public class Reversenumber {
    public static void main(String[] args){
        int number = 8557;
        int reverse = reversenumber(number); 
        System.out.println(truereversenumber(number , reverse));
    }

        static int reversenumber(int number){  
            int reverse = 0;  
            while(number != 0) {  
                int remainder = number % 10;  
                reverse = reverse * 10 + remainder;  
                number = number / 10;  
            }  
            return reverse;  
        }  

    static boolean truereversenumber(int number , int reverse){
        return number == reverse;
    }
    }
