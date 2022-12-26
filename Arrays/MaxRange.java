package Arrays;

public class MaxRange {
    public static void main(String[] args) {
        int[] a={3,4,5,64,8,54,3,9,10};
        System.out.println(maxrange(a,1,5));
    }static int maxrange(int a[], int start,int end){
        int maxval=start;
        for(int i=start;i<=end;i++){
            if(a[i]>maxval){
                maxval=a[i];
            }
        }return maxval;
    }
}
