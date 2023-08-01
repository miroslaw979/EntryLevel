import java.util.Scanner;

public class SchoollLager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());

        String typeSport = "";
        double price = 0;
        switch (season) {
            case "Winter":
                if (groupType.equals("girls")) {
                    price = studentsCount * 9.60 * nightsCount;
                    typeSport = "Gymnastics";
                } else if (groupType.equals("boys")) {
                    price = studentsCount * 9.60 * nightsCount;
                    typeSport = "Judo";
                } else if (groupType.equals("mixed")) {
                    price = studentsCount * 10 * nightsCount;
                    typeSport = "Ski";

                }
                break;
            case "Spring":
                if (groupType.equals("girls")) {
                    price = studentsCount * 7.20 * nightsCount;
                    typeSport = "Athletics";
                } else if (groupType.equals("boys")) {
                    price = studentsCount * 7.20 * nightsCount;
                    typeSport = "Tennis";
                } else if (groupType.equals("mixed")) {
                    price = studentsCount * 9.50 * nightsCount;
                    typeSport = "Cycling";

                }
                break;
            case "Summer":
                if (groupType.equals("girls")) {
                    price = studentsCount * 15 * nightsCount;
                    typeSport = "Volleyball";
                } else if (groupType.equals("boys")) {
                    price = studentsCount * 15 * nightsCount;
                    typeSport = "Football";
                } else if (groupType.equals("mixed")) {
                    price = studentsCount * 20 * nightsCount;
                    typeSport = "Swimming";

                }
                break;
        }
                if (studentsCount >= 50){
                    price = price * 0.50;
                } else if (studentsCount >=20 && studentsCount <50) {
                    price = price * 0.85;
                } else if (studentsCount >= 10 && studentsCount <20) {
                    price = price * 0.95;
                }

                System.out.printf("%s %.2f lv.", typeSport, price);






    }
}
