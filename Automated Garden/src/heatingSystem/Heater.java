package heatingSystem;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import masterController.Controller;
import sensoringSystem.Sensor;
import timing.Timing;


public class Heater extends Thread {
	
	/*
	 * The turnOnHeater() method performs the following functions:
	 *       a) First, it checks if it is cold.
	 *       b) If it is cold, it turns on the heater for a minute and then turns it off.
	 */
	
	
	public void run() {
		
		while(true) {
			
			if(Sensor.cold==true) {
				turnOnHeater();
			}
			
			try {
				sleep(120000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void checkTemperature() throws InterruptedException, IOException {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
		if(Sensor.cold == true) {
			
			pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Heater On\n");
			
			Thread.sleep(120000);
			System.out.println("check");
			pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Heater OFF\n");
			pw.flush();
			pw.close();
		}
	}
	
	
	public void turnOnHeater() {
		PrintWriter pw = null;
		
		if(Sensor.cold==true) {
			try {
				pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		    
			System.out.println("turn");
			pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Heater On\n");
			try {
				Thread.sleep(120000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Heater OFF\n");
			pw.flush();
			pw.close();
		}
	}
	
	/*
	 * The turnOffHeater method simply turns off the Heater by setting the heat variable to false 
	 */
	
	public void turnOffHeater() throws InterruptedException, IOException {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
		System.out.println("off");
		pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Heater OFF\n");
		pw.flush();
		pw.close();
		
	}
}
