import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JTextField display;
    private JPanel buttonPanel;
    private String currentInput = "";
    private double result = 0;
    private String operator = "";

    public CalculatorGUI() {
        // Setări pentru fereastră
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        // Câmp de afișare
        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        // Panou pentru butoane
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        // Creare și adăugare butoane
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();

            switch (command) {
                case "C":
                    currentInput = "";
                    result = 0;
                    operator = "";
                    display.setText("0");
                    break;

                case "=":
                    calculateResult();
                    display.setText(String.valueOf(result));
                    currentInput = "";
                    operator = "";
                    break;

                case "+":
                case "-":
                case "*":
                case "/":
                    if (!currentInput.isEmpty()) {
                        calculateResult();
                        operator = command;
                        currentInput = "";
                    } else {
                        operator = command;
                    }
                    break;

                default: // Pentru numere
                    currentInput += command;
                    display.setText(currentInput);
                    break;
            }
        }

        private void calculateResult() {
            double currentNumber = currentInput.isEmpty() ? 0 : Double.parseDouble(currentInput);

            switch (operator) {
                case "+":
                    result += currentNumber;
                    break;
                case "-":
                    result -= currentNumber;
                    break;
                case "*":
                    result *= currentNumber;
                    break;
                case "/":
                    if (currentNumber != 0) {
                        result /= currentNumber;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero!");
                        result = 0;
                    }
                    break;
                default:
                    result = currentNumber;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorGUI calculator = new CalculatorGUI();
            calculator.setVisible(true);
        });
    }
}
