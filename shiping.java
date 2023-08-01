import java.util.Scanner;

public class shiping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String typeHotel = "";

        double spendMoney = 0;

        if (budget <= 100) {
            destination = "Bulgaria";

            if (season.equals("summer")) {
                typeHotel = "Camp";
                spendMoney = budget * 0.3;
            } else if (season.equals("winter")) {
                typeHotel = "Hotel";
                spendMoney = budget * 0.7;
            }
            } else if (budget <= 1000) {
                destination = "Balkans";
                if (season.equals("summer")) {
                    typeHotel = "Camp";
                    spendMoney = budget * 0.4;
                } else if (season.equals("winter")) {
                    typeHotel = "Hotel";
                    spendMoney = budget * 0.8;
                }


            } else if ( budget >1000){
                destination = "Europe";
                typeHotel = "Hotel";
                spendMoney = budget * 0.9;
            }


            System.out.printf("Somewhere in %s%n", destination);
            System.out.printf("%s - %.2f", typeHotel, spendMoney);


        }
    }

