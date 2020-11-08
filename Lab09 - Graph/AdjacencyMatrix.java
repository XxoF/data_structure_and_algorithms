import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.*;

public class AdjacencyMatrix{
    private int[][] adj;
    private final int NUMBER_OF_VERTICES;

    public AdjacencyMatrix(int vertices) {
        NUMBER_OF_VERTICES = vertices;
        adj = new int[NUMBER_OF_VERTICES+1][NUMBER_OF_VERTICES+1];
    }

    public void setEdge(int vertexSource, int vertexDestination, int weight){
        try {
            adj[vertexSource][vertexDestination] = weight;
            adj[vertexDestination][vertexSource] = weight;
        } catch (ArrayIndexOutOfBoundsException indexBounce){
            System.out.println("The vertex is invalid");
        }
    }

    public void setEdge(int vertexSource, int vertexDestination){
        this.setEdge(vertexSource, vertexDestination, 1);
    }

    public int getEdge(int vertexSource, int vertexDestination){
        try{
            return adj[vertexSource][vertexDestination];
        } catch (ArrayIndexOutOfBoundsException indexBounce){
            System.out.println("The vertex is invalid");
        }
        return -1;
    }

    public int getNumberOfVertex(){
        return NUMBER_OF_VERTICES;
    }
    public void printGraph(){
        for(int i = 1 ; i<=NUMBER_OF_VERTICES;i++){
            for(int j = 1; j<=NUMBER_OF_VERTICES;++j){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(new BufferedReader(new FileReader("input.txt")));
        int n = sc.nextInt();
        AdjacencyMatrix graph = new AdjacencyMatrix(n);
        for(int i = 1; i<=n;++i)
            for(int j = 1; j<=n;++j){
                int check = sc.nextInt();
                if(check > 0)
                    graph.setEdge(i, j, check);
            }

        graph.printGraph();
        graph.BFS(1);
        
    }

    public void BFS(int s){
        boolean visited[] = new boolean[NUMBER_OF_VERTICES+1];

        Queue<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty()){
            int x = queue.poll();
            System.out.print(x + " ");

            for(int i = 1; i <= NUMBER_OF_VERTICES; ++i){
                if (adj[x][i] != 0 && visited[i] == false){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}