package App;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

import Data.BCrypt.BCrypt;
import Data.Data_Handling.DataHandling;
import Menu.Menu;
import Registration.Registration;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerForLogin {
    //Accessibilities
    private App main = new App();
    private Menu menu = new Menu();
    private Registration registration = new Registration();
    private DataHandling handle = new DataHandling();

    //Tempo
    private String usernameTemp, passwordTemp;

    private boolean verifyInfo() throws IOException {
        boolean flag = false;
        int id = -1;
        if(handle.containsUsername(usernameTemp)){
            id = DataHandling.TEMPORARY_USER;
            flag = true;
        }
        //Verify USERNAME
        if(!flag){
            App.CURRENT_USER_ID = -1;
            System.out.println("No data found " + id);
            return false;
        } else {
            //Verify PASSWORD
            if(id==-1){
                System.out.println(id);
                return false;
            }
            if(!BCrypt.checkpw(passwordTemp, DataHandling.users.get(id).getPassword())){
                System.out.println("WRONG PASSWORD");
                return false;
            } else {
                return true;
            }
        }
        
    }
    

    @FXML
    private Label invalidLabel;

    @FXML
    private Button button1;

    @FXML
    private Hyperlink register;

    @FXML
    private TextField username;
    
    @FXML
    private PasswordField password;

    @FXML
    private Label usernameLabel;

    @FXML
    private Label passwordLabel;

    @FXML
    private void pressToLogin() throws IOException {
        afterUsername();
        afterPassword();
        if(verifyInfo()){
            App.CURRENT_USER_ID = DataHandling.TEMPORARY_USER;
            System.out.println(App.CURRENT_USER_ID);
            System.out.println(DataHandling.users.get(App.CURRENT_USER_ID).getUsername().toString());
            
            if(DataHandling.users.get(App.CURRENT_USER_ID).getPersonality().contains("#")){
                System.out.println(App.rg.personality_type_result.get(Integer.parseInt(DataHandling.users.get(App.CURRENT_USER_ID).getPersonality().replace("#", ""))));
            }

            main.exit();
            menu.showMenu();

        } else {
            usernameLabel.getStyleClass().addAll("invalid", "weightBold");
            passwordLabel.getStyleClass().addAll("invalid", "weightBold");
            invalidLabel.setText("Invalid Information");
            invalidLabel.getStyleClass().add("invalid");
        }
    }
    
    @FXML
    private void pressToRegister() throws IOException {
        main.exit();
        registration.showRegister();
    }

    @FXML
    private void usernameClear() throws IOException {
        username.clear();
        invalidLabel.setText("");
        if(usernameLabel.getStyleClass().contains("invalid")){
            usernameLabel.getStyleClass().removeAll("invalid", "weightBold");
            usernameLabel.getStyleClass().add("loginTextBlack");
        }
    }
    
    @FXML
    private void passwordClear() throws IOException {
        password.clear();
        invalidLabel.setText("");
        if(passwordLabel.getStyleClass().contains("invalid")){
            passwordLabel.getStyleClass().removeAll("invalid", "weightBold");
            passwordLabel.getStyleClass().add("loginTextBlack");
        }
    }
    
    private void afterUsername() throws IOException {
        usernameTemp = username.getText();
    }

    private void afterPassword() throws IOException {
        passwordTemp = password.getText();
        
    }
}
