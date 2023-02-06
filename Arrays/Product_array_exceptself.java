package Arrays;

import java.util.Arrays;

public class Product_array_exceptself {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int n=nums.length;
       int multiply=1;
       int count=0;
       for(int i=0;i<n;i++){
           if(nums[i]==0){
               count++;
           }
           else{
               multiply*=nums[i];
           }
       }
       if(count==0){
           for(int i=0;i<n;i++){
           nums[i]=multiply/nums[i];
           }
     } 
     else if(count==1){
          for(int i=0;i<n;i++){
             if(nums[i]==0){
                 nums[i]=multiply;
             }
             else{
                     nums[i]=0;
             }
          }
     }
     else{
         for(int i=0;i<n;i++){
             nums[i]=0;
         }
     }
     System.out.println(Arrays.toString(nums));
    }
}
