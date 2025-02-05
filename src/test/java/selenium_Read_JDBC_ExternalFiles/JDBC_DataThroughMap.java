package selenium_Read_JDBC_ExternalFiles;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.LinkedHashMap;
import java.util.Map;

public class JDBC_DataThroughMap {
	
	public static Map<String, String> getData() {

        // Creating a Map to store data
        Map<String, String> data = new LinkedHashMap<>();

        try {
            // Establishing connection
        	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/qa_db","root","root");
            Statement statement = connection.createStatement();

            // Executing query
            ResultSet rs = statement.executeQuery("SELECT * FROM qa_db.credentials");

            // Storing data in the Map
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                data.put(username, password);
            }

            // Closing connection
            connection.close();

            // Accessing data in the Map
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    return data;
		
	}
    public static void main(String[] args) {
    	 Map<String, String> data = getData();
    	for (Map.Entry<String, String> entry : data.entrySet()) {
            System.out.println("username: " + entry.getKey() + ", password: " + entry.getValue());
        }
    }
}
//Output of above program
/*username: zerobc, password: 123zb
username: outbc, password: 123ob
username: rewardcd, password: 123rc
username: test@email.com, password: abcabc*/
