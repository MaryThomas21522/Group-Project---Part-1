public class PrimeNumber {
    public static void main(String[] args) {
        int number=2;
        boolean prime=true;
        for (int i = 2; i <number ; i++){
            if(number%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println("The number "+number+" is prime");
        }else{
            System.out.println("The number "+number+" is not prime");
        }
    }
}


/*
Write a java program to check whether a given number is prime or not
 */
