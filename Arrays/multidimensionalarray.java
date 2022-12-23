package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class multidimensionalarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] a=new int[3][3];
        System.out.println("Enter the num:");
        for(int row=0;row<a.length;row++){
            for(int col=0;col<a[row].length;col++){
                a[row][col]=sc.nextInt();
            }
        }
        for(int row=0;row<a.length;row++){
            
                System.out.print(Arrays.toString(a[row]));
            System.out.println();}
            sc.close();
            
        }
    }

