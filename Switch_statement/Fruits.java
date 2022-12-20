package Switch_statement;
import java.util.Scanner;
public class Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of fruit:");
        String fruit=sc.next();
        switch (fruit) {
            case "mango":
                System.out.println("king of fruit");
                break;
                case "Apple":
                System.out.println("sweet red fruit");
                break;
                case "orange":
                System.out.println("round fruit");
                break;
                case "grapes":
                System.out.println("green fruit");
                break;
        
            default:
            System.out.println("invalid fruit");
                break;
        }sc.close();
    }
}
