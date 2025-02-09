public class SortArray {
    public static void main (String[] args) {

        int [] number = new int [] {1,5,4,9,6,3,0};

        System.out.println("your array is : ");

        for (int s : number){
            System.out.print(s + " , ");
        }
        
        System.out.println();

        System.out.println("after sorting : ");
        for (int i = 0 ; i < number.length ; i++){
            for (int j = i + 1 ; j < number.length ; j++){

                int temp = 0;

                if (number[i] > number[j]){
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
            System.out.print(number[i] + " , "  );
        }
    }
}


