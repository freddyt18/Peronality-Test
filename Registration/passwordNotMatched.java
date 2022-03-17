package Registration;

import java.io.IOException;
import java.net.PasswordAuthentication;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class passwordNotMatched {
    FXMLLoader loader = new FXMLLoader();
    private static Stage current = new Stage();
    static Parent passwordMismatchedRoot;
    static Scene scene;
    private static boolean firstTime = true;


    public void showPasswordNotMatched() throws IOException {
        if(firstTime){
            loader.setLocation(passwordNotMatched.class.getResource("passwordNotMatched.fxml"));
            passwordMismatchedRoot = loader.load();
            scene = new Scene(passwordMismatchedRoot, 300, 200);
            current.setScene(scene);
            current.initModality(Modality.APPLICATION_MODAL);
            firstTime = false;
        }
        current.setMaxHeight(300);
        current.setMaxWidth(350);
        current.setTitle("Password Didn't Match");
        current.getIcons().add(new Image("https://cdn.iconscout.com/icon/premium/png-64-thumb/personality-disorder-2708518-2248491.png"));
        current.showAndWait();
    }

    public void close() throws IOException {
        current.close();
    }
}
