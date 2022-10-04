public class fibonacci_series_recurssion {
    static int a=0,b= 1,c;
    public static void main(String args[]){
        System.out.println(a+ " "+b);
        fibonacci_series_recurssion ob= new  fibonacci_series_recurssion();
        ob.calcFib(10);
        
    }void calcFib(int i){
        if(i>=1){
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
            calcFib(i-1);
        }
    }
}
