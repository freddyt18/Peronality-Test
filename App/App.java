package App;
import java.io.IOException;
import java.util.Currency;
import java.util.LinkedList;

import Data.Data_Handling.DataHandling;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DisplacementMap;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage; 

public class App extends Application {
    private boolean firstTime = true;
    FXMLLoader loader = new FXMLLoader();
    private static Stage current;
    static Parent root;
    static Scene scene;
    public static int CURRENT_USER_ID = -1;

    public static void main(String[] args) throws IOException {
        DataHandling.main(args);
        launch(args);
        // if all of the windows are closed, the program will output this
        /* 
        Best practice for storing data to info.dat file and prevent data loss after user exits / accidentally close
        the program.
         */
        System.out.println("ALL PROGRAM EXITS");
        DataHandling.listToData();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        current = primaryStage;
        showLogin();
    }

    private void setRoot() throws IOException {
        loader.setLocation(App.class.getResource("LOGIN_FORM.fxml"));
        root = loader.load();
    }
    public void showLogin() throws IOException {
        if(firstTime){
            setRoot(); //1200, 657.53
            scene = new Scene(root, 835, 500);
            current.setScene(scene);
            firstTime = false;
        }
        current.setTitle("Login Form");
        current.getIcons().add(new Image("https://cdn.iconscout.com/icon/premium/png-64-thumb/personality-disorder-2708518-2248491.png"));
        current.setMaxHeight(550);
        current.setMaxWidth(850);
        current.show();
    }  
    
    public void exit() throws IOException {
        current.close();
    }

    
}
