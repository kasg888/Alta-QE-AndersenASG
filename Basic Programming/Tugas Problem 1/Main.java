import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        luas segitiga = a * t / 2

        System.out.println("Kalkulator penghitung luas segitiga");
        Scanner input = new Scanner(System.in);
        System.out.print("Input Alas Segitiga : ");
        float alas = input.nextFloat();
        System.out.print("Input Tinggi Segitiga : ");
        float tinggi = input.nextFloat();
        System.out.println("Luas Segitiga : " + (alas * tinggi / 2));
    }
}