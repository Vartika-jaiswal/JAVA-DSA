public class prime_1to100_and_count {
    public static void main(String[] args){
        isprime(1,100);
    }public static void isprime(int a, int b){
        int i,count,j,total=0;
        for(i=1;i<=100;i++){
            count=0;
            for(j=1;j<=i;j++){
               if(i%j==0)
                count++;
            }if(count==2){
                System.out.println("Prime numbers from " +a+ " to " +b+ " are: " +i);
                total= total+1;
            }
        }System.out.println("Total number of prime numbers are:"+total);
    }
}
