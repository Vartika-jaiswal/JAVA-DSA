/* star pattern 8
 *
   *
     *
       *
         *
star pattern 8*/
import java.util.Scanner;
class star_pattern {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
   int n=sc.nextInt();
   for(int i=0;i<=n;i++){
      for(int j=0;j<=i;j++){
        if(i>=2&&j<=i-1){
            System.out.print(" ");
        }else{
            System.out.print("*");
        }
      }System.out.println();
   }sc.close();
    
  }
}
