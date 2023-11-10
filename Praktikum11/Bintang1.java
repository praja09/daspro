package Praktikum11;

public class Bintang1 {
        public static void main(String[] args) {
            int [][] a = new int[10][];
    
            for (int i = 0; i < a.length; i++) {
                for (int j = 10; j > i; j--) {
                    System.out.print("*");
                }
                System.out.println();   
            }
        }
    }