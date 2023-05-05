import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Tabel XYZ");
        System.out.print("Masukkan Jumlah Baris & Kolom yang Diinginkan : ");
        angka = input.nextInt();
        XYZ(angka);
    }
    private static void XYZ(int angka){
        for (int x = 1; x<=angka; x++){
            for (int y=0; y<angka; y++){
                if ((x+y) % 2 == 0){
                    System.out.print("Z ");
                } else if ((x+y) % 3 == 0){
                    System.out.print("X ");
                } else {
                    System.out.print("Y ");
                }
            }
            System.out.println();
        }
    }
}