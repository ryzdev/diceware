import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class NumberGenerator {

    public void generate(int length) throws NoSuchAlgorithmException {
        for (int i = 0; i < length ; i++) {
            System.out.printf("%d %d %d %d %d %n",
                    rollDice(), rollDice(), rollDice(), rollDice(), rollDice());
        }
    }

    private int rollDice() throws NoSuchAlgorithmException {
        SecureRandom random;
        random = SecureRandom.getInstance("SHA1PRNG");
        return random.nextInt(6) +1;
    }
}
