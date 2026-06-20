import java.util.Scanner;

public class trInvertedPyramid {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Piramit hangi karakterle oluşturulsun: ");
        char choice = input.next().charAt(0);

        System.out.println("Ters piramit büyüklüğünü giriniz: ");
        int height = input.nextInt();

        for (int i = height; i > 0; i--) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2*i-1; k++) {
                System.out.print(choice);
            }
            System.out.println();
        }
    }
}