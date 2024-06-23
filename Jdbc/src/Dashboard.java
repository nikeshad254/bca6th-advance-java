import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.sql.*;

public class Dashboard {

    public static Connection Conn() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String password = "nist254";
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public void show(){
        JFrame frame = new JFrame("Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("username");
        model.addColumn("password");

        try {
            String query = "Select * from student";
            Connection conn = Conn();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()){
                model.addRow(new String[]{rs.getString("id"), rs.getString("username"), rs.getString("password")});
            }

            JTable tbl = new JTable();

            tbl.setModel(model);
            JScrollPane sp=new JScrollPane(tbl);
            frame.add(sp,BorderLayout.CENTER);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




        frame.setBounds(100, 300, 500, 500);
        frame.setVisible(true);

    }
}
