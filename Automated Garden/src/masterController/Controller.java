package masterController;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bioChemicalSystem.Bio;
import fertilizerSystem.Fertilizer;
import heatingSystem.Heater;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;
import plants.Aster;
import plants.Astilbe;
import plants.CrapeMyrtleGPlan;
import plants.Plant;
import sensoringSystem.HeatSensor;
import sensoringSystem.PestSensor;
import sensoringSystem.RainSensor;
import sensoringSystem.Sensor;
import timing.Timing;
import userInterface.UI;
import userInterface.UserInterface;
import wateringSystem.Sprinkler;


public class Controller extends Application  {
	
	Stage window;
	TreeView<String> tree;
	ListView<String> listView;
	PrintWriter pw = null;
	
	public static void main(String args[]) throws InterruptedException, IOException   {
		
		
		Timing time = new Timing();
		
    	time.start();
    	
    	Plant p = new Plant();
    	p.GrowingHeatPlan();
    	p.GrowingPestPlan();
    	p.GrowingFertilizerPlan();
    	
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	Sensor sense = new Sensor();
    	
    	sense.start();
    		
    	HeatSensor hs = new HeatSensor();
    	
    	Thread heatSense = new Thread(hs);
    	
    	heatSense.start();
    	
    	//PestSensor pestSense = new PestSensor();
    	
    	//pestSense.start();
    	
    	RainSensor rainSense = new RainSensor();
    	
    	rainSense.start();
    	
    	Sprinkler sp = new Sprinkler();
    	
    	sp.start();
    	
    	Fertilizer f = new Fertilizer();
    	
    	f.start();
    	
    	Bio b = new Bio();
    	
    	b.start();
    	
    	
    	Thread.sleep(1000);
    	
    	launch(args);
    	
    	time.join();

    	sp.join();
    	f.join();
    	b.join();
	}	
	
	
	public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
	
	public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Automated Garden");
        Button button1 = new Button("Go");
        Button button2 = new Button("Go");
        Button button3 = new Button("Go");
        
        
        HBox north = new HBox(50);
        north.setPrefHeight(80);
        north.setStyle("-fx-background-color: #78AB46;");
        //north.setPadding(new Insets(10, 50, 50, 50));
        north.setAlignment(Pos.BASELINE_RIGHT);
        
        ChoiceBox<String> choiceBox1 = new ChoiceBox<>();
        choiceBox1.getItems().addAll("Aster","Sprinkler", "Heater", "Pest","Fertilizer");
        choiceBox1.setValue("Aster");
        
        button1.setOnAction(e -> getActionAster(choiceBox1));
        
        ChoiceBox<String> choiceBox2 = new ChoiceBox<>();
        choiceBox2.getItems().addAll("Astilbe","Sprinkler", "Heater", "Pest","Fertilizer");
        choiceBox2.setValue("Astilbe");
        button2.setOnAction(e -> getActionAstilbe(choiceBox2));
        
        ChoiceBox<String> choiceBox3 = new ChoiceBox<>();
        choiceBox3.getItems().addAll("CrapeMyrtle","Sprinkler", "Heater", "Pest","Fertilizer");
        choiceBox3.setValue("CrapeMyrtle");
        button3.setOnAction(e -> getActionCrapeMyrtle(choiceBox3));
     
        Label lbl1 = new Label("North Plants:  ");
        lbl1.setMinWidth(125);
        lbl1.setFont(Font.font("", FontWeight.BOLD, 15));
        
        north.getChildren().addAll(lbl1, choiceBox1,button1,choiceBox2, button2, choiceBox3, button3);

        
        
        Button button4 = new Button("Go");
        VBox west = new VBox(10);
        west.setPrefWidth(80);
        west.setStyle("-fx-background-color: #78AB46;");
        ChoiceBox<String> choiceBox4 = new ChoiceBox<>();
        choiceBox4.getItems().addAll("Aster","Sprinkler", "Heater", "Pest","Fertilizer");
        choiceBox4.setValue("Aster");
        
        button4.setOnAction(e -> getActionAster(choiceBox4));
        
        
        Button button5 = new Button("Go");
        ChoiceBox<String> choiceBox5 = new ChoiceBox<>();
        choiceBox5.getItems().addAll("Astilbe","Sprinkler", "Heater", "Pest","Fertilizer");
        choiceBox5.setValue("Astilbe");
        
        button5.setOnAction(e -> getActionAstilbe(choiceBox5));
        
