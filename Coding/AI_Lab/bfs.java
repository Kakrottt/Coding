package AI_Lab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static void breadthFirstSearch(ArrayList<ArrayList<Integer>> adj, int V, int s, boolean[] visited) {
        Queue<Integer> q = new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);

        while(q.isEmpty()==false){
            int u = q.poll();
            System.out.println(u + " ");

            for (int v : adj.get(u)) {
                if(visited[v]==false){
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
         int V = 5;
         ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
         int s = 0;

         boolean[] visited = new boolean[V];

         for (int i = 0; i < V; i++) {
             adj.add(new ArrayList<Integer>());
         }

         addEdge(adj, 0, 1);
         addEdge(adj, 0, 2);
         addEdge(adj, 1, 2);
         addEdge(adj, 1, 3);

         printGraph(adj);
         breadthFirstSearch(adj, V, s, visited);
    }
}
