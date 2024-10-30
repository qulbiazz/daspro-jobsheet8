import java.util.Scanner;

public class square23 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        // for(int i = 1; i<=n; i++){
        //     System.out.print(i+1);
        // }
        // System.out.println();
        for(int iOuter = 1; iOuter <= n; iOuter++){
            for(int i = 0; i<=n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
