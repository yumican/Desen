import java.util.Scanner;

public class Desen {

    static void desen(int sayi1, int temp, boolean baseCase) {
        System.out.println(temp + "");
        if (!baseCase && sayi1 == temp) return;

        if (baseCase) {
            desen(sayi1, temp - 5, temp - 5 > 0);
        } else {
            desen(sayi1, temp + 5, false);
        }
    }
    public static void main(String[]args){
    Scanner keyboard = new Scanner (System.in);


    System.out.print("N sayısı: ");
    int sayi = keyboard.nextInt();


    System.out.println("Çıktısı: " + sayi);
        desen(sayi,sayi,true );

    }
}
