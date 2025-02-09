import java.util.Scanner;
import java.util.Arrays;


// public class Training {
//     public static void main(String[] args){
//         System.out.println(addition(5 , 6));
//     }
//     static int addition(int a , int b){
//         int result = a + b;
//         return result;
//     }
// }

// public class Training {

//     public static void main(String[] args) {
//         System.out.print("enter two number for resault :");
//         Scanner scanner = new Scanner(System.in);
//         int wight = scanner.nextInt();
//         int height = scanner.nextInt();
//         int result = wight*height;
//         System.out.println("resault is : " + result);
//         scanner.close();
//     }
// }

// public class Training {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int i = scanner.nextInt();
        
//         boolean again = true;
//         while (again) {
//             switch (i) {
//                 case 1:
//                     System.out.println("your number is : 1 ");
//                     again = false;
//                     break;
//                 case 2:
//                     System.out.println("your number is : 2 ");
//                     again = false;
//                     break;
//                 case 3:
//                     System.out.println("your number is : 3 ");
//                     again = false;
//                     break;
            
//                 default:
//                     System.out.println("your number is : non ");
//                     again = false;
//                     break;
//             }
//         scanner.close();
//         }
        
//     }
// }

// public class Training {

//     public static void main(String[] args) {
//         // Scanner scanner = new Scanner(System.in);
//         // String a = scanner.next();
//         String a = "ali ghafari";
//         // scanner.close();
//         char b = a.charAt(5);
//         int c = a.indexOf("ghafari");
//         String d = a.replace("ghafari", "abbas");
//         System.out.println(b + c + d);
//     }
// }

// public class Training {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int b = scanner.nextInt();
//         int [] a = new int [b];
//         for (int i = 0 ; i < a.length ; i++){
//             a[i] = scanner.nextInt();
//         }
//         scanner.close();
//         for(int i = 0 ; i<a.length ; i++){
//             int s = a[i];
//             System.out.println(s);
//         }
//     }
// }

// for use the string with ID

// String[] stringArray = {"apple", "banana", "cherry"};  
// int[] idArray = {1, 2, 3};  

// for (int i = 0; i < stringArray.length; i++) {  
//     System.out.println("String: " + stringArray[i] + ", ID: " + idArray[i]);   
// }


// for add the item to array 

// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         // ایجاد آرایه اولیه
//         int[] array = {1, 2, 3};

//         // ایجاد آرایه جدید با یک خانه بیشتر
//         int[] newArray = Arrays.copyOf(array, array.length + 1);

//         // اضافه کردن عضو جدید به آرایه
//         newArray[newArray.length - 1] = 4;

//         // چاپ آرایه جدید
//         System.out.println(Arrays.toString(newArray)); // Output: [1, 2, 3, 4]
//     }
// }

// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         // ایجاد یک ArrayList
//         ArrayList<Integer> arrayList = new ArrayList<>();

//         // اضافه کردن اعضای جدید به ArrayList
//         arrayList.add(1);
//         arrayList.add(2);
//         arrayList.add(3);

//         // چاپ ArrayList
//         System.out.println(arrayList); // Output: [1, 2, 3]

//         // اضافه کردن یک عضو دیگر
//         arrayList.add(4);
//         System.out.println(arrayList); // Output: [1, 2, 3, 4]
//     }
// }

// public class Rectangel {

//     private int width , height ;

//     public void set_width(int w){
//         width = w;
//     }
//     public void set_height(int h){
//         height = h;
//     }
//     public int set_area(){
//         return width * height;
//     }
//     public int set_masahat(){
//         return (width+height) * 2;
//     }
//     public static void main(String[] args) {

//         Rectangel area = new Rectangel();
//         area.set_height(2);
//         area.set_width(5);
//         System.out.println(area.set_area());
//         System.out.println(area.set_masahat());
//     }
// }

public class Player {

    private String name = "ali";
    private int age;

    {
        System.out.println("hello !");
    }

    public String set_name(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a name :");
        name = scanner.nextLine();
        return name;
    }
    public int set_age(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter an age :");
        age = scanner.nextInt();
        return age;
    }
    public void show_player(){  //init
        set_name();
        set_age();
        System.out.println("name :" + name + "\nage :" + age);
    }
    public static void main(String[] args) {

        Player person = new Player();
        // person.set_name();
        // person.set_age();
        person.show_player();
    }
}
