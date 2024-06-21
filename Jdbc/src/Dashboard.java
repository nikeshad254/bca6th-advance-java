import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.text.TableView;
import java.sql.*;
import java.util.ArrayList;

public class Dashboard {

    public static Connection Conn() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String password = "nist254";
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public void show() {
        JFrame frame = new JFrame("Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            String query = "Select * from student";
            Connection conn = Conn();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            System.out.println(rs);

            ArrayList<String> al = new ArrayList<>();
//            al.add();
            JTable tbl = new JTable();

            frame.add(tbl);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




        frame.setLayout(null);
        frame.setBounds(100, 300, 500, 500);
        frame.setVisible(true);

    }
}
