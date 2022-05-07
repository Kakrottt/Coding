package DS.DSPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class graph {
    
    int V;
    LinkedList<Integer> adjm[];
    
    graph(int n){
        V = n;
        adjm = new LinkedList[n];
        for (int i=0; i<n; i++)
            adjm[i] = new LinkedList();
    }

    void addEdge(int n, int w){
        adjm[n].add(w);
    }

    void bfs(int sp){

        boolean visited[] = new boolean[V];

        LinkedList<Integer> que = new LinkedList<Integer>();

        visited[sp] = true;
        que.add(sp);
        
        while(que.size() != 0){

            sp = que.poll();
            System.out.println(sp + " ");

            Iterator<Integer> i = adjm[sp].listIterator();

            while(i.hasNext()){
                
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    que.add(n);
                }
            }


        }

}


}
