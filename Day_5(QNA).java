class Day_5 {
    public static void main(String[] args){
        int count = 1;
        int num = 1;
        int sum = 0;
        int rem = 0;
   
        while(count <= 500)  
        {  
            num = count;  
            sum = 0;  
      
            while(num!=0)  
            {  
                rem = num % 10;  
                sum = sum + (rem * rem * rem);  
                num = num / 10;  
            }  
      
            if(count == sum)  
            {  
                System.out.println(  "is a Armstrong number\n" +count);  
            }  
      
            count++;  
      }
    }
}