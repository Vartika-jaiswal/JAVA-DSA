package Arrays.Binary_search;

public class Arranging_Coins2 {
    public static void main(String[] args) {
        int n=5;
         System.out.println(arrangeCoins( n));
    } 
    public static int arrangeCoins(int n) {
        long start=0;
        long end=n;
        while(start<=end){
            long mid=start+(end-start)/2;
            if((mid*(mid+1))/2==n){
                return (int)mid;
            }
            else if((mid*(mid+1))/2>n){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return (int)end;
     }
}
