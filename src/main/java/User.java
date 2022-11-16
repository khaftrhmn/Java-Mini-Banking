import java.sql.*;

public class User{
    private Connection conn;

    public User() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/m-banking",
                "root",
                ""
        );
    }

    public String selectFullName(String id) throws SQLException {
        Statement stmt = conn.createStatement();
        String query = "select * from user where idUser = '"+id+"'";
//        Statement stmt = this.conn.createStatement();

//        PreparedStatement stmt = this.conn.prepareStatement(query);

//        stmt.setString(1,id);

        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()){
            rs.getString(3);
        }

        //rs.getString(3);

        return query;

    }


}
