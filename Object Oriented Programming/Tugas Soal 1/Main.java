import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        SEGITIGA
        System.out.println("Luas & Keliling Segitiga");
        System.out.println("Masukkan Alas & Tinggi Segitiga : ");
        System.out.print("Alas : ");
        double alas = in.nextDouble();
        System.out.print("Tinggi : ");
        double tinggi = in.nextDouble();
        Segitiga segitiga = new Segitiga(alas, tinggi);
        System.out.println("Luas Segitiga = " +segitiga.luas());
        System.out.println("Keliling Segitiga = " +segitiga.keliling()+'\n');

//        PERSEGI
        System.out.println("Luas & Keliling Persegi");
        System.out.println("Masukkan Sisi Persegi : ");
        System.out.print("Sisi : ");
        float sisi = in.nextFloat();
        Persegi persegi = new Persegi(sisi);
        System.out.println("Luas Persegi = " +persegi.luas());
        System.out.println("Keliling Persegi = " +persegi.keliling()+'\n');

//        PERSEGI PANJANG
        System.out.println("Luas & Keliling Persegi Panjang");
        System.out.println("Masukkan Panjang & Lebar Persegi Panjang : ");
        System.out.print("Panjang : ");
        float panjang = in.nextFloat();
        System.out.print("Lebar : ");
        float lebar = in.nextFloat();
        PersegiP persegiP = new PersegiP(panjang, lebar);
        System.out.println("Luas Persegi Panjang = " +persegiP.luas());
        System.out.println("Keliling Persegi = " +persegiP.keliling());
    }
}