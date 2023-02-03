package Arrays;

import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int n=nums.length;
        int[] arr=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
