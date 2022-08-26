class Day3 {
    public static void main(String[] args){
        int Marks = 65;
        if(Marks<50){
            System.out.println("Fail");
        }
        else if(Marks>=50 && Marks<60){
            System.out.println("D grade");
        }
        else if(Marks>=60 && Marks<75){
            System.out.println("C grade");
        }
        else if(Marks>=75 && Marks<90){
            System.out.println("B grade");
        }
        else if(Marks>=90 && Marks<100){
            System.out.println("A+ grade");
        }
        else{
            System.out.println("Invalid!");
        }
    }
    
}
