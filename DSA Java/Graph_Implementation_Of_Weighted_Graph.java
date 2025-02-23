import java.util.*;
class Edge{
    int src;
    int des;
    int wt;
    Edge(int s , int d , int w){
        this.src =s;
        this.des = d;
        this.wt = w;
    }
}
public class Graph_Implementation_Of_Weighted_Graph {
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));
        
        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));
        
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));
        
        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }
    public static void main(String args[]){
        int v = 4;
        
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        
        for(int i=0 ; i<v ; i++){
            System.out.print("For Verties "+i+" : ");
            for(int j=0 ; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                System.out.print(" {"+e.src+" , "+e.des+" , "+e.wt+"} ");
            }
            System.out.println();
        }    
    } 
}
