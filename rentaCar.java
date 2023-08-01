import java.util.Scanner;

public class rentaCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double rentACar = 0;
        String carType = "";
        String clas = "";
        if (budget <= 100) {
            clas = "Economy class";
            if (season.equals("Summer")) {
                rentACar = budget * 0.35;
                carType = "Cabrio";
            } else if (season.equals("Winter")) {
                rentACar = budget * 0.65;
                carType = "Jeep";
            }

        } else if (budget > 100 && budget <= 500) {
            clas = "Compact class";
            if (season.equals("Summer")) {
                rentACar = budget * 0.45;
                carType = "Cabrio";
            } else if (season.equals("Winter")) {
                rentACar = budget * 0.80;
                carType = "Jeep";
            }

        } else if (budget > 500) {
            clas = "Luxury class";
            if (season.equals("Summer")) {
                rentACar = budget * 0.90;
                carType = "Jeep";
            } else if (season.equals("Winter")) {
                rentACar = budget * 0.90;
                carType = "Jeep";
            }
        }

            System.out.printf("%s %n", clas);
            System.out.printf("%s - %.2f", carType, rentACar);



    }
}
