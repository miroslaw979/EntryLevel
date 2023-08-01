import java.util.Scanner;

public class ticketsForFootball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;
        double transportPrice = 0;

        switch (category) {
            case "VIP":
                ticketPrice = 499.99;
                break;
            case "Normal":
                ticketPrice = 249.99;
                break;
        }

        if (numberOfPeople >= 1 && numberOfPeople <=4){
        transportPrice = budget * 0.75;
        } else if ( numberOfPeople >= 5 && numberOfPeople <= 9) {
            transportPrice = budget * 0.60;
        } else if ( numberOfPeople >= 10 && numberOfPeople <= 25) {
            transportPrice = budget * 0.50;
        } else if (numberOfPeople >=25 && numberOfPeople <= 49) {
            transportPrice = budget * 0.40;
        } else if ( numberOfPeople > 50 ) {
            transportPrice = budget * 0.25;
        }

        double totalSum = ticketPrice * numberOfPeople + transportPrice;
        double diff = Math.abs(budget - totalSum);
        if (budget>= totalSum){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }


    }
}
