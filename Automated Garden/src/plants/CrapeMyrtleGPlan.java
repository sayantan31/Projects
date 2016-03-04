package plants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import bioChemicalSystem.Bio;
import fertilizerSystem.Fertilizer;
import heatingSystem.Heater;
import timing.Timing;
import wateringSystem.Sprinkler;

public class CrapeMyrtleGPlan extends Plant implements Runnable {
	
public void runAction(String action){
        
	PrintWriter pw = null;
	
	try {
		pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    switch(action) {
    
    case "Heater":
		Heater h = new Heater();
		//pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Heater On\n");
		
					
		//h.turnOnHeater();
		h.start();
		
		break;
	case "Sprinkler":
		Sprinkler sp = new Sprinkler();
		pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Sprinkler On\n");
		
	sp.start();
	
	break;
case "Fertilizer":
	Fertilizer f = new Fertilizer();
	pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Fertilizer On\n");
	
	f.start();

	break;
case "Pest":
	Bio b = new Bio();
	pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Pest System On\n");
	
	b.start();
	break;

default:
	pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + "Unrecognized Service\n");
    
    }
    	
    }
	
	
	
	public void modifyPlan() {
		System.out.println("Select action:  \n");
		System.out.println("Option 1 - Heater\n(2): Option 2 - Fertilizer\n(3): Option 3 - Water\n(4): Exit");
		Scanner in = new Scanner(System.in);
		int action = in.nextInt();
		
	switch(action) {
	case 1:
			System.out.println("At what time do you want to perform the task");
			System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
			int time = in.nextInt();
			l1.add(time);
			System.out.println("Time added in the growing plan");
			System.out.println("Heater will start at specified hours");
			break;
	case 2:
		System.out.println("At what time do you want to perform the task");
		System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
		time = in.nextInt();
		l2.add(time);
		System.out.println("Time added in the growing plan");
		System.out.println("Fertilizer will start at specified hours");
		break;
	case 3:
		System.out.println("At what time do you want to perform the task");
		System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
		time = in.nextInt();
		l4.add(time);
		System.out.println("Time added in the growing plan");
		System.out.println("Sprinkler will start at specified  hours");
		break;
	default: 
		System.exit(0);
	}
}
			
	
	public void run() {
		while(true) {
			 {
				 int today=Timing.current.get("day");
				 int now=Timing.current.get("hour");
				 
				 if(heatPlan.containsKey(today) && l1.contains(now)) {
					 Heater h = new Heater();
					
					 h.turnOnHeater();
					
				 
				 if(fertilizerPlan.containsKey(today) && l1.contains(now)) {
					 Fertilizer f = new Fertilizer();
					 try {
						f.runFertilizer();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
				 
				 if(pestPlan.containsKey(today) && l1.contains(now)) {
					 Bio b = new Bio();
					 try {
						b.runPestSystem();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
				 
				 if(waterPlan.containsKey(today) && l1.contains(now)) {
					 Sprinkler s = new Sprinkler();
					 try {
						s.runSprinkler();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
				 
				 try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
 }
}
