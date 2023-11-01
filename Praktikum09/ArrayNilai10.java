import java.util.Scanner;

public class ArrayNilai10 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir mahasiswa ke-" + (i+1) + " adalah " + nilaiAkhir[i] );
        }
    }
}
