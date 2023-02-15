package Arrays.Binary_search;

public class Find_in_mountain_array {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,3,1};
        int target=3;
        int ans=search(arr,target);
        System.out.println(ans);
     }
     public static int search(int[] arr,int target){
          int peak=findPeakElement(arr);
         int Firsttry=orderAgnosticBS(arr,target,0,peak);
         if(Firsttry!=-1){
             return Firsttry;
         }
         return orderAgnosticBS(arr,target,peak+1,arr.length-1);
     }
      public static int findPeakElement(int[] arr) {
         int start=0;
         int end=arr.length-1;
         while(start<end){
             int mid=start+(end-start)/2;
             if(arr[mid]>arr[mid+1]){
                 end=mid;
             }else{
                 start=mid+1;
             }
         }
         return start;
     }
     public static int orderAgnosticBS(int[] arr,int target,int start,int end){
          boolean isasc= arr[start]<arr[end];
         while(start<=end){
             int mid=start+(end-start)/2;
             if(arr[mid]==target){
                 return mid;
             }
             if(isasc){
                 if(arr[mid]>target){
                     end=mid-1;
                 }else if(arr[mid]<target){
                     start=mid+1;
                 }
             }else{
                 if(arr[mid]<target){
                     end=mid-1;
                 }else if(arr[mid]>target){
                     start=mid+1;
                 }
             }
         }
         return -1;
     }
}
