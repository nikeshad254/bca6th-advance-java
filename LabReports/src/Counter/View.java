package Counter;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class View {

    public View(Controller c) {
        JFrame frame = new JFrame("counter");

        JLabel lbl = new JLabel("Count: 0");
        lbl.setBounds(100, 100, 80, 20);

        JButton incrBtn = new JButton("Incr");
        incrBtn.setBounds(200, 100, 100, 20);

        JButton dcrBtn = new JButton("Decr");
        dcrBtn.setBounds(200, 140, 100, 20);

        incrBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl.setText("Count: "+ c.increment());
            }
        });

        dcrBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl.setText("Count: "+ c.decrement());
            }
        });

        frame.add(lbl);
        frame.add(incrBtn);
        frame.add(dcrBtn);

        frame.setLayout(null);
        frame.setBounds(100, 200, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
