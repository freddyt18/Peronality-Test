package Menu;

import java.io.IOException;

import AfterTest.AfterTest;
import App.App;
import Data.Data_Handling.DataHandling;
import Menu.Profile.ControllerForProfile;
import Result_Generator.resultGenerator;
import Setting.Setting;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.PopupWindow.AnchorLocation;

public class ControllerForMenu {
    public static int currentUser = App.CURRENT_USER_ID;
    public static resultGenerator tempRg = App.rg;
    AfterTest af = new AfterTest();
    Setting settingObject = new Setting();
    Menu menu = new Menu();
    App main = new App();
    
    /* MENU */
    @FXML
    private Button explore;

    @FXML
    private Button test;

    @FXML
    private Button profile;

    @FXML
    private Button setting;

    @FXML
    public ScrollPane scene;

    @FXML 
    private void whenExplorePressed() throws IOException {
        scene.setContent(FXMLLoader.load(getClass().getResource("explore.fxml")));        
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
        if(!DataHandling.users.get(App.CURRENT_USER_ID).getPersonality().contains("#")){
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
        } else {
            menu.closeMenu();
            af.showAfterTest();
        }
         
    }

    @FXML
    private void whenProfilePressed() throws IOException {
        scene.setContent(FXMLLoader.load(getClass().getResource("../Menu/Profile/scene.fxml")));
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
    public void whenLogOutPressed() throws IOException {
        /* DataHandling.users.remove(App.CURRENT_USER_ID); */
        DataHandling.listToData();
        DataHandling.resetEverything();
        DataHandling.dataToList();
        
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
