

public class Bins {
    private int[] bin;
    private int minBin;
    public Bins(int min, int max){
        minBin=min;
        bin=new int[max-min+1];
    }
    public void incrementBin(int number){
        bin[number-minBin]++;
    }
    public int getBin(int number){
        return bin[number-minBin];
    }
}
