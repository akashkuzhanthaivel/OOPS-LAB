import currency.CurrencyConvertor;
import distance.DistanceConvertor;
import time.TimeConvertor;
import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CurrencyConvertor cc = new CurrencyConvertor();
        DistanceConvertor dc = new DistanceConvertor();
        TimeConvertor tc = new TimeConvertor();

        int code, currency_code, distance_code, time_code;

        System.out.println("1. Currency");
        System.out.println("2. Distance");
        System.out.println("3. Time");
        System.out.print("Enter the code: ");
        code = sc.nextInt();

        if (code == 1) {

            System.out.println("\n1. Euro");
            System.out.println("2. Dollar");
            System.out.println("3. Yen");
            System.out.print("Enter Currency code: ");
            currency_code = sc.nextInt();

            if (currency_code == 1) {
                cc.convertInrToEuro();
                cc.convertEuroToInr();
            }
            else if (currency_code == 2) {
                cc.convertInrToDollar();
                cc.convertDollarToInr();
            }
            else if (currency_code == 3) {
                cc.convertInrToYen();
                cc.convertYenToInr();
            }
            else {
                System.out.println("Invalid Currency Code");
            }
        }

        else if (code == 2) {

            System.out.println("\n1. Meter");
            System.out.println("2. Miles");
            System.out.print("Enter Distance code: ");
            distance_code = sc.nextInt();

            if (distance_code == 1) {
                dc.convertMeterToKm();
                dc.convertKmToMeter();
            }
            else if (distance_code == 2) {
                dc.convertMilesToKm();
                dc.convertKmToMiles();
            }
            else {
                System.out.println("Invalid Distance Code");
            }
        }

        else if (code == 3) {

            System.out.println("\n1. Minutes");
            System.out.println("2. Seconds");
            System.out.print("Enter Time code: ");
            time_code = sc.nextInt();

            if (time_code == 1) {
                tc.convertHourToMinute();
                tc.convertMinuteToHour();
            }
            else if (time_code == 2) {
                tc.convertHourToSeconds();
                tc.convertSecondsToHour();
            }
            else {
                System.out.println("Invalid Time Code");
            }
        }

        else {
            System.out.println("Invalid Code");
        }

        sc.close();
    }
}
