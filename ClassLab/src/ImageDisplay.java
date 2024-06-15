import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageDisplay {
    public static void main(String[] args) throws MalformedURLException {
        JFrame f = new JFrame("Image Display");

//        Load Using online url
        URL url = new URL("https://i.ibb.co/CtfNNKt/1-1080-x-1080-px.png");
        ImageIcon i = new ImageIcon(url);

//         For Load Using Local File Path
//        ImageIcon i = new ImageIcon("E:\\OneDrive\\OneDrive - MSFT\\Pictures\\ultimatum logo.png");

        JLabel l = new JLabel(i);
        l.setBounds(10,10,400, 400);

        f.add(l);

        f.setBounds(100, 100, 600, 600);
//        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
