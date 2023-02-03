package Arrays;

import java.util.ArrayList;

public class Spiral_matrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> list=new ArrayList<>();
        int row=matrix.length;
        if(row==0)
        System.out.println(list);
        int col=matrix[0].length;
        int l=0,r=col-1,t=0,b=row-1,d=0;
        while(l<=r && t<=b){
            if(d==0){
                for(int i=l;i<=r;i++){
                    list.add(matrix[t][i]);
                }
                d=1;t++;
            }
            else if(d==1){
                for(int i=t;i<=b;i++){
                    list.add(matrix[i][r]);
                }
                d=2;r--;
            }
            else if(d==2){
                for(int i=r;i>=l;i--){
                  list.add(matrix[b][i]);
                }
                d=3;b--;
            }
            else if(d==3){
                for(int i=b;i>=t;i--){
                    list.add(matrix[i][l]);
                }
                d=0;l++;
            }
        }
        System.out.println(list);
    }
}
