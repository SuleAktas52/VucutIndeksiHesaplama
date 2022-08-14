package deneme;

import java.util.Scanner;

public class VucutIndeksiHesaplama {
    public static void main(String[] args) {

        double kilo, boy;

        Scanner input= new Scanner(System.in);

        System.out.print("Kilonuzu(kg cinsinden) Giriniz: ");
        kilo=input.nextDouble();

        System.out.print("Boyunuzu(metre cinsinden) Giriniz: ");
        boy=input.nextDouble();

        double indeks= kilo/(boy*boy);

        System.out.println("Vucut indeksiniz: " + indeks);
    }
}
