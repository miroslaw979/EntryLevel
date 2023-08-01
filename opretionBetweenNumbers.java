import java.util.Scanner;

public class opretionBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                int sum = numberOne + numberTwo;
                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", numberOne, operator, numberTwo, sum);
                } else {
                    System.out.printf("%d %s %d = %d - odd", numberOne, operator, numberTwo, sum);
                }
                break;

            case "-":
                int omega = numberOne - numberTwo;
                if (omega % 2 == 0){
                    System.out.printf("%d %s %d = %d - even", numberOne, operator, numberTwo, omega);
                } else {
                    System.out.printf("%d %s %d = %d - odd", numberOne, operator, numberTwo, omega);
                }
                break;

            case "*":
                int gama = numberOne * numberTwo;
                if (gama % 2 == 0){
                    System.out.printf("%d %s %d = %d - even", numberOne, operator, numberTwo, gama);
                }else {
                    System.out.printf("%d %s %d = %d - odd", numberOne, operator, numberTwo, gama);
                }
                break;

            case "/":
                if (numberTwo == 0){
                    System.out.printf("Cannot divide %d by zero", numberOne);
                } else {
                    double delta = numberOne * 1.0 / numberTwo;
                System.out.printf("%d / %d = %.2f", numberOne, numberTwo, delta);
                }
                break;

            case "%":
                if (numberTwo == 0){
                    System.out.printf("Cannot divide %d by zero", numberOne);
                } else {
                    int hector = numberOne % numberTwo;
                    System.out.printf("%d %% %d = %d", numberOne, numberTwo, hector);
                }
                break;






        }

    }
}
