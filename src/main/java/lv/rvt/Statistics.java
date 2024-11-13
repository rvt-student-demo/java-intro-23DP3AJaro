package lv.rvt;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variables count and sum here
    }

    public void addNumber(int number) {
        sum = sum + number;
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return (double)sum/count;
    }
}