        Button button6 = new Button("Go");
        ChoiceBox<String> choiceBox6 = new ChoiceBox<>();
        choiceBox6.getItems().addAll("CrapeMyrtle","Sprinkler", "Heater", "Pest","Fertilizer");
        choiceBox6.setValue("CrapeMyrtle");
        button6.setOnAction(e -> getActionCrapeMyrtle(choiceBox6));
        
        Label lbl2 = new Label("West Plants:  ");
        lbl2.setMinWidth(120);
        lbl2.setFont(Font.font("", FontWeight.BOLD, 15));
        
        
        west.getChildren().addAll(lbl2, choiceBox4, button4, choiceBox5, button5, choiceBox6, button6);
        
        VBox east = new VBox(10);
        east.setPrefWidth(80);
        east.setStyle("-fx-background-color: #78AB46;");
        ChoiceBox<String> choiceBox7 = new ChoiceBox<>();
        choiceBox7.getItems().addAll("Aster","Sprinkler", "Heater", "Pest","Fertilizer");
        choiceBox7.setValue("Aster");
        Button button7 = new Button("Go");
        button7.setOnAction(e -> getActionAster(choiceBox7));
        
        ChoiceBox<String> choiceBox8 = new ChoiceBox<>();
        choiceBox8.getItems().addAll("Astilbe","Sprinkler", "Heater", "Pest","Fertilizer");
        choiceBox8.setValue("Astilbe");
        Button button8 = new Button("Go");
        button8.setOnAction(e -> getActionAstilbe(choiceBox8));
        
        ChoiceBox<String> choiceBox9 = new ChoiceBox<>();
        choiceBox9.getItems().addAll("CrapeMyrtle","Sprinkler", "Heater", "Pest","Fertilizer");
        choiceBox9.setValue("CrapeMyrtle");
        Button button9 = new Button("Go");
        button9.setOnAction(e -> getActionCrapeMyrtle(choiceBox9));
        
        
        Label lbl3 = new Label("East Plants:  ");
        lbl3.setMinWidth(120);
        lbl3.setFont(Font.font("", FontWeight.BOLD, 15));
        
        
        east.getChildren().addAll(lbl3, choiceBox7, button7, choiceBox8, button8, choiceBox9, button9);
        
        VBox center = new VBox(20);
        center.setPrefWidth(40);
        
        Label lbl4 = new Label("Growing Plan:  ");
        lbl4.setMinWidth(125);
        lbl4.setFont(Font.font("", FontWeight.BOLD, 15));
        
       
       
       TextField Aster = new TextField("Type service and time (e.g heater 6 AM) for plant Aster");
       Button asterButton = new Button("Go");
       asterButton.setOnAction(e -> GPAster(Aster.getText()));
       
       TextField Astilbe = new TextField("Type service and time (e.g heater 6 AM) for plant Astilbe");
       Button astilbeButton = new Button("Go");
       astilbeButton.setOnAction(e -> GPAstilbe(Astilbe.getText()));
       
       /*TextField CrapeMyrtle = new TextField("Type service and time (e.g heater 6 AM) for plant CrapeMyrtle");
       Button cmButton = new Button("Go");
       cmButton.setOnAction(e -> GPCrape(cmButton.getText()));*/
       
       
       
       center.setStyle("-fx-background-color: #78AB46;");
       center.getChildren().addAll(lbl4, Aster, asterButton, Astilbe, astilbeButton);
       center.setAlignment(Pos.BASELINE_LEFT);
      
       
       HBox south = new HBox();
       //south.setPrefHeight(80);
       south.setStyle("-fx-background-color: #78AB46;");
       //north.setPadding(new Insets(10, 50, 50, 50));
       south.setAlignment(Pos.TOP_CENTER);
      
       listView = new ListView<>();
       listView.getItems().addAll("AVAILABLE SERVCES","Heater", "Fertilizer", "Pest", "Sprinkler");
       listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
       
       south.getChildren().add(listView);
        
        BorderPane border = new BorderPane();
        border.setTop(north);
        border.setLeft(west);	
        border.setRight(east);
        border.setCenter(center);
        border.setBottom(south);
        
