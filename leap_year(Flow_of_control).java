import java.util.Scanner;

class leap_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        leapyear(year);
        sc.close();
    }public static void leapyear(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(+year+" The year is a leap year!" );
        }else{
            System.out.println(+year+" The year is not a leap year!");
        }
    }
}
