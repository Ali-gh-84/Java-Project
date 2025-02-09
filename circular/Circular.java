public class Circular {
    public static void main(String[] args) {
        System.out.println("the number is :" + scircular(5));
    }
    static double scircular(int number){
        double s = (number*number) * (Math.PI);
        return s;
    }
}
