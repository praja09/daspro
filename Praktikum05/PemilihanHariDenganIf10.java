import java.util.Scanner;

public class PemilihanHariDenganIf10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int pemilihanHari;

        System.out.print("Masukkan jumlah hari: ");
        pemilihanHari = input10.nextInt();

        if (pemilihanHari == 1 || pemilihanHari == 2 || pemilihanHari == 3 || pemilihanHari == 4 || pemilihanHari ==5) {
            System.out.println("Weekday");
        } else if (pemilihanHari == 6 || pemilihanHari == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number!");
        }
        input10.close();
    }
}

