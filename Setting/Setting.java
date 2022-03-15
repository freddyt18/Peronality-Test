package Setting;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/// yoooooo
public class Setting {
    FXMLLoader loader = new FXMLLoader();
    public static Stage current = new Stage();
    static AnchorPane root;
    static Scene scene;
    private boolean firstTime = true;


    public void showSetting() throws IOException { 
        if(firstTime){
            //root.setLeft(FXMLLoader.load(getClass().getResource("SettingSideBar.fxml")));

            loader.setLocation(Setting.class.getResource("SettingSideBar.fxml"));
            root = loader.load();
            scene = new Scene(root, 1200, 657.53);
            current.setScene(scene);
            firstTime = false;
        }
        current.setTitle("Setting");
        current.getIcons().add(new Image("https://cdn.iconscout.com/icon/premium/png-64-thumb/personality-disorder-2708518-2248491.png"));
        current.show();
    }

    public void closeSetting() throws IOException {
        current.close();
    }
}
