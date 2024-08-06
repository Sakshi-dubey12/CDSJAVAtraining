import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {
    public static void main(String[] args) {
        String Username ="root";
        String password="" ;
        String Url = "jdbc:mysql://localhost:3306/javatrainingmanagement";
        try {
            Connection c= DriverManager.getConnection(Url,Username,password);
            System.out.println("Database connected");
        } catch (SQLException e) {
            throw new RuntimeException(e + "not connected");
        }
    }
}
