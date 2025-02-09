import java.util.Scanner;

public class EqualString {
    public static void main(String[] args) {

        System.out.print("enter a name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String reverse = "";

        for(int i = 0 ; i < name.length() ; i++){
            reverse = name.charAt(i) + reverse;
        }

        System.out.println("reverse your string is : " + reverse);

        scanner.close();

        System.out.println("");

        if (name.equals((reverse))){
            System.out.println(" Yes The word is the same shape from the beginning and the bottom");
        }
        else {
            System.out.println("No The word is not the same form ! ");
        }
    }
}