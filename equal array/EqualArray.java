import java.util.Arrays;

public class EqualArray {
    public static void main (String[] args) {

        int [] number1 = new int [] {1,2,3};
        int [] number2 = new int [] {1,3,2};

        Arrays.sort(number1);
        Arrays.sort(number2);

        System.out.println(Arrays.equals(number1, number2));
    }
}