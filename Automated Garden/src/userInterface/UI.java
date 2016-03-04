package userInterface;

import java.io.IOException;
import java.util.Scanner;

import bioChemicalSystem.Bio;
import fertilizerSystem.Fertilizer;
import heatingSystem.Heater;
import plants.Aster;
import plants.Astilbe;
import plants.CrapeMyrtleGPlan;
import wateringSystem.Sprinkler;

public class UI {
	
	public static void main(String args[]) {
		userInterface();
	}

	public static void userInterface() {
		while(true) {
			System.out.println("Choose for which plant you want to change the growing plan");
			System.out.println("(1): CrapeMyrtle\n(2): Aster\n(3): Astilbe ");
			System.out.println("Perform actions: ");
			System.out.println("(4): Turn heater On\n(5): Turn Sprinkler On\n(6): Turn Fertlizer On (7): Turn Pest System On");
			Scanner in = new Scanner(System.in);
			int plant = in.nextInt();
		
			switch(plant) {
		
			case 1:
				CrapeMyrtleGPlan cm = new CrapeMyrtleGPlan();
				cm.modifyPlan();
				break;
			case 2:
				Aster a = new Aster();
				a.modifyPlan();
				break;
		
			case 3:
				Astilbe at = new Astilbe();
				at.modifyPlan();
				break;
			case 4:
				Heater h = new Heater();
				System.out.println("Heater is turned ON. Check log file for time stamps");
				System.out.println("This task will take one minute to complete. Please wait..");
							
				h.turnOnHeater();
				
				break;
			case 5:
				Sprinkler sp = new Sprinkler();
				System.out.println("Heater is turned ON. Check log file for time stamps");
				System.out.println("This task will take one minute to complete. Please wait..");
			try {
				sp.runSprinkler();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case 6:
			Fertilizer f = new Fertilizer();
			System.out.println("Fertilizer is turned ON. Check log file for time stamps");
			System.out.println("This task will take one minute to complete. Please wait..");
			try {
				f.runFertilizer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		case 7:
			Bio b = new Bio();
			System.out.println("Pest System is turned ON. Check log file for time stamps");
			System.out.println("This task will take one minute to complete. Please wait..");
			try {
				b.runPestSystem();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			System.exit(0);
		}	
	}
	}
}








