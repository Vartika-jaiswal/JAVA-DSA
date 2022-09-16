import java.util.Scanner;

public class marks_grades_functions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks:");
        int n = sc.nextInt();
        sc.close();
        marks(n);
    }public static void marks(int n){
        if(n<=40){
            System.out.println("fail");
        } else if(n>=41 && n<=50){
            System.out.println("DD");
        }else if(n>=51 && n<=60){
            System.out.println("CD");
        }else if(n>=61 && n<=70){
            System.out.println("BC");
        }else if(n>=71 && n<=80){
            System.out.println("BB");
        }else if(n>=81 && n<=90){
            System.out.println("AB");
        }else if(n>=91 && n<=100){
            System.out.println("AA");
        }

    }
}
