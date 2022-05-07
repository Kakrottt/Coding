package studentTotal;


public class totalM {
    public int totalMark(int i, int j, int k){
        int sum = i + j + k;
        return sum;
    }

    public double aver(int sum){
        double tave = (double) sum/3;
        return tave;
    }
}
