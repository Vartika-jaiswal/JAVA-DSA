import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Double n1,n2,result;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any operator: (+,-,*,/)");
    char operator = sc.next().charAt(0);
    System.out.println("Enter the first number:");
     n1 = sc.nextDouble(); 
     System.out.println("Enter the second number:");
     n2 = sc.nextDouble(); 
     switch(operator){
        case '+':
        result = n1+n2;
        System.out.println(n1+"+"+n2+"="+result);
        break;
        case '-':
        result = n1-n2;
        System.out.println(n1+"-"+n2+"="+result);
        break;
        case '*':
        result = n1*n2;
        System.out.println(n1+"*"+n2+"="+result);
        break;
        case '/':
        result = n1/n2;
        System.out.println(n1+"/"+n2+"="+result);
        break;
        default:
        System.out.println("Invalid operator!");
        sc.close();


     }

  }
}