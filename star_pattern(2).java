/* star patter 2
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 star pattern 2
 */
 class star_pattern {
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            } System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }System.out.println();
        }
    }
}
