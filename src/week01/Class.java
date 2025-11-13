package week01;

class Carr {
    String model;
    int year;


}

public class Class {
    public static void main(String[] args) {
        Carr myCar = new Carr();
        myCar.model = "Toyota";
        myCar.year = 2022;
        System.out.println( myCar.model);
        System.out.println(myCar.year);
    }
}
