
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        double weight, height,BMI ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight g: ");
        weight = sc.nextDouble();
        System.out.print("Enter height m: ");
        height = sc.nextDouble();
        BMI = weight/(height* height);
        System.out.println("triangleArea= " + BMI + " square units");
      
    }
} 