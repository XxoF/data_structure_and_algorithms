import java.io.*;
import java.util.*;

class TripleInteger{
    private Integer u,v,w;

    public TripleInteger(Integer u, Integer v, Integer w){
        this.u = u;
        this.v = v;
        this.w = w;
    }

    public TripleInteger(Integer u, Integer v){
        this(u,v,1);
    }

    public Integer getU(){
        return u;
    }

    public Integer getV(){
        return v;
    }

    
}

public class Graph{

    private Integer parent[];
    private Integer key[];
    private Boolean mstSet[];
    private Integer V;
    private Integer graph[][];

    public Graph(Integer V){
        this.V = V;
        parent = new Integer[V+1];
        key = new Integer[V+1];
        mstSet = new Boolean[V+1];
        graph = new Integer[V+1][V+1];
        for (int i = 1; i<V;++i){
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
    }

    public Graph(Integer V, graph[][]){
        this(V);
        this.graph = graph;
    }

    int minKey(){
        int min  = Integer.MAX_VALUE, min_index=-1;

        for(int v = 1; v <= V;++v){
            if(mstSet[v] == false && key[v] < min){
                min = mstSet[v];
                min_index = v;
            }
        }
        return min_index;
    }

    public Prim(){
        key[0] = 0;
        parent[0] = -1;

        for (int count = 1; count <= V; ++count){
            int u = minKey();

            mstSet[u] = true;

            for(int v = 1; v <= V;++v){
                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]){
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }
        System.out.println("Edge \tWeight");
        for(int i = 2; i<=V;++i){
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        Graph t = new Graph();

        Integer graph[][] = new Integer[][] { 
            { 0, 2, 0, 6, 0 }, 
            { 2, 0, 3, 8, 5 }, 
            { 0, 3, 0, 0, 7 }, 
            { 6, 8, 0, 0, 9 }, 
            { 0, 5, 7, 9, 0 } 
        }; 

        t.Prim();
    }

}