import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Event");

        JButton btn = new JButton("Click It!");
        btn.setBounds(100, 100, 100, 30);
        frame.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
                JOptionPane.showMessageDialog(frame, "Button Clicked");
            }
        });

        frame.setBounds(300, 100, 500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
