package OOP.Homewrok2;

import java.io.IOException; 
import java.util.ArrayList; 

public interface Research {
    ArrayList<Person>getParents(Relations realations) throws IOException;

    ArrayList<Person>getCildrenByPerson() throws IOException;
}
