/* star pattern 6
    *
   * *
  * * *
 * * * *
* * * * *
star pattern 6*/
import java.util.Scanner;
class star_pattern_another_logic {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=0;i<=n;i++){
       for(int j=n;j>=0;j--){
           if(j>i){
            System.out.print(" ");
           }else{
            System.out.print(" *");
           }
       }System.out.println();
   }sc.close();
}
}
