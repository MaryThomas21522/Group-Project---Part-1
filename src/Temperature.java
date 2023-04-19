public class Temperature {
    public static void main(String[] args) {
        double[] temperature = {52, 80.5, 60.5, 90.7, 75, 78};

        double highestTemp = temperature[0];
        double lowestTemp =temperature[0] ;

        for (int i = 0; i <temperature.length ; i++) {
            if (temperature[i]>highestTemp){
                highestTemp=temperature[i];
            }if (temperature[i]<lowestTemp){
                lowestTemp=temperature[i];
            }
        }
        System.out.println("Highest temperature is "+highestTemp);
        System.out.println("Lowest temperature is "+lowestTemp);
    }
}


/*
Create a program that uses an array to store a list of temperatures for a week, and then uses a loop to
find the highest and lowest temperature for the week.
 */
