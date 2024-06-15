import javax.swing.*;
import java.awt.*;

public class ImageGridLayout {
    public static void main(String[] args){

        JFrame frame = new JFrame("Image Grid Assignment");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        String[] images = {
                "E:\\OneDrive\\OneDrive - MSFT\\Pictures\\ultimatum logo.png",
                "E:\\OneDrive\\OneDrive - MSFT\\Pictures\\ultimatum logo.png",
                "E:\\OneDrive\\OneDrive - MSFT\\Pictures\\ultimatum logo.png",
                "E:\\OneDrive\\OneDrive - MSFT\\Pictures\\ultimatum logo.png",
                "E:\\OneDrive\\OneDrive - MSFT\\Pictures\\ultimatum logo.png"
        };
        for (int i = 0; i < images.length; i++) {
            ImageIcon img = new ImageIcon(images[i]);
            Image img1 = img.getImage();
            Image resize= img1.getScaledInstance(600,600, Image.SCALE_SMOOTH);
            ImageIcon resizedImg = new ImageIcon(resize);
            JLabel label = new JLabel(resizedImg);
            panel.add(label);
        }
        frame. add(panel);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
