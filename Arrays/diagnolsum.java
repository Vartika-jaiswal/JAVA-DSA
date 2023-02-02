package Arrays;

public class diagnolsum {
   public static void main(String[] args) {
    int [][] mat={{1,2,3},
    {4,5,6},
    {7,8,9}};
int sum=0;
int n=mat.length-1;
for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[i].length;j++){
        if(i==j){
            sum+=mat[i][j];
        }else if(i==n-j){
            sum+=mat[i][j];
        }
    }
} System.out.println(sum);
   }
}
