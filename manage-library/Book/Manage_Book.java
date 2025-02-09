package Book;
import java.util.Scanner;
import java.util.ArrayList;

public class Manage_Book {
    
    public int id_book = 1;
    ArrayList <String> title_book = new ArrayList<>();
    ArrayList <String> writter_book = new ArrayList<>();
    ArrayList <Integer> paper_book = new ArrayList<>();

    public void add_book(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\tPlease Enter Name Of Book : ");
        String name_book = scanner.nextLine();

        System.out.print("\tPlease Enter Writter Of Book : ");
        String writter = scanner.nextLine();

        System.out.print("\tPlease Enter Count Paper Of Book : ");
        int count_paper = scanner.nextInt();

        System.out.println();
        
        title_book.add(name_book);
        writter_book.add(writter);
        paper_book.add(count_paper);

        System.out.print("\tID Book Is : " + id_book);
        System.out.print("\n\tAdd Book Is Success");

        System.out.println();

        // System.out.println("Added Book: " + title_book[id_book] + ", " + writter_book[id_book] + ", " + paper_book[id_book]);

        id_book +=1;
    }

    public void show_book(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\tPlease Enter ID Of Book : ");
        int id = scanner.nextInt();

        System.out.println();

        if (id > 0 && id <= title_book.size()) {
            System.out.print("\t\n Name Of Book : " + title_book.get(id - 1));
            System.out.print("\t\n Writter Of Book : " + writter_book.get(id - 1));
            System.out.print("\t\n Count Paper Of Book : " + paper_book.get(id - 1));
            System.out.println();
        }else{
            System.out.print("\tBook not found !");
            System.out.println();
        }
    }

    public void update_book(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\tPlease Enter ID Of Book For Update : ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println();

        if (id > 0 && id <= title_book.size()){

            System.out.print("\t Please Enter Name Of Book For Update : ");
            String name_update = scanner.nextLine();

            System.out.print("\t Please Enter Writter Of Book For Update : ");
            String writter_update = scanner.nextLine();

            System.out.print("\t Please Enter Name Of Book For Update : ");
            int paper_count_update = scanner.nextInt();
            System.out.println();

            title_book.set(id - 1, name_update);
            writter_book.set(id - 1, writter_update);
            paper_book.set(id - 1, paper_count_update);

            System.out.println("\t Update Book Success !");
        } else {
            System.out.println("\t Book not found !");
        }
    }

    public void delete_book(){

        System.out.print("\t Please Enter ID For Delete :");

        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        System.out.println();

        if (id > 0 && id <= title_book.size()) {

            title_book.remove(id - 1);
            writter_book.remove(id - 1);
            paper_book.remove(id - 1);

            System.out.println("\t Delete Book Success !");
        }else{
            System.out.println("\t Book not found ! ");
        }
    }

    public void show_list_book(){
        for (int i = 0; i < title_book.size(); i++) {

            System.out.println("\t ID : " + (i + 1));
            System.out.println("\t Name Of Book : " + title_book.get(i));
            System.out.println("\t Writter Of Book : " + writter_book.get(i));
            System.out.println("\t Count Page : " + paper_book.get(i));
            System.out.println();
            
        }
    }
}

