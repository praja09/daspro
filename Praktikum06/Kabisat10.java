import java.util.Scanner;
public class Kabisat10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int tahun;

    System.out.print("Masukkan tahun : ");
    tahun = sc.nextInt();

    if ((tahun %4) == 0 && (tahun %100) != 0 || (tahun %400) == 0) {
    System.out.print("adalah tahun kabisat");

    } else {
    System.out.print("adalah Bukan Tahun Kabisat");

    } sc.close();
    }
}