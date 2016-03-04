package wateringSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import masterController.Controller;
import sensoringSystem.Sensor;
import timing.Timing;

public class Sprinkler extends Thread {
	

	public void run() {
		Sprinkler s = new Sprinkler();
		while(true) {
			try {
				try {
					s.runSprinkler();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	/*
	 * The runSprinkler method performs the following functions:
	 *     a) First, it gets the current time.
	 *     b) If the time is divisible by 8, we turn on the sprinkler for 1 minutes.
	 *     c) This denotes that we turn on the sprinkler 3 times per day. Every 8th minute.   
	 */
	
	public void runSprinkler() throws InterruptedException, IOException {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
		if(Timing.current.get("hour")%3 == 0 && Sensor.raining == false) {
			
			
			pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "No Rain Detected. Turning Sprinkler ON\n");
			
			Thread.sleep(60000);
			
			pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Turning Sprinkler OFF\n");
			pw.flush();
			pw.close();
		}
			
	}
	
	/*
	 * The turnOnSprinkler() method performs the following functions:
	 *       a) First, it checks if it is raining.
	 *       b) If it is not raining, it turns on the sprinkler for a minute and then turns it off.
	 */
	
	public void turnOnSprinkler() throws InterruptedException, IOException {
		if(Sensor.raining == false) {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
			
			pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Turning Sprinkler ON\n");
			
			Thread.sleep(60000);
			
			pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Turning Sprinkler OFF\n");
			pw.flush();
			pw.close();
		}
	}
	
	/*
	 * The turnOffSprinkler method simply turns of the sprinkler by setting the sprinkler variable to false 
	 */
	
	public void turnOffSprinkler() throws IOException {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
		
		pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Sprinkler Turned OFF\n");
		pw.flush();
		pw.close();
	}
}

