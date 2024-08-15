import java.sql.*;

public class BasicConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Nitpece@$321789";

    public static Connection Connect() {
        Connection cnn=null;
        Statement stm=null;
        ResultSet rs=null;

        try {
            Class.forName("org.postgresql.Driver");

            cnn=DriverManager.getConnection(URL,USER,PASSWORD);

            System.out.println("Connection Established");
            return cnn;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
