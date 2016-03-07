package DataManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsumerDao {

	public static int consumer_id = 1000;
	
	public static void main(String args[]) {
		String[] c1 = {"sayantan31", "archie123", "777 S mathilda ave.", "6692242714", "sayantan31@gmail.com"};
		String[] c2 = {"mpatil", "mantu123", "646 San Jose", "6692142287","mpatil1@scu.edu"};
		String[] user = {"sayantan31", "archie123"};
		//addConsumer(c1);
		//addConsumer(c2);
		//showResults();
		System.out.println(verifyConsumer(user));
	}
	
	public static void addConsumer(String[] consumer) {
		
		Connection conn = null;
		Statement st = null;
		
		String sqlQuery = "INSERT INTO CONSUMER (consumer_ID, username, "
				+ "password, address, phone, email)"
				+ " VALUES (" 
				+ consumer_id + "," 
				+ "'" + consumer[0] + "'," 
				+ "'" + consumer[1] + "'," 
				+ "'" + consumer[2] + "',"
				+ "'" + consumer[3] + "'," 
				+ "'" + consumer[4] + "')";
		
		System.out.println(sqlQuery);
	
		conn = DataStore.getConnection();
		
		consumer_id += 1;
		
		try {
			st = conn.prepareStatement(sqlQuery);
			st.executeUpdate(sqlQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {

			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	private static boolean verifyConsumer(String[] str) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String passwd = "";
		conn = DataStore.getConnection();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery("Select * from CONSUMER where username='" + str[0] +"'");
			if(rs.next()) {
				passwd = rs.getString("password");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(passwd.equals(str[1])) {
			return true;
		}
		else {
			return false;
		}
	}
}

