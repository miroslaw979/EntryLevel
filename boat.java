import java.util.Scanner;

public class boat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budgetForGroup = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFishers = Integer.parseInt(scanner.nextLine());


        double price = 0 ;


        switch (season) {
            case "Spring":
                price = 3000;
                if (countFishers <= 6) {
                    price = price * 0.9;
                } else if (countFishers >= 7 && countFishers <= 11) {
                    price = price * 0.85;
                } else if (countFishers > 12) {
                    price = price * 0.75;
                }
                if(countFishers % 2 == 0){
                    price = price * 0.95;
                }
                break;
            case "Summer":
                price = 4200;
                if (countFishers <= 6) {
                    price = price * 0.9;
                } else if (countFishers >= 7 && countFishers <= 11) {
                    price = price * 0.85;
                } else if (countFishers > 12) {
                    price = price * 0.75;
                }
                if(countFishers % 2 == 0){
                    price = price * 0.95;
                }
                break;
            case "Autumn":
                price = 4200;
                if (countFishers <= 6) {
                    price = price * 0.9;
                } else if (countFishers >= 7 && countFishers <= 11) {
                    price = price * 0.85;
                } else if (countFishers >= 12) {
                    price = price * 0.75;
                }
                break;
            case "Winter":
                price = 2600;
                if (countFishers <= 6) {
                    price = price * 0.9;
                } else if (countFishers >= 7 && countFishers <= 11) {
                    price = price * 0.85;
                } else if (countFishers >= 12) {
                    price = price * 0.75;
                }
                if(countFishers % 2 == 0){
                    price = price * 0.95;
                }
                break;
        }
          double diff = Math.abs(budgetForGroup - price);
         if (budgetForGroup >= price){
             System.out.printf("Yes! You have %.2f leva left.",diff);
         } else {
             System.out.printf("Not enough money! You need %.2f leva.", diff);
         }











    }
}









