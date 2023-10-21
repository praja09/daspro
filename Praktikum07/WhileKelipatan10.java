import java.util.Scanner;

public class WhileKelipatan10 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        int bilangan, total, counter;
        double rataRata ;
        total = 0;
        counter = 0;

            System.out.print("Masukkan bilangan 1-9: ");
            bilangan = input.nextInt();
            
            int i=1;
            while (i <= 50) {
                if(i% bilangan == 0) {
                total += i;
                counter++;
              }
            i++;
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", bilangan,counter);
        System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", bilangan, total);
    }
}
