package Test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class ControllerForTest {
    
    @FXML
    private Label label1;
    
    @FXML
    private RadioButton q11, q12, q13;

    public void getQ1(ActionEvent event){

        if(q11.isSelected()){
            label1.setText("q11");
        }
        else if(q12.isSelected()){
            label1.setText("q12");
        }
        else if(q13.isSelected()){
            label1.setText("q13");
        }
    }
}
