/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofx;

import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class RentalsFX extends Application{

    
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage){
        
        //Create Label Customer
        Text text1 = new Text("Customer:");
        
        //Create Label Genre
        Text text2 = new Text("Genre");
        
        //Create Label Movies
        Text text3 = new Text("Movies");
        
        //Create Label Borrowed
        Text text4 = new Text("Borrowed");
        
        //Create Label Returned
        Text text5 = new Text("Returned");
        
     
        ComboBox comboBox1 = new ComboBox();
        comboBox1.getItems().addAll();
        
        ComboBox comboBox2 = new ComboBox();
        comboBox2.getItems().addAll(
                "Action",
            "Horror",
            "Adventure",
            "Comedy",
            "Drama"
        );
        
        comboBox2.setValue("Horror");
        
        ComboBox comboBox3 = new ComboBox();
        comboBox3.getItems().addAll();
        
        ComboBox comboBox4 = new ComboBox();
        comboBox4.getItems().addAll();
        
        ComboBox comboBox5 = new ComboBox();
        comboBox5.getItems().addAll();
        
        //Creating Buttons 
      Button button1 = new Button("Save Rental"); 
      Button button2 = new Button("Return Movie");
      
      //Creating a Grid Pane and import relevant clases
      GridPane gridPane = new GridPane();
      
      //Setting size for the pane 
      gridPane.setMinSize(600, 400);
      
      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10));
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(10); 
      gridPane.setHgap(10);
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER);
      
       //Arranging all the nodes in the grid 
      gridPane.add(text1, 0, 0); 
      gridPane.add(comboBox1, 1, 0); 
      
      gridPane.add(text2, 0, 2); 
      gridPane.add(comboBox2, 1, 2); 
      
      gridPane.add(text3, 0, 4); 
      gridPane.add(comboBox3, 1, 4);
      gridPane.add(button2, 1, 5);
      
      gridPane.add(text4, 0, 7); 
      gridPane.add(comboBox4, 1, 7);
      gridPane.add(button2, 1, 8);
      
      gridPane.add(text5, 0, 10); 
      gridPane.add(comboBox5, 1, 10); 
      
      //Styling nodes  
      button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
       
      text1.setStyle("-fx-font: normal 15px 'serif' "); 
      text2.setStyle("-fx-font: normal 15px 'serif' ");
       text3.setStyle("-fx-font: normal 15px 'serif' ");
        text4.setStyle("-fx-font: normal 15px 'serif' ");
         text5.setStyle("-fx-font: normal 15px 'serif' ");
      gridPane.setStyle("-fx-background-color: WHITE;");
      
      
      //Creating a scene object 
      Scene scene = new Scene(gridPane); 
      
      //Setting title to the Stage 
      stage.setTitle("Movie Library System"); 
         
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show();
      
      
      
      
    }
    
}
