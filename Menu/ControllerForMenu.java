package Menu;

import java.io.IOException;

import App.App;
import Setting.Setting;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.PopupWindow.AnchorLocation;

public class ControllerForMenu {
    Setting settingObject = new Setting();
    Menu menu = new Menu();
    App main = new App();
    
    @FXML
    private Button explore;

    @FXML
    private Button test;

    @FXML
    private Button profile;

    @FXML
    private Button setting;

    @FXML
    private ScrollPane scene;

    @FXML
    private void whenExplorePressed() throws IOException {
        scene.setContent(FXMLLoader.load(getClass().getResource("../App/LOGIN_FORM.fxml")));
        if(containsMain(test) || containsMain(setting) || containsMain(profile)){
            if(containsMain(test)){
                mainToAlt(test);
            } else if(containsMain(profile)){
                mainToAlt(profile);
            } else {
                mainToAlt(setting);
            }
        }
        altToMain(explore);
    }

    @FXML
    private void whenTestPressed() throws IOException {
        scene.setContent(FXMLLoader.load(getClass().getResource("../Test/test.fxml")));
        if(containsMain(explore) || containsMain(setting) || containsMain(profile)){
            if(containsMain(explore)){
                mainToAlt(explore);
            } else if(containsMain(profile)){
                mainToAlt(profile);
            } else {
                mainToAlt(setting);
            }
        }
        altToMain(test);
    }

    @FXML
    private void whenProfilePressed() throws IOException {
        scene.setContent(FXMLLoader.load(getClass().getResource("../Profile/scene.fxml")));
        if(containsMain(explore) || containsMain(setting) || containsMain(test)){
            if(containsMain(explore)){
                mainToAlt(explore);
            } else if(containsMain(setting)){
                mainToAlt(setting);
            } else {
                mainToAlt(test);
            }
        }
        altToMain(profile);
    }

    @FXML
    private void whenSettingPressed() throws IOException {
         //set new stage for setting
         menu.closeMenu();
         settingObject.showSetting();
         
        //scene.setContent(FXMLLoader.load(getClass().getResource("../App/LOGIN_FORM.fxml")));
        if(containsMain(explore) || containsMain(test) || containsMain(profile)){
            if(containsMain(explore)){
                mainToAlt(explore);
            } else if(containsMain(profile)){
                mainToAlt(profile);
            } else {
                mainToAlt(test);
            }
        }
        altToMain(setting);
    }

    @FXML
    private void whenLogOutPressed() throws IOException {
        App.CURRENT_USER_ID = -1;
        menu.closeMenu();
        main.showLogin();
    }
    

    private void altToMain(Button b){
        b.getStyleClass().remove("menu-main-alt");
        b.getStyleClass().addAll("maincolor", "noBorderColorMenu");
    }
    private void mainToAlt(Button b){
        b.getStyleClass().removeAll("maincolor", "noBorderColorMenu");
        b.getStyleClass().add("menu-main-alt");
    }
    private boolean containsMain(Button b){
        if(b.getStyleClass().toString().contains("maincolor")){
            return true;
        }
        return false;
    }
}
