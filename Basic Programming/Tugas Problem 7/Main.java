import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kalkulator Rata - Rata");
        System.out.print("Masukkan berapa banyak angkanya : ");
        int bangka = input.nextInt();
        float[] arr = new float[bangka];

        System.out.println("Masukkan semua angka yang akan dihitung : ");
        for (int i = 0; i < bangka; i++) {
            float angka = input.nextFloat();
            arr[i] = angka;
        }
        System.out.println("Hasil Rata - Rata : " +mean(arr));
    }

    private static float mean(float[] arr){
        int panjang = arr.length;
        float total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / panjang;
    }
}