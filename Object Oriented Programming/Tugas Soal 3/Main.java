import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka1;
        int angka2;
        String confirm;
        String fungsi;

        do {

            System.out.println("Silahkan Pilih Fungsi Kalkulator\n" +
                    "(TAMBAH/KURANG/KALI/BAGI)");
            fungsi = in.next();

            System.out.println("Masukkan Angka");
            System.out.print("Angka Pertama = ");
            angka1 = in.nextInt();
            System.out.print("Angka Kedua = ");
            angka2 = in.nextInt();

            switch (fungsi.toUpperCase()) {
                case "TAMBAH" :
                    Tambah tambah = new Tambah(angka1, angka2);
                    tambah.rtambah();
                    break;
                case "KURANG" :
                    Kurang kurang = new Kurang(angka1, angka2);
                    kurang.rkurang();
                    break;
                case "KALI" :
                    Kali kali = new Kali(angka1, angka2);
                    kali.rkali();
                    break;
                case "BAGI" :
                    Bagi bagi = new Bagi(angka1, angka2);
                    bagi.rbagi();
                    break;
                default:
                    System.out.println("Fungsi Tidak Tersedia!");
                    break;
            }
                System.out.println("Apakah Anda Ingin Memilih Fungsi Lain ? (Ya/Tidak)");
                confirm = in.next();
        } while (confirm.equalsIgnoreCase("Ya"));
    }
}