package One;
// import java.util.Scanner;

import java.util.Scanner;
import java.util.Random;
import TextBox.Calculate;

// import java.util.ArrayList;
// import java.util.Scanner;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.List;

// import TextBox.GenericList;

// // import java.text.NumberFormat;
// // import java.util.Arrays;
// // import java.util.Date;
// // import java.util.Scanner;
// // import TextBox.Textbox;

// // public class One {

//     // public static void main(String[] args) {

//         // var a = new Textbox();

//         // a.setText("ali");
//         // a.clearText();

//         // System.out.println("empty file");
//         // Scanner scanner = new Scanner(System.in);

//         // var a = new Textbox();

//         // int ab = scanner.nextInt();
//         // a.setBasesalary(ab);

//         // int ac = scanner.nextInt();
//         // a.setExtraHours(ac);

//         // int ad = scanner.nextInt();
//         // a.setSalaryRate(ad);

//         // a.setBasesalary(5);
//         // a.setExtraHours(4);
//         // a.setSalaryRate(2);

        
//         // System.out.println(a.calculate(ab, ac, ad));

//         // double price = 10.99D;
//         // System.out.println("hello world" + price);
//         // Date now = new Date();
//         // System.out.println(now);
//         // String a = "ali here";
//         // System.out.println(a.replace("ali" , "mohammad"));
//         // // int [] arr = new int [5];
//         // // arr[0] = 8;
//         // // arr[1] = 1;
//         // // arr[2] = 3;
//         // // arr[3] = 0;
//         // int [] arr = {5,2,0,9};
//         // Arrays.sort(arr);
//         // System.out.println(Arrays.toString(arr));
//         // String [] arr2 = {"ali" , "abbas"};
//         // System.out.println(Arrays.toString(arr2));
//         // System.out.println(arr2.length);
//         // boolean [] arr3 = new boolean[5];
//         // System.out.println(Arrays.toString(arr3));
//         // char [][] arr4 = new char [2][2];
//         // arr4 [0][0] = 'a';
//         // arr4 [1][1] = 'b';
//         // int [][] arr5 = {{1,2} , {3,4}};
//         // System.out.println(Arrays.deepToString(arr4));
//         // System.out.println(Arrays.deepToString(arr5));
//         // String c = "5.3";
//         // double s = Double.parseDouble(c) + 5;
//         // System.out.println(s);
//         // int y = (int)(Math.random() * 100);
//         // System.out.println(y);
//         // NumberFormat n = NumberFormat.getPercentInstance();
//         // NumberFormat n1 = NumberFormat.getInstance();
//         // String res = n.format(5);
//         // String res1 = n1.format(48414916);
//         // System.out.println(res);
//         // System.out.println(res1);
//         // Scanner scan = new Scanner(System.in);
//         // System.out.print("enter a name : ");
//         // String name = scan.nextLine();
//         // System.out.println("your name is :" + name);
//         // scan.close();
//         // var r = 54;
//         // boolean isr = r > 50 && r < 60;
//         // System.out.println(isr);
//         // String isra = r > 50 ? "yes" : "no";
//         // System.out.println(isra);
//         // var bo = "ali hello world";
//         // System.out.println(bo);
// //     }
// // }

// // public class One{
// //     public static void main(String[] args) {

// //         public void drag(Uidraging udrag){
// //             udrag.drag();
// //             System.out.println("draging!");
        
// //     }
// //     }

// // }

// // public class One {

//     // public static void main(String[] args) {

//     //     // ArrayList <Integer> a = new ArrayList<>();
//     //     // a.add(5);
//     //     // System.out.println(a);
//     //     // a.get(0);
//     //     // for (Integer b : a){
//     //     //     System.out.println(b);
//     //     // ArrayList <Boolean> ab = new ArrayList<>();
//     //     // ab.add(true);
//     //     // ab.add(false);
//     //     // ab.remove(0);
//     //     // System.out.println(ab);
//     //     // }
//     //     Scanner scanner = new Scanner(System.in);

//     //     // System.out.println("enter a number for status angry : ");
//     //     // int angry = scanner.nextInt();

//     //     // if (angry % 2 == 0 && angry != 0){
//     //     //     System.out.println("Bala Barare");
//     //     // }
//     //     // else if(angry % 2 != 0 && angry != 0){
//     //     //     System.out.println("Payin Barare");
//     //     // }

//     //     }
//     // } 

// //     public class Main
// // {
// //     public static void main (String[]args)
// //     {
// //         Scanner scanner = new Scanner(System.in);
        
// //         int num1 = scanner.nextInt();
// //         int num2 = scanner.nextInt();

// //         //variables initialization
// //         int reverse1 = 0, rem , reverse2 = 0;


// //         //loop to find reverse number
// //         while (num1 != 0)
// //         {
// //             rem = num1 % 10;
// //             reverse1 = reverse1 * 10 + rem;
// //             num1 /= 10;
// //         }
// //         while (num2 != 0 ) {
// //             rem = num2 % 10;
// //             reverse2 = reverse2 * 10 + rem;
// //             num2 /= 10;
// //         }

// //         //output
// //         System.out.println ("Reversed Number 1 : " + reverse1);
// //         System.out.println ("Reversed Number 2 : " + reverse2);

// //         if (reverse1 > reverse2){
// //             System.out.println("number one " + " > " + "number two ");
// //         }else{
// //             System.out.println("number two " + " > " + "number one ");
// //         }
// //     }
// // }

// public class Main {

