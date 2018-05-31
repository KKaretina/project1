import java.util.Scanner;

public class Calculator {

    public static double readNum() {
        Scanner inputReader = new Scanner(System.in);
        double input = inputReader.nextFloat();
        return input;
    }

    public static double sum () {
        System.out.println("Введите первое число и нажмите enter:");
        double num1 = readNum();

        System.out.println("Введите второе число и нажмите enter:");
        double num2 = readNum();

        double result = num1 + num2;

        return result;
    }
}
