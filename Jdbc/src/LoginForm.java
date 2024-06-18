import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginForm {
    public static JOptionPane jOptionPane;

    public static Connection Conn() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String password = "nist254";
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel userLbl = new JLabel("User Name: ");
        userLbl.setBounds(10, 20, 80, 20);

        JTextField userTxt = new JTextField();
        userTxt.setBounds(80, 20, 100, 20);

        JLabel passLbl = new JLabel("Password: ");
        passLbl.setBounds(10, 50, 80, 20);

        JTextField passTxt = new JTextField();
        passTxt.setBounds(80, 50, 100, 20);

        JButton btn = new JButton("Login");
        btn.setBounds(100, 100, 100, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userTxt.getText().isEmpty() || passTxt.getText().isEmpty()){
                    jOptionPane.showMessageDialog(null, "User or Pass field is empty");
                    return;
                }

                try {
                    String query = "Select * from student where username = '"+userTxt.getText()+"' and password = '"+passTxt.getText()+"'";
                    Connection conn = Conn();
                    Statement statement = conn.createStatement();
                    ResultSet rs = statement.executeQuery(query);

                    if(rs.next()){
                        jOptionPane.showMessageDialog(null, "You have logged in!");
                    }else{
                        jOptionPane.showMessageDialog(null, "Incorrect username or password");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


        frame.add(userLbl);
        frame.add(userTxt);
        frame.add(passLbl);
        frame.add(passTxt);
        frame.add(btn);

        frame.setLayout(null);
        frame.setBounds(100, 300, 500, 500);
        frame.setVisible(true);
    }
}
