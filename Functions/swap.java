package Functions;

public class swap {
    public static void main(String[] args) {
        
        Swap(10,20);
   ;
    }
    static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+ " " +b);
    }
}
