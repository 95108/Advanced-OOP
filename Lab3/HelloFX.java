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


public class HelloFX extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage){
        
        //step 1: Create Label Name
        Text text1 = new Text("Name:");
        
        //step 2: Create Label Registered
        Text text2 = new Text("Registered");
        
        //step 3: Create Text Field for Name
        TextField textField1 = new TextField();
        
        //step 4: Create Combo Box for Registered
        ComboBox comboBox = new ComboBox();
        
        //Creating Buttons 
      Button button1 = new Button("Save"); 
      Button button2 = new Button("Remove");
      
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
      gridPane.add(textField1, 1, 0); 
      gridPane.add(button1, 1, 1);
      
      gridPane.add(text2, 0, 2); 
      gridPane.add(comboBox, 1, 2); 
      
      gridPane.add(button2, 1, 3);
      
      //Styling nodes  
      button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
       
      text1.setStyle("-fx-font: normal bold 20px 'serif' "); 
      text2.setStyle("-fx-font: normal bold 20px 'serif' ");  
      gridPane.setStyle("-fx-background-color: BEIGE;");
      
      
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
