package ServiceProvider;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import DataManagement.AppointmentDao;
import DataManagement.DataStore;

public class ProviderCalendar {

	public static void main(String args[]) {
		
		//getConsumerCalendar();
	}
	
	/*
	 * Takes a date array as argument. Returns true if no bookings are present at the same time slot.
	 */
	
	public boolean isValid(Appointment app)
	{
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sTime = sdf.format(date[0]);
		String eTime = sdf.format(date[1]);
		String checkDay = sTime.split(" ")[0];
		String checkStartTime = sTime.split(" ")[1];
		String checkEndTime = eTime.split(" ")[1];*/
		
		String checkDay = app.getDay();
		String sTime = app.getStartTime();
		String eTime = app.getEndTime();
		
		System.out.println(checkDay);
		
		AppointmentDao ad = new AppointmentDao();
		
		HashMap<String,String> map = ad.BookingTimes();
		//System.out.println(map);
		
		if(map.containsKey(checkDay)) {
			String[] str = map.get(checkDay).split(" ");
			int startTimeDB = toMins(str[0]);
			int endTimeDB = toMins(str[1]);
			
			int start = toMins(sTime);
			int end = toMins(eTime);
			
			//System.out.println("start: " + start);
			//System.out.println("end: " + end);
			
			//System.out.println("startTimeDB: " + startTimeDB);
			//System.out.println("endTimeDB: " + endTimeDB);
			
			if(startTimeDB < start || endTimeDB > end) {
				return false;
			}
		}
		
		return true;
	}

	/*
	 * Changes HH:MM to mins
	 */
	
	private static int toMins(String s) {
	    String[] hourMin = s.split(":");
	    int hour = Integer.parseInt(hourMin[0]);
	    int mins = Integer.parseInt(hourMin[1]);
	    int hoursInMins = hour * 60;
	    return hoursInMins + mins;
	}
	
	public void updateProvider()
	{

	}
	
	/*
	 * Returns a hashset of strings for a specific period of time.
	 */
	
	public static HashSet<String> getConsumerCalendar(String consumer_id) {
		AppointmentDao ad = new AppointmentDao();
		
		ArrayList<String> al = AppointmentDao.recordsBetween("%");
		
		System.out.println("consumer_id: " + consumer_id);
		
		System.out.println(al);
		
		HashSet<String> hs = new HashSet<>(al);
		
		System.out.println("HashSet: " + hs);
		
		return hs;
	}
}
