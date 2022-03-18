package Result_Generator;

public class RUN {    
    public static void main(String[] args) {
        test.main(args);

        for(int i=0; i<5; i++){
            System.out.println(test.personality_type.get(i).toString());
            System.out.println("");
            System.out.println(test.personality_type_result.get(i).toString());
        }
        
    }
}
