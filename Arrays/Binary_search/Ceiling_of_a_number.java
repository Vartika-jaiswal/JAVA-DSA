package Arrays.Binary_search;

public class Ceiling_of_a_number {
    public static void main(String[] args) {
        int [] arr={2,3,5,9,14,16,18};
        int ans=Ceiling(arr,15);
        System.out.println(ans);
   }
   static int Ceiling(int arr[],int target){
       int start=0;
       int  end=arr.length-1;
       if(target>arr[arr.length-1])
       return -1;
           
       while(start<=end){
           int mid=start+(end-start)/2;
           if(arr[mid]<target){
               start=mid+1;
           }else if(arr[mid]>target){
               end=mid-1;
           }else{
               return mid;
           }

       }
       return start;
           
       }
}
