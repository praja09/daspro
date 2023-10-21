import java.util.Scanner;

public class ForKelipatan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int bilangan, total, counter ;
        double rataRata;
        total = 0;
        counter = 0;

        System.out.print("Masukkan bilangan 1-9: ");
        bilangan = input.nextInt();

        for (int i = 0; i < 50; ++i) {
            if (i % bilangan == 0) {
                total += i;
                ++counter;
            }
        }
        if (counter > 0) {
            rataRata = (double) total / counter;
            System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", bilangan,counter);
            System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", bilangan, total);
            System.out.printf("rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", bilangan, rataRata);
        }
        System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);
    }
}