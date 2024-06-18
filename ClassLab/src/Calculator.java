import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private static String operator = "";
    private static double num1 = 0;
    private static double num2 = 0;
    private static boolean startNewNumber = true;
    private static JLabel lbl;
    private static JLabel lbl2;
    private static String expression = "";
    private static int frameW = 400;
    private static int frameH = 600;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 80, frameW+13, frameH+30);
        frame.setResizable(false);
        frame.setLayout(null);

        lbl2 = new JLabel("", SwingConstants.RIGHT);
        lbl2.setFont(new Font("Arial", Font.PLAIN, 16));
        lbl2.setBounds(0, 0, frameW, 20);
        frame.add(lbl2);

        lbl = new JLabel("0", SwingConstants.RIGHT);
        lbl.setFont(new Font("Arial", Font.PLAIN, 32));
        lbl.setBounds(0, 20,frameW, 50);
        frame.add(lbl);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4)); // 5 rows, 4 columns, 10px gaps
        panel.setBounds(0, 70, frameW, frameH-70);
        String[] buttonLabels = {
                "Back", "^", "C", "/",
                "7", "8", "9", "*",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "0", ".", "00", "=",
        };

        for (String text : buttonLabels) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        frame.add(panel);
        frame.setVisible(true);
    }

    private static class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();

            if ("0123456789.".contains(command)) {
                if (startNewNumber) {
                    lbl.setText(command);
                    startNewNumber = false;
                } else {
                    lbl.setText(lbl.getText() + command);
                }
                expression += command;
            } else if (command.equals("00")) {
                lbl.setText(lbl.getText() + command);
                expression += command;
            } else if ("+-*/".contains(command)) {
                operator = command;
                num1 = Double.parseDouble(lbl.getText());
                expression += (" "+ command + " ");
                lbl2.setText(expression);
                startNewNumber = true;
            } else if (command.equals("=")) {
                num2 = Double.parseDouble(lbl.getText());
                double result = 0;
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
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            lbl.setText("Error");
                            expression = "";
                            return;
                        }
                        break;
                    default:
                        result = num2;
                }
                lbl.setText(String.valueOf(result));
                expression += (" = " + result);
                lbl2.setText(expression);
                expression=""+result;
                num1 = 0;
                num2 = 0;
                startNewNumber = true;
            } else if (command.equals("C")) {
                lbl.setText("0");
                lbl2.setText("");
                expression="";
                num1 = 0;
                num2 = 0;
                operator = "";
                startNewNumber = true;
            } else if (command.equals("Back")) {
                String currentText = lbl.getText();
                if (!currentText.isEmpty() && !startNewNumber) {
                    lbl.setText(currentText.substring(0, currentText.length() - 1));
                    expression = expression.substring(0, expression.length() - 1);
                    if (lbl.getText().isEmpty()) {
                        lbl.setText("0");
                        startNewNumber = true;
                    }
                }
                lbl2.setText(expression);
            } else if (command.equals("^")) {
                num1 = Double.parseDouble(lbl.getText());
                double result = num1 * num1;
                lbl.setText(String.valueOf(result));
                expression += ("^2 = " + result);
                lbl2.setText(expression);
                expression = ""+result;
                startNewNumber = true;
            }
        }
    }
}
