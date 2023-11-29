// import java.util.Scanner;

// public class BioskopWithScanner10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int baris;
//         int kolom;
//         String nama;
//         String next;

//         String[][] penonton = new String[4][2];
//         while (true) {
//             System.out.print("Masukkan nama: ");
//             nama = sc.nextLine();
//             System.out.print("Masukkan baris: ");
//             baris = sc.nextInt();
//             System.out.print("Masukkan kolom: ");
//             kolom = sc.nextInt();
//             sc.nextLine();

//             penonton[baris-1][kolom-1] = nama;

//             System.out.print("Input penonton lainnya? (y/n): ");
//             next = sc.nextLine();

//             if (next.equalsIgnoreCase("n")) {
//                 break;
//             }
//         }
//     }
// }



// yang ini jawaban percobaan 2 nomor 2

// import java.util.Scanner;
// public class BioskopWithScanner10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int baris, kolom, choice;
//         String nama, next;
//         String[][] penonton = new String[4][2];

//     while (true) {
//         System.out.println("+++++++++++++++++++++++++===");
//         System.out.println("Selamat Datang Di Bioskop 1D");
//         System.out.println("+++++++++++++++++++++++++===");
//         System.out.println("- Menu 1 : Input Data Penonton");
//         System.out.println("- Menu 2 : Tampilan Daftar Penonton");
//         System.out.println("- Menu 3 : Exit");
//         System.out.println("+++++++++++++++++++++++++===");
//         System.out.println("Masukkan Pilihan Anda : ");
//         choice = sc.nextInt();
//         sc.nextLine(); // Consume the newLine character


//         switch (choice) {
//             case 1:
//                 System.out.println("Masukkan nama: ");
//                 nama = sc.nextLine();
//                 System.out.println("Masukkan baris: ");
//                 baris = sc.nextInt();
//                 System.out.println("Masukkan kolom: ");
//                 kolom = sc.nextInt();
//                 sc.nextLine();

//                  penonton[baris-1][kolom-1] = nama;
//                 break;

//             case 2:
//             System.out.println("Daftar Penonton: ");
//             for (int i = 0; i < 4; i++) {
//                 for (int j = 0; j < 2; j++) {
//                     if (penonton[i][j] != null) {
//                         System.out.println("Baris " + (i + 1) + ", kolom " + (j + 1) + ": " + penonton[i][j]);
//                     }
//                 }
//             } 
//             break;

//             case 3:
//                 System.out.println("Terima Kasih!");
//             return; // Exit the program
            
//             default:
//                 System.out.println("Menu tidak valid. silahkan pilih menu yang benar. ");
//         }

//         System.out.print("kembali ke menu? (y/n) : ");
//         next = sc.nextLine();

//         if (next.equalsIgnoreCase("n")) {
//             break;
//         }
//         }
//     }
// }


// yang ini jawaban percobaan 2 nomor 3
import java.util.Scanner;
public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];
        boolean exit = false;


    while (!exit) {
        System.out.println("Menu:");
        System.out.println("1. Input Data Penonton");
        System.out.println("2. Tampilkan daftar Penonton");
        System.out.println("3. Exit");
        System.out.println("Menu: ");
        int pilihan = sc.nextInt();
        sc.nextLine();

    switch (pilihan) {
        case 1:
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan baris: ");
        baris = sc.nextInt();
        System.out.println("Masukkan kolom: ");
        kolom = sc.nextInt();
        sc.nextLine();

        if (baris >= 1 && baris <= 4 && kolom >= 1&& kolom <= 2) {
            if (penonton[baris - 1][kolom - 1] == null) {
                penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data penonton berhasil diinput. ");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Kursi sudah terisi!!!");
            }
        } else {
            System.out.println("Baris atau kolom tidak tersedia. Harap masukkan nilai yang benar. ");
        }
        break;

            case 2:
            System.out.println();
            System.out.println("Daftar penonton: ");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 2; j++) {
                    if (penonton[i][j] != null) {
                        System.out.println("Baris " + (i + 1) + ", kolom " + (j + i) + ": " + penonton[i][j]);
                    }
                }
            }
            break;

            case 3:
            exit = true;
            System.out.println("Terima kasih!");
            break;

            default:
                System.out.println("Menu tidak valid. Harap pilih menu yang sesuai.");
    }
    }
}
}