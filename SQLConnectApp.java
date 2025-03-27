import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnectApp {
    public static void main(String[] args) {
         
        // Establishing the connection
        try  {
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_db","root","SDS20@erfgbn");
    		Statement stat=con.createStatement();
            System.out.println("Connected to the database!");

            // Example query
            String sqlQuery = "SELECT  * FROM products";
            ResultSet resultSet = stat.executeQuery(sqlQuery);

            // Processing the result set
            while (resultSet.next()) {
                System.out.println( resultSet.getString("product_id") 
                		          + " " +resultSet.getString("name") + "    " 
                                  + resultSet.getString("description") + "    "
                                  + resultSet.getString("price") + "    "
                                   +resultSet.getString("stock_quantity") + "    "
                                   +resultSet.getString("category"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
