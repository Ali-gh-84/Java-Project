package New_Twoelve.Klass;

import java.util.Scanner;

public class Klass {
    private Scanner scanner = new Scanner(System.in);
    private String klassName;
    private int countUnit;
    private String klassPlace;
    private String klassDay;
    private String klassClock;
    private int klassDuration;

    // this method for get and save lessons and classess*
    public void getInfoKlass() {
        System.out.print("\tEnter Name of Klass: ");
        klassName = scanner.next();

        System.out.print("\tEnter Count of Unit of Klass: ");
        countUnit = scanner.nextInt();

        System.out.print("\tEnter Place of Klass: ");
        klassPlace = scanner.next();

        System.out.print("\tEnter Day of Klass: ");
        klassDay = scanner.next();

        System.out.print("\tEnter Clock of Klass: ");
        klassClock = scanner.next();

        System.out.print("\tEnter Duration of Klass (min): ");
        klassDuration = scanner.nextInt();

    }

    public String getKlassName() {
        return klassName;
    }
}
