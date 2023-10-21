import java.util.Scanner;
public class KasirApotek10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int kuantitas;
    String namaObat;
    double harga, totalHarga;

    System.out.println("nama obat : ");
    namaObat = sc.nextLine();
    System.out.println("kuantitas : ");
    kuantitas = sc.nextInt();
    System.out.println("Harga : ");
    harga = sc.nextDouble();
    
    totalHarga = harga*kuantitas;

    if (totalHarga >=50000) {
    totalHarga = totalHarga-5000;

    } else {}
    
    System.out.println("nama obat : " + namaObat);
    System.out.print("total harga : " + totalHarga);
    sc.close();
    }
}
