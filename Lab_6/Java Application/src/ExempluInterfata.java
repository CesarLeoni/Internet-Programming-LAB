import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExempluInterfata extends JFrame {
    private JComboBox<String> comboBox;
    private JTextField textField;

    public ExempluInterfata() {
        // Configurarea ferestrei principale
        setTitle("Exemplu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new FlowLayout());

        // Crearea listei de opțiuni
        String[] articole = {"Articol 1", "Articol 2", "Articol 3", "Articol 4"};
        comboBox = new JComboBox<>(articole);
        comboBox.setSelectedIndex(0); // Selectăm primul element implicit
        add(comboBox);

        // Crearea câmpului text pentru afișare
        textField = new JTextField(20);
        textField.setEditable(false);
        textField.setText((String) comboBox.getSelectedItem()); // Afișăm elementul selectat implicit
        add(textField);

        // Adăugarea unui ActionListener pentru a actualiza câmpul text la selecția unui element din ComboBox
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();
                textField.setText(selectedItem);
            }
        });
    }

    public static void main(String[] args) {
        // Crearea și afișarea ferestrei
        SwingUtilities.invokeLater(() -> {
            ExempluInterfata frame = new ExempluInterfata();
            frame.setVisible(true);
        });
    }
}
