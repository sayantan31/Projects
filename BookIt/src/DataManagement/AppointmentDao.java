package DataManagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AppointmentDao {

	public static int appointment_id = 1000;
	
	public static void main(String args[]) {
		String[] app = {"1000", "1000", "2016-03-05", "05:30", "06:30", "Coding Doubts"};
		addAppointment(app);
	}
	
	public static void addAppointment(String[] appointment) {
		
		Connection conn = null;
		Statement st = null;
		
		String sqlQuery = "INSERT INTO APPOINTMENT (appointment_ID, provider_ID, "
				+ "consumer_ID, day, start_time, end_time, comment)"
				+ " VALUES (" 
				+ appointment_id + "," 
				+ "'" + appointment[0] + "'," 
				+ "'" + appointment[1] + "'," 
				+ "'" + appointment[2] + "',"
				+ "'" + appointment[3] + "',"
				+ "'" + appointment[4] + "',"		
				+ "'" + appointment[5] + "')";
		
		System.out.println(sqlQuery);
	
		conn = DataStore.getConnection();
		
		appointment_id += 1;
		
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
	
	public static boolean removeAppointment(String appointment) {
		
		Connection conn = null;
		Statement st = null;
		boolean cancelled = true;
		
		String sqlQuery = "DELETE FROM APPOINTMENT where appointment_ID=" + appointment;
		
		conn = DataStore.getConnection();
		
		try {
			st = conn.prepareStatement(sqlQuery);
			st.executeUpdate(sqlQuery);
		} catch (SQLException e) {
			
			cancelled = false;
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
		
		return cancelled;
	}
}
