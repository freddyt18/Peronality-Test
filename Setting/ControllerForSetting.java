package Setting;

import java.io.IOException;

import App.App;
import Data.Data_Handling.DataHandling;
import Menu.Menu;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ControllerForSetting {
    Setting setting = new Setting();
    App app = new App();
    Menu menu = new Menu();
    DataHandling dataHandling = new DataHandling();

    //new cshanges
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
    private Button btnSubmitChangeProfile;

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
//////////////////////Change Profile
    @FXML
    private Button BtnChangeProfile;

    @FXML
    private TextField NewBio;

    @FXML
    private TextField NewEmail;

    @FXML
    private TextField NewName;

    @FXML
    private TextField NewSex;

    @FXML
    private TextField NewUsername;
    
    @FXML
    void btnReturnToMenuFromSetting(ActionEvent event) throws IOException {
        menu.showMenu();
        setting.closeSetting();   
    }

    @FXML
    void btnSubmitChangeProfile(ActionEvent event) {
        DataHandling.users.get(App.CURRENT_USER_ID).setUsername(NewUsername.getText());
        DataHandling.users.get(App.CURRENT_USER_ID).setName(NewName.getText());
        DataHandling.users.get(App.CURRENT_USER_ID).setBio(NewBio.getText());
        DataHandling.users.get(App.CURRENT_USER_ID).setEmail(NewEmail.getText());
        DataHandling.users.get(App.CURRENT_USER_ID).setSex(NewSex.getText());

        System.out.println(DataHandling.users.get(App.CURRENT_USER_ID).getUsername().toString());
        System.out.println(DataHandling.users.get(App.CURRENT_USER_ID).getName().toString());
        System.out.println(DataHandling.users.get(App.CURRENT_USER_ID).getBio().toString());
        System.out.println(DataHandling.users.get(App.CURRENT_USER_ID).getEmail().toString());
        System.out.println(DataHandling.users.get(App.CURRENT_USER_ID).getSex().toString());
    }

}
