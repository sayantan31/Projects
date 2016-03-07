package DataManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import Consumer.Appointment;

public class AppointmentDao {

	public static int appointment_id = 1000;
	
	public static void main(String args[]) {
		
	}
	
	/*
	 * Adds an appointment record in the database
	 */
	
/*	
public int findMax() {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String max = "";
		
		String sqlQuery = "SELECT max (appointment_ID) + 1 FROM APPOINTMENT";
		conn = DataStore.getConnection();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sqlQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while (rs.next()) {
				max  = rs.getString("appointment_ID");

				System.out.println(max);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Integer.parseInt(max);
}*/
	
	public int addAppointment(String[] str) {
		
		Connection conn = null;
		Statement st = null;
		
		
		
		String sqlQuery = "INSERT INTO APPOINTMENT (appointment_ID,provider, "
				+ "consumer_ID, day, start_time, end_time)"
				+ " VALUES (" 
				+ appointment_id + "," 
				+ "'" + str[0] + "'," 
				+ "'" + str[1] + "',"	 
				+ "'" + str[2] + "',"
				+ "'" + str[3] + "',"
				+ "'" + str[4] + "')";		
		
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
		
		return 1;
	}
	
	
	/*
	 * Removes entry from the appointment table of the specified appointment ID
	 */
	
	public  boolean removeAppointment(String appointment) {
		
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
	
	/*
	 * Returns a Hashmap of all the days and times  in the appointment table
	 */
	
	public HashMap<String,String> BookingTimes() {
		
		Connection conn = null;
		java.sql.ResultSet rs = null;
		Statement st = null;
		
		HashMap<String,String> map = new HashMap<>();
		
		conn = DataStore.getConnection();
		try {
			st = conn.createStatement();
			rs = st.executeQuery("Select * from APPOINTMENT");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while (rs.next()) {
				String day = rs.getString("day");
				String startTime = rs.getString("start_time");
				String endTime = rs.getString("end_time");
					
				String str = startTime + " " + endTime;
			
				//System.out.println(day + " - " + startTime + " - " + endTime);
				map.put(day, str);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return map;
	}
	
	/*
	 *  Returns an arrayList of all the records in a specified time range
	 */
	
	public ArrayList<String> recordsBetween(String consumer_id) {
		
		Connection conn = null;
		java.sql.ResultSet rs = null;
		Statement st = null;
		
		ArrayList<String> al = new ArrayList<>();
		
		conn = DataStore.getConnection();
		try {
			st = conn.createStatement();
			rs = st.executeQuery("select * from APPOINTMENT where day between '03-03-2016' AND '03-09-2016' AND consumer_ID=" + consumer_id + ";");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while (rs.next()) {
				String business = rs.getString("provider");
				String date = rs.getString("day");
				String startTime = rs.getString("start_time");
				String endTime = rs.getString("end_Time");
				String appointment_ID = rs.getString("appointment_ID");
					
				String record = business + " " + date + " " + startTime + " " + endTime + " " + appointment_ID;
			
				System.out.println(record);
				
				al.add(record);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al;
	}
	
}
