package Pattern;

public class Sudoku {

    public static void sudokuSolver(int[][] graph){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(graph[i][j] == 0){
                    int temp = 1;
                    graph[i][j] = Check(graph, i, j, temp);
                }
            }
        }
        printSoln(graph);
    }

    public static int Check(int[][] graph, int i, int j, int temp){
        rowCheck(graph, i, j, temp);
        // System.out.println(temp);
        columnCheck(graph, i, j, temp);
        // System.out.println(temp);
        gridCheck(graph, i, j, temp);
        // System.out.println(temp);
        return temp;
    }

    public static int rowCheck(int[][] graph, int i, int j, int temp){
        if(temp>9)
            Check(graph, --i, --j, graph[i][j]++);
        else{
            for (int u = 0; u < i; u++) {
                if(graph[i][u] == temp)
                    rowCheck(graph, i, j, temp++);
            }
        }
        return temp;
    }

    public static int columnCheck(int[][] graph, int i, int j, int temp) {
        if(temp>9)
            Check(graph, --i, --j, graph[i][j]++);
        else{
            for (int k = 0; k < j; k++) {
                if(graph[k][j] == temp)
                columnCheck(graph, i, j, temp++);
            }
        }
        return temp;
    }

    public static int gridCheck(int[][] graph, int i, int j, int temp) {
        int m1 = i/3;
        // int n1 = j%3;
        int m2 = j/3;
        // int n2 = j%3;
        if(temp>9)
            Check(graph, --i, --j, graph[i][j]++);
        else{
            for(int u = m1; u<(m1+3);u++)
                for(int v = m2; v<(m2+3); v++){
                    if(graph[u][v]==temp)
                        gridCheck(graph, i, j, temp++);
                }
        }
        return temp;
    }

    public static void printSoln(int[][] graph){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // int n = 9;
        int graph[][] =    {{1, 2, 3, 4, 5, 6, 7, 8, 9},
                            {4, 5, 6, 0, 0, 0, 0, 0, 0},
                            {7, 8, 9, 0, 0, 0, 0, 0, 0},
                            {2, 0, 0, 0, 0, 0, 0, 0, 0},
                            {3, 0, 0, 0, 0, 0, 0, 0, 0},
                            {5, 0, 0, 0, 0, 0, 0, 0, 0},
                            {8, 0, 0, 0, 0, 0, 0, 0, 0},
                            {9, 0, 0, 0, 0, 0, 0, 0, 0},};
        sudokuSolver(graph);                     
        
    }
}
