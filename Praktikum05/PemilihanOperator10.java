import java.util.Scanner;

public class PemilihanOperator10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int angka1 = 0, angka2 = 0;
        char operator;
        double total = 0;

        System.out.print("Masukkan angka 1: ");
        angka1 = input10.nextInt();
        System.out.print("Masukkan angka 2: ");
        angka2 = input10.nextInt();
        System.out.print("Masukkan operator (+ - * :): ");
        operator = input10.next().charAt(0);

        // if (angka1 < 30) {
        //     System.out.println("C");
        // }
        // if (angka1 < 50) {
        //     System.out.println("B");
        // }

        if (operator == '+') {
            total = angka1 + angka2;
        } else if(operator == '-') {
            total = angka1 - angka2;
        } else if (operator == '*') {
            total = angka1 * angka2;
        } else if (operator == ':') {
            total = angka1 / angka2;
        } else {
            System.out.println("Masukkan operator yang benar");
        }

        System.out.println("Hasilnya adalah: " + total);
        input10.close();
    }
}
