import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {
    public static void main(String[] args) throws SQLException {
        Connection cn=BasicConnection.Connect();
        Statement stm=null;
        ResultSet rs=null;

        String query="select * from Customers";

        stm= cn.createStatement();
        rs=stm.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getInt("customer_id")+rs.getString("first_name")+rs.getString("last_name"));

        }
    }
}
