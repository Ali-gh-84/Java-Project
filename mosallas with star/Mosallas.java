public class Mosallas {  
    public static void main(String[] args) {  
        star(5);  
    }  
    static void star(int number) {  

        for (int i = 1; i <= number; i++) {  
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");  
            }  
            System.out.println(); 
        }  
        for (int j = number; j > 0; j--) {  
            for (int k = 1; k <= j; k++) {  
                System.out.print("*");  
            }  
            System.out.println();   
        }  
    }  
}  