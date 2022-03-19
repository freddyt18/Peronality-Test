package Result_Generator;

import java.lang.ref.PhantomReference;
import java.util.LinkedList;

import javax.swing.text.AsyncBoxView.ChildLocator;


public class resultGenerator {
    public LinkedList<String> personality_type = new LinkedList<String>();
    public LinkedList<String> personality_type_result = new LinkedList<String>();
    
    public void generateResult(){
        for(int a = 0; a < 2; a++){
            String tempA = "";
            if(a==0){
                tempA = tempA.concat(" O - high | ");
            } else {
                tempA = tempA.concat(" o - low | ");
            }
            for(int b = 0; b < 2; b++){
                String tempB = "";
                if(b==0){
                    tempB = " C - high | ";
                    tempB = tempB.concat(tempA);
                } else {
                    tempB = " c - low | ";
                    tempB = tempB.concat(tempA);
                }
                for(int c = 0; c < 2; c++){
                    String tempC = "";
                    if(c==0){
                        tempC = " E - high | ";
                        tempC = tempC.concat(tempB);
                    } else {
                        tempC = " e - low | ";
                        tempC = tempC.concat(tempB);
                    }
                    for(int d = 0; d < 2; d++){
                        String tempD = "";
                        if(d==0){
                            tempD = " | A - high | ";
                            tempD = tempD.concat(tempC);
                        } else {
                            tempD = " | a - low | ";
                            tempD = tempD.concat(tempC);
                        }   
                        for(int e = 0; e < 2; e++){
                            String tempE = "";
                            if(e==0){
                                tempE = "N - high";
                                tempE = tempE.concat(tempD);                               
                            } else {
                                tempE = "n - low";
                                tempE = tempE.concat(tempD);
                            }
                            personality_type.add(tempE);
                        }  
                    }        
                }
            }
        }


        String oHigh = "\n You tend to be imaginative and creative but also prone to boredom, and so strive to continually feed their mind with new ideas and experiences. Low scorers are more down-to-earth, and so tend\n";
        String oLow = "\nYou are more down-to-earth, and so tend to seek out situations in which they have to turn an existing idea into reality, take small steps rather  initiate radical change, and follow well-established patterns and rules.\n";

        String cHigh = "\n You are methodical, well organized, and dutiful, and perform best in highly structured and predictable environments where there is a place for everything and everything is in its place.\n";
        String cLow = "\nYou are far more laid-back and find it easy to enjoy life, but may well need a helping hand when it comes to self-discipline.\n";

        String eHigh = "\n You are energized by the company of others, are evening types, and are motivated more by carrots than sticks.\n";
        String eLow = "\nYou tend to be happiest working alone and in quiet surroundings, are most alert in the morning, and are motivated more by fear of punishment than promise of rewards.\n";

        String aHigh = "\n You tend to be trusting, friendly, and cooperative, but have to be careful to avoid situations in which others might take advantage of their overly giving nature.\n";
        String aLow = "\nYou tend to be more aggressive and competitive, and bloom in situations that require tough thinking and straight talking.\n";

        String nHigh = "\n You are prone to insecurity and emotional distress, and avoid situations that they find upsetting because those negative feelings take some time to fade away.\n";
        String nLow = "\nYou tend to be more relaxed, less emotional and less prone to distress, and they operate well in situations that others find stressful.\n";

        for(int i = 0; i < personality_type.size(); i++){
            String temp = "";
            if(personality_type.get(i).toString().contains("o - low")){
                temp = temp.concat(oLow);
            } else {
                temp = temp.concat(oHigh);
            }

            if(personality_type.get(i).toString().contains("c - low")){
                temp = temp.concat(cLow);
            } else {
                temp = temp.concat(cHigh);
            }

            if(personality_type.get(i).toString().contains("e - low")){
                temp = temp.concat(eLow);
            } else {
                temp = temp.concat(eHigh);
            }

            if(personality_type.get(i).toString().contains("a - low")){
                temp = temp.concat(aLow);
            } else {
                temp = temp.concat(aHigh);
            }

            if(personality_type.get(i).toString().contains("n - low")){
                temp = temp.concat(nLow);
            } else {
                temp = temp.concat(nHigh);
            }
            personality_type_result.add(temp);
        }
    }
}
