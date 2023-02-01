package Arrays;

public class cells_with_odd_values_in_matrix {
    public static void main(String[] args) {
        int [][] indices={{0,1},{1,1}};
        int m=2;
        int n=3;
        int [][] ans=new int[m][n];
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<n;j++){
                ans[indices[i][0]][j]++;
            }
            for(int j=0;j<m;j++){
                ans[j][indices[i][1]]++;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ans[i][j]%2!=0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
