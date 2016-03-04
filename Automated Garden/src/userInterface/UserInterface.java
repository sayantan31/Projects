package userInterface;

import java.util.Scanner;

import plants.Aster;
import plants.Astilbe;
import plants.CrapeMyrtleGPlan;
import plants.Plant;

public class UserInterface {

	public static void runInterface() {
		while (true) {
			System.out.println("Choose for which plant you want to change the growing plan");
			System.out.println("(1): Option 1 - CrapeMyrtle\n(2): Option 2 - Aster\n(3): Option 3 - Astilbe\n(4): Exit");
			Scanner in = new Scanner(System.in);
			int plant = in.nextInt();

			if (plant == 4) {
				System.exit(0);
			}


			if(plant == 1) {
				System.out.println("What action do you want to perform on the plant?");
				System.out.println("(1): Option 1 - Heater\n(2): Option 2 - Fertilizer\n(3): Option 3 - Water\n(4): Exit");
				int action = in.nextInt();
				if(action==1) {
					System.out.println("At what time do you want to perform the task");
					System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
					int time = in.nextInt();
					if(time == 1 && !Plant.l1.isEmpty()) Plant.l1.add(6);
					if(time == 2 && !Plant.l1.isEmpty()) Plant.l1.add(10);
					if(time == 3 && !Plant.l1.isEmpty()) Plant.l1.add(15);
					if(time == 4 && !Plant.l1.isEmpty()) Plant.l1.add(21);
				}
				else if(action==2) {
						System.out.println("At what time do you want to perform the task");
						System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
						int time = in.nextInt();
						if(time == 1 && !Plant.l2.isEmpty()) Plant.l2.add(6);
						if(time == 2 && !Plant.l2.isEmpty()) Plant.l2.add(10);
						if(time == 3 && !Plant.l2.isEmpty()) Plant.l2.add(15);
						if(time == 4 && !Plant.l2.isEmpty()) Plant.l2.add(21);
				}
				else if(action==3) {
						System.out.println("At what time do you want to perform the task");
						System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
						int time = in.nextInt();
						if(time == 1 && !Plant.l3.isEmpty()) Plant.l3.add(6);
						if(time == 2 && !Plant.l3.isEmpty()) Plant.l3.add(10);
						if(time == 3 && !Plant.l3.isEmpty()) Plant.l3.add(15);
						if(time == 4 && !Plant.l3.isEmpty()) Plant.l3.add(21);
					}
				}
				else if(plant==2) {
					System.out.println("What action do you want to perform on the plant?");
					System.out.println("(1): Option 1 - Heater\n(2): Option 2 - Fertilizer\n(3): Option 3 - Water\n(4): Exit");
					int action = in.nextInt();
					if(action==1) {
						System.out.println("At what time do you want to perform the task");
						System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
						int time = in.nextInt();
						if(time == 1 && !Plant.l3.isEmpty()) Plant.l1.add(6);
						if(time == 2 && !Plant.l3.isEmpty()) Plant.l1.add(10);
						if(time == 3 && !Plant.l3.isEmpty()) Plant.l1.add(15);
						if(time == 4 && !Plant.l3.isEmpty()) Plant.l1.add(21);
					}
					if(action==2) {
						System.out.println("At what time do you want to perform the task");
						System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
						int time = in.nextInt();
						if(time == 1 && !Plant.l2.isEmpty()) Plant.l2.add(6);
						if(time == 3 && !Plant.l2.isEmpty()) Plant.l2.add(15);
						if(time == 4 && !Plant.l2.isEmpty()) Plant.l2.add(21);
					}
					else if(action==3) {
						System.out.println("At what time do you want to perform the task");
						System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
						int time = in.nextInt();
						if(time == 1 && !Plant.l3.isEmpty()) Plant.l3.add(6);
						if(time == 2 && !Plant.l3.isEmpty()) Plant.l3.add(10);
						if(time == 3 && !Plant.l3.isEmpty()) Plant.l3.add(15);
						if(time == 4 && !Plant.l3.isEmpty()) Plant.l3.add(21);
					}
					else if(action==4) {
						System.out.println("At what time do you want to perform the task");
						System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
						int time = in.nextInt();
						if(time == 1 && !Plant.l4.isEmpty()) Plant.l4.add(6);
						if(time == 2 && !Plant.l4.isEmpty()) Plant.l4.add(10);
						if(time == 3 && !Plant.l4.isEmpty()) Plant.l4.add(15);
						if(time == 4 && !Plant.l4.isEmpty()) Plant.l4.add(21);
					}
					
					else if(plant==3) {
						System.out.println("What action do you want to perform on the plant?");
						System.out.println("(1): Option 1 - Heater\n(2): Option 2 - Fertilizer\n(3): Option 3 - Water\n(4): Exit");
						action = in.nextInt();
						if(action==1) {
							System.out.println("At what time do you want to perform the task");
							System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
							int time = in.nextInt();
							if(time == 1 && !Plant.l1.isEmpty()) Plant.l1.add(6);
							if(time == 2 && !Plant.l1.isEmpty()) Plant.l1.add(10);
							if(time == 3 && !Plant.l1.isEmpty()) Plant.l1.add(15);
							if(time == 4 && !Plant.l1.isEmpty()) Plant.l1.add(21);
						}
						if(action==2) {
							System.out.println("At what time do you want to perform the task");
							System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
							int time = in.nextInt();
							if(time == 1 && !Plant.l2.isEmpty()) Plant.l2.add(6);
							if(time == 2 && !Plant.l2.isEmpty()) Plant.l2.add(10);
							if(time == 3 && !Plant.l2.isEmpty()) Plant.l2.add(15);
							if(time == 4 && !Plant.l2.isEmpty()) Plant.l2.add(21);
						}
						else if(action==3) {
							System.out.println("At what time do you want to perform the task");
							System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
							int time = in.nextInt();
							if(time == 1 && !Plant.l3.isEmpty()) Plant.l3.add(6);
							if(time == 2 && !Plant.l3.isEmpty()) Plant.l3.add(10);
							if(time == 3 && !Plant.l3.isEmpty()) Plant.l3.add(15);
							if(time == 4 && !Plant.l3.isEmpty()) Plant.l3.add(21);
						}
						else if(action==4) {
							System.out.println("At what time do you want to perform the task");
							System.out.println("Choice: [1] 6AM, [2] 10AM, [3] 3PM, [4] 6PM");
							int time = in.nextInt();
							if(time == 1 && !Plant.l4.isEmpty()) Plant.l4.add(6);
							if(time == 2 && !Plant.l4.isEmpty()) Plant.l4.add(10);
							if(time == 3 && !Plant.l4.isEmpty()) Plant.l4.add(15);
							if(time == 4 && !Plant.l4.isEmpty()) Plant.l4.add(21);
						}
				
					}
				}		
		}
	}
}