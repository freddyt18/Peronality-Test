package Profile;

import App.App;
import Data.Data_Handling.DataHandling;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class ControllerForProfile {

    @FXML
    private Button deleteAcc;

    @FXML
    private Button editProfile;

    @FXML
    public static Label fullName;

    @FXML
    private AnchorPane mainScreen;

    @FXML
    public static TextArea userEmail;

    @FXML
    public static Label userName;

    @FXML
    public static TextArea userPersonalityType;

    @FXML
    private void editProfile(){}

    @FXML
    private void deleteAcc(){}


    /* public void displayUser(){
        fullName.setText("ABC");
        userName.setText(DataHandling.users.get(App.CURRENT_USER_ID).getUsername());
        userPersonalityType.setText(App.rg.personality_type_result.get(Integer.parseInt(DataHandling.users.get(App.CURRENT_USER_ID).getPersonality().replace("#", ""))));
        userEmail.setText(DataHandling.users.get(App.CURRENT_USER_ID).getEmail());
    } */

    
}
