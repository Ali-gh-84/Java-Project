public class Det{
    public static void main(String[] args) {

        int [][] matrix = { {1, 4}, {1, 4} };

        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[1][0];
        int d = matrix[1][1];

        if (a*d != b*c){

            System.out.println("this mattrix have det !");

            int det = a*d - b*c;

            System.out.println("determinan matris is : " + det);
        }
        else {
            System.out.println("sorry this mattrix havenot det !!");
        }

    }
}