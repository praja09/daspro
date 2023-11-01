import java.util.Scanner;

public class Tarif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tujuan;
        String jenisKendaraan;
        
        do {
            System.out.print("Tujuan: ");
            tujuan = input.nextLine();
            
            System.out.print("Jenis kendaraan: ");
            jenisKendaraan = input.nextLine();
            
            int golongan;
            
            if (jenisKendaraan.equalsIgnoreCase("mobil") || jenisKendaraan.equalsIgnoreCase("bus")) {
                golongan = 1;
            } else if (jenisKendaraan.equalsIgnoreCase("truk")) {
                int jumlahGandar;
                do {
                    System.out.print("Jumlah gandar: ");
                    jumlahGandar = input.nextInt();
                } while (jumlahGandar < 2 || jumlahGandar > 5);
                golongan = jumlahGandar + 1;
            } else {
                System.out.println("Maaf, jenis kendaraan tidak terdaftar");
                continue;
            }
            
            double tarif;
            
            if (tujuan.equalsIgnoreCase("Purwodadi")) {
                if (golongan == 1) {
                    tarif = 14000;
                } else if (golongan == 2) {
                    tarif = 21000;
                } else if (golongan == 3) {
                    tarif = 21000;
                } else if (golongan == 4) {
                    tarif = 28000;
                } else {
                    tarif = 28000;
                }
            } else if (tujuan.equalsIgnoreCase("Lawang")) {
                if (golongan == 1) {
                    tarif = 21000;
                } else if (golongan == 2) {
                    tarif = 31500;
                } else if (golongan == 3) {
                    tarif = 31500;
                } else if (golongan == 4) {
                    tarif = 42500;
                } else {
                    tarif = 42500;
                }
            } else {
                System.out.println("Tujuan tidak terdaftar");
                continue;
            }
            
            if (golongan == 1) {
                System.out.print("Apakah kendaraan dinas? (y/n): ");
                String isDinas = input.next();
                if (isDinas.equalsIgnoreCase("y")) {
                    tarif = tarif * 1.3;
                }
            }
            
            System.out.println("Tarif: " + tarif);
            
            System.out.print("Cek tarif kendaraan lainnya? (y/n): ");
            String lanjut = input.next();
            
            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }
            
            input.nextLine(); // Membersihkan newline
        } while (true);
        
        System.out.println("Terima kasih!");
}
}

