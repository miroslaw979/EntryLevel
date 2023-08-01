import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countNight = Integer.parseInt(scanner.nextLine());

        double apartamentPrice = 0;
        double studioPrice = 0;

        switch(month){
            case "May":
            case "October":
                studioPrice = countNight * 50;
                apartamentPrice = countNight * 65;
                if(countNight > 14 ){
                    studioPrice = studioPrice * 0.7;
                    apartamentPrice = apartamentPrice * 0.9;
                } else if (countNight > 7){
                    studioPrice = studioPrice * 0.95;

                }
                break;
            case "June":
            case "September":
                studioPrice = countNight * 75.20;
                apartamentPrice = countNight * 68.70;
                if (countNight > 14){
                    studioPrice = studioPrice * 0.8;
                    apartamentPrice = apartamentPrice * 0.9;
                }
                break;

            case "July":
            case "August":
                studioPrice = countNight * 76;
                apartamentPrice = countNight * 77;
                if (countNight >14){
                    apartamentPrice = apartamentPrice * 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n",apartamentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);














    }
}