        Scene scene = new Scene(border, 900, 500);
        window.setScene(scene);
        window.show();
    }
   
	
	public void GPAster(String s) {
		
		String[] str = s.split(" ");
		
		
		int time = Integer.parseInt(str[1]);
		
		System.out.println(str[0]);
		
		String plant = str[0].toLowerCase();
		
		if(plant.equals("heater")) {
			Plant.l1.add(time);
			display("Alert ", "Time Added to growing plan");
			
		}
		else if(plant.equals("fertilizer")) {
			Plant.l2.add(time);
			display("Alert ", "Time Added to growing plan");
		}
		else if(plant.equals("sprinkler")) {
			Plant.l4.add(time);
			display("Alert ", "Time Added to growing plan");
		}
		else if(plant.equals("pest")) {
			Plant.l3.add(time);
			display("Alert ", "Time Added to growing plan");
		}
		else {
			System.out.println("Unrecognized plant name");
		}
	}
	
	public void GPAstilbe(String s) {
	
		
		String[] str = s.split(" ");
		
		
		int time = Integer.parseInt(str[1]);
		
		System.out.println(str[0]);
		
		String plant = str[0].toLowerCase();
		
		if(plant.equals("heater")) {
			Plant.l1.add(time);
			display("Alert ", "Time Added to growing plan");
		}
		else if(plant.equals("fertilizer")) {
			Plant.l2.add(time);
			display("Alert ", "Time Added to growing plan");
		}
		else if(plant.equals("sprinkler")) {
			Plant.l4.add(time);
			display("Alert ", "Time Added to growing plan");
		}
		else if(plant.equals("pest")) {
			Plant.l3.add(time);
			display("Alert ", "Time Added to growing plan");
		}
		else {
			System.out.println("Unrecognized plant name");
		}
	}
	
	public void GPCrape(String s) {
		
	
	String[] str = s.split(" ");
		
		
		int time = Integer.parseInt(str[1]);
		
		System.out.println(str[0]);
		
		String plant = str[0].toLowerCase();
		
		if(plant.equals("heater")) {
			Plant.l1.add(time);
			display("Alert ", "Time Added to growing plan");
		}
		else if(plant.equals("fertilizer")) {
			Plant.l2.add(time);
			display("Alert ", "Time Added to growing plan");
		}
		else if(plant.equals("sprinkler")) {
			Plant.l4.add(time);
			display("Alert ", "Time Added to growing plan");
		}
		else if(plant.equals("pest")) {
			Plant.l3.add(time);
			display("Alert ", "Time Added to growing plan");
		}
		else {
			System.out.println("Unrecognized plant name");
		}
	}
	
    public void getActionAster(ChoiceBox<String> choiceBox)  {
    	PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Aster a = new Aster();
    	String action = choiceBox.getValue();
    	pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + action + " was turned ON for plant Aster\n");
    	
    	display("Alert ", action + " was turned ON for plant Aster.");
    	
    	a.runAction(action);
    	pw.flush();
    	pw.close();
    }
    
    public void getActionAstilbe(ChoiceBox<String> choiceBox) {
    	
    	PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	Astilbe a = new Astilbe();
    	
    	String action = choiceBox.getValue();

    	pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + action + " was turned ON for plant Astilbe\n");
    
    	display("Alert ", action + " was turned ON.");
    	
    	a.runAction(action);
    	pw.flush();
    	pw.close();
    	
    }

    public void getActionCrapeMyrtle(ChoiceBox<String> choiceBox) {
	
    	PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter("writePath", true)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    	
		CrapeMyrtleGPlan a = new CrapeMyrtleGPlan();
		String action = choiceBox.getValue();
	
	
		a.runAction(action);
		pw.write("Day " + Timing.current.get("day") + " " + "Hour: " + Timing.current.get("hour")+ "\t\t\t" + action + " was turned ON for plant CrapeMyrtle\n");
		display("Alert ", action + " was turned ON.");
	
		pw.flush();
		pw.close();
    }
    
  public void growlingPlanAster(ChoiceBox<String> choiceBox) {
	  
	  String action = choiceBox.getValue();
	  
	  switch(action) {
		case "3 AM":
				Plant.l1.add(3);
				System.out.println("Time Added to growing plan");
				System.out.println("Heater will start at specified hours");
				break;
		case "7 AM":
			Plant.l2.add(7);
			System.out.println("Time Added to growing plan");
			System.out.println("Fertilizer will start at specified hours");
			break;
		case "3 PM":
			Plant.l4.add(15);
			System.out.println("Time Added to growing plan");
			System.out.println("Sprinkler will start at specified  hours");
			break;
		default: 
			System.exit(0);
		}
	  
  }
  
  public static void display(String title, String message) {
      Stage window = new Stage();

     
      window.initModality(Modality.APPLICATION_MODAL);
      window.setTitle(title);
      window.setMinWidth(250);

      Label label = new Label();
      label.setText(message);
      Button closeButton = new Button("Close");
      closeButton.setOnAction(e -> window.close());

      VBox layout = new VBox(10);
      layout.getChildren().addAll(label, closeButton);
      layout.setAlignment(Pos.CENTER);

     
      Scene scene = new Scene(layout);
      window.setScene(scene);
      window.showAndWait();
  }
}

	

