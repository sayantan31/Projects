package ServiceProvider;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment {

	private String provider;

	private String sTime;

	private String eTime;

	private String day;
	
	
	public Appointment(String provider, Date[] date)
	{
		this.provider = provider;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sTime = sdf.format(date[0]);
		eTime = sdf.format(date[1]);
		day = sTime.split(" ")[0];
		sTime = sTime.split(" ")[1];
		eTime = eTime.split(" ")[1];
	}
	
	public String getProvider() {
		return provider;
	}
	
	public String getDay() {
		return day;
	}
	
	public String getStartTime() {
		return sTime;
	}
	
	public String getEndTime() {
		return eTime;
	}
}
 
