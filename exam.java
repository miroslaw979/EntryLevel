import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrived = Integer.parseInt(scanner.nextLine());
        int minutesArrived = Integer.parseInt(scanner.nextLine());

        int examTotalMinutes = hourExam * 60 + minutesExam;
        int arrivedTotalMinutes = hourArrived * 60 + minutesArrived;

        int diff = Math.abs(arrivedTotalMinutes - examTotalMinutes);
        if (arrivedTotalMinutes > examTotalMinutes) {
            System.out.println("Late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        } else if (diff <= 30) {
            System.out.println("On time");
            if (examTotalMinutes != arrivedTotalMinutes) {
                System.out.printf("%d minutes before the start", diff);
            }
            } else {
                System.out.println("Early");
                if (diff < 60) {
                    System.out.printf("%d minutes before the start", diff);
                } else {
                    int hour = diff / 60;
                    int minutes = diff % 60;
                    System.out.printf("%d:%02d hours before the start", hour, minutes);
                }

            }


        }
    }