//     public static void main(String[] args) {
//         ArrayList <Integer> num = new ArrayList<>();
//         num.add(1);
//         num.add(-5);
//         num.add(3);
//         num.add(0);
//         System.out.println(num.size());
//         System.out.println(num.get(2));
//         Collections.sort(num);
//         for(Integer i : num){
//             System.out.println(i);
//         }
//         HashMap <String , Integer> student = new HashMap<>();
//         student.put("ali", 19);
//         student.put("abbas", 17);
//         student.put("ahmad", 10);
        
//         System.out.println(student);

//         System.out.println(student.get("ali"));
//         System.out.println(student.replace("ali" ,  19, 17));

//         List <String> list = new ArrayList<>();
//         list.add("ali");
//         list.add("abbas");
//         Collections.addAll(list , "mohammad" , "hasan");
//         // System.out.println(list.get(0));
//         for(var l : list){
//             System.out.println(l);
//         }
//         // GenericList a = new GenericList<String>();
//         // GenericList b = new GenericList<Integer>();

//         // a.GenericList("ali");
//         // a.show();
//         // b.GenericList(56);
//         // b.show();
        
//         // List <Character> lists = List.of('a' , 'b' , 'c');
        
//         // for (Character li : lists) {
//         //     System.out.println(li);
//         // }
//                 List <GenericList> namelist = new ArrayList<>(); 
                

//                 namelist.add(new GenericList("ali", 19));  
//                 namelist.add(new GenericList("mohammad", 10));  
//                 namelist.add(new GenericList("baran", 18));  
                
//             long count = namelist.stream()  
//                 .filter(person -> person.getAge() > 15) // کسانی که سن‌شان بیشتر از 15 سال است  
//                 .peek(person -> System.out.println(person.getName())) // چاپ نام آنها  
//                 .count();  

//         System.out.println("Count of people older than 15: " + count);  

//         // مرتب‌سازی بر اساس نام و چاپ افراد  
//         namelist.stream()  
//                 .sorted(Comparator.comparing(GenericList::getName))  // GenericList::getName
//                 .forEach(p -> System.out.println(p.getName()));  

//         System.out.println(Runtime.getRuntime().availableProcessors());
//         System.out.println(Thread.activeCount());
//     }
// }

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // int a = scanner.nextInt();
        // int b = scanner.nextInt();

        // int sum = (a + b);
        // int avg = (a + b) / 2;
        
        // System.out.println(sum);
        // System.out.println(avg);
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();

        // int temp;

        // temp = a;
        // a = b;
        // b = temp;

        // System.out.println(a);
        // System.out.println(b);

        // int a = scanner.nextInt();
        // if (a%2 == 0){
        //     System.out.println("zouj");
        // }else{
        //     System.out.println("fard");
        // }
        // for (int i = 0; i < 1000; i++) {
        //     if(i % 2 != 0){
        //         System.out.println(i);
        //     }
        // }
        // int a = 0;
        // for (int i = 0; i <= 100; i++) {
        //     a += i;
        // }
        // System.out.println(a);
        // int year = 1403;
        // int month = 6;
        // int day = 26;

        // int yearperson = scanner.nextInt();
        // int monthperson = scanner.nextInt();
        // int dayperson = scanner.nextInt();

        // System.out.println("year " + (year - yearperson));
        // System.out.println("month " + (month - monthperson));
        // System.out.println("day " + (day - dayperson));

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // String pass = "ali ghafari";
        // boolean a = true;
        // while (a) {
        //     String prompt = scanner.nextLine();
        //     if(prompt.equals(pass)){
        //         System.out.println("true");
        //         a = false;
        //         break;
        //     }else{
        //         System.out.println("enter another password ");
        //     }
        // }

        // int [] arr = {1,2,3,6,4,8,9,0,1};

        // int max = arr[0];

        // for (int i = 0 ; i < arr.length ; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        // int [] arr = {0,1,2,3,4};

        // int num = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        //     num += arr[i];
        // }
        // num /= arr.length;

        // System.out.println(num);

        // String [] names = {"ali" , "abbas" , "mohammad" , "mahya"};

        // Random random = new Random();

        // int choicehome = random.nextInt(names.length);
        
        // String randomname = names[choicehome];

        // System.out.println(randomname);

        // int [] number = {1,2,3,4,5,6};

        // for (int i = number.length-1 ; i >= 0 ; i--) {
        //     System.out.println(number[i]);
        // }

        System.out.print("\n\t* welcome to calculator *");
        System.out.println();

        Calculate obj = new Calculate();

        boolean again = true;
        while (again) {

            System.out.print("\n\t1) add (+) : " +
                            "\n\t2) minus (-) : " +
                            "\n\t3) multipli (*) : " +
                            "\n\t4) division (/) : " +
                            "\n\t5) exit :");

            System.out.println();

            System.out.print("\tenter number for operation : ");

            int choiceoperation = scanner.nextInt();

            switch (choiceoperation) {
                case 1:
                    obj.add(obj.getNum1(),obj.getNum2());
                    break;
                case 2:
                    obj.minus(obj.getNum1(),obj.getNum2());
                    break;
                case 3:
                    obj.multiple(obj.getNum1(),obj.getNum2());
                    break;
                case 4:
                    obj.divison(obj.getNum1(),obj.getNum2());
                    break;
                case 5:
                    System.out.println("\tthanks you !");
                    again = false;
                    break;
                default:
                    System.out.println("\twrong ! enter valid number ");
                    break;
            }
        }
    }
}
