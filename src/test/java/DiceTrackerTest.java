import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class DiceTrackerTest {

    @Test
    public void testAddingToDiceTracker1() {
        DiceTracker diceTracker = new DiceTracker();
        diceTracker.addingToCollection(1);
        diceTracker.addingToCollection(1);
        diceTracker.addingToCollection(1);

        int expectedNumberOf1 = 3;
        int actual = diceTracker.getNumberOccurance(1);
        assertEquals(actual, expectedNumberOf1);
    }

    @Test
    public void testAddingToDiceTracker2() {
        DiceTracker diceTracker = new DiceTracker();
        diceTracker.addingToCollection(1);
        diceTracker.addingToCollection(2);
        diceTracker.addingToCollection(3);

        int expectedNumberOf2 = 1;
        int actual = diceTracker.getNumberOccurance(2);
        assertEquals(actual, expectedNumberOf2);
    }

    @Test
    public void testSetPrintOut() {
        DiceTracker diceTracker = new DiceTracker();
        diceTracker.addingToCollection(1);
        diceTracker.addingToCollection(2);
        diceTracker.addingToCollection(3);

        String expectedPrintOut = "[1=1, 2=1, 3=1]";
        String actual = diceTracker.entrySetPrint();
        assertEquals(actual, expectedPrintOut);
    }

    @Test
    public void testSetPrintOut2() {
        DiceTracker diceTracker = new DiceTracker();
        diceTracker.addingToCollection(1);
        diceTracker.addingToCollection(1);
        diceTracker.addingToCollection(1);

        String expectedPrintOut = "[1=3]";
        String actual = diceTracker.entrySetPrint();
        assertEquals(actual, expectedPrintOut);
    }
}
