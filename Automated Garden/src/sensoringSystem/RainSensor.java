package sensoringSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import timing.Timing;

public class RainSensor extends Sensor {

	public void run() {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while(true) {
			checkForRain();
			if(raining == true) {
				
				pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Its Raining. Skipping the sprinkler\n");				

				reset();
			}
			
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			pw.flush();
			pw.close();
		}
		
	}
}
