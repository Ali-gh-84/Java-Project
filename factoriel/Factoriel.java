public class Factoriel {  
    public static void main(String[] args) {  
        System.out.println(fact(5));  
    }  
    static int fact(int number) {  
        int num = 1;  
        for (int i = 1; i <= number; i++) {  
            num = num * i;  
        }  
        return num;  
    }  
}  