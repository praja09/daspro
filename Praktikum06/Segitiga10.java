import java.util.Scanner;

public class Segitiga10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int sudut1, sudut2, sudut3,totalSudut ;
    System.out.println("Masukkan sudut");
    sudut1 = sc.nextInt();
    sudut2 = sc.nextInt();
    sudut3 = sc.nextInt();
    totalSudut = sudut1 + sudut2 + sudut3;

    if (totalSudut == 180) {
        if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60))
                    System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else
                if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else {
                System.out.println("Segitiga sembarang");
            }
    } else
        System.out.println("Bukan Segitiga");
        sc.close();
    }
    
}
