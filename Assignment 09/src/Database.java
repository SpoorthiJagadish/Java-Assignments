import java.sql.*;
public class Database {
    public Database() throws SQLException {
    }

    String url = "jdbc:mysql://localhost:3306/mark";
    String username = "root";
    String password = "Spooswa2103";
    Connection conn = DriverManager.getConnection(url, username, password);

}
