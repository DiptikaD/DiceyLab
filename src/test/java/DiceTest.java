import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void sumOfDiceRoll() {
        Dice dice = new Dice(1);
        int minimumValue = 1;
        int maximumValue = 6;
        int actualValue = dice.diceRoll();
        System.out.println(actualValue);
        Assert.assertTrue(minimumValue<= actualValue && actualValue <= maximumValue);
    }

    @Test
    public void sumOfMultipleDiceRoll() {
        Dice dice = new Dice(3);
        int minimumValue = 3;
        int maximumValue = 18;
        int actualValue = dice.diceRoll();
        System.out.println(actualValue);
        Assert.assertTrue(minimumValue<= actualValue && actualValue <= maximumValue);
    }
}