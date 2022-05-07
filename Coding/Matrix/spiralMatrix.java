package Matrix;

public class spiralMatrix {
    public void printSpiral(int mat[][]){
        int top = 0, right = mat.length-1, bottom = mat[0].length-1, left = 0;

        while(top<=bottom && left<=right){
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            for(int i = top; i<=bottom; i++){
                System.out.print(mat[i][right] + " ");
            }
            right--;

            if(top<=bottom){
                for(int i = right; i>=left; i--){
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i = bottom; i>=top; i--){
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }
}
