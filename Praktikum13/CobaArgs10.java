package Praktikum13;

public class CobaArgs10 {
    public static void main(String[] args) {
        System.out.println("Hai " + args[0]);
        System.out.println("Selamat datang di " + args[1]);
    
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
