import java.util.Scanner;

public class tradeComission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0;

        //Град	0 ≤ s ≤ 500//	500 < s ≤ 1 000//	1 000 < s ≤ 10 000	//s > 10 000
        //Sofia	     5%        	      7%	                8%	             12%
        //Varna	   4.5%	              7.5%	                10%	              13%
        //Plovdiv	5.5%	             8%	                12%	             14.5%



        if (city.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                commission = sales * 0.05;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * 0.07;
            } else if (sales> 1000 && sales <= 10000) {
                commission = sales * 0.08;
            } else if (sales > 10000) {
                commission = sales * 0.12;
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                commission = sales * 0.045;
            } else if (sales> 500 && sales <= 1000) {
                commission = sales * 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.10;
            } else if (sales > 10000) {
                commission = sales * 0.13;
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commission = sales * 0.055;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.12;
            } else if (sales > 10000) {
                commission = sales * 0.145;
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }


        if(commission>0){
            System.out.printf("%.2f",commission);
        }







    }
}
