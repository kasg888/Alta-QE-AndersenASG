import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        nilai 80 - 100 = A
//        nilai 65 - 79 = B+
//        nilai 50 - 64 = B
//        nilai 35 - 49 = C
//        nilai 0 - 34 = D
//        else = invalid

        int nilai = 0;
        String hasil = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        nilai = input.nextInt();
        if (nilai <= 100 && nilai > 79) {
            hasil = "Nilai A";
        } else if (nilai < 80 && nilai > 64) {
            hasil = "Nilai B+";
        } else if (nilai < 65 && nilai > 49) {
            hasil = "Nilai B";
        } else if (nilai < 50 && nilai > 34) {
            hasil = "Nilai C";
        } else if (nilai < 35 && nilai >= 0) {
            hasil = "Nilai D";
        } else {
            hasil = "INVALID";
        }

        System.out.println(hasil);
    }
}
