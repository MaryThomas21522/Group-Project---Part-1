public class OddAndEven {
    public static void main(String[] args) {

        int [][] numbers={
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        int sum1 = 0;
        int sum2 = 0;

        for (int[] num : numbers) {
            for (int i : num) {
                if (i % 2 == 0) {
                    sum1 = sum1 + i;
                }
                if (i % 2 != 0) {
                    sum2 = sum2 + i;
                }
            }
        }
        System.out.println("The sum of even numbers is "+sum1);
        System.out.println("TRhe sum of odd numbers is "+sum2);
    }
}


/*
Create a 2D array of integers. Develop a program which will calculate the sum of even and
odd numbers for that array.
 */
