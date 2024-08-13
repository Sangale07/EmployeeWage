import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    private int wagePerHr=20;
    private int FullDayHr=8;
    private int totalWage=0;

    public void dailywage(boolean add){

        if(add==true){

            totalWage=totalWage+(wagePerHr *FullDayHr);
        }else{

            totalWage=totalWage+0;
        }
        System.out.println("TotalWage= "+totalWage);
    }
    public static  void isPresent(){
        Random random = new Random();
        // Generate a random number (0 or 1)
        int attendance = random.nextInt(2);

        // Check if the employee is present or absent
        if (attendance == 0) {
            System.out.println("Employee is absent.");
        } else {
            System.out.println("Employee is present.");
        }
    }
}