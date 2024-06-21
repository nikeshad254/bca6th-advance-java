import javax.swing.*;
import java.sql.*;

public class BasicDbCRUD {
    Connection conn;
    Statement statement;

    public BasicDbCRUD() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String password = "nist254";
        conn = DriverManager.getConnection(url, user, password);
        statement = conn.createStatement();
    }

    public void createStudentTable() throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS student (id INT NOT NULL AUTO_INCREMENT, username VARCHAR(50), password VARCHAR(50), PRIMARY KEY(id));";
        statement.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Student Table Created");
    }

    public void insertStudent(String userName, String password) throws SQLException {
        String query = "INSERT INTO student (username, password) VALUES ('"+userName+"', '"+password+"')";
        statement.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Insert Student Table");
    }

    public void deleteStudent(int id) throws SQLException {
        String query = "DELETE FROM student WHERE id = '"+id+"'";
        statement.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Deleted Student Table");
    }

    public void updateStudent(int id, String username) throws SQLException {
        String query = "UPDATE student SET username = '"+username+"' WHERE id = '"+id+"'";
        statement.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Update Student Table");
    }

    public void getAllStudents() throws SQLException{
        String query = "SELECT * FROM student";
        ResultSet rs = statement.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getString("id") + " : "+ rs.getString("username")+ " : "+ rs.getString("password"));
        }

        JOptionPane.showMessageDialog(null, "Fetched All Students");
    }
}

class CRUD{
    public static void main(String[] args) {

        try {
            BasicDbCRUD basicDbCRUD = new BasicDbCRUD();
            basicDbCRUD.createStudentTable();
            basicDbCRUD.insertStudent("nikesh", "pass1234");
            basicDbCRUD.insertStudent("nikesh2", "pass1234");

            System.out.println("After Insert: ");
            basicDbCRUD.getAllStudents();

            basicDbCRUD.updateStudent(1, "nikesh001");

            System.out.println("\nAfter Update:");
            basicDbCRUD.getAllStudents();

            basicDbCRUD.deleteStudent(1);

            System.out.println("\nAfter Delete:");
            basicDbCRUD.getAllStudents();

            basicDbCRUD.statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}