public class Simulation {
    private Dice dice;
    private Bins bins;
    private int min, max, numberOfSims, numberOfDie;
    public Simulation (int numberOfDice,int numberOfSimulations) {
        dice = new Dice(numberOfDice);
        min = numberOfDice;
        max = numberOfDice * 6;
        bins = new Bins(min, max);
        numberOfDie=numberOfDice;
        numberOfSims =numberOfSimulations;
    }
    public void runSimulations(){
        for (int i = 0; i< numberOfSims; i++){
            bins.incrementBin(dice.tossAndSum());
        }
    }
    public void printResults(){
        String stars="";
        int result=0;
        double percent = 0;
        System.out.println("-----");
        System.out.println("Simulation of "+ numberOfDie+" dice tossed for "+ numberOfSims +" times.");
        System.out.println("-----");
        for (int i=0;i<=(max-min);i++){
            result=bins.getBin(i+2);
            percent=((double) result)/ numberOfSims;
            for (int j=0;j<(Math.round(percent*100));j++){
                stars+="*";
            }
            System.out.println(String.format("%3d  : %10d: %.2f %s",min+i,result, percent, stars));
            stars="";
        }
    }
}
