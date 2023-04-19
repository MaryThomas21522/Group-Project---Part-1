public class SumArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        int sum= 0;
        for (int i = 0; i < num.length; i++) {
            sum= sum + num[i];
        }
        System.out.println("Sum of array is " + sum);
    }
}

/*
Create an array of integer values. After the array is created, calculate the sum of all stored
elements in that array.
 */
