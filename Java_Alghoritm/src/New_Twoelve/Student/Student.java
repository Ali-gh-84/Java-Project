package New_Twoelve.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int id;
    public static ArrayList<Student> allStudents = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void getName_Id() {

        System.out.print("\tEnter Your First Name: ");
        firstName = scanner.next();

        System.out.print("\tEnter Your Last Name: ");
        lastName = scanner.next();

        id = (int) (Math.random() * 101);
        System.out.println("\tYour Unique Student Number is: " + id);

        System.out.println("\tAdded Student.");

       allStudents.add(this);
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
