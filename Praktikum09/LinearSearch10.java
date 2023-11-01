import java.util.Scanner;

public class LinearSearch10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key;
        int hasil = -1;

        System.out.print(" Masukkan jumlah elemen array : ");
        int jumlahElemen = input.nextInt();
        
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" +i+ " : ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        key = input.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil == -1) {
            System.out.println("key tidak ditemukan");
        }
    }
}
