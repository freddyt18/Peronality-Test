package Menu;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class ControllerForMenu {
    
    @FXML
    private Button personalities;

    @FXML
    private Button test;

    @FXML
    private Button setting;

    @FXML
    private BorderPane scene;

    @FXML
    private void whenPersonalitiesPressed() throws IOException {
        scene.setCenter(FXMLLoader.load(getClass().getResource("../App/INVALID_INFO.fxml")));
        if(containsMain(test) || containsMain(setting)){
            if(containsMain(test)){
                buttonMainTOSecond(test);
            } else {
                buttonMainTOSecond(setting);
            }
        }
        buttonSecondToMain(personalities);
    }

    @FXML
    private void whenTestPressed() throws IOException {
        scene.setCenter(FXMLLoader.load(getClass().getResource("../App/LOGIN_FORM.fxml")));
        if(containsMain(personalities) || containsMain(setting)){
            if(containsMain(personalities)){
                buttonMainTOSecond(personalities);
            } else {
                buttonMainTOSecond(setting);
            }
        }
        buttonSecondToMain(test);
    }

    @FXML
    private void whenSettingPressed() throws IOException {
        scene.setCenter(FXMLLoader.load(getClass().getResource("../App/LOGIN_FORM.fxml")));
        if(containsMain(personalities) || containsMain(test)){
            if(containsMain(personalities)){
                buttonMainTOSecond(personalities);
            } else {
                buttonMainTOSecond(test);
            }
        }
        buttonSecondToMain(setting);
    }
    

    private void buttonMainTOSecond(Button b){
        b.getStyleClass().removeAll("maincolor", "loginText");
        b.getStyleClass().add("secondaryColor");
    }
    private void buttonSecondToMain(Button b){
        b.getStyleClass().remove("secondaryColor");
        b.getStyleClass().addAll("maincolor", "loginText");
    }
    private boolean containsMain(Button b){
        if(b.getStyleClass().toString().contains("maincolor")){
            return true;
        }
        return false;
    }
}
