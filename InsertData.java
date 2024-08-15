import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void main(String[] args) throws SQLException {
        Connection cn=BasicConnection.Connect();
        PreparedStatement ps=null;

        ps=cn.prepareStatement("INSERT INTO customers (first_name, last_name, email, contact_number, date_of_birth) VALUES (?, ?, ?, ?, ?)");
        ps.setString(1,"new name");
        ps.setString(2,"jdbc");
        ps.setString(3,"jbdbc.com");
        ps.setString(4,"123456");
        ps.setDate(5,new java.sql.Date(System.currentTimeMillis()));
        int rowsAffected = ps.executeUpdate();
    }
}
