package sensoringSystem;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import timing.Timing;

public class Sensor extends Thread{
	public static boolean cold;
	public static boolean raining;
	public static boolean rained;
	public static boolean pestAffected;
	
	public static void reset() {
		cold = false;
		raining = false;
		pestAffected = false;
	}
	
	
	public void run() {	
		
		while(true) {
			checkForTemperature();
			checkForRain();
			try {
				checkForPest();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	/*
	 * The static method getRandomNumber generated a random number from 0-100. 
	 */
	
	public static int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(100);
	}
	
	/*
	 * The checkForTemperature method performs the following functions:
	 *        a) First it generates a random number.
	 *        b) If the generated random number is less than 20, in this model it denotes to be a cold temperature.
	 *        c) If the temperature is cold it turns on the heater.
	 */
	public static void checkForTemperature() {
		int r = getRandomNumber();
		//System.out.println("Random Value: " + r);
		
		if(r < 10) {
			cold = true;
		}
	}
	
	/*
	 * Below method performs the following functions:
	 *       a) First it generated a random number
	 *       b) If the generated random number is greater than 80, in this model it means raining.
	 *       c) Hence, it sets the raining variable to true in that case.
	 */
	
	public static void checkForRain() {
		int r = getRandomNumber();
		//System.out.println("Random Value: " + r);
		
		if(r > 90) {
			raining = true;
		}
	}
	
	/*
	 * Below method performs the following functions:
	 *   a) First it generated a random number
	 *   b) If the generated number is greater than 80, in this model it denotes the garden is affect by pest and needs pesticides.
	 *   c) Hence, it sets the pestAffected variable to true
	 */
	
	public static void checkForPest() throws IOException {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
		int r = getRandomNumber();
	//System.out.println("Random Value: " + r);
		
		if(r > 90) {
			pestAffected = true;
		}
		pw.flush();
		pw.close();
	}
}
