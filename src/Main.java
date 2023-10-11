import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = 0.00;
        double fahrenheit = 0.00;
        boolean valid = false;

        System.out.println("Please input your temperature in Celsius.");
        do {
            if (scan.hasNextDouble()) {
                valid = true;
            }
            else{
                scan.nextLine();
                System.out.println("Invalid input, please try again");
            }
        } while (!valid) ;
        celsius = scan.nextDouble();
        fahrenheit = celsius * 9 / 5 + 32;

        System.out.printf("%-10s%7.2f", "Degrees C:", celsius);
        System.out.printf("\n%-10s%7.2f", "Degrees F", fahrenheit);

    }
}