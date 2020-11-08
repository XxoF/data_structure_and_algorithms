import java.io.*;
import java.util.*;

class IntegerTriple{
    private Integer weight;
    private Integer source;
    private Integer dest;

    public IntegerTriple(Integer w, Integer s, Integer d){
        weight = w;
        source = s;
        dest = d;
    }

    public IntegerTriple(Integer s, Integer d){
        this(1,s,d);
    }

    public Integer getWeight(){
        return weight;
    }

    public Integer getSource(){
        return source;
    }

    public Integer getDest(){
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
    }

    
    public void addEdge(Integer u, Integer v){
        this.addEdge(1,u,v);
    }

    public void printGraph(){
        System.out.println("w u v");
        for(int i = 0;i<edges.size();++i){
            System.out.println(edges.get(i));
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("input2.txt")));    
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