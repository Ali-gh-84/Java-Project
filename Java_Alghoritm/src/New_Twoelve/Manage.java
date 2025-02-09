package New_Twoelve;

import New_Twoelve.Term.*;
import New_Twoelve.Student.*;
import New_Twoelve.Klass.*;

import java.util.*;

public class Manage {
    private ArrayList<Klass> klasses = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private Term term = new Term();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manage manage = new Manage();

        System.out.println();
        System.out.print("\t* WELCOME TO THE MANAGE UNIVERSITY APP *");
        System.out.println();

        boolean again = true;
        while (again) {
            System.out.println();
            System.out.println("\t 1) Add Klass");
            System.out.println("\t 2) Show List Classes");
            System.out.println("\t 3) Add Student");
            System.out.println("\t 4) Show List Students and ID");
            System.out.println("\t 5) Show List Classes and Places");
            System.out.println("\t 6) Show List Classes and Day of Event");
            System.out.println("\t 7) Show List Classes and Durations");
            System.out.println("\t 8) Show List Terms");
            System.out.println("\t 9) Choose Unit of Terms");
            System.out.println("\t 10) Show List Student and Unit");
            System.out.println("\t 11) Display and Calculate the Total Grade");
            System.out.println("\t 12) Show List Students and Average");
            System.out.println("\t 13) Exit");
            System.out.println();

            System.out.print("\tEnter an option between 1-13 : ");
            int option = scanner.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    Klass klass = new Klass();
                    klass.getInfoKlass();
//                    manage.klasses.add(klass);
                    break;
                case 2:
                    for (Klass k : manage.klasses) {
                        System.out.println(k.getKlassName());
                    }
                    break;
                case 3:
                    Student student = new Student();
//                    student.getFullName();
//                    manage.students.add(student);
                    break;
                case 4:
                    for (Student s : manage.students) {
//                        System.out.println(s.getId() + ": " + s.getFullName());
                    }
                    break;
                case 5:
                    // Implement functionality here
                    break;
                case 6:
                    // Implement functionality here
                    break;
                case 7:
                    // Implement functionality here
                    break;
                case 8:
                    // Implement functionality here
                    break;
                case 9:
                    // Implement functionality here
                    break;
                case 10:
                    // Implement functionality here
                    break;
                case 11:
                    // Implement functionality here
                    break;
                case 12:
                    // Implement functionality here
                    break;
                case 13:
                    System.out.println("\tThanks For Using Our App !");
                    again = false;
                    break;
                default:
                    System.out.println("\tThe Option is not correct !");
                    break;
            }
        }
    }
}
