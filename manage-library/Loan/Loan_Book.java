package Loan;
import Person.Manage_Person;

import java.util.ArrayList;
import java.util.Scanner;

import Book.Manage_Book;


public class Loan_Book {

    private Manage_Book manageBook;
    private Manage_Person managePerson;

    public int day_get;
    public int month_get;
    public int year_get;
    public int day_give;
    public int month_give;
    public int year_give;
    public int idbook , idperson;
    
    public Loan_Book(Manage_Book manageBook, Manage_Person managePerson) {
        this.manageBook = manageBook;
        this.managePerson = managePerson;
    }
    
    public void get_book_time(){

        Scanner scanner = new Scanner(System.in);


        System.out.print("\t Please Enter ID Person For Loan Book : ");
        idperson = scanner.nextInt();


        System.out.print("\t Please Enter ID Book For Loan Book : ");
        idbook = scanner.nextInt();

        System.out.println();

        if (idperson > 0 && idperson < managePerson.member_id){
            if (idbook > 0 && idbook < manageBook.id_book){
                System.out.println("\t The Book For You But Previous Fill the field");

                System.out.println();

                System.out.print("\t Please Enter Day For Loan Book : ");
                day_get = scanner.nextInt();

                System.out.print("\t Please Enter Month For Loan Book : ");
                month_get = scanner.nextInt();

                System.out.print("\t Please Enter Year For Loan Book : ");
                year_get = scanner.nextInt();

                System.out.println();

                System.out.print("\tThe Operation Was Successful !");

                System.out.println();

                addBookToPerson(idperson, idbook);

                
            }else {
                System.out.print("\tThe Operation Was Not Successful");
                System.out.println();
            }
        }else{
            System.out.print("\tThe Operation Was Not Successful");
            System.out.println();
        }
    }

    public void give_book_time(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t Please Enter ID Person For Return Book : ");
        idperson = scanner.nextInt();

        System.out.println();

        System.out.print("\t Please Enter ID Book For Return Book : ");
        idbook = scanner.nextInt();

        System.out.println();

        if (idperson > 0 && idperson < managePerson.member_id){
            if (idbook > 0 && idbook < manageBook.id_book)
                System.out.println("\t The Book Return Success But Previous Fill the field");

                System.out.println();

                System.out.print("\t Please Enter Day For Return Book : ");
                day_give = scanner.nextInt();

                System.out.print("\t Please Enter Month For Return Book : ");
                month_give = scanner.nextInt();

                System.out.print("\t Please Enter Year For Return Book : ");
                year_give = scanner.nextInt();

                System.out.println();

                System.out.print("\tThe Operation Was Successful !");

                System.out.println();

                removeBookToPerson(idperson, idbook);

            if (day_give - day_get >= 14 || month_give - month_get >= 1 || year_give - year_get >=1){
                System.out.print("\tWarning !! you will not be able to get the book for a month !");
                System.out.println();
            }else{
                System.out.print("\tThank you ");
                System.out.println();
            }
        }else{
            System.out.print("\tThe Operation Was Not Successful");
            System.out.println();
        }
    }

    public void addBookToPerson(int personId, int bookId) {

        if (managePerson.assing_book.containsKey(personId)) {

            ArrayList<Integer> bookList = managePerson.assing_book.get(personId);
            bookList.add(bookId);
        } else {
            ArrayList<Integer> bookList = new ArrayList<>();
            bookList.add(bookId);
            managePerson.assing_book.put(personId, bookList);
        }
    }

    public void removeBookToPerson(int personId, int bookId) {

        if (managePerson.assing_book.containsKey(personId)) {

            ArrayList<Integer> bookList = managePerson.assing_book.get(personId);
            bookList.remove((Integer) bookId);
        } else {
            ArrayList<Integer> bookList = new ArrayList<>();
            bookList.remove((Integer) bookId);
            managePerson.assing_book.remove(personId, bookList);
        }
    }
    
    public void assing_book() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t Please Enter ID Person For Check Book: ");
        idperson = scanner.nextInt();
    
        System.out.println();
    
        if (idperson > 0 && idperson < managePerson.member_id) {
            if (managePerson.assing_book.containsKey(idperson)) {
                ArrayList<Integer> bookList = managePerson.assing_book.get(idperson);
                if (!bookList.isEmpty()) {
                    System.out.println("\t Person ID: " + idperson);
                    System.out.println("\t Book IDs: " + bookList);
                } else {
                    System.out.println("\t The person has no books assigned.");
                }
            } else {
                System.out.println("\t No books assigned to this person.");
            }
        } else {
            System.out.print("\t The Person ID is invalid.");
            System.out.println();
        }
    }
}
    


