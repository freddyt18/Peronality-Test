package Registration;

import App.App;
import Data.Data_Handling.DataHandling;
import java.util.regex.*;  
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.regex.Pattern;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
public class ControllerForRegistration {
    //Accessibilities
    private Registration registration = new Registration();
    private App login = new App();
    DataHandling handle = new DataHandling();

    //Tempo Strings
    private String emailTemp, usernameTemp, passwordTemp, rPasswordTemp;

    @FXML
    private Button signUp;

    @FXML
    private Hyperlink hasAccount;

    @FXML
    private TextField email;

    @FXML
    private TextField newUsername;

    @FXML
    private PasswordField newPassword;

    @FXML
    private PasswordField retypedPassword;

    @FXML
    private Label alertRegistration;

    @FXML
    private void signUpWhenPressed() throws IOException{
        //Pattern.matches() DOES NOT WORK!!!!! ughhh
        //-------------------------------------------------------
        //      Use .find() method of object Matcher            //
        //      regex --> pattern object                        //1
        //      pattern.matcher(string) --> matcher object      //2
        //      (matcher object).find()                         //3
        //-------------------------------------------------------

        Pattern W = Pattern.compile("\\W"); //1 //  \W <- non-character ":" "-" "@"
        Pattern s = Pattern.compile("\\s");     //  \s <- whitespace " " "\t" "\0x" ...
        

        boolean userExists = false;
        boolean unacceptableUsername = false;
        afterEmail();
        afterUsername();
        afterPassword();
        afterRetypedPassword();

        Matcher usernameContainsNonCharacter = W.matcher(usernameTemp);//2
        Matcher usernameContainsWhiteSpace = s.matcher(usernameTemp);

        //3
        if(usernameContainsNonCharacter.find() || usernameContainsWhiteSpace.find()){
            unacceptableUsername = true;
        } else if(handle.containsUsername(usernameTemp)){
            userExists = true;
        }


        if(!passwordTemp.equals(rPasswordTemp) || userExists || unacceptableUsername){

            if(userExists){
                alertRegistration.setText("User already exists");
            } else if(unacceptableUsername){
                alertRegistration.setText("Username can only contain a-z A-Z 0-9");
            } else {
                alertRegistration.setText("Mismatched Password");
                newPassword.getStyleClass().addAll("invalid", "weightBold");
                retypedPassword.getStyleClass().addAll("invalid", "weightBold");
            }
            alertRegistration.getStyleClass().addAll("invalid", "weightBold");

        } else {
            handle.writeToFile(usernameTemp, passwordTemp, emailTemp);
            App.CURRENT_USER_ID = DataHandling.users.size()-1;
            registration.closeRegistration();
            login.showLogin();
        }

    }

    @FXML
    private void alreadyHasAnAccount() throws IOException {
        registration.closeRegistration();
        login.showLogin();
    }

    @FXML
    private void afterEmail() throws IOException {
        emailTemp = email.getText();
    }

    @FXML
    private void afterUsername() throws IOException {
        usernameTemp = newUsername.getText();
    }

    @FXML
    private void afterPassword() throws IOException {
        passwordTemp = newPassword.getText();
    }

    @FXML
    private void afterRetypedPassword() throws IOException {
        rPasswordTemp = retypedPassword.getText();
    }
    
    @FXML
    private void afterPasswordClicked() throws IOException {
        newPassword.clear();
        if(newPassword.getStyleClass().contains("invalid")){
            alertRegistration.setText("");
            newPassword.getStyleClass().removeAll("invalid", "weightBold");
            alertRegistration.getStyleClass().removeAll("invalid", "weightBold");
        }
        afterPassword();
    }

    @FXML
    private void afterRetypedPasswordClicked() throws IOException {
        retypedPassword.clear();
        if(retypedPassword.getStyleClass().contains("invalid")){
            alertRegistration.setText("");
            retypedPassword.getStyleClass().removeAll("invalid", "weightBold");
            alertRegistration.getStyleClass().removeAll("invalid", "weightBold");
        }
        afterRetypedPassword();
    }
}
