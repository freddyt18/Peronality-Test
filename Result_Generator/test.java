package Result_Generator;

import java.util.LinkedList;


public class test {
    static LinkedList<String> personality_type = new LinkedList<String>();
    static LinkedList<String> personality_type_result = new LinkedList<String>();
    public static void main(String[] args) {
        for(int a = 0; a < 2; a++){
            String tempA = "";
            if(a==0){
                tempA = tempA.concat(" A - high | ");
            } else {
                tempA = tempA.concat(" a - low | ");
            }
            for(int b = 0; b < 2; b++){
                String tempB = "";
                if(b==0){
                    tempB = " B - high | ";
                    tempB = tempB.concat(tempA);
                } else {
                    tempB = " b - low | ";
                    tempB = tempB.concat(tempA);
                }
                for(int c = 0; c < 2; c++){
                    String tempC = "";
                    if(c==0){
                        tempC = " C - high | ";
                        tempC = tempC.concat(tempB);
                    } else {
                        tempC = " c - low | ";
                        tempC = tempC.concat(tempB);
                    }
                    for(int d = 0; d < 2; d++){
                        String tempD = "";
                        if(d==0){
                            tempD = " | D - high | ";
                            tempD = tempD.concat(tempC);
                        } else {
                            tempD = " | d- low | ";
                            tempD = tempD.concat(tempC);
                        }   
                        for(int e = 0; e < 2; e++){
                            String tempE = "";
                            if(e==0){
                                tempE = "E - high";
                                tempE = tempE.concat(tempD);                               
                            } else {
                                tempE = "e - low";
                                tempE = tempE.concat(tempD);
                            }
                            personality_type.add(tempE);
                        }  
                    }        
                }
            }
        }
        System.out.println(personality_type.get(3).toString());

        for(int i = 0; i < personality_type.size(); i++){
            String temp = "";
            if(personality_type.get(i).toString().contains("a - low")){
                temp = temp.concat("-a detail low");
            } else {
                temp = temp.concat("-a detail high");
            }

            if(personality_type.get(i).toString().contains("b - low")){
                temp = temp.concat("||-b detail low");
            } else {
                temp = temp.concat("||-b detail high");
            }

            if(personality_type.get(i).toString().contains("c - low")){
                temp = temp.concat("||-c detail low");
            } else {
                temp = temp.concat("||-c detail high");
            }

            if(personality_type.get(i).toString().contains("d - low")){
                temp = temp.concat("||-d detail low");
            } else {
                temp = temp.concat("||-d detail high");
            }

            if(personality_type.get(i).toString().contains("e - low")){
                temp = temp.concat("||-e detail low");
            } else {
                temp = temp.concat("||-e detail high");
            }

            personality_type_result.add(temp);
        }
        //result of personality 1
        System.out.println("\n\nPersonality type #1: ");
        System.out.println(personality_type_result.get(0).toString().replace("||", "\n").replace("-", "\t"));
    }
}