import java.util.Arrays;
import java.util.Scanner;

public class Numbers10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] myNumbers =  new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // for (int i = 0; i < myNumbers.length; i++) {
        //     System.out.println(Arrays.toString(myNumbers[i]));
        // }

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
        }
    }
}


// contoh aja ini
// int[] data = { 6, 5, 3, 1, 8, 7, 2, 4 };

// for (int i = 0; i < data.length; i++) {
//     for (int j = 0; j < data.length - i - 1; j++) {
//         if (data[j] > data[j + 1]) {
//             int temp = data[j];
//             data[j] = data[j + 1];
//             data[j + 1] = temp;
//         }
//     }
// }

// for (int dt : data) {
//     System.out.print(dt + "");
// }