import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class RandomCharacterTest {

    private int MAX = 15;

    RandomCharacter randomChar = new RandomCharacter();

    @Test
    void testGetRandomCharacter() {
        for(int i = 0; i < MAX; i++){
            assertTrue(Character.isLetterOrDigit(randomChar.getRandomCharacter()));
        }
    }

    @Test
    void testGetRandomDigitCharacter() {
        for(int i = 0; i < MAX; i++){
            int num = randomChar.getRandomDigit();
            assertTrue(num <=9 && num >=0);
        }
    }

    @Test
    void testGetRandomLowerCaseLetter() {
        for(int i = 0; i < MAX; i++){
            assertTrue(Character.isLowerCase(randomChar.getRandomLowerCaseLetter()));
        }
    }

    @Test
    void testGetRandomUpperCaseLetter() {
        for(int i = 0; i < MAX; i++){
            assertTrue(Character.isUpperCase(randomChar.getRandomUpperCaseLetter()));
        }
    }

    @Test
    void testGetRandomPrimeNumbers() {
        for(int i = 0; i < MAX; i++){
            int num = randomChar.getRandomPrimeNumbers();
            assertTrue(randomChar.checkPrime2(num));
        }
    }
}