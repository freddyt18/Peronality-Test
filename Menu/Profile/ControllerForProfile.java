package Menu.Profile;

import java.io.IOException;

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
    private void editProfileWhenPressed() throws IOException {
        fullName = new Label();
        fullName.setText("arg0");
        System.out.println(fullName.getText());
    }
}
