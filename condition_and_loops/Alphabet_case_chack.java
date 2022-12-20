package condition_and_loops;

import java.util.Scanner;

public class Alphabet_case_chack {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch=in.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
        in.close();
    }
}
