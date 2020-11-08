import java.io.*;
import java.util.*;

public class AdjacencyList{
    private int V;
    private LinkedList<Integer> adj[];
    
    public AdjacencyList(int v){
        V = v;
        adj = new LinkedList[v+1];
        for(int i = 1; i<=v;++i)
            adj[i] = new LinkedList<Integer>();
    }

    public void addEgde(int u, int v){
        adj[u].add(v);
    }

    public void printGraph(){
        for(int i = 1;i<=V;++i){
            System.out.print("Vertex " + i + ": ");
            //System.out.println("head");
            for(Integer v: adj[i]){
                System.out.print("->" + v);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("input.txt")));
        int n = sc.nextInt();
        AdjacencyList graph = new AdjacencyList(n);
        for(int i = 1; i<=n;++i){
            for(int j = 1; j <=n; ++j){
                int check = sc.nextInt();
                if(check > 0)
                    graph.addEgde(i, j);
            }
        }

        graph.printGraph();

        System.out.println("Type 2: ");
        sc = new Scanner(new BufferedReader(new FileReader("input2.txt")));
        n = sc.nextInt();
        AdjacencyList graph2 = new AdjacencyList(n);
        int t = sc.nextInt();
        while(t-- > 0){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph2.addEgde(u, v);
            graph2.addEgde(v, u);
        }

        graph2.printGraph();
    }
}