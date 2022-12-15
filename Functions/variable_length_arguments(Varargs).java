package Functions;

import java.util.Arrays;

class variable_length_arguments {
    public static void main(String[] args) {
        fun(2,3,4,56,24,8,10);
        multiple(10,20,"vartika","kunal");
        multi(10,20,"vartika");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multi(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a+" "+b);
    }
    
}
