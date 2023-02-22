package OOP.Homewrok2;

import java.io.IOException; 

public class Main {
    public static void main(String[] args) throws IOException{
        Person firstPerson = new Person("Thomas", 27);

        Person secondPerson = new Person("Claudia", 32);

        Person thirdPerson = new Person("Albert", 12);

        Person fourthPerson = new Person("Alevtina", 17);

        Person fifthPerson = new Person("Albert", 32);

        firstPerson.append(secondPerson); 
        firstPerson.append(thirdPerson); 
        secondPerson.append(fourthPerson); 
        secondPerson.append(fifthPerson); 

        secondPerson.getCildrenByPerson(); 
        secondPerson.getParents(Relations.CHILDREN);
    }
}
