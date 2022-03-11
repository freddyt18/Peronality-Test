package Registration;

import java.io.IOException;
import App.App;
import Data.Data_Handling.DataHandling;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Registration {
    private App login;
    private boolean firstTime = true;
    //CSS is already included in FXML file
    FXMLLoader loader = new FXMLLoader();
    private static Stage current = new Stage();
    static Parent root;
    static Scene scene;

    private void setRoot() throws IOException{
        loader.setLocation(Registration.class.getResource("registration.fxml"));
        root = loader.load();
    }


    public void showRegister() throws IOException { 
        if(firstTime){
            setRoot();
            scene = new Scene(root, 835, 500);
            current.setScene(scene);
            firstTime = false;
        }
        
        current.setTitle("Registration");
        current.getIcons().add(new Image("https://cdn.iconscout.com/icon/premium/png-64-thumb/personality-disorder-2708518-2248491.png"));
        current.setMaxHeight(530);
        current.setMaxWidth(860);
        current.show();
    }

    public void closeRegistration () throws IOException {
        current.close();
    }
}
