package Functions;

public class mehtod_overloading {
    public static void main(String[] args) {
        fun(30);
        fun("vartika");
        int c=sum(3,6);
        System.out.println(c);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
