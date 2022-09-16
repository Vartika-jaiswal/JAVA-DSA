public class add_two_numbers_in_array {
    public static void main(String[] args){
        
        int num = 5;
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        for(int i=0;i<5;i++){
            a[i] = i;
        }
        for(int i=0;i<5;i++){
            b[i] = num;
            ++num;
        }System.out.println("Values in array A:");
        for(int i=0;i<5;i++){
            System.out.print(a[i] + " ");
        } System.out.println();
        System.out.println("Values in array B:");
        for(int i=0;i<5;i++){
            System.out.print(b[i] + " ");
        }System.out.println();
        System.out.println("Addition of two arrays is:");
        for(int i=0;i<5;i++){
            c[i] = a[i]+b[i];
        }
        for(int i=0;i<5;i++){
            System.out.print(c[i] + " ");
        }System.out.println();
        

    }
}
