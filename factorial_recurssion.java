public class factorial_recurssion {
    static int fact = 1;
    public static void main(String args[]){
        int n=5;
        factorial_recurssion ob= new factorial_recurssion();
        ob.calcFact(n);
        System.out.println("Factorial of"+n+"is:"+fact);
    }void calcFact(int n){
        if(n>=1){
            fact=fact*n;
            calcFact(n-1);
        }
    }
}
