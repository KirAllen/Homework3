package OOP.Homewrok2;

public class Node{
    
    Person person; 

    Relations relations; 

    Person anotherperson; 

    public Node(Person person, Relations relations, Person anotherperson){
        this.person = person; 
        this.relations = relations; 
        this.anotherperson= anotherperson; 
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", person, relations, anotherperson);
    }
}
