import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Lab 5: Use Mouse Drag to Paint where the mouse is pressed and dragged in a Frame.
public class MousePressDraw {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Nikesh - Mouse Click Paint");

        jf.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
//                super.mouseDragged(e);
                Graphics g = jf.getGraphics();
                g.setColor(Color.BLUE);
                g.fillOval(e.getX(), e.getY(), 10, 10);
            }
        });


        jf.setBounds(100, 300, 500, 500);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
