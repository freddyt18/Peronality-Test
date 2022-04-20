package Setting;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import Data.BCrypt.*;
import java.awt.Desktop;

public class ControllerForSetting {
    Setting setting = new Setting();
    App app = new App();
    Menu menu = new Menu();
    DataHandling dataHandling = new DataHandling();
    ControllerForRegistration registrationController = new ControllerForRegistration();
    Person currentUser = DataHandling.users.get(App.CURRENT_USER_ID);

    //new changes
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
    private Hyperlink githubLink;

    @FXML
    void goToGithubLink(ActionEvent event) throws IOException, URISyntaxException {
        Desktop.getDesktop().browse(new URI("https://github.com/freddyt18/Peronality-Test"));
    }


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
    private TextField NewAge;

    @FXML
    private TextField NewUsername;

    @FXML
    private Label InvalidUpdate;

    @FXML
    private PasswordField NewPassword;

    @FXML
    private PasswordField OldPassword;

    @FXML
    private PasswordField ReEnterNewPassword;

    
    @FXML
    private RadioButton btnFemale;

    @FXML
    private RadioButton btnOther;
    
    @FXML
    private RadioButton btnMale;

    @FXML
    void btnReturnToMenuFromSetting(ActionEvent event) throws IOException {
        menu.showMenu();
        setting.closeSetting();   
    }

    @FXML
    void btnSubmitChangeProfile(ActionEvent event) throws IOException {
        boolean flag = false;
        if(true) {
            currentUser.setName(NewName.getText());
            System.out.println(NewName.getText());
            if(registrationController.checkUsernameAcceptable(NewUsername.getText())) {
                currentUser.setUsername(NewUsername.getText());
    
                if(registrationController.checkEmailAcceptable(NewEmail.getText())) {
                    currentUser.setEmail(NewEmail.getText());
                    
                    if(true) {
                        currentUser.setBio(NewBio.getText());

                        if(registrationController.checkAgeAcceptable(NewAge.getText())) {
                            int tempAge = Integer.parseInt(NewAge.getText());
                            
                            if(tempAge > 0) {
                                currentUser.setAge(tempAge);
                                flag = true;
                            }
                            else {
                                InvalidUpdate.setText("Invalid age!! Try again");
                            }
                        }
                        else {
                            InvalidUpdate.setText("Invalid age!! Try again");
                        }
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

       //clear input
        NewName.clear();
        NewUsername.clear();
        NewBio.clear();
        NewEmail.clear();
        
        if(flag) {
            DataHandling.listToData();
            DataHandling.resetEverything();
            DataHandling.dataToList();
    
            setting.closeSetting();
            app.showLogin();
        }
 

        if(flag) {
            DataHandling.listToData();
            DataHandling.resetEverything();
            DataHandling.dataToList();

            setting.closeSetting();
            app.showLogin();
        }



    }

    @FXML
    void btnSubmitChangePassword(ActionEvent event) throws IOException {
        boolean flag = false;
        //hash
        System.out.println(currentUser.getPassword());
        if(BCrypt.checkpw(OldPassword.getText(), currentUser.getPassword())) {
            System.out.println(currentUser.getPassword().toString());
            String temp = NewPassword.getText();
            if(temp.equals(ReEnterNewPassword.getText())) {
                if(registrationController.checkPasswordAcceptable(temp)) {
                    currentUser.setPassword(BCrypt.hashpw(temp, BCrypt.gensalt()));
                    InvalidUpdate.setText("Success!");
                    flag = true;
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

        if(flag){
            DataHandling.listToData();
            DataHandling.resetEverything();
            DataHandling.dataToList();
    
            setting.closeSetting();
            app.showLogin();
        }
    }

    @FXML
    void getSex(ActionEvent event) {      
        if(btnFemale.isSelected()) {
            currentUser.setSex("Female");
        } 
        else if(btnMale.isSelected()) {
            currentUser.setSex("Male");
        }
        else if(btnOther.isSelected()) {
            currentUser.setSex("Other");
        }
        else {
            currentUser.setSex("Not specified");
        }
    }
}
