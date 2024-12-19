import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JTextField num1Field;
    private JTextField num2Field;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JTextField resultField;
    private JButton clearButton;
    private JPanel mainPanel;

    public Calculator() {
        // Inițializare componente
        mainPanel = new JPanel(new GridLayout(5, 2, 10, 10)); // Layout 5x2 pentru componente
        num1Field = new JTextField();
        num2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false); // Rezultatul nu poate fi editat

        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");
        clearButton = new JButton("Clear");

        // Adăugare componente în panou
        mainPanel.add(new JLabel("First Number:"));
        mainPanel.add(num1Field);
        mainPanel.add(new JLabel("Second Number:"));
        mainPanel.add(num2Field);
        mainPanel.add(new JLabel("Result:"));
        mainPanel.add(resultField);
        mainPanel.add(addButton);
        mainPanel.add(subtractButton);
        mainPanel.add(multiplyButton);
        mainPanel.add(divideButton);
        mainPanel.add(clearButton);

        // Funcționalitate pentru butoane
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("+");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("-");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("*");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("/");
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1Field.setText("");
                num2Field.setText("");
                resultField.setText("");
            }
        });
    }

    private void performOperation(String operator) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero!");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator");
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        // Configurare fereastră principală
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
