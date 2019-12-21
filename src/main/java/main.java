import java.sql.*;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://13.124.105.47:3306/SNS";
        String sql = "SELECT*FROM user";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, "moonsoo", "Rla933466r!");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()) {
            System.out.println(rs.getString("name"));
        }

        rs.close();
        st.close();
        con.close();
    }
}
