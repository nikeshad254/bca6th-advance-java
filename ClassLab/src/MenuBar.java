import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Menu Bar");

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");

        JMenuItem mi1 = new JMenuItem("New");
        JMenuItem mi2 = new JMenuItem("Open");
        JMenuItem mi3 = new JMenuItem("Save");
        JMenuItem mi4 = new JMenuItem("Exit");

        mi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Exit Clicked");
//                jf.dispose();   // to dispose only the selected frame
                System.exit(0);
            }
        });

        JMenu m2 = new JMenu("Edit");

        JMenu m3 = new JMenu("help");


        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);

        jf.setJMenuBar(mb);
        jf.setBounds(100, 300, 500, 500);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
