public class ApplicationMain {

    public static void main(String[] args) {
        double sumResult = Calculator.sum();
        System.out.printf("%.4f", sumResult);

        System.out.println();

        double multResult = Calculator.mult();
        System.out.printf("%.4f", multResult);

        System.out.println();

        double divResult = Calculator.div();
        System.out.printf("%.4f", divResult);

        System.out.println();

        double subResult = Calculator.sub();
        System.out.printf("%.4f", subResult);

    }

}
