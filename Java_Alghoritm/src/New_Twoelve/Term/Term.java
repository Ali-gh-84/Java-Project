package New_Twoelve.Term;

import java.util.ArrayList;
import java.util.Scanner;
import New_Twoelve.Klass.*;

public class Term {
    private Scanner scanner = new Scanner(System.in);
    private int year;
    private int halfYear;
    private ArrayList<Klass> lessons = new ArrayList<>();

    // this method for get and save information term*
    public void getInfoTerm() {

        System.out.print("\tEnter Year of Education: ");
        year = scanner.nextInt();

        System.out.print("\tEnter Half Year of Education: ");
        halfYear = scanner.nextInt();

        Klass klass = new Klass();
        klass.getInfoKlass();

        lessons.add(klass);

        System.out.println("\tClasses in this Term:");
        for (Klass e : lessons) {
            System.out.println(e.getKlassName());
        }
    }
}
