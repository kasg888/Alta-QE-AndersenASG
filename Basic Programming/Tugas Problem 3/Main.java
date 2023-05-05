import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int angka = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masin Pencari Faktor Bilangan");
        System.out.print("Masukkan Bilangan : ");
        angka = input.nextInt();
        for (i = 1; i<=angka; i++) {
            if (angka % i == 0) {
                System.out.println(i+"");
            }
        }
    }
}