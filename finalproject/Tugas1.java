import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan 1: ");
        int bil1 =  input.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        int bil2 =  input.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        int bil3 =  input.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan 1 terbesar.");
            } else {
                System.out.println("Bilangan 3 terbesar.");
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan 2 terbesar.");
            } else {
                System.out.println("Bilangan 3 terbesar.");
            }
        }
    }    
}