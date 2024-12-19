import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewClass2 {
    private JTextField textField1;
    private JButton convertButton;
    private JButton clearButton;
    private JTextField textField2;
    private JButton exitButton;
    private JPanel mainPanel;

    public NewClass2() {
        // Funcționalitate pentru butonul Exit
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Închide aplicația
            }
        });

        // Funcționalitate pentru butonul Clear
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(""); // Golește primul câmp text
                textField2.setText(""); // Golește al doilea câmp text
            }
        });

        // Funcționalitate pentru butonul Convert
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float degree_cent = Float.parseFloat(textField1.getText());
                    float degree_fahren = (degree_cent * 9 / 5) + 32;
                    textField2.setText(String.valueOf(degree_fahren));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number!");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Inițializarea interfeței
        JFrame frame = new JFrame("Temperature Converter");

        // Creare instanță a clasei și configurare GUI
        NewClass2 converter = new NewClass2();
        converter.mainPanel = new JPanel(new GridLayout(4, 2, 10, 10)); // Layout de 4x2 pentru componente

        // Creare componente
//        converter.textField1 = new JTextField();
//        converter.textField2 = new JTextField();
//        converter.convertButton = new JButton("Convert");
//        converter.clearButton = new JButton("Clear");
//        converter.exitButton = new JButton("Exit");

        // Adăugare componente în panou
        converter.mainPanel.add(new JLabel("Celsius:"));
        converter.mainPanel.add(converter.textField1);
        converter.mainPanel.add(new JLabel("Fahrenheit:"));
        converter.mainPanel.add(converter.textField2);
        converter.mainPanel.add(converter.convertButton);
        converter.mainPanel.add(converter.clearButton);
        converter.mainPanel.add(converter.exitButton);

        // Adăugare panou în fereastră
        frame.setContentPane(converter.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
