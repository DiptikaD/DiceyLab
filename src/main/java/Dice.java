import java.util.Random;

public class Dice {

    private int numberOfDice;

   public Dice(int numberOfDice){
       this.numberOfDice = numberOfDice;
   }

   public int diceRoll(){
       Random random = new Random();
       int rollCounter = numberOfDice;
       int sumOfRoll = 0;
       while(rollCounter > 0){
           int diceRoll = random.nextInt(6)+1 ;
           sumOfRoll += diceRoll;
           rollCounter--;
       }
       return sumOfRoll;
   }

}
