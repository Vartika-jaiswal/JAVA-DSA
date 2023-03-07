package Arrays.Binary_search;

import java.util.Arrays;

public class Check_if_N_and_its_double_exists {
    public static void main(String[] args) {
        int [] arr={10,2,5,4};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int target=arr[i]*2;
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target && mid!=i){
                    return true;
                }
                else if(arr[mid]<target){
                      start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}
