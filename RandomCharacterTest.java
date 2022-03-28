import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class RandomCharacterTest {

    // Constant variable for the for loop
    private int MAX = 15;

    // Creating an object RandomCharacter
    RandomCharacter randomChar = new RandomCharacter();

    @Test   // Testing for the function: getRandomCharacter()
    void testGetRandomCharacter() {
        for(int i = 0; i < MAX; i++){   // For loop to test the function MAX times
            // Checks if the value returned from the function is letter or digit
            assertTrue(Character.isLetterOrDigit(randomChar.getRandomCharacter()));
        }
    }

    @Test   // Testing for the function: getRandomDigit()
    void testGetRandomDigit() {
        for(int i = 0; i < MAX; i++){   // For loop to test the function MAX times
            int num = randomChar.getRandomDigit();  // Using the function getRandomDigit() to generate a random value
            assertTrue(num <=9 && num >=0);         // Checks if the generated value falls within the specified range
        }
    }

    @Test // Testing for the function: getRandomLowerCaseLetter()
    void testGetRandomLowerCaseLetter() {
        for(int i = 0; i < MAX; i++){   // For loop to test the function MAX times
            // Checks if the generated value from getRandomLowerCaseLetter() are lower cases characters
            assertTrue(Character.isLowerCase(randomChar.getRandomLowerCaseLetter()));
        }
    }

    @Test // Testing for the function: getRandomUpperCaseLetter()
    void testGetRandomUpperCaseLetter() {
        for(int i = 0; i < MAX; i++){   // For loop to test the function MAX times
            // Checks if the generated value from getRandomUpperCaseLetter() are upper cases characters
            assertTrue(Character.isUpperCase(randomChar.getRandomUpperCaseLetter()));
        }
    }

    @Test // Testing for the function getRandomPrimeNumbers()
    void testGetRandomPrimeNumbers() {
        for(int i = 0; i < MAX; i++){   // For loop to test the function MAX times
            int num = randomChar.getRandomPrimeNumbers();   // Using the function getRandomPrimeNumbers to generate a prime value
            assertTrue(randomChar.checkPrime2(num));        // Check if the generated value is prime, using checkPrime2
        }
    }
}