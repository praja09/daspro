import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String buku;
        int jumlahbuku;
        double diskon;
        System.out.print("Masukkan jenis buku: ");
        buku =  input.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahbuku =  input.nextInt();
        if (buku.equalsIgnoreCase("kamus")) {
            if (jumlahbuku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.1;
            }
        } else if (buku.equalsIgnoreCase("novel")) {
            if (jumlahbuku > 3) {
                diskon = 0.09;
            } else if (jumlahbuku <= 3) {
                diskon = 0.08;
            } else {
                diskon = 0.07;
            }
        } else {
            if (jumlahbuku > 3) {
                diskon = 0.05;
            } else {
                diskon = 0;
            }
        }
    }
}