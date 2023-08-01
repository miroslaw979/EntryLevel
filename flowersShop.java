import java.util.Scanner;

public class flowersShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countsBuyingHrizantemi = Integer.parseInt(scanner.nextLine());
        int countsBuyingRose = Integer.parseInt(scanner.nextLine());
        int countsBuyingLale = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holidayDay = scanner.nextLine();

        double hrizantemi = 0;
        double rose = 0;
        double lale = 0;
        switch (season){
            case "Spring":
            case "Summer":
                hrizantemi = countsBuyingHrizantemi * 2.00;
                rose = countsBuyingRose * 4.10;
                lale = countsBuyingLale * 2.50;

                break;
            case "Autumn":
            case "Winter":
                hrizantemi = countsBuyingHrizantemi * 3.75;
                rose = countsBuyingRose * 4.50;
                lale = countsBuyingLale * 4.15;
                break;

                }
             double totalSum= hrizantemi + rose + lale;
                if (holidayDay.equals("Y")) {
                 totalSum = totalSum * 1.15;
             } else if (holidayDay.equals("N")) {
                    totalSum = totalSum;
                }
                if (countsBuyingLale > 7 && season.equals("Spring") ) {
                    totalSum = totalSum * 0.95;
                }
                if (countsBuyingRose >= 10 && season.equals("Winter")) {
                    totalSum = totalSum * 0.90;
                }
                if ( countsBuyingRose + countsBuyingLale + countsBuyingHrizantemi >20) {
                    totalSum = totalSum * 0.80;
                }
                double sum = totalSum + 2;
                System.out.printf("%.2f", sum);



    }
}
