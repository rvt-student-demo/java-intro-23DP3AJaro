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

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i = i + 1) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i = i + 1) {
            printSpaces(size-i);
            printStars(i+1);
        }
         
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i = i + 1) {
            System.out.print(" ");
        }
    }

    public static void christmasTree(int height) {
        int number = 1;
        for (int i = 0; i < height; i = i + 1) {
            printSpaces(height-i);
            printStars(number);
            number = number + 2;
        }
        for (int i = 0; i < 2; i = i + 1) {
            printSpaces(number-(height+2));
            printStars(3);
        }

    }

    public static void main(String[] args) {
        
        christmasTree(4);
    }

}
