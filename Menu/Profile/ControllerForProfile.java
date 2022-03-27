package Menu.Profile;

import java.io.IOException;

import App.App;
import Data.Data_Handling.DataHandling;
import Data.Data_Handling.Person;
import Menu.ControllerForMenu;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class ControllerForProfile {
    ControllerForMenu cmenu = new ControllerForMenu();
    App main = new App();
    /* Profile */
    @FXML
    private Button deleteAcc;

    @FXML
    private Button editProfile;

    @FXML
    private Label fullName;

    @FXML
    private AnchorPane mainScreen;

    @FXML
    private TextArea userEmail;

    @FXML
    private Label userName;

    @FXML
    private TextArea userPersonalityType;

    @FXML
    private void revealDataWhenPressed() throws IOException {
        if(DataHandling.users.get(App.CURRENT_USER_ID).getPersonality().contains("#")){
            setContent();
        } else {
            setNullContent();
        }
    }

    @FXML
    private void deleteAcc() throws IOException {
        DataHandling.deleteAccount(ControllerForMenu.currentUser);
        DataHandling.users.remove(ControllerForMenu.currentUser);
        System.out.println(DataHandling.users.size());
        DataHandling.listToData();
        DataHandling.resetEverything();
        DataHandling.dataToList();
        cmenu.whenLogOutPressed();
    }

    public void setContent(){
        fullName.setText(DataHandling.users.get(ControllerForMenu.currentUser).getName());
        userName.setText(DataHandling.users.get(ControllerForMenu.currentUser).getUsername());
        userEmail.setText(DataHandling.users.get(ControllerForMenu.currentUser).getEmail());
        userPersonalityType.setText(ControllerForMenu.tempRg.personality_type_result.get(Integer.parseInt(DataHandling.users.get(ControllerForMenu.currentUser).getPersonality().replace("#", ""))));
    }

    public void setNullContent(){
        fullName.setText(DataHandling.users.get(ControllerForMenu.currentUser).getName());
        userName.setText(DataHandling.users.get(ControllerForMenu.currentUser).getUsername());
        userEmail.setText(DataHandling.users.get(ControllerForMenu.currentUser).getEmail());
        userPersonalityType.setText("You can't cross a bridge if there is no bridge to begin with.\nTake the test to see the result!");
    }
}
