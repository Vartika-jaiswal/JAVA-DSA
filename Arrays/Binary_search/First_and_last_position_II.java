package Arrays.Binary_search;

import java.util.Arrays;

public class First_and_last_position_II {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=7;
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        if(ans[0]!=-1){
            ans[1]=search(nums,target,false);
        }
        System.out.println(Arrays.toString(ans));
       }
       public static int search(int[] nums,int target,boolean findStartIndex){
           int ans=-1;
           int start=0;
           int end=nums.length-1;
           while(start<=end){
               int mid=start+(end-start)/2;
               if(target>nums[mid]){
                   start=mid+1;
               }else if(target<nums[mid]){
                   end=mid-1;
               }
               else{
                   ans=mid;
                   if(findStartIndex==true){
                       end=mid-1;
                   }else{
                       start=mid+1;
                   }
               }
           }
           return ans;
       }
    }

