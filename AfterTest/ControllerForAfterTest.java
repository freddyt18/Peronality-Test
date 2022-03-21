package AfterTest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;

import App.App;
import Data.Data_Handling.DataHandling;
import Menu.Menu;

public class ControllerForAfterTest {
    AfterTest af = new AfterTest();
    Menu m = new Menu();
    @FXML
    private TextArea details;

    @FXML
    private Button buttonAfterTest;

    @FXML
    private Button back;

    @FXML
    private void afterPressed(){
        details.setText(App.rg.personality_type_result.get(Integer.parseInt(DataHandling.users.get(App.CURRENT_USER_ID).getPersonality().replace("#", ""))));
    }

    @FXML
    private void afterBackPressed() throws IOException {
        af.closeAfterTest();
        m.showMenu();
    }
}
