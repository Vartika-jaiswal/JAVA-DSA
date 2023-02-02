package Arrays;

import java.util.Arrays;

public class transpose_matrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        
        int n=matrix.length;
        if(n==0){
            System.out.println(Arrays.toString(matrix));
        }
        int m=matrix[0].length;
        if(m==0){
            System.out.println(Arrays.toString(matrix));
        }
        int[][] trans= new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                trans[j][i]=matrix[i][j];
                System.out.print(trans[j][i]);
            }
            
        }
       System.out.println(Arrays.toString(trans));
    }
}
