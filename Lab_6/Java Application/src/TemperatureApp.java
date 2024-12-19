import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureApp {
    public static void main(String[] args) {
        // Crearea ferestrei principale
        JFrame frame = new JFrame("Celsius to Fahrenheit Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crearea unui panou pentru componente
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10)); // 3 rânduri, 2 coloane, margini de 10px

        // Eticheta pentru introducerea temperaturii în grade Celsius
        JLabel celsiusLabel = new JLabel("Temperature in °C:");
        JTextField celsiusField = new JTextField();

        // Eticheta pentru afișarea rezultatului
        JLabel fahrenheitLabel = new JLabel("Result in °F:");
        JLabel fahrenheitResult = new JLabel("...");

        // Buton pentru conversie
        JButton convertButton = new JButton("Convert");

        // Adăugarea componentelor în panou
        panel.add(celsiusLabel);
        panel.add(celsiusField);
        panel.add(fahrenheitLabel);
        panel.add(fahrenheitResult);
        panel.add(new JLabel()); // Componentă goală pentru aliniere
        panel.add(convertButton);

        // Adăugarea panoului în fereastră
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        // Funcționalitate pentru butonul Convert
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Preluarea temperaturii în grade Celsius
                    String celsiusText = celsiusField.getText();
                    double celsius = Double.parseDouble(celsiusText);

                    // Conversia în grade Fahrenheit
                    double fahrenheit = celsius * 9 / 5 + 32;

                    // Afișarea rezultatului
                    fahrenheitResult.setText(String.format("%.2f °F", fahrenheit));
                } catch (NumberFormatException ex) {
                    // Mesaj de eroare pentru valori invalide
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Setarea vizibilității ferestrei
        frame.setVisible(true);
    }
}
