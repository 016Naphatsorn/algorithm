import java.util.Scanner;
public class Celsius2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter Fahrenheit degree: ");
        float Fahrenheit = scanner.nextFloat();
        float celsius =(Fahrenheit-32)* 5/9;
        System.out.println( Fahrenheit +"fahrenheit is equal to"+ celsius);
        scanner.close();
    }
}