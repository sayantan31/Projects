package DataManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServiceProviderDao {

	public static int provider_id = 1000;
	
	public static void main(String args[]) {
		String[] p1 = {"sayantan31", "archie123", "777 S mathilda ave.", "6692242714", "sayantan31@gmail.com", "123", "HackerRank"};
		String[] user = {"sayantan31", "archie123"};
		System.out.println(verifyProvider(user));
	}
	
	public  void addProvider(String[] provider) {
		
		Connection conn = null;
		Statement st = null;
		
		String sqlQuery = "INSERT INTO SERVICE_PROVIDER (provider_ID, username, "
				+ "password, address, phone, email,service_type,business_name)"
				+ " VALUES (" 
				+ provider_id + "," 
				+ "'" + provider[0] + "'," 
				+ "'" + provider[1] + "'," 
				+ "'" + provider[2] + "',"
				+ "'" + provider[3] + "',"
				+ "'" + provider[4] + "',"
				+ "'" + provider[5] + "',"		
				+ "'" + provider[6] + "')";
		
		System.out.println(sqlQuery);
	
		conn = DataStore.getConnection();
		
		provider_id += 1;
		
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
	
	private static boolean verifyProvider(String[] str) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String passwd = "";
		conn = DataStore.getConnection();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery("Select * from SERVICE_PROVIDER where username='" + str[0] +"'");
			if(rs.next()) {
				passwd = rs.getString("password");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("password for sayantan31:" + passwd);
		
		if(passwd.equals(str[1])) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
