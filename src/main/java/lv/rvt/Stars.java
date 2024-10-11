package lv.rvt;

public class Stars 
{

    public static void printStars(int number) {
        for (int i = 0; i < number; i = i + 1) {
            System.out.print("*");
        }
        System.out.println();

    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i = i + 1) {
            printStars(size);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printSquare(4);
        
    }

}
