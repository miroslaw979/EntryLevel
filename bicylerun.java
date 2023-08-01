import java.util.Scanner;

public class bicylerun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int youngCycleCount = Integer.parseInt(scanner.nextLine());
        int oldCycleCount = Integer.parseInt(scanner.nextLine());
        String trailType = scanner.nextLine();

        double seniors = 0;
        double juniors = 0;


        switch (trailType){
            case "trail":
               juniors = 5.50;
               seniors = 7;
               break;
            case "cross-country":
                juniors = 8;
                seniors = 9.50;
                if (youngCycleCount + oldCycleCount >= 50){
                    juniors = juniors * 0.75;
                    seniors = seniors * 0.75;
                }
                break;
            case"downhill":
                juniors = 12.25;
                seniors = 13.75;
                break;
            case "road":
                juniors = 20;
                seniors = 21.50;
                break;

        }
        double totalSum = youngCycleCount * juniors + oldCycleCount * seniors;
        double expenses = totalSum * 0.05;
        double rest = totalSum - expenses;
        System.out.printf("%.2f", rest);




    }
}
