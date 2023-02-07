package Arrays.Binary_search;

import java.util.Arrays;

public class First_last_position_of_element_optimized {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] arr=new int[2];
        arr[0]=findFirst(nums,target);
         arr[1]=findLast(nums,target);
         System.out.println(Arrays.toString(arr));
    }
    public  static int findFirst(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int pos=-1;
        while(start<=end){
           int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                pos=mid;
                end=mid-1;
            }
        }
        return pos;
    }
     public static int findLast(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int pos=-1;
        while(start<=end){
           int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                pos=mid;
                start=mid+1;
            }
        }
        return pos;
    }
}
