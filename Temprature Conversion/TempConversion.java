import java.util.Scanner;

/**
 * TempConversion
 * 
 * @author Nishant Sonar
 */
public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        double k = c + 273.15;
        System.out.println("The temperature in fahrenheit is " + f + "° fahrenheit.");
        System.out.println("The temperature in kelvin is " + k + "° kelvin.");
        sc.close();
    }

}