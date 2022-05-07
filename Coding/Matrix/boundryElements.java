package Matrix;

public class boundryElements {
    public void printBoundryElements(int mat[][]) {
        int c = mat[0].length;
        int r = mat.length;
        
        if(c == 1){
            for (int i = 0; i < c; i++) {
                System.out.print(mat[0][i] + " ");
            }
        }
        else if(r == 1){
            for (int i = 0; i < r; i++) {
                System.out.print(mat[i][0] + " ");
            }
        }
        else {
            for (int i = 0; i < mat[0].length; i++) {
                System.out.print(mat[0][i] + " ");
            }

            for (int i = 1; i < mat[0].length; i++) {
                System.out.print(mat[i][mat[0].length-1] + " ");
            }

            for(int i = mat.length-2; i>=0; i--){
                System.out.print(mat[mat.length-1][i] + " ");
            }

            for (int i = mat[0].length-1; i > 0; i--) {
                System.out.print(mat[i][0] + " ");
            }
        }
    }
}
