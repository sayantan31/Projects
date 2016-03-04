/**
 * 
 */
package timing;

import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author sayantan
 * The timing system module models 24 hours into 24 minutes.  
 */
public class Timing extends Thread {
	
	long startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
	public static HashMap<String, Integer> current;
	
	
	public  void run() {
			Timing t = new Timing();
			
			while(true) {
				try {
					current = t.getCurrentTime();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//System.out.println("day = " + current.get("day"));
				//System.out.println("hour = " + current.get("hour") + " Hours");
			
				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

	public HashMap<String,Integer> getCurrentTime() throws InterruptedException {
		
		HashMap<String,Integer> time = new HashMap<>();
		
		long now = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		long elapsed = now - startTime;
		
		int day = (int) elapsed/1440;
		int x= (int) elapsed%1440;
		int hour = x/60;
		
		time.put("day", day+1);
		time.put("hour", hour+1);
		
		return time;
	}	
}
