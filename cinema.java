import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String daysOfWeek = scanner.nextLine();

        int price = 0;

        if (daysOfWeek.equals("Monday") || daysOfWeek.equals("Tuesday") || daysOfWeek.equals("Friday")) {
            price = 12;
        } else if (daysOfWeek.equals("Wednesday") || daysOfWeek.equals("Thursday")) {
            price = 14;
        } else if (daysOfWeek.equals("Saturday") || daysOfWeek.equals("Sunday")) {
            price = 16;
        }
        System.out.println(price);

    }
}
