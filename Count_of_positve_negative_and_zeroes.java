 import java.util.Scanner;
public class Count_of_positve_negative_and_zeroes
{
	public static void main(String[] args) {
	    int count = 0;
	    int negative = 0;
	    int positive = 0;
	    int zero = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the integers:");
	   int n = sc.nextInt();
	   sc.close();
	    
	    while(n<=100){
	        System.out.println("enter the integers:");
	        n= sc.nextInt();
	    if(n>0){
	      positive++;
	    }else if(n<0){
	        negative++;
	    }else{
	        zero++;
	    }
	    count++;
	    }
	      System.out.println("positive numbers are:" +positive);
	      System.out.println("negative numbers are:" +negative);
	      System.out.println("zero numbers are:" +zero);
		
	}
}
 