package plants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Plant {

	public static HashMap<Integer, List<Integer>> heatPlan;
	public static HashMap<Integer, List<Integer>> fertilizerPlan;
	public static HashMap<Integer, List<Integer>> pestPlan;
	public static HashMap<Integer, List<Integer>> waterPlan;
	
	public static List<Integer> l1;
	public static List<Integer> l2;
	public static List<Integer> l3;
	public static List<Integer> l4;
	
	public String name = "CrapeMyrtle";
	
	public Plant() {
		heatPlan = new HashMap<>();
		fertilizerPlan = new HashMap<>();
		pestPlan = new HashMap<>();
		waterPlan = new HashMap<>();
		
		l1 = new LinkedList<Integer>();	
		l2 = new LinkedList<Integer>();	
		l3 = new LinkedList<Integer>();	
		l4 = new LinkedList<Integer>();	
		
	}

	public void GrowingHeatPlan() {
		l1.add(5);
		l1.add(15);
		l1.add(21);
	
		heatPlan.put(5,l1);
		heatPlan.put(10,l1);
		heatPlan.put(15,l1);
		
	}
	
	
	public void GrowingFertilizerPlan() {
		l2.add(4);
		l2.add(12);
		l2.add(18);
	
		fertilizerPlan.put(12,l2);
		fertilizerPlan.put(24,l2);
	}
	
	public void GrowingPestPlan() {
		l3.add(4);
		l3.add(12);
		l3.add(18);
	
		pestPlan.put(12,l2);
		pestPlan.put(24,l2);
	}
	
	public void WaterPlan() {
		l4.add(12);
		l4.add(18);
		l4.add(24);
	
		waterPlan.put(12,l2);
		waterPlan.put(24,l2);
	}
}
