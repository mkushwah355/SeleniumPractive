package selenium_Read_JDBC_ExternalFiles;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class JDBC_FeedMySqlDataToTestCase {

	@Test(dataProvider = "driveTest")
	public void test(String scenario, String username, String password) {

		System.out.println(scenario + " " + username + " " + password);
	}

	@DataProvider(name = "driveTest")
	public static String[][] getData() throws IOException, Exception {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qa_db", "root", "root");

		Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stm.executeQuery("SELECT * FROM qa_db.credentials");

		rs.last();// Move to the last row

		int noOfRows = rs.getRow();
		rs.beforeFirst(); // Move back to the beginning

		ResultSetMetaData rsm = rs.getMetaData();
		int noOfColumns = rsm.getColumnCount();

		String[][] data = new String[noOfRows][noOfColumns];

		int i = 0;
		while (rs.next()) {
			for (int j = 0; j < noOfColumns; j++) {

				data[i][j] = rs.getString(j + 1);
			}
			i++;
		}
		/*for (String[] a : data) {
			System.out.println(Arrays.toString(a));
		}*/

		return data;
	}

	public static void main(String[] arg) throws Exception {
		getData();

	}
}
