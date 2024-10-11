package lv.rvt;

public class Stars 
{

    public static void printStars(int number) {
        for (int i = 0; i <= number; i = i + 1) {
            System.out.print("*");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }

}
