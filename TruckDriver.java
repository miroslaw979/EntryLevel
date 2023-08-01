import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

double salary = 0;
        switch (season){
            case "Spring":
            case "Autumn":
                if (kmPerMonth <= 5000){
                    salary = kmPerMonth * 0.75;
                } else if ( kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    salary = kmPerMonth * 0.95;
                } else if (kmPerMonth > 10000 && kmPerMonth <=20000) {
                    salary = kmPerMonth * 1.45;
                }
                break;
            case "Summer":
                if (kmPerMonth <= 5000){
                    salary = kmPerMonth * 0.90;
                } else if ( kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    salary = kmPerMonth * 1.10;
                } else if (kmPerMonth > 10000 && kmPerMonth <=20000) {
                    salary = kmPerMonth * 1.45;
                }
                break;
            case "Winter":
                if (kmPerMonth <= 5000){
                    salary = kmPerMonth * 1.05;
                } else if ( kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    salary = kmPerMonth * 1.25;
                } else if (kmPerMonth > 10000 && kmPerMonth <=20000) {
                    salary = kmPerMonth * 1.45;
                }
                break;
        }
        double finshSalary = (salary * 4) * 0.90;
        System.out.printf("%.2f", finshSalary);


    }
}
