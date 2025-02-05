import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first value");
        double firstValue = scanner.nextDouble();

        System.out.println("Enter second value");
        double secondValue = scanner.nextDouble();

        System.out.println("Enter sign");
        String sign = scanner.next();

        switch (sign) {
            case "+":
                System.out.println("Result:" + (firstValue + secondValue));
                break;
            case "-":
                System.out.println("Result:" + (firstValue - secondValue));
                break;
            case "*":
                System.out.println("Result:" + (firstValue * secondValue));
                break;
            case "/":
                if (secondValue == 0) {
                    System.out.println("Cannot divide to 0");
                }
                else {
                    System.out.println("Result:" + (firstValue / secondValue));
                }
                break;
            default:
                System.out.println("Not a valid sign");
                break;
        }
    }
}
