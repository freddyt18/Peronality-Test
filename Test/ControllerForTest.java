package Test;

import java.beans.EventHandler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

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
        getQ1();
        getQ2();
        getQ3();
        getQ4();
        getQ5();
        getQ6();
        getQ7();
        getQ8();
        getQ9();
        getQ10();
        System.out.println("extro: "+extroversion);
    }

    public void getQ1(){
        if(q11.isSelected()){
            extroversion += 1;
        }
        else if(q12.isSelected()){
            extroversion += 2;
        }
        else if(q13.isSelected()){
            extroversion += 3;
        }
        else if(q14.isSelected()){
            extroversion += 4;
        }
        else if(q15.isSelected()){
            extroversion += 5;
        }
        else if(q16.isSelected()){
            extroversion += 6;
        }
        else if(q17.isSelected()){
            extroversion += 7;
        }
    }

    public void getQ2(){
        if(q21.isSelected()){
            extroversion += 1;
            agreeableness += 1;
        }
        else if(q22.isSelected()){
            extroversion += 2;
            agreeableness+= 2;
        }
        else if(q23.isSelected()){
            extroversion += 3;
            agreeableness += 3;
        }
        else if(q24.isSelected()){
            extroversion += 4;
            agreeableness += 4;
        }
        else if(q25.isSelected()){
            extroversion += 5;
            agreeableness += 5;
        }
        else if(q26.isSelected()){
            extroversion += 6;
            agreeableness += 6;
        }
        else if(q27.isSelected()){
            extroversion += 7;
            agreeableness += 7;
        }
    }

    public void getQ3(){
        if(q31.isSelected()){
            extroversion += 1;
            agreeableness += 1;
            conscientiousness += 1;
        }
        else if(q32.isSelected()){
            extroversion += 2;
            agreeableness+= 2;
            conscientiousness += 2;
        }
        else if(q33.isSelected()){
            extroversion += 3;
            agreeableness += 3;
            conscientiousness += 3;
        }
        else if(q34.isSelected()){
            extroversion += 4;
            agreeableness += 4;
            conscientiousness += 4;
        }
        else if(q35.isSelected()){
            extroversion += 5;
            agreeableness += 5;
            conscientiousness += 5;
        }
        else if(q36.isSelected()){
            extroversion += 6;
            agreeableness += 6;
            conscientiousness += 6;
        }
        else if(q37.isSelected()){
            extroversion += 7;
            agreeableness += 7;
            conscientiousness += 7;
        }
    }

    public void getQ4(){
        if(q41.isSelected()){
            extroversion += 1;
            agreeableness += 1;
            conscientiousness += 1;
            neroticism += 1;
        }
        else if(q42.isSelected()){
            extroversion += 2;
            agreeableness+= 2;
            conscientiousness += 2;
             neroticism += 2;
        }
        else if(q43.isSelected()){
            extroversion += 3;
            agreeableness += 3;
            conscientiousness += 3;
            neroticism += 3;
        }
        else if(q44.isSelected()){
            extroversion += 4;
            agreeableness += 4;
            conscientiousness += 4;
            neroticism += 4;
        }
        else if(q45.isSelected()){
            extroversion += 5;
            agreeableness += 5;
            conscientiousness += 5;
            neroticism += 5;
        }
        else if(q46.isSelected()){
            extroversion += 6;
            agreeableness += 6;
            conscientiousness += 6;
            neroticism += 6;
        }
        else if(q47.isSelected()){
            extroversion += 7;
            agreeableness += 7;
            conscientiousness += 7;
            neroticism += 7;
        }
    }

    public void getQ5(){
        if(q51.isSelected()){
            extroversion += 1;
            agreeableness += 1;
            conscientiousness += 1;
            neroticism += 1;
            openness += 1;
        }
        else if(q52.isSelected()){
            extroversion += 2;
            agreeableness+= 2;
            conscientiousness += 2;
             neroticism += 2;
             openness += 2;
        }
        else if(q53.isSelected()){
            extroversion += 3;
            agreeableness += 3;
            conscientiousness += 3;
            neroticism += 3;
            openness += 3;
        }
        else if(q54.isSelected()){
            extroversion += 4;
            agreeableness += 4;
            conscientiousness += 4;
            neroticism += 4;
            openness += 4;
        }
        else if(q55.isSelected()){
            extroversion += 5;
            agreeableness += 5;
            conscientiousness += 5;
            neroticism += 5;
            openness += 5;
        }
        else if(q56.isSelected()){
            extroversion += 6;
            agreeableness += 6;
            conscientiousness += 6;
            neroticism += 6;
            openness += 6;
        }
        else if(q57.isSelected()){
            extroversion += 7;
            agreeableness += 7;
            conscientiousness += 7;
            neroticism += 7;
            openness += 7;
        }
    }

    public void getQ6(){
        if(q61.isSelected()){
            extroversion += 1;
            agreeableness += 1;
            conscientiousness += 1;
            neroticism += 1;
            openness += 1;
        }
        else if(q62.isSelected()){
            extroversion += 2;
            agreeableness+= 2;
            conscientiousness += 2;
             neroticism += 2;
             openness += 2;
        }
        else if(q63.isSelected()){
            extroversion += 3;
            agreeableness += 3;
            conscientiousness += 3;
            neroticism += 3;
            openness += 3;
        }
        else if(q64.isSelected()){
            extroversion += 4;
            agreeableness += 4;
            conscientiousness += 4;
            neroticism += 4;
            openness += 4;
        }
        else if(q65.isSelected()){
            extroversion += 5;
            agreeableness += 5;
            conscientiousness += 5;
            neroticism += 5;
            openness += 5;
        }
        else if(q66.isSelected()){
            extroversion += 6;
            agreeableness += 6;
            conscientiousness += 6;
            neroticism += 6;
            openness += 6;
        }
        else if(q67.isSelected()){
            extroversion += 7;
            agreeableness += 7;
            conscientiousness += 7;
            neroticism += 7;
            openness += 7;
        }
    }

    public void getQ7(){
        if(q71.isSelected()){
            agreeableness += 1;
            conscientiousness += 1;
            neroticism += 1;
            openness += 1;
        }
        else if(q72.isSelected()){
            agreeableness+= 2;
            conscientiousness += 2;
             neroticism += 2;
             openness += 2;
        }
        else if(q73.isSelected()){
            agreeableness += 3;
            conscientiousness += 3;
            neroticism += 3;
            openness += 3;
        }
        else if(q74.isSelected()){
            agreeableness += 4;
            conscientiousness += 4;
            neroticism += 4;
            openness += 4;
        }
        else if(q75.isSelected()){
            agreeableness += 5;
            conscientiousness += 5;
            neroticism += 5;
            openness += 5;
        }
        else if(q76.isSelected()){
            agreeableness += 6;
            conscientiousness += 6;
            neroticism += 6;
            openness += 6;
        }
        else if(q77.isSelected()){
            agreeableness += 7;
            conscientiousness += 7;
            neroticism += 7;
            openness += 7;
        }
    }

    public void getQ8(){
        if(q81.isSelected()){
            conscientiousness += 1;
            neroticism += 1;
            openness += 1;
        }
        else if(q82.isSelected()){
            conscientiousness += 2;
             neroticism += 2;
             openness += 2;
        }
        else if(q83.isSelected()){
            conscientiousness += 3;
            neroticism += 3;
            openness += 3;
        }
        else if(q84.isSelected()){
            conscientiousness += 4;
            neroticism += 4;
            openness += 4;
        }
        else if(q85.isSelected()){
            conscientiousness += 5;
            neroticism += 5;
            openness += 5;
        }
        else if(q86.isSelected()){
            conscientiousness += 6;
            neroticism += 6;
            openness += 6;
        }
        else if(q87.isSelected()){
            conscientiousness += 7;
            neroticism += 7;
            openness += 7;
        }
    }

    public void getQ9(){
        if(q91.isSelected()){
            neroticism += 1;
            openness += 1;
        }
        else if(q92.isSelected()){
             neroticism += 2;
             openness += 2;
        }
        else if(q93.isSelected()){
            neroticism += 3;
            openness += 3;
        }
        else if(q94.isSelected()){
            neroticism += 4;
            openness += 4;
        }
        else if(q95.isSelected()){
            neroticism += 5;
            openness += 5;
        }
        else if(q96.isSelected()){
            neroticism += 6;
            openness += 6;
        }
        else if(q97.isSelected()){
            neroticism += 7;
            openness += 7;
        }
    }

    public void getQ10(){
        if(q101.isSelected()){
            openness += 1;
        }
        else if(q102.isSelected()){
             openness += 2;
        }
        else if(q103.isSelected()){
            openness += 3;
        }
        else if(q104.isSelected()){
            openness += 4;
        }
        else if(q105.isSelected()){
            openness += 5;
        }
        else if(q106.isSelected()){
            openness += 6;
        }
        else if(q107.isSelected()){
            openness += 7;
        }
    }
}
