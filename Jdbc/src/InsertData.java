import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String password = "nist254";
        String query = "insert into student (id, username, password) values ('2', 'user', 'pass1234')";
        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        statement.close();
        connection.close();
        JOptionPane.showMessageDialog(null, "Table Created");
    }
}
