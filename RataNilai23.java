import java.util.Scanner;

public class RataNilai23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, j;
        float nilai, totalNilai, rataNilai;

        for (i = 1; i <= 5; i++) {
            totalNilai = 0;
            System.out.println("Input Nilai Mahasiswa Ke: " +i);
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai Ke: " + j + " = ");
                nilai = input.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata Rata Nilai: " +rataNilai);
        }
    }
}
