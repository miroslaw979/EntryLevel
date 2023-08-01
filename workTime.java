import java.util.Scanner;

public class workTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        boolean ifIsWorkingDay = day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday") ||
                day.equals("Saturday");
        boolean ifIsWorkingHours = number >= 10 && number <= 18;

        if (ifIsWorkingDay && ifIsWorkingHours){
            System.out.println("open");
        }else {
            System.out.println("closed");
        }




    }
}
