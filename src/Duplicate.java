public class Duplicate {
    public static void main(String[] args) {

        String[] sub = {"Prime", "HBO", "Netfix", "Prime", "CrunchyRoll", "Roku", "Hulu", "HBO"};

        for (int i = 0; i < sub.length; i++) {
            for (int j = i + 1; j < sub.length; j++) {
                if (sub[i].equals(sub[j])) {

                    System.out.println("Duplicate subscriptions is " + sub[j]);
                }
            }
        }
    }
}

/*
Write a program to print out duplicate elements from an Array of Strings
 */



