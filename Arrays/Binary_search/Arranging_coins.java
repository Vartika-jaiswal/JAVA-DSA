package Arrays.Binary_search;

public class Arranging_coins {
    public static void main(String[] args) {
        int n=5;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        int i=1;
        while(n>=i){
            n=n-i;
            i++;
        }
        return i-1;
    }
}
