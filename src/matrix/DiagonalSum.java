package matrix;

public class DiagonalSum {

    //has O(n^2) complexity because of nested for loop
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(i==j || i+j==mat.length-1) sum += mat[i][j];
            }
        }
        return sum;
    }


    //optimized solution using two pointer approach
    public int diagonalSumOptimized(int[][] mat){
        int sum = 0;
        int i = 0;
        int j = mat[0].length-1;
        for(int k=0; k<mat.length; k++){
            if(i==j) sum += mat[k][i];
            else{
                int temp = mat[k][i] + mat[k][j];
                sum += temp;
            }
            i++;
            j--;
        }
        return sum;
    }
}
