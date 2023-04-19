public class Swap2Numbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("a= "+a);
        System.out.println("b= "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}


/*
Write a program to swap 2 numbers without a temporary variable
 */
