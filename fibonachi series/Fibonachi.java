public class Fibonachi {

    public static void main(String[] args) {
        fibo();
    }
    static void fibo(){
        int num1 = 0 ;
        int num2 = 1 ;
        int sum = 0;
        while(sum <= 1000){
            System.out.println(num1);
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }    
}
