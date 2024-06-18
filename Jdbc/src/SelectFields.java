import javax.swing.*;
import java.sql.*;

public class SelectFields {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String password = "nist254";
        String query = "select * from student";
        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getString("id") + " : "+ rs.getString("username")+ " : "+ rs.getString("password"));
        }

        statement.close();
        connection.close();
//        JOptionPane.showMessageDialog(null, "Table Created");
    }
}
