import javax.swing.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        JLabel lbl = new JLabel("XXXX");
//        frame.add(lbl);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        JButton btn1 = new JButton("+");
        JButton btn2 = new JButton("-");
        JButton btn3 = new JButton("*");

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);



        frame.setBounds(500, 100, 400, 650);
        frame.setVisible(true);
    }
}
