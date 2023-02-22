package OOP.Homewrok2;

import java.io.FileWriter; 
import java.io.IOException; 
import java.util.ArrayList;

import org.w3c.dom.Node; 

public interface GeoTree extends Printer{
    ArrayList<Node> tree = new ArrayList<>(); 
    void append (Person children);
    default ArrayList<Node> getTree(){
        return tree;
    }

     @Override
    default void print() throws IOException {
        FileWriter fileWriter = new FileWriter("Research.txt",true);
        for (Node node: getTree()){
            fileWriter.write(node.toString());
            fileWriter.write('n');
        }
        
        fileWriter.write("---");
        fileWriter.write('n');
        fileWriter.flush();
    }
}
