  
package hellofx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage; // connect primary stage
        mainWindow();
    }

    // main window
    public void mainWindow() {
        try {
            // view
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindowView.fxml"));
            AnchorPane pane = loader.load();

            // controller
            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(this);

            // scene on stage
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    private static class MainWindowController {

        public MainWindowController() {
        }

        private void setMain(Main aThis) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
