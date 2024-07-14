import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DiceTracker {

    private Map<Integer , Integer> collectionOfRolls;

    public Map<Integer, Integer> getCollectionOfRolls() {
        return collectionOfRolls;
    }

    public DiceTracker() {
        this.collectionOfRolls = new TreeMap<>();

    }

    public void addingToCollection(int valueToIncrement){
        int valueCounter = collectionOfRolls.getOrDefault(valueToIncrement, 0);
        collectionOfRolls.put(valueToIncrement, valueCounter+1);
    }

    public int getNumberOccurance(int sum) {
        return this.collectionOfRolls.getOrDefault(sum, 0);
    }

    public String entrySetPrint(){

        Set<Map.Entry<Integer, Integer>> set =  this.collectionOfRolls.entrySet();
        String print = set.toString();
        return print;
    }
}
