import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseClickPaint {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Mouse Click Paint");

        jf.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                super.mouseClicked(e);
                System.out.println(e.getX() + " "+ e.getY());
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
