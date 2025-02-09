package calbirthday.human;
import java.util.Scanner;
import calbirthday.time.Date;


public class Person {

    private String name;

    public void get_name(){
        System.out.print("enter your name : ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("name is : " + name);
    }
    public void init(){
        Date date = new Date();
        
        get_name();
        date.get_day();
        date.get_month();
        date.get_year();
        date.calyourbirthday(date);
    }
}
