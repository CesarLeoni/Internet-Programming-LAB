import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exemplu2Interfata {

    public static void main(String[] args) {
        // Crearea ferestrei principale
        JFrame frame = new JFrame("Exemplu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        // Crearea unui model pentru lista de elemente
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Element 1");
        listModel.addElement("Element 2");
        listModel.addElement("Element 3");
        listModel.addElement("Element 4");

        // Crearea componentei JList folosind modelul creat
        JList<String> list = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(list);

        // Crearea unui buton
        JButton button = new JButton("Buton1");

        // Adăugarea unui ascultător de evenimente pentru buton
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size = listModel.getSize();
                listModel.addElement("Element " + (size + 1));
            }
        });

        // Adăugarea butonului și a listei în fereastră
        frame.add(button, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Afișarea ferestrei
        frame.setVisible(true);
    }
}
