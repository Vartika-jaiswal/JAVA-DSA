package Arrays;

import java.util.Arrays;

public class first_last_position_of_element {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int n=nums.length;
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0;i<n;i++){
               if(nums[i]==target){
                   ans[0]=i;
                   break;
               }  
           }
        for(int i=n-1;i>=0;i--){
            if(nums[i]==target){
                ans[1]=i;
                break;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
