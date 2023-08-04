package OOPS;

public class Main {
    public static void main(String[] args) {
        Human kunal= new Human(22,"kunal", 10000, false);
        Human rahul= new Human(34,"rahul", 2500000, true);
        System.out.println(kunal.name);
        System.out.println(rahul.salary);
    }
}
