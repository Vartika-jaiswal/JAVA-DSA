package Switch_statement;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day");
        // String fruit=sc.next();
        int day=sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
                case 2:
                System.out.println("tuesday");
                break;
                case 3:
                System.out.println("wednesday");
                break;
                case 4:
                System.out.println("thursday");
                break;
                case 5:
                System.out.println("friday");
                break;
                case 6:
                System.out.println("saturday");
                break;
                case 7:
                System.out.println("sunday");
                break;
        
            default:
            System.out.println("invalid input!");
                break;
        }sc.close();
    }
}
