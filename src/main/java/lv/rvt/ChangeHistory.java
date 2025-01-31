package lv.rvt;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> records;

    public ChangeHistory(){
        this.records = new ArrayList<>();
    }

    public void add(double status){
        this.records.add(status);
    }

    public void clear(){
        records.clear();
    }

    public double maxValue(){
        if (records.size() == 0) {
            return 0;
        } else {
           return Collections.max(records); 
        }
    }

    public double minValue(){
        if (records.size() == 0) {
            return 0;
        } else {
            return Collections.min(records);
        }
    }

    public double average(){
        if (records.size() == 0) {
            return 0;
        } else {
            double sum = 0;
            for (int i = 0; i < records.size(); i = i + 1) {
                sum = sum + records.get(i);
            }
            return sum / records.size();
        }
    }

    @Override
    public String toString(){
        return records.toString();
    }
}
