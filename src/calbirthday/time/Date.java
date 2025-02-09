package calbirthday.time;
import java.util.Scanner;


public class Date {

    public int day_user;
    public int month_user;
    public int year_user;
    public static int day_now = 25;
    public static int month_now = 9;
    public static int year_now = 2024;
    

    public int get_day(){
        System.out.print("enter your day birthday : ");
        Scanner scanner = new Scanner(System.in);
        day_user = scanner.nextInt();
        return day_user;
    }

    public int get_month(){
        System.out.print("enter your month birthday : ");
        Scanner scanner = new Scanner(System.in);
        month_user = scanner.nextInt();
        return month_user;
    }

    public int get_year(){
        System.out.print("enter your year birthday : ");
        Scanner scanner = new Scanner(System.in);
        year_user = scanner.nextInt();
        if(year_user<=2100 && year_user>=1970){
            return year_user;
        }
        return year_user;
    }

    public void calyourbirthday(Date date){
        int myday = day_now - day_user;
        int mymonth = month_now - month_user;
        int myyear = year_now - year_user;
        if(year_now - year_user < 150){
            System.out.println("your Year birthday is : " + myyear + " Month : " + mymonth + " Day : " + myday);
        }
    }
}
