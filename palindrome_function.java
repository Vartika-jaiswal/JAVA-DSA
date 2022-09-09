import java.util.Scanner;

public class palindrome_function{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
  int n = sc.nextInt();
  sc.close();
  if (checkPalindrome(n) == true) {
    System.out.println("Yes");
  }
  else {
    System.out.println("No");
  }
 
}public static boolean checkPalindrome(int n)
{
  int reverse = 0;
  int temp = n;
  while (temp != 0) {
    reverse = (reverse * 10) + (temp % 10);
    temp = temp / 10;
   
  }
  return (reverse == n); // if it is true then it will return 1;
  // else if false it will return 0;
}
}
