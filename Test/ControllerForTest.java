package Test;

import java.beans.EventHandler;
import java.io.IOException;
import java.security.spec.ECField;
import java.util.concurrent.atomic.AtomicLong;

import AfterTest.AfterTest;
import App.App;
import Data.Data_Handling.DataHandling;
import Menu.ControllerForMenu;
import Menu.Menu;
import Result_Generator.resultGenerator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.Effect;

public class ControllerForTest {
    Menu m = new Menu();
    AfterTest aft = new AfterTest();

    private int openness = 0;
    private int conscientiousness = 0;
    private int extroversion = 0;
    private int agreeableness = 0;
    private int neroticism = 0;
    private String result = "";

    @FXML
    private Button submit;

    @FXML
    private RadioButton q11, q12, q13, q14, q15, q16, q17;

    @FXML
    private RadioButton q21, q22, q23, q24, q25, q26, q27;

    @FXML
    private RadioButton q31, q32, q33, q34, q35, q36, q37;

    @FXML
    private RadioButton q41, q42, q43, q44, q45, q46, q47;

    @FXML
    private RadioButton q51, q52, q53, q54, q55, q56, q57;

    @FXML
    private RadioButton q61, q62, q63, q64, q65, q66, q67;

    @FXML
    private RadioButton q71, q72, q73, q74, q75, q76, q77;

    @FXML
    private RadioButton q81, q82, q83, q84, q85, q86, q87;

    @FXML
    private RadioButton q91, q92, q93, q94, q95, q96, q97;

    @FXML
    private RadioButton q101, q102, q103, q104, q105, q106, q107;

    @FXML
    private Label invalid;

    public void submitButtonPressed() throws IOException {
        openness = oForQ5 + oForQ10;
        conscientiousness = cForQ3 + cForQ8;
        extroversion = eForQ1 + eForQ6;
        agreeableness = aForQ2 + aForQ7;
        neroticism = nForQ4 + nForQ9;

        if(neroticism>=9){
            result = result.concat("N - high |");
        } else {
            result = result.concat("n - low |");
        }

        if(agreeableness>=10){
            result = result.concat(" A - high | ");
        } else {
            result = result.concat(" a - low | ");
        }

        if(extroversion>=9){
            result = result.concat(" E - high | ");
        } else {
            result = result.concat(" e - low | ");
        }

        if(conscientiousness>=11){
            result = result.concat(" C - high | ");
        } else {
            result = result.concat(" c - low | ");
        }

        if(openness>=10){
            result = result.concat(" O - high | ");
        } else {
            result = result.concat(" o - low | ");
        }


        System.out.println("O: " + openness + "\nC: " + conscientiousness + "\nE: " + extroversion + "\nA: " + agreeableness + "\nN: " + neroticism );
        System.out.println("");

        if((openness<=7)||(conscientiousness<=7)||(extroversion<=7)||(agreeableness<=7)||(neroticism<=7)){
            invalid.setText("Missing Question(s)");
            invalid.getStyleClass().add("invalid");
        } else {
            for(int i = 0; i < App.rg.personality_type.size(); i++){
                if(App.rg.personality_type.get(i).contains(result)){
                    DataHandling.users.get(App.CURRENT_USER_ID).setPersonality("#" + i);
                    break;
                }
            }
            System.out.println(App.rg.personality_type_result.get(Integer.parseInt(DataHandling.users.get(App.CURRENT_USER_ID).getPersonality().replace("#", ""))));

            m.closeMenu();
            aft.showAfterTest();
        }
    }

    int eForQ1 = 0;
    public void getQ1(){
        invalid.setText("");
        eForQ1 = 0;
        int temp = 0;
        if(q11.isSelected()){
            temp += 1;
        }
        else if(q12.isSelected()){
            temp += 2;
        }
        else if(q13.isSelected()){
            temp += 3;
        }
        else if(q14.isSelected()){
            temp += 4;
        }
        else if(q15.isSelected()){
            temp += 5;
        }
        else if(q16.isSelected()){
            temp += 6;
        }
        else if(q17.isSelected()){
            temp += 7;
        }
        eForQ1 = temp;
    }

    int aForQ2 = 0;
    public void getQ2(){
        invalid.setText("");
        aForQ2 = 0;

        if(q21.isSelected()){

            aForQ2 += 1;
        }
        else if(q22.isSelected()){

            aForQ2+= 2;
        }
        else if(q23.isSelected()){

            aForQ2 += 3;
        }
        else if(q24.isSelected()){

            aForQ2 += 4;
        }
        else if(q25.isSelected()){

            aForQ2 += 5;
        }
        else if(q26.isSelected()){

            aForQ2 += 6;
        }
        else if(q27.isSelected()){

            aForQ2 += 7;
        }
    }

