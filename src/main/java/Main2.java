import java.sql.*;

public class Main2 {
    public Connection conn;

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/m-banking";
        String user = "root";
        String password = "";

        try{
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement myStmt = conn.createStatement();
            String sql = "SELECT * FROM user";
            ResultSet rs = myStmt.executeQuery(sql);

            while (rs.next())
                System.out.println(rs.getString("userName"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}