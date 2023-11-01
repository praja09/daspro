import java.util.Scanner;

public class TarifTolPandaanMalang {
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
                tarif = getTarifPurwodadi(golongan);
            } else if (tujuan.equalsIgnoreCase("Lawang")) {
                tarif = getTarifLawang(golongan);
            } else {
                System.out.println("Tujuan tidak terdaftar");
                continue;
            }
            
            if (golongan == 1) {
                System.out.print("Apakah kendaraan dinas? (y/n): ");
                String isDinas = input.next();
                if (isDinas.equalsIgnoreCase("y")) {
                    tarif *= 1.3;
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
    
    // Fungsi untuk mendapatkan tarif Purwodadi berdasarkan golongan
    private static double getTarifPurwodadi(int golongan) {
        switch (golongan) {
            case 1:
                return 14000;
            case 2:
            case 3:
                return 21000;
            case 4:
            case 5:
                return 28000;
            default:
                return 0; // Golongan tidak valid
        }
    }
    
    // Fungsi untuk mendapatkan tarif Lawang berdasarkan golongan
    private static double getTarifLawang(int golongan) {
        switch (golongan) {
            case 1:
                return 21000;
            case 2:
            case 3:
                return 31500;
            case 4:
            case 5:
                return 42500;
            default:
                return 0; // Golongan tidak valid
 }
}
}