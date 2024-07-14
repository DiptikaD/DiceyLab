import java.util.Map;
import java.util.Set;

public class Simulation {


    public static void main(String[] args) {
        Dice dice = new Dice(2);
        DiceTracker diceTracker = new DiceTracker();


        for (int i = 1000000; i > 0; i--){
            int value = dice.diceRoll();
            diceTracker.addingToCollection(value);
        }
        System.out.println(diceTracker.entrySetPrint());




    }


}
