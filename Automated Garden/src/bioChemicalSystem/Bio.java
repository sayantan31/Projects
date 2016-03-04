package bioChemicalSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import sensoringSystem.Sensor;
import timing.Timing;


public class Bio extends Thread {
	
	boolean isPestAffected;
	
	public static void main(String args[]) throws InterruptedException {
		Bio b = new Bio();
		
		try {
			b.turnOnPestSystem();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	boolean fertilizer;
	
	public void run() {
		Bio bio = new Bio();
		while(true) {
			try {
				try {
					bio.runPestSystem();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void runPestSystem() throws InterruptedException, IOException {
		
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
		
		isPestAffected = Sensor.pestAffected ? true : false;
		
		if(isPestAffected == true) {

			pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Pest System ON\n");
			Thread.sleep(60000);
			isPestAffected = false;

			pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Pest System OFF\n");
			
			pw.flush();
			pw.close();
		}
	}
	
	/*
	 * The turnOnPestSystem() method performs the following functions:
	 *       a) First, it checks if there are pests in the system.
	 *       b) If there are pests, it turns on the pest system ON for a minute and then turns it off.
	 */
	
	public void turnOnPestSystem() throws InterruptedException, IOException {
		new Bio().runPestSystem();
	}
	
	/*
	 * The turnOffPestSystem method simply turns off the pest system  by setting the pestMachine variable to false 
	 */
	
	public void turnOffPestSystem() throws IOException {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
		isPestAffected = false;

		pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Pest System OFF\n");
		pw.flush();
		pw.close();
	}
}
