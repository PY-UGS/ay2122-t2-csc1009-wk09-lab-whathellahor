import java.util.Random;

public class RandomCharacter {

    // Random() method to generate alphabets or numbers
    Random random = new Random();
    
    public char getRandomLowerCaseLetter(){
        // Generate a random LOWERCASE letter from 'a' to 'z'
        // Referenced to ASCII table, generating from a range of 
        // 97 == a TO (97+26-1) == z
        char c = (char)(97 + random.nextInt(26));
        return c;
    }

    public char getRandomUpperCaseLetter(){
        // Generate a random UPPERCASE letter from 'A' to 'Z'
        // Referenced to ASCII table, generating from a range of 
        // 65 == A TO (65+26-1) == 90
        return (char)(65 + random.nextInt(26));
    }

    public int getRandomDigit(){
        // Generate a random UPPERCASE letter from '0' to '9'
        return (int)(random.nextInt(10));
    }

    public char getRandomCharacter(){
        // Create a string which alphanumerics
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
        // Generate a random number
        int randNum = random.nextInt(alphaNumericString.length());
        // Retrieve the letter at the index of the generated random number
        return alphaNumericString.charAt(randNum);
    }

    public int getRandomPrimeNumbers(){
        // While loop to search for prime number
        while(true){
            // Generate a number from 2 to 30, +2 to skip 0 and 1 since not prime numebrs
            int num =  (int)(random.nextInt(28)+2);
            // If its prime number, return the number
            if(checkPrime(num) == true){
                return num;
            }
        }
    }

    // First method to check if a number is prime
    public boolean checkPrime(int num){
        boolean flag = true;
        int i = 2;
        while(i <= num/2){
            if (num % i == 0){
                flag = false;
                break;
            }
            ++i;
        }
        return flag;
    }

    // Alternative method for testing prime
    public boolean checkPrime2(int num){
        boolean flag = true;
        for(int i = 2; i<= num/2; ++i){
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}