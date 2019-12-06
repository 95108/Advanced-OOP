
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


public class Interface2FX extends Application {
    
    public static void main(String[] args) {
        // TODO code application logic her
        launch(args);
    }

    @Override
           
      public void start(Stage stage){
        
        //Create Label Genres
        Text text1 = new Text("Genres:");
        
        //Create Label Name
        Text text2 = new Text("Name:");
        
        //Create Label Registered
        Text text3 = new Text("Registered:");
        
        
        //Create Text Field for Name
        TextField textField2 = new TextField();
        
              
        
        //Create Combo Box for Genres
        ComboBox comboBox1 = new ComboBox();
        comboBox1.getItems().addAll(
            "Action",
            "Horror",
            "Adventure",
            "Comedy",
            "Drama"  
        );
        
         comboBox1.setValue("Horror");
        
        
        //Create Combo Box for Registered
        ComboBox comboBox2 = new ComboBox();
        comboBox2.getItems().addAll(
              
        );
        
        //Creating Buttons 
      Button button1 = new Button("Save Movie"); 
      Button button2 = new Button("Remove Movie");
      
      
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
      gridPane.add(textField2, 1, 2);
      gridPane.add(button1, 1, 3);
      
      gridPane.add(text3, 0, 5);
      gridPane.add(comboBox2, 1, 5);
      gridPane.add(button2, 1, 6);
      
      //Styling nodes  
      button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
       
      text1.setStyle("-fx-font: normal  15px 'serif' "); 
      text2.setStyle("-fx-font: normal  15px 'serif' ");
      text3.setStyle("-fx-font: normal 15px 'serif' ");
      gridPane.setStyle("-fx-background-color: WHITE;");
      
      
      //Creating a scene object 
      Scene scene = new Scene(gridPane); 
      
      //Setting title to the Stage 
      //stage.setTitle("Movie Library System"); 
         
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show();
        
    }
    
}
