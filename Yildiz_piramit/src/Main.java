import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, temp=0;

        System.out.print("Kaç basamaklı olsun? -->");

        Scanner girdi = new Scanner(System.in);
        sayi = girdi.nextInt();
        temp = sayi;

        for (int i = 1; i < sayi + 1; i++) {
            for (int k = 0; k < temp-1; k++) {
                System.out.print(" ");
            }
            temp--;
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}