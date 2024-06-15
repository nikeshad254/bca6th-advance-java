import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

// Lab1: write a program to draw line, rectangle and ellipse and fill different color in it
// using graphics 2d in swing
public class Shape2d {

    public static void main(String[] args){
        JFrame f = new JFrame("Nikesh - 2d graphics");

        JPanel p = new JPanel(){
            public void paint(Graphics g){
                Graphics2D g2d = (Graphics2D) g;
//                g2d.setStroke(new BasicStroke(10));
//                g2d.draw(new Line2D.Float(30,20,80,90)); can do any
                g2d.drawLine(20, 20, 90, 90);
                g2d.setPaint(Color.RED);
                g2d.fillRect(100, 100, 200, 200);
                g2d.setPaint(Color.GREEN);
                g2d.fillOval(300, 300, 200, 200);
            }
        };

        f.add(p);

        f.setVisible(true);
        f.setBounds(500, 100, 600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
