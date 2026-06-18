import java.util.Scanner;

public class engNormalPyramid {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the height of the pyramid: ");
        int height = input.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}