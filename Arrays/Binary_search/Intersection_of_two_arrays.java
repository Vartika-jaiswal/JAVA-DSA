package Arrays.Binary_search;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_two_arrays {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i:nums1){
            set.add(i);
        }
        HashSet<Integer> intersection = new HashSet<Integer>();
        for(int i:nums2){
            if(set.contains(i)){
                intersection.add(i);
            }
        }
        int [] result =new int[intersection.size()];
        int index=0; 
        for(int i:intersection){
            result[index++]=i;
        }
        return result;
     }
}
