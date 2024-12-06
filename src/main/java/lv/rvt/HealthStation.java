package lv.rvt;

public class HealthStation {
    int count = 0;

    public int weigh(Person person) {
        count = count + 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        
        return count;
    }
}
