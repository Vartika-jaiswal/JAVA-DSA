package Arrays.Binary_search;

public class Kth_missing_positive_number {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositive( arr, k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int l=0;
        int h=arr.length-1;
        int mis=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]-(mid+1)<k)
            {
                mis=mid+1;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return k+mis;
     }
}
