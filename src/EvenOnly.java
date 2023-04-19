public class EvenOnly {
    public static void main(String[] args) {
        int [][] numbers={
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        for (int[] num : numbers) {
            for (int i : num) {
                if(i%2==0){
                    System.out.print( i+" ");
                }
            }
            System.out.println();
        }
    }
}

/*
Create a 2D array or integer type where you will store odd and even numbers.
Develop a program which will identify/print the even numbers only.
 */
