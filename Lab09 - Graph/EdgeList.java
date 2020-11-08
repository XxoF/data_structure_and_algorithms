import java.io.*;
import java.util.*;

class IntegerTriple{
    private Integer weight;
    private Integer source;
    private Integer dest;

    private IntegerTriple(Integer w, Integer s, Integer d){
        weight = w;
        source = s;
        dest = d;
    }

    private IntegerTriple(Integer s, Integer d){
        this(1,d,s);
    }

    private Integer getWeight(){
        return weight;
    }

    private Integer getSource(){
        return source;
    }

    private Integer getDest(){
        return dest;
    }

    @Override
    public String toString(){
        return weight + " " + source + " " + dest;
    }

}

public class EdgeList{
    private Vector<IntegerTriple> edges;

    public EdgeList(){
        edges = new Vector<IntegerTriple>();
    }

    public void addEdge(Integer w, Integer u, Integer v){
        edges.add(new IntegerTriple(w,u,v));
        edges.add(new IntegerTriple)
    }

    public void addEdge(Integer u, Integer v){
        edges.add(new IntegerTriple(u,v));
    }
    public void printGraph(){
        for(int i = 0;i<edges.size();++i){
            System.out.println(edges.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("input.txt")));    
        EdgeList graph = new EdgeList();
        int n = sc.nextInt();
        for(int i = 1; i<=n;++i){
            Integer u = sc.nextInt();
            Integer v = sc.nextInt();
            graph.addEdge(u,v);
        }
        graph.printGraph();
    }

}