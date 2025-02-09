package TextBox;

// public class Textbox {
    // public String text;

    // public void setText(String t){
    //     this.text = t;
    //     // System.out.println(t);
    // }

    // public void clearText(){
    //     text = "";
    // }
//     private int basesalary ;
//     private int extraHours ;
//     private int salaryRate ;

//     public void setBasesalary(int basesalary) {
//         if (basesalary <= 0){
//             System.out.println("warning !");
//         }else{
//             this.basesalary = basesalary;
//         }
//     }

//     public void setExtraHours(int extraHours) {
//         this.extraHours = extraHours;
//     }

//     public void setSalaryRate(int salaryRate) {
//         this.salaryRate = salaryRate;
//     }


//     public int calculate(int basesalary , int extraHours , int salaryRate){
//         return basesalary + (extraHours * salaryRate);
//     }

// }

// public interface Uidraging {
    
//     public void drag();
//     public void resize();
//     public void render();
    
// }

// public class GenericList <T> {

//     private T num;
//     private T num2;


//     public T mohasebeh (){
//         return (num + num2);
//     }


// }
// public class GenericList <T>{

//     private T item;

//     // public void setItem(T item) {
//     //     this.item = item;
//     // }

//     // public T getItem() {
//     //     return item;
//     // }
//     public void GenericList(T item){
//         this.item = item;
//     }

//     public void show(){
//         System.out.println("you enter this : " + item);
//     }
// }

// public class GenericList {

//     private String name;
//     private int age;

//     public GenericList(String name , int age){
//         this.name = name;
//         this.age = age;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     // public toString(String name){
//     //     return this.name;
//     // }
// }
import java.util.Scanner;

public class Calculate {

    private int num1;
    private int num2;

    Scanner scanner = new Scanner(System.in);

    public int getNum1() {
        System.out.print("\tenter a number :");
        num1 = scanner.nextInt();
        return num1;
    }
    public int getNum2() {
        System.out.print("\tenter a number :");
        num2 = scanner.nextInt();
        return num2;
    }

    public void add(int num1 , int num2){
        System.out.println("\tsum is : " + (num1 + num2));
    }

    public void minus(int num1 , int num2){
        System.out.println("\tminus is :" + (num1 - num2));
    }

    public void multiple(int num1 , int num2){
        System.out.println("\tmultiple is :" + (num1 * num2));
    }

    public void divison(int num1 , int num2){
        System.out.println("\tdivison is :" + (num1 / num2));
    }
}