    int cForQ3 = 0;
    public void getQ3(){
        invalid.setText("");
        cForQ3 = 0;

        if(q31.isSelected()){

            cForQ3 += 1;
        }
        else if(q32.isSelected()){

            cForQ3 += 2;
        }
        else if(q33.isSelected()){

            cForQ3 += 3;
        }
        else if(q34.isSelected()){

            cForQ3 += 4;
        }
        else if(q35.isSelected()){

            cForQ3 += 5;
        }
        else if(q36.isSelected()){

            cForQ3 += 6;
        }
        else if(q37.isSelected()){

            cForQ3 += 7;
        }
    }

    int nForQ4 = 0;
    public void getQ4(){
        invalid.setText("");
        nForQ4 = 0;

        if(q41.isSelected()){

            nForQ4 += 1;
        }
        else if(q42.isSelected()){

            nForQ4 += 2;
        }
        else if(q43.isSelected()){

            nForQ4 += 3;
        }
        else if(q44.isSelected()){

            nForQ4 += 4;
        }
        else if(q45.isSelected()){

            nForQ4 += 5;
        }
        else if(q46.isSelected()){

            nForQ4 += 6;
        }
        else if(q47.isSelected()){

            nForQ4 += 7;
        }
    }

    int oForQ5 = 0;
    public void getQ5(){ 
        invalid.setText("");
        oForQ5 = 0;

        if(q51.isSelected()){

            oForQ5 += 1;
        }
        else if(q52.isSelected()){

            oForQ5 += 2;
        }
        else if(q53.isSelected()){

            oForQ5 += 3;
        }
        else if(q54.isSelected()){

            oForQ5 += 4;
        }
        else if(q55.isSelected()){

            oForQ5 += 5;
        }
        else if(q56.isSelected()){

            oForQ5 += 6;
        }
        else if(q57.isSelected()){

            oForQ5 += 7;
        }
    }

    int eForQ6 = 0;
    public void getQ6(){
        invalid.setText("");
        eForQ6 = 0;

        if(q61.isSelected()){
            eForQ6 += 1;

        }
        else if(q62.isSelected()){
            eForQ6 += 2;

        }
        else if(q63.isSelected()){
            eForQ6 += 3;

        }
        else if(q64.isSelected()){
            eForQ6 += 4;

        }
        else if(q65.isSelected()){
            eForQ6 += 5;

        }
        else if(q66.isSelected()){
            eForQ6 += 6;

        }
        else if(q67.isSelected()){
            eForQ6 += 7;

        }
    }

    int aForQ7 = 0;
    public void getQ7(){
        invalid.setText("");
        aForQ7 = 0;

        if(q71.isSelected()){
            aForQ7 += 1;
        }
        else if(q72.isSelected()){
            aForQ7+= 2;
        }
        else if(q73.isSelected()){
            aForQ7 += 3;
        }
        else if(q74.isSelected()){
            aForQ7 += 4;
        }
        else if(q75.isSelected()){
            aForQ7 += 5;
        }
        else if(q76.isSelected()){
            aForQ7 += 6;
        }
        else if(q77.isSelected()){
            aForQ7 += 7;
        }
    }

    int cForQ8 = 0;
    public void getQ8(){
        invalid.setText("");
        cForQ8 = 0;

        if(q81.isSelected()){
            cForQ8 += 1;

        }
        else if(q82.isSelected()){
            cForQ8 += 2;

        }
        else if(q83.isSelected()){
            cForQ8 += 3;

        }
        else if(q84.isSelected()){
            cForQ8 += 4;

        }
        else if(q85.isSelected()){
            cForQ8 += 5;

        }
        else if(q86.isSelected()){
            cForQ8 += 6;

        }
        else if(q87.isSelected()){
            cForQ8 += 7;

        }
    }

    int nForQ9 = 0;
    public void getQ9(){
        invalid.setText("");
        nForQ9 = 0;

        if(q91.isSelected()){
            nForQ9 += 1;

        }
        else if(q92.isSelected()){
            nForQ9 += 2;

        }
        else if(q93.isSelected()){
            nForQ9 += 3;

        }
        else if(q94.isSelected()){
            nForQ9 += 4;

        }
        else if(q95.isSelected()){
            nForQ9 += 5;

        }
        else if(q96.isSelected()){
            nForQ9 += 6;

        }
        else if(q97.isSelected()){
            nForQ9 += 7;

        }
    }

    int oForQ10 = 0;
    public void getQ10(){
        invalid.setText("");
        oForQ10 = 0;
        if(q101.isSelected()){
            oForQ10 += 1;
        }
        else if(q102.isSelected()){
            oForQ10 += 2;
        }
        else if(q103.isSelected()){
            oForQ10 += 3;
        }
        else if(q104.isSelected()){
            oForQ10 += 4;
        }
        else if(q105.isSelected()){
            oForQ10 += 5;
        }
        else if(q106.isSelected()){
            oForQ10 += 6;
        }
        else if(q107.isSelected()){
            oForQ10 += 7;
        }
    }
}
