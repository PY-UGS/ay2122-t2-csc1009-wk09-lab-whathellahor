public class Main {
    
    public static void main (String[] args){

        final int MAX = 15;
        
        // Creating a new object RandomCharacter
        RandomCharacter r = new RandomCharacter();

        int[] randomDigit = new int[MAX];
        int[] primeNum = new int[MAX];
        char[] upperCase = new char[MAX];
        char[] lowerCase = new char[MAX];
        char[] randomCharacter = new char[MAX];

        // Formatting the strings
        System.out.printf("%-22s%-22s%-22s%-22s%-22s\n","Random Lowercase", "Random Uppercase", "Random Digit", "Random Character", "Prime Numbers");
        for(int i = 0; i < MAX; i++){

            // Storing generated values into arrays
            lowerCase[i] = r.getRandomLowerCaseLetter();
            upperCase[i] = r.getRandomUpperCaseLetter();
            randomDigit[i] = r.getRandomDigit();
            randomCharacter[i] = r.getRandomCharacter();
            primeNum[i] = r.getRandomPrimeNumbers();
            // Returning the values from the arrays
            System.out.printf("%-22c%-22c%-22d%-22c%-22d",lowerCase[i], upperCase[i],randomDigit[i], randomCharacter[i], primeNum[i]);
            System.out.println("");
        }
    }
}