// // public class Book {

// //     public int price;
// //     private Integer countpaper = null;
// //     private final String writter = "ferdowsi";

// //     enum Status{
// //         READY , Amanat , Sahafi;
// //     }

// //     public int num;
// //     public String numbersString(){
// //         switch (num) {
// //             case 1:
// //                 return "READY";
// //             case 2:
// //                 return "amanat";
// //             case 3:
// //                 return "sahafi";
// //             default:
// //                 return "unknown";
// //         }
// //     }

// //     public String tosString(int a){
// //         return "Status the Book is " + numbersString();
// //     }

// //     public void setprice(int b){
// //         price = b;
// //         System.out.println("price is :" + b);

// //     }

// //     public void detail(int c){
// //         countpaper = c;
// //         System.out.println("writter is : " + writter + " " + "count paper is : " + c);
// //     }
// //     public static void main(String[] args) {
// //         Book a = new Book();
// //         System.out.println(a.tosString(4));
// //         a.setprice(100);
// //         a.detail(8);
// //     }
// // }

// public class Person {


//     public static void main(String[] args) {
//         Student a = new Student();
//         a.getName("ali");
//         a.getAge(15);
//         a.getgender("M");
//         System.out.println(a.toString());
        
//     }


//     protected String name;
//     protected int age;

//     public void getName(String name) {
//         this.name = name;
//     }

//     public void getAge(int age) {
//         this.age = age;
//     }
    
//     public void toString(){
//         System.out.println( "name " + name + "age " + age);
//     }

// }
// class Student extends Person{

//     public String gender;

//     public void getgender(String gender) {
//         this.gender = gender;
//     }

//     @Override
//     public void toString(){
//         super.toString();
//         return "gender " + gender;
//     }

// }
// class Teacher extends Person{
//     public int id;

//     @Override
//     public String toString(){
//         super.toString();
//         return "id " + id;
//     }

// }

