package Test;

import java.beans.EventHandler;
import java.security.spec.ECField;

import Profile.profile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.effect.Effect;

public class ControllerForTest {
    
    public int openness = 0;
    public int conscientiousness = 0;
    public int extroversion = 0;
    public int agreeableness = 0;
    public int neroticism = 0;

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

    public void submitButtonPressed(){
        openness = oForQ5 + oForQ6 + oForQ7 + oForQ9 + oForQ10;
        conscientiousness = cForQ3 + cForQ4 + cForQ5 + cForQ6 + cForQ7 + cForQ8;
        extroversion = eForQ1 + eForQ2 + eForQ3 + eForQ4 + eForQ5 + eForQ6;
        agreeableness = aForQ2 + aForQ3 + aForQ4 + aForQ5 + aForQ6 + aForQ7;
        neroticism = nForQ4 + nForQ5 + nForQ6 + nForQ7 + nForQ8 + nForQ9;
        System.out.println("Openness: " + openness + "\nConscienciousness: " + conscientiousness + "\nExtroversion: " + extroversion + "\nAgreeableness: " + agreeableness + "\nNeroticism: " + neroticism);
    }

    int eForQ1 = 0;
    public void getQ1(){
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

    int eForQ2 = 0, aForQ2 = 0;
    public void getQ2(){
        eForQ2 = 0;
        aForQ2 = 0;

        if(q21.isSelected()){
            eForQ2 += 1;
            aForQ2 += 1;
        }
        else if(q22.isSelected()){
            eForQ2 += 2;
            aForQ2+= 2;
        }
        else if(q23.isSelected()){
            eForQ2 += 3;
            aForQ2 += 3;
        }
        else if(q24.isSelected()){
            eForQ2 += 4;
            aForQ2 += 4;
        }
        else if(q25.isSelected()){
            eForQ2 += 5;
            aForQ2 += 5;
        }
        else if(q26.isSelected()){
            eForQ2 += 6;
            aForQ2 += 6;
        }
        else if(q27.isSelected()){
            eForQ2 += 7;
            aForQ2 += 7;
        }
    }

    int eForQ3 = 0, aForQ3 = 0, cForQ3 = 0;
    public void getQ3(){
        eForQ3 = 0;
        aForQ3 = 0;
        cForQ3 = 0;

        if(q31.isSelected()){
            eForQ3 += 1;
            aForQ3 += 1;
            cForQ3 += 1;
        }
        else if(q32.isSelected()){
            eForQ3 += 2;
            aForQ3+= 2;
            cForQ3 += 2;
        }
        else if(q33.isSelected()){
            eForQ3 += 3;
            aForQ3 += 3;
            cForQ3 += 3;
        }
        else if(q34.isSelected()){
            eForQ3 += 4;
            aForQ3 += 4;
            cForQ3 += 4;
        }
        else if(q35.isSelected()){
            eForQ3 += 5;
            aForQ3 += 5;
            cForQ3 += 5;
        }
        else if(q36.isSelected()){
            eForQ3 += 6;
            aForQ3 += 6;
            cForQ3 += 6;
        }
        else if(q37.isSelected()){
            eForQ3 += 7;
            aForQ3 += 7;
            cForQ3 += 7;
        }
    }

    int eForQ4 = 0, aForQ4 = 0, cForQ4 = 0, nForQ4 = 0;
    public void getQ4(){
        eForQ4 = 0;
        aForQ4 = 0; 
        cForQ4 = 0;
        nForQ4 = 0;

        if(q41.isSelected()){
            eForQ4 += 1;
            aForQ4 += 1;
            cForQ4 += 1;
            nForQ4 += 1;
        }
        else if(q42.isSelected()){
            eForQ4 += 2;
            aForQ4+= 2;
            cForQ4 += 2;
            nForQ4 += 2;
        }
        else if(q43.isSelected()){
            eForQ4 += 3;
            aForQ4 += 3;
            cForQ4 += 3;
            nForQ4 += 3;
        }
        else if(q44.isSelected()){
            eForQ4 += 4;
            aForQ4 += 4;
            cForQ4 += 4;
            nForQ4 += 4;
        }
        else if(q45.isSelected()){
            eForQ4 += 5;
            aForQ4 += 5;
            cForQ4 += 5;
            nForQ4 += 5;
        }
        else if(q46.isSelected()){
            eForQ4 += 6;
            aForQ4 += 6;
            cForQ4 += 6;
            nForQ4 += 6;
        }
        else if(q47.isSelected()){
            eForQ4 += 7;
            aForQ4 += 7;
            cForQ4 += 7;
            nForQ4 += 7;
        }
    }

    int eForQ5 = 0, aForQ5 = 0, cForQ5 = 0, nForQ5 = 0, oForQ5 = 0;
    public void getQ5(){
        eForQ5 = 0;
        aForQ5 = 0; 
        cForQ5 = 0; 
        nForQ5 = 0; 
        oForQ5 = 0;

        if(q51.isSelected()){
            eForQ5 += 1;
            aForQ5 += 1;
            cForQ5 += 1;
            nForQ5 += 1;
            oForQ5 += 1;
        }
        else if(q52.isSelected()){
            eForQ5 += 2;
            aForQ5+= 2;
            cForQ5 += 2;
            nForQ5 += 2;
            oForQ5 += 2;
        }
        else if(q53.isSelected()){
            eForQ5 += 3;
            aForQ5 += 3;
            cForQ5 += 3;
            nForQ5 += 3;
            oForQ5 += 3;
        }
        else if(q54.isSelected()){
            eForQ5 += 4;
            aForQ5 += 4;
            cForQ5 += 4;
            nForQ5 += 4;
            oForQ5 += 4;
        }
        else if(q55.isSelected()){
            eForQ5 += 5;
            aForQ5 += 5;
            cForQ5 += 5;
            nForQ5 += 5;
            oForQ5 += 5;
        }
        else if(q56.isSelected()){
            eForQ5 += 6;
            aForQ5 += 6;
            cForQ5 += 6;
            nForQ5 += 6;
            oForQ5 += 6;
        }
        else if(q57.isSelected()){
            eForQ5 += 7;
            aForQ5 += 7;
            cForQ5 += 7;
            nForQ5 += 7;
            oForQ5 += 7;
        }
    }

    int eForQ6 = 0, aForQ6 = 0, cForQ6 = 0, nForQ6 = 0, oForQ6 = 0;
    public void getQ6(){
        eForQ6 = 0;
        aForQ6 = 0;
        cForQ6 = 0;
        nForQ6 = 0;
        oForQ6 = 0;

        if(q61.isSelected()){
            eForQ6 += 1;
            aForQ6 += 1;
            cForQ6 += 1;
            nForQ6 += 1;
            oForQ6 += 1;
        }
        else if(q62.isSelected()){
            eForQ6 += 2;
            aForQ6+= 2;
            cForQ6 += 2;
            nForQ6 += 2;
            oForQ6 += 2;
        }
        else if(q63.isSelected()){
            eForQ6 += 3;
            aForQ6 += 3;
            cForQ6 += 3;
            nForQ6 += 3;
            oForQ6 += 3;
        }
        else if(q64.isSelected()){
            eForQ6 += 4;
            aForQ6 += 4;
            cForQ6 += 4;
            nForQ6 += 4;
            oForQ6 += 4;
        }
        else if(q65.isSelected()){
            eForQ6 += 5;
            aForQ6 += 5;
            cForQ6 += 5;
            nForQ6 += 5;
            oForQ6 += 5;
        }
        else if(q66.isSelected()){
            eForQ6 += 6;
            aForQ6 += 6;
            cForQ6 += 6;
            nForQ6 += 6;
            oForQ6 += 6;
        }
        else if(q67.isSelected()){
            eForQ6 += 7;
            aForQ6 += 7;
            cForQ6 += 7;
            nForQ6 += 7;
            oForQ6 += 7;
        }
    }

    int aForQ7 = 0, cForQ7 = 0, nForQ7 = 0, oForQ7 = 0;
    public void getQ7(){
        aForQ7 = 0;
        cForQ7 = 0;
        nForQ7 = 0;
        oForQ7 = 0;

        if(q71.isSelected()){
            aForQ7 += 1;
            cForQ7 += 1;
            neroticism += 1;
            oForQ7 += 1;
        }
        else if(q72.isSelected()){
            aForQ7+= 2;
            cForQ7 += 2;
            nForQ7 += 2;
            oForQ7 += 2;
        }
        else if(q73.isSelected()){
            aForQ7 += 3;
            cForQ7 += 3;
            nForQ7 += 3;
            oForQ7 += 3;
        }
        else if(q74.isSelected()){
            aForQ7 += 4;
            cForQ7 += 4;
            nForQ7 += 4;
            oForQ7 += 4;
        }
        else if(q75.isSelected()){
            aForQ7 += 5;
            cForQ7 += 5;
            nForQ7 += 5;
            oForQ7 += 5;
        }
        else if(q76.isSelected()){
            aForQ7 += 6;
            cForQ7 += 6;
            nForQ7 += 6;
            oForQ7 += 6;
        }
        else if(q77.isSelected()){
            aForQ7 += 7;
            cForQ7 += 7;
            nForQ7 += 7;
            oForQ7 += 7;
        }
    }

    int cForQ8 = 0, nForQ8 = 0, oForQ8 = 0;
    public void getQ8(){
        cForQ8 = 0;
        nForQ8 = 0;
        oForQ8 = 0;

        if(q81.isSelected()){
            cForQ8 += 1;
            nForQ8 += 1;
            oForQ8 += 1;
        }
        else if(q82.isSelected()){
            cForQ8 += 2;
            nForQ8 += 2;
            oForQ8 += 2;
        }
        else if(q83.isSelected()){
            cForQ8 += 3;
            nForQ8 += 3;
            oForQ8 += 3;
        }
        else if(q84.isSelected()){
            cForQ8 += 4;
            nForQ8 += 4;
            oForQ8 += 4;
        }
        else if(q85.isSelected()){
            cForQ8 += 5;
            nForQ8 += 5;
            oForQ8 += 5;
        }
        else if(q86.isSelected()){
            cForQ8 += 6;
            nForQ8 += 6;
            oForQ8 += 6;
        }
        else if(q87.isSelected()){
            cForQ8 += 7;
            nForQ8 += 7;
            oForQ8 += 7;
        }
    }

    int nForQ9 = 0, oForQ9 = 0;
    public void getQ9(){
        nForQ9 = 0;
        oForQ9 = 0;

        if(q91.isSelected()){
            nForQ9 += 1;
            oForQ9 += 1;
        }
        else if(q92.isSelected()){
            nForQ9 += 2;
            oForQ9 += 2;
        }
        else if(q93.isSelected()){
            nForQ9 += 3;
            oForQ9 += 3;
        }
        else if(q94.isSelected()){
            nForQ9 += 4;
            oForQ9 += 4;
        }
        else if(q95.isSelected()){
            nForQ9 += 5;
            oForQ9 += 5;
        }
        else if(q96.isSelected()){
            nForQ9 += 6;
            oForQ9 += 6;
        }
        else if(q97.isSelected()){
            nForQ9 += 7;
            oForQ9 += 7;
        }
    }

    int oForQ10 = 0;
    public void getQ10(){
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
