package condition_and_loops;

import java.util.Scanner;

public class temperature_conversion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the temperature in celcius:");
        float tempc=sc.nextFloat();
        float tempf=(tempc*9/5)+32;
        System.out.println(tempf);
        sc.close();
    }
}
