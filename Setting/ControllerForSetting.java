package Setting;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ControllerForSetting {

    @FXML
    private BorderPane SettingBorderPane;
    @FXML
    private Button AboutButton;

    @FXML
    private Button ChangePasswordButton;

    @FXML
    private Button EditProfileButton;

    @FXML
    private Button PrivacyButton;

    @FXML
    private Button TermButton;

    @FXML
    void goToAbout(ActionEvent event) throws IOException {
        SettingBorderPane.setCenter(FXMLLoader.load(getClass().getResource("About.fxml")));
    }

    @FXML
    void goToChangePassword(ActionEvent event) throws IOException {
        SettingBorderPane.setCenter(FXMLLoader.load(getClass().getResource("ChangePassword.fxml")));
    }

    @FXML
    void goToEditProfile(ActionEvent event) throws IOException {
        SettingBorderPane.setCenter(FXMLLoader.load(getClass().getResource("EditProfile.fxml")));
    }

    @FXML
    void goToPrivacy(ActionEvent event) throws IOException{
        SettingBorderPane.setCenter(FXMLLoader.load(getClass().getResource("Privacy.fxml")));
    }

    @FXML
    void goToTerm(ActionEvent event) throws IOException{
        SettingBorderPane.setCenter(FXMLLoader.load(getClass().getResource("Term.fxml")));
    }

}
