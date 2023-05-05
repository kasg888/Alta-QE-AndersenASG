import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Alat Pembukti Bilangan Prima");
        System.out.print("Masukkan Bilangan : ");
        angka = input.nextInt();
        System.out.println(prima(angka));
        if (prima(angka)) {
            System.out.println(angka + " adalah Bilangan Prima");
        } else {
            System.out.println(angka + " bukan Bilangan Prima");
        }
    }

    private static boolean prima(int angka){
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i < angka; i++){
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}