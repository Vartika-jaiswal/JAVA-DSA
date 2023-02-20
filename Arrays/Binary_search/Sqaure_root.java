package Arrays.Binary_search;

public class Sqaure_root {
   public static void main(String[] args) {
    int x=4;
    System.out.println(mySqrt(x));
   }
   public static int mySqrt(int x) {
    if(x==0)
    return 0;
    int i=1;
    for( i=1;i<=x/i;i++)
        if(x/i==i)
        return i;
    
    return i-1;
}
}
