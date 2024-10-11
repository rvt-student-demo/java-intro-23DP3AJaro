package lv.rvt;

public class Stars 
{

    public static void printStars(int number) {
        for (int i = 0; i < number; i = i + 1) {
            System.out.print("*");
        }
        System.out.println();

    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i = i + 1) {
            printStars(width);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printRectangle(17, 3);
        
    }

}
