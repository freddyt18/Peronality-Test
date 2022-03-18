package Data.Data_Handling;

public class Person {
    private int id;
    private String name = " ";
    private int age = 0;
    private String sex = " ";
    
    private String bio = " ";
    private String email;
    private String username;
    private String password;
    private String personality = " ";

    Person(){}
    Person(String name){
        this.name = name;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    Person(String name, int age, int id, String sex){
        this.name = name;
        this.age = age;
        this.id = id;
        this.sex = sex;
    }
    Person(String name, int age, int id, String sex, String username){
        this.name = name;
        this.age = age;
        this.id = id;
        this.sex = sex;
        this.username = username;
    }
    Person(String name, int age, int id, String sex, String username, String password){
        this.name = name;
        this.age = age;
        this.id = id;
        this.sex = sex;
        this.username = username;
        this.password = password;
    }
    Person(String name, int age, int id, String sex, String username, String password, String personality){
        this.name = name;
        this.age = age;
        this.id = id;
        this.sex = sex;
        this.username = username;
        this.password = password;
        this.personality = personality;
    }
    Person(String name, int age, int id, String sex, String username, String password, String personality, String email){
        this.name = name;
        this.age = age;
        this.id = id;
        this.sex = sex;
        this.username = username;
        this.password = password;
        this.personality = personality;
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    } 
    public void setAge(int age){
        this.age = age;
    } 
    public void setID(int id){
        this.id = id;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setPersonality(String personality){
        this.personality = personality;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setBio(String bio){
        this.bio = bio;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getID(){
        return this.id;
    }
    public String getSex(){
        return this.sex;
    }
    public String getBio(){
        return this.bio;
    }
    public String getEmail(){
        return this.email;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getPersonality(){
        return this.personality;
    }

    public void printInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("\tName: " + this.name + " - " + this.age +  " years old - " + this.sex);
        System.out.println("\tUsername - " + this.username);
        System.out.println("\tPassword - " + this.password);
        System.out.println("\tEmail - " + this.email);
        System.out.println("\tPersonality - " + this.personality);
        System.out.println("\n\tBio:\n\n" + this.bio);
        
    }

}