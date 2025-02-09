import java.util.Scanner;  

public class ReturnString {  
    public static void main (String[] args){  
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter a number for length string:");  

        int len = scanner.nextInt();  
        scanner.nextLine(); 
        String [] strings = new String[len];  

        for (int i = 0; i < strings.length; i++) {  
            strings[i] = scanner.nextLine();  
        }  
        scanner.close();  

        for (int i = 0; i < strings.length; i++) {  
            String s = strings[i];  
            boolean containsSeyyed = s.contains("seyyed");  
            System.out.println("have 'seyyed' ? " + containsSeyyed);  
        }  
    }  
}  