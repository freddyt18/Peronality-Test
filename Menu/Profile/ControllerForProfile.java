package Menu.Profile;

import java.io.IOException;

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
        setContent();
    }

    public void setContent(){        
        fullName.setText("Name");
        userName.setText(DataHandling.users.get(ControllerForMenu.currentUser).getUsername());
        userEmail.setText(DataHandling.users.get(ControllerForMenu.currentUser).getEmail());
        userPersonalityType.setText(ControllerForMenu.tempRg.personality_type_result.get(Integer.parseInt(DataHandling.users.get(ControllerForMenu.currentUser).getPersonality().replace("#", ""))));
    }
}
