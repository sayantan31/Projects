package GUI;

import java.awt.Color;
import java.io.IOException;

import bioChemicalSystem.Bio;
import fertilizerSystem.Fertilizer;
import heatingSystem.Heater;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import plants.Aster;
import wateringSystem.Sprinkler;

public class UserInterface extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
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
        VBox west = new VBox(50);
        west.setPrefWidth(80);
        west.setStyle("-fx-background-color: #78AB46;");
        ChoiceBox<String> choiceBox4 = new ChoiceBox<>();
        choiceBox4.getItems().addAll("Aster","Sprinkler", "Heater", "Pest","Fertilizer");
        choiceBox4.setValue("Aster");
        
        button4.setOnAction(e -> getActionCrapeMyrtle(choiceBox4));
        
        
        Button button5 = new Button("Go");
        ChoiceBox<String> choiceBox5 = new ChoiceBox<>();
        choiceBox5.getItems().addAll("Astilbe","Sprinkler", "Heater", "Pest","Fertilizer");
        choiceBox5.setValue("Astilbe");
        
        button5.setOnAction(e -> getActionCrapeMyrtle(choiceBox5));
        
        Button button6 = new Button("Go");
        ChoiceBox<String> choiceBox6 = new ChoiceBox<>();
        choiceBox6.getItems().addAll("CrapeMyrtle","Sprinkler", "Heater", "Pest","Fertilizer");
        choiceBox6.setValue("CrapeMyrtle");
        button6.setOnAction(e -> getActionCrapeMyrtle(choiceBox6));
        
        Label lbl2 = new Label("West Plants:  ");
        lbl2.setMinWidth(120);
        lbl2.setFont(Font.font("", FontWeight.BOLD, 15));
        
        
        west.getChildren().addAll(lbl2, choiceBox4, button4, choiceBox5, button5, choiceBox6, button6);
        
        VBox east = new VBox(50);
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
        
        VBox center = new VBox(50);
        center.setPrefWidth(80);
        center.setStyle("-fx-background-color: #78AB46;");
        ChoiceBox<String> choiceBox10 = new ChoiceBox<>();
        choiceBox10.getItems().addAll("Aster","3 AM", "7 AM", "3 PM","6PM");
        choiceBox10.setValue("Aster");
        
        ChoiceBox<String> choiceBox11 = new ChoiceBox<>();
        choiceBox11.getItems().addAll("Astilbe","3 AM", "7 AM", "3 PM","6PM");
        choiceBox11.setValue("Astilbe");
        
        
        ChoiceBox<String> choiceBox12 = new ChoiceBox<>();
        choiceBox12.getItems().addAll("CrapeMyrtle","3 AM", "7 AM", "3 PM","6PM");
        choiceBox12.setValue("CrapeMyrtle");
        
        Label lbl4 = new Label("Growing Plan:  ");
        lbl4.setMinWidth(125);
        lbl4.setFont(Font.font("", FontWeight.BOLD, 15));
        
        
        center.getChildren().addAll(lbl4, choiceBox10, choiceBox11, choiceBox12);
        center.setAlignment(Pos.CENTER);
        
        
        
        BorderPane border = new BorderPane();
        border.setTop(north);
        border.setLeft(west);	
        border.setRight(east);
        border.setCenter(center);
        
        
        
        Scene scene = new Scene(border, 900, 500);
        window.setScene(scene);
        window.show();
    }
    
    public void getActionAster(ChoiceBox<String> choiceBox) {
    	
    	Aster a = new Aster();
    	String action = choiceBox.getValue();
    	
    	a.runAction(action);
    	
    }
    
    public void getActionAstilbe(ChoiceBox<String> choiceBox) {
    	
    	Aster a = new Aster();
    	String action = choiceBox.getValue();
    	
    	a.runAction(action);
    	
    }

    public void getActionCrapeMyrtle(ChoiceBox<String> choiceBox) {
	
	Aster a = new Aster();
	String action = choiceBox.getValue();
	
	a.runAction(action);
	
  }
}
