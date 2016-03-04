package sensoringSystem;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import masterController.Controller;
import timing.Timing;

public class HeatSensor extends Sensor implements Runnable {

	
	public void run() {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter("writepath", true)));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		while(true) {
			checkForTemperature();
			if(cold == true) {
				
				pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Garden Temperature Below Threshold\n");
				
				
				pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Turning ON Heater\n");
				
				
				pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Heater ON\n");
				
				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Heater OFF\n");
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
