package Ex_01_Java_Basic;

public class Lab003_Comments {
    public static void main(String[] args) {
        printTableOf2();
    }

    // Function to print the multiplication table of 2 till 10
    public static void printTableOf2() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }
    }
} 