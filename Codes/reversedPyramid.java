import java.util.Scanner;

public class reversedPyramid {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ters piramit büyüklüğünü giriniz: ");
        int height = input.nextInt();

        for (int i = height; i > 0; i--) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}