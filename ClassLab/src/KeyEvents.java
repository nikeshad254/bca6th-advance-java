import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEvents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Events");

        JLabel lbl1 = new JLabel("no events");
        lbl1.setBounds(100, 100, 300, 30);
        frame.add(lbl1);

        JLabel lbl2 = new JLabel("Typed: none");
        lbl2.setBounds(100, 200, 300, 30);
        frame.add(lbl2);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                lbl2.setText("Key Typed: "+ e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                lbl1.setText("Key pressed Event");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                lbl1.setText("Key Released Event");
            }
        });

        frame.setBounds(300, 100, 500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
