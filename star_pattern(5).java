/* star pattern 5
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
star pattern 5*/
import java.util.Scanner;
  class star_pattern
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=0;i<=n;i++){
	        for(int j=4;j>=i;j--){
	            System.out.print(" ");
	        }
	        for(int k=0;k<=i;k++){
	            System.out.print("*");
	        }System.out.println();
	    }
	        for( int i=1;i<=n;i++){
	        for(int j=0;j<=i;j++){
	            System.out.print(" ");
	        }
	        for(int k=4;k>=i;k--){
	            System.out.print("*");
	        }System.out.println();
	    }
	    sc.close();
	}
}
