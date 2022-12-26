package Arrays;

public class maxValue {
    public static void main(String[] args) {
        int[] a={1,3,2,23,18};
        maxval(a);
        System.out.println(maxval(a));
    }
    static int maxval(int a[]){
           int max=a[0];
           for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
           }
        return max;
        
    }
}
