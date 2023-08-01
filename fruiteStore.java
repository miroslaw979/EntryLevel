import java.util.Scanner;

public class fruiteStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //(Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday)

        String fruits = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        boolean isWorkingDay = dayOfWeek.equals("Monday") ||
                dayOfWeek.equals("Tuesday") ||
                dayOfWeek.equals("Wednesday") ||
                dayOfWeek.equals("Thursday") ||
                dayOfWeek.equals("Friday");
        boolean weekend = dayOfWeek.equals("Saturday") ||
                dayOfWeek.equals("Sunday");


        boolean invalid = false;
        double price = 0;
        if (isWorkingDay) {
            if (fruits.equals("banana")) {
                price = 2.50;
            } else if (fruits.equals("apple")) {
                price = 1.20;
            } else if (fruits.equals("orange")) {
                price = 0.85;
            } else if (fruits.equals("grapefruit")) {
                price = 1.45;
            } else if (fruits.equals("kiwi")) {
                price = 2.70;
            } else if (fruits.equals("pineapple")) {
                price = 5.50;
            } else if (fruits.equals("grapes")) {
                price = 3.85;
            } else {
                invalid = true;
            }
        } else if (weekend) {
            if (fruits.equals("banana")) {
                price = 2.70;
            } else if (fruits.equals("apple")) {
                price = 1.25;
            } else if (fruits.equals("orange")) {
                price = 0.90;
            } else if (fruits.equals("grapefruit")) {
                price = 1.60;
            } else if (fruits.equals("kiwi")) {
                price = 3.00;
            } else if (fruits.equals("pineapple")) {
                price = 5.60;
            } else if (fruits.equals("grapes")) {
                price = 4.20;
            } else {
                invalid = true;
            }
            }else {
            invalid = true;
        }
        if (invalid) {
            System.out.println("error");
        }else {
            double result = price * count;
            System.out.printf("%.2f", result);


        }

    }
}

