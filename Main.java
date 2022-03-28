public class Main {
    
    public static void main (String[] args){

        // Defining a constant
        final int MAX = 15;
        
        // Creating a new object RandomCharacter
        RandomCharacter r = new RandomCharacter();

        // Creating arrays to store 15 different values of each type that will be generated and passed in
        int[] randomDigit = new int[MAX];           // Array for only integer numbers
        int[] primeNum = new int[MAX];              // Array for only prime numbers
        char[] upperCase = new char[MAX];           // Array for only uppercase letters
        char[] lowerCase = new char[MAX];           // Array for only lowercase letters
        char[] randomCharacter = new char[MAX];     // Array for alphanumeric characters

        // Formatting the strings
        System.out.printf("%-22s%-22s%-22s%-22s%-22s\n","Random Lowercase", "Random Uppercase", "Random Digit", "Random Character", "Prime Numbers");
        
        // For loop to generate 15 different values each and store it into the array
        for(int i = 0; i < MAX; i++){
            // Storing generated values into arrays
            lowerCase[i] = r.getRandomLowerCaseLetter();        // Storing randomly generated lowercase letter into lowercase[i]
            upperCase[i] = r.getRandomUpperCaseLetter();        // Storing randomly generated uppercase letter into uppercase[i]
            randomDigit[i] = r.getRandomDigit();                // Storing randomly generated digit into randomDigit[i]
            randomCharacter[i] = r.getRandomCharacter();        // Storing randomly generated alphanumeric letters into randomCharacter[i]
            primeNum[i] = r.getRandomPrimeNumbers();            // Storing randomly generated prime numbers into primeNum[i]
            // Returning the values from the arrays
            System.out.printf("%-22c%-22c%-22d%-22c%-22d",lowerCase[i], upperCase[i],randomDigit[i], randomCharacter[i], primeNum[i]);
            System.out.println("");
        }
    }
}