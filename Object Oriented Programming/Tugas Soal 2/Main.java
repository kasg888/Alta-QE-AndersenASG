import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        KUBUS
        System.out.println("Volume Kubus");
        System.out.println("Masukkan Sisi Kubus : ");
        System.out.print("Sisi : ");
        float sisi = in.nextFloat();
        Kubus kubus = new Kubus(sisi);
        System.out.println("Volume Kubus = " +kubus.volume()+'\n');

//        BALOK
        System.out.println("Volume Balok");
        System.out.println("Masukkan Panjang, Lebar, & Tinggi Balok : ");
        System.out.print("Panjang : ");
        float panjang = in.nextFloat();
        System.out.print("Lebar : ");
        float lebar = in.nextFloat();
        System.out.print("Tinggi : ");
        float tinggi = in.nextFloat();
        Balok balok = new Balok(panjang, lebar, tinggi);
        System.out.println("Volume Balok = " +balok.volume()+'\n');

//        TABUNG
        System.out.println("Volume Tabung");
        System.out.println("Masukkan Jari - Jari & Tinggi Tabung : ");
        System.out.print("Jari - Jari : ");
        int jari = in.nextInt();
        System.out.print("Tinggi : ");
        int tinggit = in.nextInt();
        Tabung tabung = new Tabung(jari, tinggit);
        System.out.println("Volume Tabung = " +tabung.volume()+ "("+Math.round(tabung.volume())+")");
    }
}