package Functions;

import java.util.Scanner;

public class Stringfunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the name:");
        String name=sc.next();
        String personalised=greet(name);
        System.out.println(personalised);
        sc.close();
    }
    static String greet(String name){
        String message="Hello "+name;
        return message;
    }
    
}
