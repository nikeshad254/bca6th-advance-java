import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Lab 3: Take Input from two text fields nad return sum in joption
public class SumCalculator {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Nikesh - Sum Calculator");

        JLabel lbl1 = new JLabel("num1: ");
        lbl1.setBounds(100, 100, 50, 30);

        JTextField txt1 = new JTextField();
        txt1.setBounds(160, 100, 100, 30);

        JLabel lbl2 = new JLabel("num2: ");
        lbl2.setBounds(100, 180, 50, 30);

        JTextField txt2 = new JTextField();
        txt2.setBounds(160, 180, 100, 30);

        JButton btn = new JButton("Sum");
        btn.setBounds(120, 280, 100, 30);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                    int num1 = Integer.parseInt(txt1.getText());
                    int num2 = Integer.parseInt(txt2.getText());

                    JOptionPane.showMessageDialog(jf, "The sum is = "+ (num1 + num2));
            }
        });



        // adding all
        jf.add(lbl1);
        jf.add(txt1);
        jf.add(lbl2);
        jf.add(txt2);
        jf.add(btn);


        jf.setBounds(100, 100, 500, 500);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
