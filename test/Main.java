// // import Book.Book;

// public class App {

//     class Person {

//         public String name ;
//         protected long phone_number ;

//         public void get_name(String name , long  phone_number){
//             this.name = name;
//             this.phone_number = phone_number;
//         }

//         public void show(){
//             System.out.println("name is :" + name + " " + "phone number is : " + phone_number);
//         }
//     }

//     class Student extends Person{

//         protected double average;
//         protected int id;

//         public void get_average(double average , int  id){
//             this.average = average;
//             this.id = id;
//         }

//         public void show(){
//             super.show();
//             System.out.println("average is :" + " " + average + " id is : " + id);
//         }
//     }
//     public static void main(String[] args) {

//         App app = new App();
//         // Person person = app.new Person();
//         Student student = app.new Student();

//         // person.get_name("ali" , 56594484012L);
//         // person.show();

//         student.get_name("abbas" , 454911854848L);
//         student.get_average(19.5 , 1);
//         student.show();
//     }
// }

public interface App {

    String getname(String name);
    int getid(int id);
    
}

class App_one implements App{

    String name;
    int id;

    public String getname(String name){
        this.name = name;
        return name;
    }
    public int getid(int id){
        this.id = id;
        return id;
    }
    public void show(){
        System.out.println("name is : " + name);
        System.out.println("id is : " + id);
    }


}
public class Main{
    public static void main(String[] args) {

        App_ a = new App_one();

        a.getname("ali");
        a.getid(15);
        a.show();

    }
}
    
