import java.util.Scanner;
import BooK.Manage_book;
import Person.Manage_person;


public class Manage_library {

        // function crud

    static void add_member(String[] name ,  int[] age , char[] gender , int member_id) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\t Please enter Your Name : ");
        String name_person = scanner.nextLine();

        System.out.print("\t Please enter Your Age : ");
        int age_person = scanner.nextInt();

        System.out.print("\t Please enter Your Gender M/F : ");
        char gender_person = scanner.next().charAt(0);

        System.out.println("\t Your Owen ID Is : " + member_id);

        System.out.println("\t Add Member Success !");

        name[member_id] = name_person;
        age[member_id] = age_person;  
        gender[member_id] = gender_person; 

    }

    static void show_member(String[] name ,  int[] age , char[] gender , int member_id) {

        System.out.print("\t Please Enter ID For Search :");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        System.out.println();

        if (id > 0 && id < member_id && name[id] != null) {
            System.out.println("\t Name: " + name[id]);
            System.out.println("\t Age: " + age[id]);
            System.out.println("\t Gender: " + gender[id]);
        }
        else {
            System.out.println("\t Member not found !");
        }
    }

    static void update_member(String[] name ,  int[] age , char[] gender , int member_id ) {

        System.out.print("\t Please Enter ID For Search And Update :");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println();

        if (id > 0 && id < member_id) {

            Scanner scanner1 = new Scanner(System.in);

            System.out.print("\t Please enter Your Name For Edit : ");
            String name_person_edited = scanner1.nextLine();
    
            System.out.print("\t Please enter Your Age For Edit : ");
            int age_person_edited = scanner1.nextInt();
    
            System.out.print("\t Please enter Your Gender M/F For Edit : ");
            char gender_person_edited = scanner1.next().charAt(0);
        
            name[id] = name_person_edited;
            age[id] = age_person_edited;  
            gender[id] = gender_person_edited; 

            System.out.println("\t Update Member Success !");

        } else {
            System.out.println("\t Member not found !");
        }
    }

    static void delete_member(String[] name ,  int[] age , char[] gender , int member_id ) {

        System.out.print("\t Please Enter ID For Delete :");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println();

        if (id > 0 && id < member_id) {
            name[id] = null;
            age[id] = 0;
            gender[id] = '\0';

            System.out.println("\t Delete Member Success !");
        }else{
            System.out.println("\t Member not found ! ");
        }
    }

    public static void main (String[] args) {

        // main function 

        System.out.println();

        System.out.println("\t* WELCOME TO LIBRARY *");

        System.out.println();

        System.out.print("\t PLEASE ENTER A NUMBER For Length Library :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // array options

        int member_id = 1;
        String [] name = new String [n];
        int [] age = new int [n];
        char [] gender = new char[n];
        // Manage_person 
        Manage_book library = new Manage_book();        

        // menu app 
        
        boolean again = true;
        while (again) {

            System.out.println();

            System.out.println("\t 1) ADD MEMBER : ");
            System.out.println("\t 2) SHOW MEMBER : ");
            System.out.println("\t 3) UPDATE MEMBER : ");
            System.out.println("\t 4) DELETE MEMBER : ");
            System.out.println("\t 5) ADD BOOK : ");
            System.out.println("\t 6) SHOW BOOK : ");
            System.out.println("\t 7) UPDATE BOOK : ");
            System.out.println("\t 8) DELETE BOOK : ");
            System.out.println("\t 9) GET BOOK : ");
            System.out.println("\t 10) GIVE BOOK : ");
            System.out.println("\t 11)  EXIT : ");
    
            System.out.println();

            System.out.print("\t PLEASE ENTER A NUMBER BETWEEN 1 AND 11 : ");
            Scanner scann = new Scanner(System.in);
            int choice = scann.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    if (member_id > n){
                        System.out.println("\t Member Finished !");
                    }
                    else {
                        add_member(name , age , gender , member_id);
                        member_id +=1;
                    }
                    break;
                case 2:
                    show_member(name , age , gender , member_id);
                    break;
                case 3:
                    update_member(name , age , gender , member_id);
                    break;
                case 4:
                    delete_member(name , age , gender , member_id);
                    break;
                case 5:
                    library.add_book();
                    library.id_book+=1;
                    break;
                case 6:
                    library.show_book();
                    break;
                case 7:
                    library.update_book();
                    break;
                case 8:
                    library.delete_book();
                    break;
                // case 9:
                //     delete_member(name , age , gender , member_id);
                //     break;
                // case 10:
                //     obj.delete_book();
                //     break;
                case 11:
                    System.out.println("\t Thanks For Use !");
                    again = false;
                    break;
                default:
                    System.out.println("\t This Number IsNot True !!");
                    break;
            }
        }
    }
}
