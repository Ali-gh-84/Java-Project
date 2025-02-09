public class Poweroftwo {  
    public static void main(String[] args) {  
        int number = 6;  
        if (isPowerOfTwo(number)) {  
            System.out.println(number + " is a power of two !");  
        } else {  
            System.out.println(number + " is not a power of two !!");  
        }  
    }  

    static boolean isPowerOfTwo(int number) {  
        if (number <= 0) {  
            return false;  
        }  
        return (number & (number - 1)) == 0;  
    }  
}