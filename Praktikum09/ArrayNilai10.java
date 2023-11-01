import java.util.Scanner;

public class ArrayNilai10 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] nilaiAkhir =  new int[10];
    int totalNilai = 0;
    int nilaiTertinggi = 0;
    int nilaiTerendah = 100;
    
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.println("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ":");
        nilaiAkhir[i] = sc.nextInt();
        totalNilai += nilaiAkhir[i];
     
     
    // nilai tertinggi nilai terendah 

     if (nilaiAkhir[i] > nilaiTertinggi){
        nilaiTertinggi = nilaiAkhir[i];
     }
     if (nilaiAkhir[i] < nilaiTerendah){
        nilaiTerendah = nilaiAkhir[i];
     }

    }

    double nilaiRatarata = totalNilai / nilaiAkhir.length;
     int jumlahLulus = 0;
     int jumlahTidakLulus = 0;

    for (int i = 0; i < 10; i++) {
        if (nilaiAkhir[i] > 70){
             System.out.println("Mahasiswa ke-" + (i+1) + " lulus ");
             jumlahLulus++;
        }
        if (nilaiAkhir[i] < 70) {
            System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus ");
            jumlahTidakLulus++;
        }
        }

        System.out.println("Nilai Rata-Rata : " + nilaiRatarata);
        System.out.println("Nilai Terendah : " + nilaiTerendah);
        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Jumlah Mahasiswa Yang Lulus : " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus : " + jumlahTidakLulus);
}
}