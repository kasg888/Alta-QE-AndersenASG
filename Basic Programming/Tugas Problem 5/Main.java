import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kal = "";
        String kalbal = "";
        System.out.println("Palindrome or no Palindrome");
        System.out.println("Mari Kita Cek Palindrome-mu : ");
        kal = input.nextLine();
        char[] arr = kal.toCharArray();
        System.out.println(palindrome(kal, kalbal, arr));
        if (palindrome(kal, kalbal, arr)){
            System.out.println(kal + " adalah PALINDROME");
        } else {
            System.out.println(kal + " Bukan PALINDROME");
        }
    }

    private static boolean palindrome(String kal, String kalbal, char[] arr){
        for (int i=arr.length-1; i>=0; i--){
            kalbal = kalbal + arr[i];
        }
        if (kal.equals(kalbal)){
            return true;
        } else {
            return false;
        }
    }
}