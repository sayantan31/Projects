package fertilizerSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import timing.Timing;


public class Fertilizer extends Thread {
	
	boolean fertilizer;
	
	/*
	 * The runFertilizer method performs the following functions:
	 *     a) First, it gets the current time.
	 *     b) If the time is divisible by 12, we turn on the fertilizer for 1 minute.
	 *     c) This denotes that we turn on the fertilizer 1 time per day, at 12 PM   
	 */
	
	public void run() {
		Fertilizer f = new Fertilizer();
		while(true) {
			try {
				try {
					f.runFertilizer();
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
	
	public void runFertilizer() throws InterruptedException, IOException {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
		Thread.sleep(60000);
		if(Timing.current.get("hour")%6 == 0) {
			fertilizer = true;

			pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Turning Fertilizer ON\n");
			Thread.sleep(60000);
			fertilizer = false;

			pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Turning Fertilizer OFF\n");
			pw.flush();
			pw.close();
		}
	}
	
	public void turnOnFertilizer() throws InterruptedException, IOException {
		runFertilizer();
	}
	
	public void turnOffFertilizer() {
		fertilizer = false;
	}
}
