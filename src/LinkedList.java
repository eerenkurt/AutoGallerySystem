import java.util.Scanner;

public class LinkedList {

    AutoNode head;
    AutoNode tail;

    String plaka;
    String marka;
    String model;
    String renk;
    int alisFiyat;
    int satisFiyat;
    String aciklama;

    Scanner scanner = new Scanner(System.in);

    void ekle() {
        System.out.println("Eklencek araç bilgilerini giriniz: ");
        System.out.print("plaka: ");
        plaka = scanner.nextLine();
        System.out.print("marka: ");
        marka = scanner.nextLine();
        System.out.print("model: ");
        model = scanner.nextLine();
        System.out.print("renk: ");
        renk = scanner.nextLine();
        System.out.print("alisFiyat: ");
        alisFiyat = scanner.nextInt();
        scanner.nextLine();
        System.out.print("aciklama: ");
        aciklama = scanner.nextLine();

        AutoNode arac = new AutoNode(plaka, marka, model, renk, alisFiyat, aciklama);

        if (head == null) {
            head = arac;
            tail = arac;
            tail.next = head;
            System.out.println(plaka + " plakalı araç eklendi.");
        } else {
            tail.next = arac;
            tail = arac;
            arac.next = head;
            System.out.println(plaka + " plakalı araç eklendi.");
        }
    }

    void sil() {
        if (head == null) {
            System.out.println("Silinecek araç yok");
        } else {
            System.out.println("Plaka giriniz");
            plaka = scanner.nextLine();

            if (head == tail && head.plaka.equals(plaka)) {
                System.out.println(plaka + " plakalı araç silindi");
                head = null;
                tail = null;
            } else if (head != tail && head.plaka.equals(plaka)) {
                System.out.println(plaka + " plakalı araç silindi.");
                head = head.next;
                tail.next = head;
            } else {
                AutoNode temp = head;
                AutoNode temp2 = head;

                while (temp != tail) {
                    if (temp.plaka.equals(plaka)) {
                        temp2.next = temp.next;
                        System.out.println(plaka + " plakalı araç silindi.");

                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if (temp.plaka.equals(plaka)) {
                    tail = temp2;
                    tail.next = head;
                    System.out.println(plaka + " plakalı araç silindi.");
                }
            }
        }
    }

    void yazdir() {
        if (head == null) {
            System.out.println("Liste boş!");
        } else {
            System.out.println("Plaka\tMarka\tModel\tRenk\taFiyat\tsFiyat\tAciklama ");
        }
        AutoNode temp = head;
        while (temp != tail) {
            System.out.print(temp.plaka + "\t" + temp.marka + "\t" + temp.model + "\t" + temp.renk + "\t" + temp.alisFiyat + "\t" + temp.satisFiyat + "\t" + temp.aciklama + "\n");
            temp = temp.next;
        }
        System.out.print(temp.plaka + "\t" + temp.marka + "\t" + temp.model + "\t" + temp.renk + "\t" + temp.alisFiyat + "\t" + temp.satisFiyat + "\t" + temp.aciklama + "\n");
    }

    void aracAra() {
        if (head == null) {
            System.out.println("Liste boş!");
        } else {
            boolean sonuc = false;
            System.out.println("Aradağınız aracın plakası: ");
            plaka = scanner.nextLine();

            AutoNode temp = head;
            AutoNode temp2 = head;

            while (temp != tail) {
                if (temp.plaka.equals(plaka)) {
                    temp2 = temp;
                    sonuc = true;
                }
                temp = temp.next;
            }
            if (temp.plaka.equals(plaka)) {
                temp2 = temp;
                sonuc = true;
            }
            if (sonuc == false) {
                System.out.println(plaka + " plakalı araç listede yok.");

            } else {
                System.out.println(plaka + " plakalı araç bilgileri: ");
                System.out.println("Marka: " + temp2.marka);
                System.out.println("Model: " + temp2.model);
                System.out.println("Renk: " + temp2.renk);
                System.out.println("Alis fiyat: " + temp2.alisFiyat);
                System.out.println("Satis fiyat: " + temp2.satisFiyat);
                System.out.println("Aciklama: " + temp2.aciklama);
            }
        }
    }


}

