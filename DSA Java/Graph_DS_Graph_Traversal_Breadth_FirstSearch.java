import java.util.*;
class Edge{
    int src;
    int des;
    Edge(int s , int d){
        this.src = s;
        this.des = d;
    }
}
public class Graph_DS_Graph_Traversal_Breadth_FirstSearch {
    public static void bfs(ArrayList<Edge> graph[], int v){
        boolean visit[] = new boolean[v];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        while(!q.isEmpty()){
            int cur = q.remove();
            if(visit[cur] == false){
                System.out.print(cur+" ");
                visit[cur] = true;
            
                for(int i= 0 ; i<graph[cur].size() ; i++){
                    Edge e = graph[cur].get(i);
                    q.add(e.des);
                }
            }
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        
        graph[6].add(new Edge(6,5));
    }
    public static void main(String args[]){
        int v = 7;
        /*
                1 --- 3
               /      | \
              0       |  5 -- 6  
              \       | /     
               2 --- 4
        */
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        
        bfs(graph , v);
        
    } 
}
