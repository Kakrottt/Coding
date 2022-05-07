package DS.DSPractice;

import java.util.Scanner;

public class directedGraph {
        public static void main(String[] args) {
            int n, m;
            Scanner sc = new Scanner(System.in);

            n = sc.nextInt();
            m = sc.nextInt();

            int[][] adjm = new int[n+1][n+1];

            for(int i = 0; i<m; i++){
                int x, y;
                x = sc.nextInt();
                y = sc.nextInt();

                adjm[x][y] = 1;
                // adjm[y][x] = 1;

            }

            System.out.println("Adjacency Matrix >> \n");

            for(int i= 1; i<n+1; i++){
                for(int j=1; j<n+1; j++){
                    System.out.print(adjm[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\n Adjacency List >> \n");
            
            for(int i= 1; i<n+1; i++){
                System.out.print(i);
                for(int j=1; j<n+1; j++){
                    if(adjm[i][j]== 1){
                        System.out.print(" -> " + j );
                    }
                }
                System.out.println();
            }


        }
}
