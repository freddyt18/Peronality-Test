package Data.Data_Handling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Data.BCrypt.BCrypt;

public class DataHandling {

    static File path = new File("src/Data/Data_Handling/info.dat");
    static FileWriter file;
    static FileReader fileRead;
    static BufferedWriter bWriter;
    static BufferedWriter b;
    static Scanner readFile;
    static BufferedReader bReader;
    static List<String> line;
    public static LinkedList<Person> users = new LinkedList<Person>();
    public static int TEMPORARY_USER;
    public static void main(String[] args) throws IOException {
        dealWithFile();
        dataToList();
        /* int index = users.size();
        boolean exists = false;
        for(int i=0; i<index; i++){
            if(users.get(i).getName().equalsIgnoreCase("Whatanak")){
                System.out.println(users.get(i).getName() + " - " + users.get(i).getID());
                exists = true;
                break;
            }
        }
        if(!exists){
            System.out.println("No user found " + users.size());
            
        } */

        /* Person test = new Person("test", 20, users.size()+1);
        users.add(test);
        dealWithFile();
        while(readFile.hasNext()){
            readFile.nextLine();
        }
        bWriter.write("\n" + users.get(index).getID()
            + "\nName: " + users.get(index).getName()
            + "\nAge: " + users.get(index).getAge() + "\n"
        );
        bWriter.close();
        file.close(); */

        //Everytime the program is closed
        /* List<String> lines = Files.readAllLines(path.toPath());
        lines.set(0, "AMOUNT " + users.size());
        Files.write(path.toPath(), lines);
        bWriter.close();
        file.close(); */
    }

    //initializing files controling
    public static void dealWithFile() throws IOException {
        readFile = new Scanner(path);
        file = new FileWriter(path, true);
        fileRead = new FileReader(path);
        bWriter = new BufferedWriter(file);
        bReader = new BufferedReader(fileRead);
        line = Files.readAllLines(path.toPath()); //n*10 + 2 //size (actual id)*10 + 2

    }

    public static void resetDealWithFile() throws IOException {
        readFile.close();
        file.close();
        fileRead.close();
        bWriter.close();
        bReader.close();
        line.clear();

        dealWithFile();
    }

    public static void resetEverything(){
        users = null;
        users = new LinkedList<>();
    }

    //read data from .dat file to temporary linked list
    public static void dataToList() throws IOException {
        resetDealWithFile();
        int size = Integer.parseInt(line.get(0));
        bReader.readLine();
        System.out.println(size);
        for(int i=0; i<size; i++){
            int tempLine = i*10 + 2;
            int age = 0;
            String name = ""; //6
            String bio = ""; //5
            String email = ""; //7
            String username = ""; //10
            String password = ""; //10
            String personality = ""; //13
            String sex = ""; //5
            String temp = ""; //6
            Person person = new Person();
            
            person.setID(Integer.parseInt(line.get(tempLine++)));

            username = line.get(tempLine++).toString().replace("Username: ", "");
            person.setUsername(username);
            
            password = line.get(tempLine++).toString().replace("Password: ", "");
            person.setPassword(password);

            email = line.get(tempLine++).toString().replace("Email: ", "");
            person.setEmail(email);

            personality = line.get(tempLine++).toString().replace("Personality: ", "");
            person.setPersonality(personality);

            name = line.get(tempLine++).toString().replace("Name: ", "");
            person.setName(name);

            temp = line.get(tempLine++).toString().replace("Age: ", "");
            if(temp.equals("")){
                age = 0;
            } else {
                age = Integer.parseInt(temp);
            }
            person.setAge(age);

            sex = line.get(tempLine++).toString().replace("Sex: ", "");
            person.setSex(sex);

            bio = line.get(tempLine++).toString().replace("Bio: ", "");
            person.setBio(bio);

            users.addLast(person);
        }
    
        bReader.close();
        fileRead.close();
        dealWithFile();
    }

