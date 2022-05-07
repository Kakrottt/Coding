package DS.DSPractice;

import java.util.Scanner;


public class bfsGraph {

        // int n;
        // LinkedList<Integer> adj[];       

        
        public static void main(String[] args) {
            // Scanner sci = new Scanner(System.in);

            // int nv = sci.nextInt();
            // int mv = sci.nextInt();


            // graph g = new graph(nv);
            graph g = new graph(4);

            // for(int i=0; i<mv; i++){
            //     int v = sci.nextInt();
            //     int w = sci.nextInt();
            //     g.addEdge(v, w);
            // }

            // int spi = sci.nextInt();
            System.out.print("Starting From " + 2 + " ");

            
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.bfs(2);

        }
}
