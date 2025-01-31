package lv.rvt;

public class Student extends Person {
    private int credits = 0;

    public Student(String name, String address) {
        super(name, address);
    }

    public String credits(){
        return "Study credits " + this.credits;
    }

    public void study() {
        credits = credits + 1;
    }

    @Override
    public String toString(){
        return "Student: " + super.toString() + "\n\tStudy credits " + this.credits;
    }
}
