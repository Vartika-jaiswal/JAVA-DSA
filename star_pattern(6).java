 /* star pattern 6
    *
   * *
  * * *
 * * * *
* * * * *
star pattern 6*/
 import java.util.Scanner;
 class star_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print(" ");
        }for(int k=0;k<=i;k++){
            System.out.print(" *");
        }System.out.println();
    }
}
 }