    public boolean containsUsername(String username){
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getUsername().equals(username)){
                TEMPORARY_USER = i;
                return true;
            }
        }
        return false;
    }

    public void writeToFile(String username, String password, String email) throws IOException{
        resetDealWithFile();
        line.set(0, Integer.toString(users.size()+1));
        Files.write(path.toPath(), line);

        resetDealWithFile();
        int id = users.size() + 1;
        Person newUser = new Person();
        newUser.setID(id);
        newUser.setUsername(username);
        newUser.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));
        newUser.setEmail(email);
        users.add(newUser);

        while(readFile.hasNext()){
            readFile.nextLine();
        }

        bWriter.write("\n" + DataHandling.users.get(id-1).getID()
        + "\nUsername: " + DataHandling.users.get(id-1).getUsername()
        + "\nPassword: " + DataHandling.users.get(id-1).getPassword()
        + "\nEmail: " + DataHandling.users.get(id-1).getEmail()
        + "\nPersonality: " + DataHandling.users.get(id-1).getPersonality()
        + "\nName: " + DataHandling.users.get(id-1).getName()
        + "\nAge: " + DataHandling.users.get(id-1).getAge()
        + "\nSex: " + DataHandling.users.get(id-1).getSex()
        + "\nBio:" + DataHandling.users.get(id-1).getBio());

        bWriter.close();
        file.close();
    }

    //BETA
    public static void listToData() throws IOException {
        resetDealWithFile();
        b = new BufferedWriter(new FileWriter("src/Data/Data_Handling/info.dat"));
        System.out.println("User size: " + users.size());
        b.write(Integer.toString(users.size()) + "\n\n");
        for(int i = 0; i < users.size(); i++){
            b.write(Integer.toString(DataHandling.users.get(i).getID()) + "\n");
            b.write("Username: " + DataHandling.users.get(i).getUsername() + "\n");
            if(!DataHandling.users.get(i).getPassword().contains("$2a$10$")){
                b.write("Password: " + BCrypt.hashpw(DataHandling.users.get(i).getPassword(), BCrypt.gensalt()) + "\n");
            } else {
                b.write("Password: " + DataHandling.users.get(i).getPassword() + "\n");
            }
            b.write("Email: " + DataHandling.users.get(i).getEmail() + "\n");
            b.write("Personality: " + DataHandling.users.get(i).getPersonality() + "\n");
            b.write("Name: " + DataHandling.users.get(i).getName() + "\n");
            b.write("Age: " + DataHandling.users.get(i).getAge() + "\n");
            b.write("Sex: " + DataHandling.users.get(i).getSex() + "\n");
            b.write("Bio: " + DataHandling.users.get(i).getBio() + "\n");
            if(i!=(users.size()-1)){b.write("\n");}
        }
        bWriter.close();
        file.close();
        b.close();

        /* line.set(0, Integer.toString(users.size()));
        Files.write(path.toPath(), line);

        //Password Hashing
        String hash = BCrypt.hashpw("123", BCrypt.gensalt(12));
        if(BCrypt.checkpw("123", hash)){
            System.out.println(hash);
        } else System.out.println("False");
        
        for(int i = 0; i < users.size(); i++){
            int tempLine = i*10 + 2;
            line.set(tempLine++, Integer.toString(DataHandling.users.get(i).getID()));
            Files.write(path.toPath(), line);

            line.set(tempLine++, "Username: " + DataHandling.users.get(i).getUsername());
            Files.write(path.toPath(), line);

            if(!DataHandling.users.get(i).getPassword().contains("$2a$10$")){
                line.set(tempLine++, "Password: " + BCrypt.hashpw(DataHandling.users.get(i).getPassword(), BCrypt.gensalt()));
                Files.write(path.toPath(), line);
            } else {tempLine++;}

            line.set(tempLine++, "Email: " + DataHandling.users.get(i).getEmail());
            Files.write(path.toPath(), line);

            line.set(tempLine++, "Personality: " + DataHandling.users.get(i).getPersonality());
            Files.write(path.toPath(), line);

            line.set(tempLine++, "Name: " + DataHandling.users.get(i).getName());
            Files.write(path.toPath(), line);

            line.set(tempLine++, "Age: " + DataHandling.users.get(i).getAge());
            Files.write(path.toPath(), line);

            line.set(tempLine++, "Sex: " + DataHandling.users.get(i).getSex());
            Files.write(path.toPath(), line);

            line.set(tempLine, "Bio: " + DataHandling.users.get(i).getBio());
            Files.write(path.toPath(), line);
            
        }
        bWriter.close();
        file.close();
        b.close(); */

    }

    public static void deleteAccount(int id) throws IOException {
        int temp = id + 1;
        for(int i = 0; i < users.size(); i++){
            if(i>=id){
                users.get(i).setID(temp); 
                if(!(i==id)) {temp++;}
            }
        }
    }
}
