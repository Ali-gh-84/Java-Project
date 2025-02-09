import java.util.Scanner;

import Book.Manage_Book;
import Loan.Loan_Book;
import Person.Manage_Person;


public class Manage_Library {
    public static void main (String[] args) {

        Manage_Book library = new Manage_Book();  
        Manage_Person person = new Manage_Person(); 
        Loan_Book loan = new Loan_Book(library , person); 

        System.out.println();

        System.out.println("\t* WELCOME TO LIBRARY *");
        
        System.out.println();    
        
        boolean again = true;
        while (again) {

            System.out.println();

            System.out.println("\t 1) ADD MEMBER : ");
            System.out.println("\t 2) SHOW MEMBER : ");
            System.out.println("\t 3) UPDATE MEMBER : ");
            System.out.println("\t 4) DELETE MEMBER : ");
            System.out.println("\t 5) SHOW LIST MEMBER : ");            
            System.out.println("\t 6) ADD BOOK : ");
            System.out.println("\t 7) SHOW BOOK : ");
            System.out.println("\t 8) UPDATE BOOK : ");
            System.out.println("\t 9) DELETE BOOK : ");
            System.out.println("\t 10) SHOW LIST BOOK : ");            
            System.out.println("\t 11) GET BOOK : ");
            System.out.println("\t 12) GIVE BOOK : ");
            System.out.println("\t 13) SHOW ASSING BOOKED : ");
            System.out.println("\t 14)  EXIT : ");
    
            System.out.println();

            System.out.print("\t PLEASE ENTER A NUMBER BETWEEN 1 AND 14 : ");
            Scanner scann = new Scanner(System.in);
            int choice = scann.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    person.add_member();
                    break;
                case 2:
                    person.show_member();
                    break;
                case 3:
                    person.update_member();
                    break;
                case 4:
                    person.delete_member();
                    break;
                case 5:
                    person.show_list_members();
                    break;    
                case 6:
                    library.add_book();
                    break;
                case 7:
                    library.show_book();
                    break;
                case 8:
                    library.update_book();
                    break;
                case 9:
                    library.delete_book();
                    break;
                case 10:
                    library.show_list_book();
                    break;
                case 11:
                    loan.get_book_time();
                    break;               
                case 12:
                    loan.give_book_time();
                    break;
                case 13:
                    loan.assing_book();
                    break;
                case 14:
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



