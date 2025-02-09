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

// interface App {

//     String getname(String name);
//     int getid(int id);
    
// }

// class App_one implements App{

//     String name;
//     int id;

//     public String getname(String name){
//         this.name = name;
//         return name;
//     }
//     public int getid(int id){
//         this.id = id;
//         return id;
//     }
//     public void show(){
//         System.out.println("name is : " + name);
//         System.out.println("id is : " + id);
//     }


// }

// public class Origin{
//     public static void main(String[] args) {

//         App_one a = new App_one();

//         a.getname("ali");
//         a.getid(15);
//         a.show();

//     }
// }

// interface App {  
//     String getname();  
//     int getage();  
// }  

// abstract class App_one {  
//     public abstract int getid();  
// }  

// class App_two extends App_one implements App {  

//     private String name;  
//     private int id;  
//     private int age;  

//     public String getname() {  
//         return name;  
//     }  

//     public int getage() {  
//         return age;  
//     }  

//     public int getid() {  
//         return id;  
//     }  

//     public void setname(String name) {  
//         this.name = name;  
//     }  

//     public void setage(int age) {  
//         this.age = age;  
//     }  

//     public void setid(int id) {  
//         this.id = id;  
//     }  

//     public void show() {  
//         System.out.println("name: " + getname());  
//         System.out.println("age: " + getage());  
//         System.out.println("id: " + getid());  
//     }  
// }  

// public class Origin {  
//     public static void main(String[] args) {  
//         App_two a = new App_two();  
//         a.setname("ali");  
//         a.setage(15);  
//         a.setid(1);  
//         a.show();  
//     }  
// }
// class A {

//     private String name = "ali";
    
//     public void show(){
//         System.out.println("name is : " + name);
//     }
//     public class B{

//         public void f(){

//         // String s = A.this.name = "mamad";
//         String s = name = "mamad";
//         System.out.println(s);
//     }
//     }
// }
// public class Origin {
//     public static void main(String[] args) {

//         A person = new A();
//         A.B person2 = person.new B();

//         person.show();
//         person2.f();
//     }
// }


// class A {

//         private String name = "ali";
        
//         public void show(){
//             System.out.println("name is : " + name);
//         }
//         static class B{
    
//             public void f(){
//                 System.out.println("name is : alllllli");
//         }
//         }
//     }
//     public class Origin {
//         public static void main(String[] args) {
    
//         A.B person = new A.B();
    
//             person.f();

//         }
//     }

// interface Nameable{

//     void getName();
// }

// interface Canthink{

//     void think();
// }

// interface Cantalk extends Canthink{

//     void talk();
// }

// abstract class NamedObject{
//     protected String name;

//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public void show(){
//         System.out.println("name is : " + name);
//     }
// }

// class Person extends NamedObject implements Nameable , Cantalk{

//     public void get_name(){
    
//         System.out.println("name is : " + name);

//     }

//     public void think(){
//         System.out.println("i im think !");
//     }

//     public void talk(){
//         System.out.println("i im talk !");
//     }
// }

// class Student extends Person{
//     public void hello(){
//         System.out.println("hiiiiiii");
//     }
// }

// public class Origin {

//     public static void main(String[] args) {
//         Cantalk c = new Person();
//         c.talk();
//     }
// }

// public class Origin{
//     public static void main(String[] args) {
//         int num = 10;
//         int makhraj = 0;
//         try {
//             System.out.println(num / makhraj);
//         } catch (Exception e) {
//             System.out.println("this work not True !");
//         }finally{
//             System.out.println("thank for use !");
//         }
//     }
// }

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;


class Ali <T>{

    private T item;

    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}
public class Origin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList <Integer> a = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            System.out.println("enter a number :");
            int number = scanner.nextInt();
            a.add(number);
        }
        for(int s : a){
            System.out.println(s);
        }
        System.out.println(a);

        Ali<String> string = new Ali<>();
        Ali<Integer> intege = new Ali<>();

        string.setItem("ali here !");
        String message = string.getItem();
        System.out.println(message);

        intege.setItem(5);
        int number1 = intege.getItem();
        System.out.println(number1);

        ArrayList <Integer> num = new ArrayList<>();

        num.add(4);
        num.add(1);
        num.add(3);

        Collections.sort(num);

        Iterator<Integer> it = num.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // for(Integer s : num){
        //     System.out.println(s);
        // }

        HashMap <String , Double> info = new HashMap<>();

        info.put("ali", 18.5);

        System.out.println(info);

        // switch (number) {
        //     case 1:
        //         try {
        //             System.out.println("number is one ");
        //         }catch (Exception e) {
        //             System.out.println("number is not one");
        //         } finally {
        //             System.out.println("thankyou");
        //         }
        //         break;
        //     default:
        //         break;
        }
    }
