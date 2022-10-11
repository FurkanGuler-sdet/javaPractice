package practice_basic_day01;

import java.util.Scanner;

public class Q08My {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı girin");
        int sayi1=scan.nextInt();

        System.out.println("Lütfen bir tam sayı daha girin");
        int sayi2=scan.nextInt();

        int sayı3= sayi1+sayi2;
        System.out.println(sayı3);


    }
}
