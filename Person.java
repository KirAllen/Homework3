package OOP.Homewrok2;

import java.io.IOException;
import java.util.ArrayList;

public class Person implements GeoTree, Printer, Research {
    private String name; 

    private int age; 

    public Person(String name, int age){
        this.name = name;
        this.age = age; 
    }

    public String GetName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void append(Person children){ 
        getTree().add(new Node(this, Relations.PARENTS, children)); 
        getTree().add(new Node(children, Relations.CHILDREN, this)); 
    }

    @Override
    public ArrayList<Person> getParents(Relations realations) throws IOException {
        ArrayList<Person> result = new ArrayList<>(); 
        for(Node node: getTree()){
            if(node.Person.getName().equals this.GetName() && node.relations equals(Relations.CHILDREN)){
                result.add(node.anotherperson); 
            }

        }
        print(result);
        return result;
    }

    @Override
    public ArrayList<Person> getCildrenByPerson() throws IOException {
        ArrayList<Person> result = new ArrayList<>(); 
        for(Node node: getTree()){
            if(node.Person.getName().equals this.GetName() && node.relations equals(Relations.PARENTS)){
                result.add(node.anotherperson); 
            }

        }
        print(result);
        return result;
    }    
}
