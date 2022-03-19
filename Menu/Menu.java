package Menu;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Menu {
    FXMLLoader loader = new FXMLLoader();
    public static Stage current = new Stage();
    static Parent root;
    static Scene scene;
    private boolean firstTime = true;


    public void showMenu() throws IOException { 
        if(firstTime){
            loader.setLocation(Menu.class.getResource("menu.fxml"));
            root = loader.load();
            scene = new Scene(root, 1200, 687.53);
            current.setScene(scene);
            firstTime = false;
        }
        current.setTitle("Test");
        current.getIcons().add(new Image("https://cdn.iconscout.com/icon/premium/png-64-thumb/personality-disorder-2708518-2248491.png"));
        current.show();
    }

    public void closeMenu() throws IOException {
        current.close();
    }
}
