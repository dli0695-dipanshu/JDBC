import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) throws SQLException {
        Connection conn=BasicConnection.Connect();
        PreparedStatement stm=null;

        String query="update customers set first_name = ?, last_name = ? Where customer_id = ?";
        stm= conn.prepareStatement(query);

        stm.setString(1,"dipanshu");
        stm.setString(2,"mahto");
        stm.setInt(3,24);
        int rowaffected= stm.executeUpdate();

        System.out.println("row updated "+rowaffected);
    }
}
