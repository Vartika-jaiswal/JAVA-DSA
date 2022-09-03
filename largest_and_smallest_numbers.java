import java.util.Scanner;

public class largest_and_smallest_numbers {
    public static void main(String[] args) {
        System.out.println("Please enter N:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            System.out.printf("please enter %d numbers ",n);
            int current = sc.nextInt();
            if(current>largest){
                largest = current;
            }
            if(current<smallest){
                smallest = current;
            }
        }System.out.println("largest no.:" +largest);
        System.out.println("smallest no.:" +smallest);

      
}
}
