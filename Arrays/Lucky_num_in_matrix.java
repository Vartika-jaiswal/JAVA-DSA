package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Lucky_num_in_matrix {
    public static void main(String[] args) {
        int[][] matrix={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        ArrayList<Integer> list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int[] mi=new int[n];
        int[] mx=new int[m];
          Arrays.fill(mi, Integer.MAX_VALUE);
          Arrays.fill(mx, Integer.MIN_VALUE);
        
          for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                mi[i] = Math.min(matrix[i][j], mi[i]);
                mx[j] = Math.max(matrix[i][j], mx[j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mi[i]==mx[j]){
                    list.add(mi[i]);
                }
            }
        }
        System.out.println(list);
    }
}
