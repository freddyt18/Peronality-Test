package AfterTest;

import java.io.IOException;

import App.App;
import Data.Data_Handling.DataHandling;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AfterTest {
    FXMLLoader loader = new FXMLLoader();
    public static Stage current = new Stage();
    static Parent root;
    static Scene scene;
    private boolean firstTime = true;


    public void showAfterTest() throws IOException { 
        if(firstTime){
            loader.setLocation(AfterTest.class.getResource("Result.fxml"));
            root = loader.load();
            scene = new Scene(root, 1200, 700);
            current.setScene(scene);
            firstTime = false;
        }
        current.setMaxHeight(720);
        current.setMaxWidth(1210);
        current.setTitle("Test");
        current.getIcons().add(new Image("https://cdn.iconscout.com/icon/premium/png-64-thumb/personality-disorder-2708518-2248491.png"));
        current.show();
    }

    public void showAlert() throws IOException {
        if(firstTime){
            loader.setLocation(AfterTest.class.getResource("Result.fxml"));
            root = loader.load();
            scene = new Scene(root, 1200, 700);
            current.setScene(scene);
            firstTime = false;
        }
        current.setMaxHeight(720);
        current.setMaxWidth(1210);
        current.setTitle("Test");
        current.getIcons().add(new Image("https://cdn.iconscout.com/icon/premium/png-64-thumb/personality-disorder-2708518-2248491.png"));
        current.show();
    }

    public void closeAfterTest() throws IOException {
        current.close();
    }
}
