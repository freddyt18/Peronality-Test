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
    private Label ptype;

    @FXML
    private Label u1, u2, u3, u4;

    @FXML
    private void afterPressed() throws IOException {
        details.setText(App.rg.personality_type_result.get(Integer.parseInt(DataHandling.users.get(App.CURRENT_USER_ID).getPersonality().replace("#", ""))));
        setEmailForMatch();
        ptype.setText(DataHandling.users.get(App.CURRENT_USER_ID).getPersonality());
    }

    @FXML
    private void afterBackPressed() throws IOException {
        af.closeAfterTest();
        m.showMenu();
    }

    private void setEmailForMatch() throws IOException {
        int u = 0;
        String temp = DataHandling.users.get(App.CURRENT_USER_ID).getPersonality();
        for(int i = 0; i < DataHandling.users.size(); i++){
            if(i==App.CURRENT_USER_ID){
                continue;
            }
            if(DataHandling.users.get(i).getPersonality().equals(temp)){
                if(u==0){
                    u++;
                    u1.setText(DataHandling.users.get(i).getEmail());
                } else if(u==1){
                    u++;
                    u2.setText(DataHandling.users.get(i).getEmail());
                } else if(u==2){
                    u++;
                    u3.setText(DataHandling.users.get(i).getEmail());
                } else {
                    u++;
                    u4.setText(DataHandling.users.get(i).getEmail());
                }
            }
        }
    }
}
