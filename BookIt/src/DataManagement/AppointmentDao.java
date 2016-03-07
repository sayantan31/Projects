package DataManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import Consumer.Appointment;

public class AppointmentDao {

	public static int appointment_id;
	
	public static void main(String args[]) {
		
		ArrayList<String> al = recordsBetween("'%'");
		
		System.out.println(al);
	}
	
	/*
	 * Loads all the appointment ids from the appointment table to a hashset and returns the hashset
	 */
	
	
		public static HashSet<Integer> getAppointmentList() {
		
			Connection conn = null;
			Statement st = null;
			ResultSet rs = null;
			HashSet<Integer> hs = new HashSet<>();
			
			String sqlQuery = "SELECT * FROM APPOINTMENT";
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
				hs.add(Integer.parseInt(rs.getString("appointment_ID"))); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(hs);
		
		return hs;
}
	

	public static int randomAppIDGenerator() {
		
		Random rand = new Random();
		int max = 9999;
		int min = 1000;
		int appID;
		HashSet<Integer> hs = getAppointmentList();
		
		while(true) {
			int rn = rand.nextInt((max - min) + 1) + min;
			
			if(!hs.contains(rn)) {
				appID = rn;
				break;
			}
		}
		
		return appID;
	}
		
	public int addAppointment(String[] str) {
		
		Connection conn = null;
		Statement st = null;
		
		
		
		String sqlQuery = "INSERT INTO APPOINTMENT (appointment_ID,provider, "
				+ "consumer_ID, day, start_time, end_time)"
				+ " VALUES (" 
				+ randomAppIDGenerator() + "," 
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
	
	public static ArrayList<String> recordsBetween(String consumer_id) {
		
		Connection conn = null;
		java.sql.ResultSet rs = null;
		Statement st = null;
		
		ArrayList<String> al = new ArrayList<>();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date dt = new Date();
		
		String d = dateFormat.format(dt);
		
		String today = d.split(" ")[0];
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		cal.add(Calendar.DATE, 7);
		dt = cal.getTime();
	    
		d = dateFormat.format(dt);
		
		String seventh = d.split(" ")[0];
		
		
		System.out.println("today: " + today);
		System.out.println("seventh: " + seventh);
		
		String sql = "select * from APPOINTMENT where day between \"" + today + "\" AND \"" +  seventh + "\" AND consumer_ID LIKE " + consumer_id + ";";
		
		System.out.println(sql);
		
		
		conn = DataStore.getConnection();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
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
			
				System.out.println("Record: " +  record);
				
				al.add(record);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al;
	}
	
}
