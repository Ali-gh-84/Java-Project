package Person;

import java.util.Scanner;

import Book.Manage_Book;

import java.util.ArrayList;
import java.util.HashMap;

public class Manage_Person {

    public int member_id = 1;
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> age = new ArrayList<>();
    ArrayList<String> gender = new ArrayList<>();
    public HashMap<Integer, ArrayList<Integer>> assing_book = new HashMap<>();

    public void add_member() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\t Please enter Your Name : ");
        String name_person = scanner.nextLine();

        System.out.print("\t Please enter Your Age : ");
        int age_person = scanner.nextInt();

        System.out.print("\t Please enter Your Gender M/F : ");
        String gender_person = scanner.nextLine();

        scanner.nextLine();

        System.out.println();

        if (gender_person == "M" || gender_person == "F") {

            name.add(name_person);
            age.add(age_person);
            gender.add(gender_person);

            System.out.println();

            System.out.println("\t Your Owen ID Is : " + member_id);

            System.out.println("\t Add Member Success !");

            member_id += 1;

        } else if (gender_person.isEmpty()) {

            name.add(name_person);
            age.add(age_person);
            gender.add("M");

            System.out.println();

            System.out.println("\t Your Owen ID Is : " + member_id);

            System.out.println("\t Add Member Success !");

            member_id += 1;

        } else {
            System.out.println("\t Warning !! Please Enter True Gender !");
            System.out.println("\t Add Member Not Success ! Try Again !");
        }
    }

    public void show_member() {

        System.out.print("\t Please Enter ID For Search :");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        System.out.println();

        if (id > 0 && id <= name.size()) {
            System.out.println("\t Name: " + name.get(id - 1));
            System.out.println("\t Age: " + age.get(id - 1));
            System.out.println("\t Gender: " + gender.get(id - 1));

        } else {
            System.out.println("\t Member not found !");
        }
    }

    public void update_member() {

        System.out.print("\t Please Enter ID For Search And Update :");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.println();

        if (id > 0 && id <= name.size()) {

            System.out.print("\t Please enter Your Name For Edit : ");
            String name_person_edited = scanner.nextLine();

            System.out.print("\t Please enter Your Age For Edit : ");
            int age_person_edited = scanner.nextInt();

            scanner.nextLine();

            System.out.print("\t Please enter Your Gender M/F For Edit : ");
            String gender_person_edited = scanner.nextLine();

            name.set(id - 1, name_person_edited);
            age.set(id - 1, age_person_edited);
            gender.set(id - 1, gender_person_edited);

            System.out.println();

            System.out.println("\t Update Member Success !");

        } else {
            System.out.println("\t Member not found !");
        }
    }

    public void delete_member() {

        System.out.print("\t Please Enter ID For Delete :");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println();

        if (id > 0 && id <= name.size()) {

            name.remove(id - 1);
            age.remove(id - 1);
            gender.remove(id - 1);

            System.out.println("\t Delete Member Success !");

        } else {
            System.out.println("\t Member not found ! ");
        }
    }

    public void show_list_members() {

        for (int i = 0; i < name.size(); i++) {

            System.out.println("\t ID : " + (i + 1));
            System.out.println("\t Name : " + name.get(i));
            System.out.println("\t Age : " + age.get(i));
            System.out.println("\t Gender : " + gender.get(i));

            System.out.println();
        }
    }
}
