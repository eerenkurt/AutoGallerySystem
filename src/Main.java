import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        int secim = -1;
        while (secim != -0) {
            System.out.println("1- ekle");
            System.out.println("2- sil");
            System.out.println("3- yazdir");
            System.out.println("4- ara");
            System.out.println("0- cikis");
            System.out.println("seciminiz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    list.ekle();
                    break;
                case 2:
                    list.sil();
                    break;
                case 3:
                    list.yazdir();
                    break;
                case 4:
                    list.aracAra();
                    break;
                case 0:
                    System.out.println("Cikis yaptiniz.");
                default:
                    System.out.println("Hatalı tuşladınız.");
                    break;
            }
        }

    }
}
