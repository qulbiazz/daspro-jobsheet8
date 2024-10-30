import java.util.Scanner;

public class triangle23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;

        System.out.print("Masukkan nilai N = ");
        int n = input.nextInt();

        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
