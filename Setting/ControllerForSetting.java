package Setting;

import java.io.IOException;

import App.App;
import Data.BCrypt.BCrypt;
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
import Data.BCrypt.*;

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
    private Button BackButton;

    @FXML
    private TextField NewBio;

    @FXML
    private TextField NewEmail;

    @FXML
    private TextField NewName;

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
        
        if(registrationController.checkNameAcceptable(NewName.getText())) {
            currentUser.setName(NewName.getText());
            System.out.println(NewName.getText());
            if(registrationController.checkUsernameAcceptable(NewUsername.getText())) {
                currentUser.setUsername(NewUsername.getText());
    
                if(registrationController.checkEmailAcceptable(NewEmail.getText())) {
                    currentUser.setEmail(NewEmail.getText());
                    
                    if(registrationController.checkNameAcceptable(NewBio.getText())) {
                        currentUser.setBio(NewBio.getText());
                    }
                    else {
                        InvalidUpdate.setText("Bio cannot contain non characters! Try Again!!");
                    }
                }
                else {
                    InvalidUpdate.setText("Invalid Email! Try Again!!");
                }
            }
            else {
                InvalidUpdate.setText("Invalid Username! Try Again!!");
            }
        }
        else {
            InvalidUpdate.setText("Invalid Name! Try Again!!");
        }   

        //clear input
        NewName.clear();
        NewUsername.clear();
        NewBio.clear();
        NewEmail.clear(); 

        DataHandling.listToData();
        DataHandling.resetEverything();
        DataHandling.dataToList();

        setting.closeSetting();
        app.showLogin();
    }

    @FXML
    void btnSubmitChangePassword(ActionEvent event) throws IOException {

        //hash
        System.out.println(currentUser.getPassword());
        if(BCrypt.checkpw(OldPassword.getText(), currentUser.getPassword())) {
            System.out.println(currentUser.getPassword().toString());
            String temp = NewPassword.getText();
            if(temp.equals(ReEnterNewPassword.getText())) {
                if(registrationController.checkPasswordAcceptable(temp)) {
                    currentUser.setPassword(BCrypt.hashpw(temp, BCrypt.gensalt()));
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

        DataHandling.listToData();
        DataHandling.resetEverything();
        DataHandling.dataToList();

        setting.closeSetting();
        app.showLogin();
    }
}
