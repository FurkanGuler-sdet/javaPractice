package practice_basic_day01;

import java.util.Scanner;

public class Q09My {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adınızı girin");
        String isim= scan.nextLine();
        System.out.println("Lütfen memleketinizi girin");
        String memleket= scan.nextLine();
        System.out.println("Lütfen konumu girin");
        String konum= scan.nextLine();
        System.out.println("Lütfen yaşınızı girin");
        int yas= scan.nextInt();
        System.out.println("Lütfen boyunuzu girin");
        double boy=scan.nextDouble();
        System.out.println("Yaşadığınız yeri seviyorsanız 1, sevmiyorsanız 2ye basın?:");
        int cevap= scan.nextInt();
        if (cevap==1){
            System.out.println("seviyor");
        }else if (cevap==2){
            System.out.println("sevmiyor");
        }else System.out.println("geçersiz cevap");
        // FIXME: 12.10.2022

        System.out.println();



    }
}
