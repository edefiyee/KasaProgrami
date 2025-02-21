package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ÖDEV2
        Scanner scanner = new Scanner(System.in);
        int kek = 10, su = 3, cips = 40;
        int toplamTutar = 0;
        String kupon = "indr";
        boolean anahtar = true;

        System.out.println("HOŞGELDİNİZ...");
        System.out.println("**************************");

        while (anahtar) {
            System.out.println("Seçiminizi yapın: ");
            System.out.println("0 - Alışveriş Bitir\n" +
                    "1 - Kek: " + kek + " TL\n" +
                    "2 - Su: " + su + " TL\n" +
                    "3 - Cips: " + cips + " TL");

            if (!scanner.hasNextInt()) {
                System.out.println("Geçerli bir seçim giriniz!");
                scanner.next();
                continue;
            }

            int secim = scanner.nextInt();

            switch (secim) {
                case 0:
                    System.out.println("İndirim Kuponunuz Varsa Giriniz (Yoksa 'yok' yazın): ");
                    String kuponCevap = scanner.next();

                    if (kuponCevap.equalsIgnoreCase(kupon)) {
                        double indirim = toplamTutar * 0.10;
                        toplamTutar -= indirim;
                        System.out.println("İndirim Uygulandı!");
                    }

                    System.out.println("Alışverişiniz Tamamlandı");
                    System.out.println("Toplam tutar: " + toplamTutar + " TL");
                    anahtar = false;
                    break;
                case 1:
                    toplamTutar += kek;
                    System.out.println("Toplam tutar: " + toplamTutar + " TL");
                    break;
                case 2:
                    toplamTutar += su;
                    System.out.println("Toplam tutar: " + toplamTutar + " TL");
                    break;
                case 3:
                    toplamTutar += cips;
                    System.out.println("Toplam tutar: " + toplamTutar + " TL");
                    break;
                default:
                    System.out.println("Geçersiz değer girdiniz :(");
            }
        }
    }
}
