package Setting;

import java.io.IOException;

import App.App;
import Data.Data_Handling.DataHandling;
import Data.Data_Handling.Person;
import Menu.Menu;
import Registration.ControllerForRegistration;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ControllerForSetting {
    Setting setting = new Setting();
    App app = new App();
    Menu menu = new Menu();
    DataHandling dataHandling = new DataHandling();
    ControllerForRegistration registrationController = new ControllerForRegistration();
    Person currentUser = DataHandling.users.get(App.CURRENT_USER_ID);

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
    private Button SubmitChangeProfile;

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
    @FXML
    private Button BtnChangeProfile;
    @FXML
    private Button btnChangePassword;

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
    private Label InvalidUpdate;

    @FXML
    private TextField NewPassword;

    @FXML
    private TextField OldPassword;

    @FXML
    private TextField ReEnterNewPassword;


    @FXML
    void btnReturnToMenuFromSetting(ActionEvent event) throws IOException {
        menu.showMenu();
        setting.closeSetting();   
    }

    @FXML
    void btnSubmitChangeProfile(ActionEvent event) throws IOException {
        
        if(registrationController.checkUsernameAcceptable(NewUsername.getText())) {
            currentUser.setUsername(NewUsername.getText());
        }
        else {
            InvalidUpdate.setText("Try Again!!");
        }

        currentUser.setName(NewName.getText()); //use the checkUsernameAcceptable() method
        currentUser.setBio(NewBio.getText()); //not yet
        currentUser.setEmail(NewEmail.getText()); //not yet
        currentUser.setSex(NewSex.getText()); //not yet

        System.out.println(currentUser.getUsername().toString());
        System.out.println(currentUser.getName().toString());
        System.out.println(currentUser.getBio().toString());
        System.out.println(currentUser.getEmail().toString());
        System.out.println(currentUser.getSex().toString());

        //clear input
        NewName.clear();
        NewUsername.clear();
        NewBio.clear();
        NewEmail.clear();
        NewSex.clear(); 
    }

    @FXML
    void btnSubmitChangePassword(ActionEvent event) throws IOException {
        if(currentUser.getPassword().equals(OldPassword.getText())) {
            System.out.println(currentUser.getPassword().toString());
            if(NewPassword.getText().equals(ReEnterNewPassword.getText())) {
                System.out.println(currentUser.getPassword().toString());
                if(registrationController.checkPasswordAcceptable(NewPassword.getText())) {
                    currentUser.setPassword(NewPassword.getText());
                    InvalidUpdate.setText("Success!");
                    System.out.println(currentUser.getPassword().toString());
                }
                else {
                    InvalidUpdate.setText("New password is not acceptable");
                }
            }
            else {
                InvalidUpdate.setText("New Password does not match");
            }
        }
        else {
            InvalidUpdate.setText("Old password does not match");
        }
    }
}
