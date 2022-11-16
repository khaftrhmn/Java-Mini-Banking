import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    private Connection conn;

    public void data(String id) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/m-banking",
                "root",
                ""
        );

        Statement stmt = conn.createStatement();
        String query = "select * from user where idUser = '"+id+"'";

        ResultSet rs = stmt.executeQuery(query);
        rs.getString(3);
    }
}
