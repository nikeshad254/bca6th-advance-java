import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event");

        JLabel lbl = new JLabel("no events");
        lbl.setBounds(10, 10, 500, 20);
        frame.add(lbl);

        frame.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                lbl.setText("mouse pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                lbl.setText("mouse relesed");

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lbl.setText("mouse entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lbl.setText("mouse exited");
            }
        });

        frame.setBounds(100, 300, 500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
