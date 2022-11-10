public class Dice {
    public int numOfDice;


    public Dice(int numOfDice){
        this.numOfDice = numOfDice;
    }
    public Integer tossAndSum(){
        int result = 0;
        for (int i = 1; i <= numOfDice; i++) {
            result += (6 * Math.random() + 1);
        }
        return result;
    }
}
