package OOP.Homewrok2;

import java.io.FileWriter; 
import java.io.IOException; 
import java.util.ArrayList; 

public interface Printer{
    void print() throws IOException; 

    default void print(ArrayList<Person>personArrayList) throws IOException{   
        FileWriter fileWriter = new FileWriter("Research.txt",true); 
        for (Person person: personArrayList){
            fileWriter.write(person.GetName());
            fileWriter.write("/n");
        }
        fileWriter.write("---");
        fileWriter.write("/n");
        fileWriter.flush();
    }
}






