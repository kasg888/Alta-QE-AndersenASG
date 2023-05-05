import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ongkir 5000/kg
//        ongkir 5000/50cm3

        Scanner in = new Scanner(System.in);
        float harga;
        System.out.println("Masukkan Ukuran & Berat Barang");
        System.out.print("Panjang : ");
        float panjang = in.nextInt();
        System.out.print("Lebar : ");
        float lebar = in.nextInt();
        System.out.print("Tinggi : ");
        float tinggi = in.nextInt();
        System.out.print("Berat (kg) : ");
        float berat = in.nextInt();

        float dimensi = panjang*lebar*tinggi;

        if (berat <= 1)
            harga = 5000;
        else {
            berat = 0;
            harga = (5000 + (berat*5000));
        }
        if (dimensi <= 50)
            harga = harga;
        else {
            dimensi = 0;
            harga = harga + (5000 + dimensi*100);
        }

        System.out.println("Total Ongkir = " +harga);
    }
}