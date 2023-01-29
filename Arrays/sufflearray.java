package Arrays;

import java.util.Arrays;

public class sufflearray {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[] ans=new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i=i+2){
            ans[i]=nums[j];
            ans[i+1]=nums[j+n];
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
