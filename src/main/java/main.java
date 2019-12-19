import java.sql.*;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://<ip_address>:3306(default port number of mysql)/<name of database>";
        String sql = "SELECT*FROM user";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, "user", "password");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()) {
            System.out.println(rs.getString("name"));

        }

    }
}
