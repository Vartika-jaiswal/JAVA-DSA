package Arrays.Binary_search;

import java.util.Arrays;

public class Intersection_of_two_arraysII {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
         Arrays.sort(nums2);
         int [] ans=new int[nums1.length*nums2.length];
         int i=0,j=0,k=0;
         while(i<nums1.length && j<nums2.length){
             if(nums1[i]<nums2[j]){
                 i++;
             }
             else if(nums1[i]>nums2[j]){
                 j++;
             }
             else{
                  ans[k++]=nums1[i++];
                  j++;
             }
         }
         return Arrays.copyOfRange(ans,0,k);
      }
}
