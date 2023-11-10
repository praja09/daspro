import java.util.Scanner;

public class PemilihanBilangan10{
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input10.nextInt();

        String hasil;
        hasil = (angka > 0.0 ) ? "Bilangan Positif" : "Bilangan Negatif";
        System.out.println(angka+ " adalah " + hasil );
        
        input10.close();
    }
}