package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        phoneCollection telefon = new phoneCollection("Telefonok", new PhoneOne(75000, "2310 x 1080px", "Kirin 810", 2020, 6, "Huawei P40 Lite"),
                new phoneTwo(402190, "3040 x 1440 px", "Exynos 9825", 2020, 12, "Samsung Galaxy Note10+ 512GB Dual"),
                new phoneThree(144290, "2224 x 1080 px", "Kirin 970", 2018, 6, "Huawei P20 Pro Dual"));
        //A felhasználónak lesz egy randoman meghatározott pénz összege...
        Random penz = new Random();
        int money = penz.nextInt(75000, 500000);
        System.out.println("Üdvözöljük kedves vásárló!");
        System.out.println("Jelenlegi pénzed: " + money);
        Scanner scanner = new Scanner(System.in);
        boolean isOn = true;
        System.out.println("Mai napon 3 ajánlatunk van!");
        System.out.println("1. Huawei P40 Lite");
        System.out.println("2. Samsung Galaxy Note10+");
        System.out.println("3. Huawei P20 Pro");
        System.out.println("4. Kilépés ");
        System.out.println("Melyik keltette fel érdeklődését?");
        try {
            while (isOn) {
                System.out.printf("> Írja be azt a sorszámot!: ");
                int answer = scanner.nextInt();
                if (answer == 1) { //Szokásos duma amivel megpróbálnak rávenni. A progam miatt kell
                    System.out.println("Bemutatjuk a " + telefon.getOnePhone().getName() + " Telefont!, ami " + telefon.getOnePhone().getYear() + " évjáratú!");
                    System.out.println("Kedvező " + telefon.getOnePhone().getPrice() + " forintos ára miatt, ez a legjobb ár/értékű telefonunk jelenleg!");
                    System.out.println("Korszerű " + telefon.getOnePhone().getResolution() + " Felbontásnak köszönhetően élvezheti a szép éles képet!");
                    System.out.println(telefon.getOnePhone().getChipset() + " Chipsetnek köszönhetően megfelel a mai standardnak! Emellé még " + telefon.getOnePhone().getMemory() + "GB Memóriát kap mellé.");
                    System.out.printf("Megvásárolja a telefont? 1 = igen, 2 = nem: ");
                    answer = scanner.nextInt();
                    if (answer == 1 && money >= telefon.getOnePhone().getPrice()) {
                        System.out.println("Köszönjük a vásárlást!");
                        System.exit(0);
                    }
                    if (answer == 1 && money < telefon.getOnePhone().getPrice()) {
                        System.out.println("Nem elegendő pénz a megvásárláshoz!");
                        System.exit(0);
                    }
                    if (answer == 2) {
                        System.out.println("Most adunk mellé 5x whiskast! Nem gondolta meg magát? ");
                        System.out.printf("1 = Igen, 2 = Nem: ");
                        answer = scanner.nextInt();
                        if (answer == 1 && money >= telefon.getOnePhone().getPrice()) {
                            System.out.println("Köszönjük a vásárlást!");
                            System.out.println("Itt van az 5x whiskas!");
                            System.exit(0);
                        }
                        if (answer == 1 && money < telefon.getOnePhone().getPrice()) {
                            System.out.println("Nem elegendő pénz a megvásárláshoz!");
                            System.exit(0);
                        }
                        if(answer == 2){
                            System.out.println("Viszontlásra.");
                            System.exit(0);
                        }
                    }
                    if(answer != 1 || answer !=2){
                        System.out.println("Nincs ilyen opció");
                        System.exit(0);
                    }
                }
                if (answer == 2) {
                    System.out.println("Bemutatjuk a " + telefon.getTwoPhone().getName() + " Telefont!, ami " + telefon.getTwoPhone().getYear() + " évjáratú!");
                    System.out.println("Kedvező " + telefon.getTwoPhone().getPrice() + " forintos ára miatt, ez a legjobb ár/értékű telefonunk jelenleg!");
                    System.out.println("Korszerű " + telefon.getTwoPhone().getResolution() + " Felbontásnak köszönhetően élvezheti a szép éles képet!");
                    System.out.println(telefon.getTwoPhone().getChipset() + " Chipsetnek köszönhetően megfelel a mai standardnak! Emellé még " + telefon.getTwoPhone().getMemory() + "GB Memóriát kap mellé.");
                    System.out.printf("Megvásárolja a telefont? 1 = igen, 2 = nem: ");
                    answer = scanner.nextInt();
                    if (answer == 1 && money >= telefon.getTwoPhone().getPrice()) {
                        System.out.println("Köszönjük a vásárlást!");
                        System.exit(0);
                    }
                    if (answer == 1 && money < telefon.getTwoPhone().getPrice()) {
                        System.out.println("Nem elegendő pénz a megvásárláshoz!");
                        System.exit(0);
                    }
                    if (answer == 2) {
                        System.out.println("Most adunk mellé 5x whiskast! Nem gondolta meg magát? ");
                        System.out.printf("1 = Igen, 2 = Nem: ");
                        answer = scanner.nextInt();
                        if (answer == 1 && money >= telefon.getTwoPhone().getPrice()) {
                            System.out.println("Köszönjük a vásárlást!");
                            System.out.println("Itt van az 5x whiskas!");
                            System.exit(0);
                        }
                        if (answer == 1 && money < telefon.getTwoPhone().getPrice()) {
                            System.out.println("Nem elegendő pénz a megvásárláshoz!");
                            System.exit(0);
                        }
                        if(answer == 2){
                            System.out.println("Viszontlásra.");
                            System.exit(0);
                        }
                    }
                    if(answer != 1 || answer !=2){
                        System.out.println("Nincs ilyen opció");
                        System.exit(0);
                    }
                }
                if (answer == 3) { //Igen, mindenhol ugyanazt mondják. :D
                    System.out.println("Bemutatjuk a " + telefon.getThreePhone().getName() + " Telefont!, ami " + telefon.getThreePhone().getYear() + " évjáratú!");
                    System.out.println("Kedvező " + telefon.getThreePhone().getPrice() + " forintos ára miatt, ez a legjobb ár/értékű telefonunk jelenleg!");
                    System.out.println("Korszerű " + telefon.getThreePhone().getResolution() + " Felbontásnak köszönhetően élvezheti a szép éles képet!");
                    System.out.println(telefon.getThreePhone().getChipset() + " Chipsetnek köszönhetően megfelel a mai standardnak! Emellé még " + telefon.getThreePhone().getMemory() + "GB Memóriát kap mellé.");
                    System.out.printf("Megvásárolja a telefont? 1 = igen, 2 = nem: ");
                    answer = scanner.nextInt();
                    if (answer == 1 && money >= telefon.getThreePhone().getPrice()) {
                        System.out.println("Köszönjük a vásárlást!");
                        System.exit(0);
                    }
                    if (answer == 1 && money < telefon.getThreePhone().getPrice()) {
                        System.out.println("Nem elegendő pénz a megvásárláshoz!");
                        System.exit(0);
                    }
                    if (answer == 2) {
                        System.out.println("Most adunk mellé 5x whiskast! Nem gondolta meg magát? ");
                        System.out.printf("1 = Igen, 2 = Nem: ");
                        answer = scanner.nextInt();
                        if (answer == 1 && money >= telefon.getThreePhone().getPrice()) {
                            System.out.println("Köszönjük a vásárlást!");
                            System.out.println("Itt van az 5x whiskas!");
                            System.exit(0);
                        }
                        if (answer == 1 && money < telefon.getThreePhone().getPrice()) {
                            System.out.println("Nem elegendő pénz a megvásárláshoz!");
                            System.exit(0);
                        }
                        if(answer == 2){
                            System.out.println("Viszontlásra.");
                            System.exit(0);
                        }
                    }
                    if(answer != 1 || answer !=2){
                        System.out.println("Nincs ilyen opció");
                        System.exit(0);
                    }
                }
                if(answer == 4){
                    System.exit(0);
                }
                if(answer != 1 || answer != 2 || answer !=3 || answer !=4){
                    System.out.println("Nincs ilyen opció.");
                    System.exit(0);
                }
            }
        }
        catch(Exception exception){
            System.out.println("Helytelen bevitel.");
        }
    }
}