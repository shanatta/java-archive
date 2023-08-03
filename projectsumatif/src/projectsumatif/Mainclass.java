package projectsumatif;
import java.util.Scanner;

public class Mainclass extends operasi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Mainclass run1 = new Mainclass();
        run1.setA(10.5);
        run1.setB(0.5);
        run1.setC();
        System.out.println("==================================");
        System.out.println("Aplikasi penjumlahan,pengurangan,perkalian,dan pembagian");
        System.out.println("Bilangan A : "+run1.getA());
        System.out.println("Bilangan B : "+run1.getB());
        System.out.println("==================================");
        run1.tampil();

        penjumlahan jumlah = new penjumlahan();
        jumlah.setA(10.5);
        jumlah.setB(0.5);
        jumlah.setC();
        System.out.println("----------------------------------");
        System.out.println("Penjumlahan");
        System.out.println("Bilangan A  : "+run1.getA());
        System.out.println("Bilangan B  : "+run1.getB());
        System.out.println("Hasil A + B : "+jumlah.getC());
        System.out.println("----------------------------------");
        jumlah.tampil();

        pengurangan kurang = new pengurangan ();
        kurang.setA(10.5);
        kurang.setB(0.5);
        kurang.setC();
        System.out.println("----------------------------------");
        System.out.println("Pengurangan");
        System.out.println("Bilangan A  :"+kurang.getA());
        System.out.println("Bilangan B  :"+kurang.getB());
        System.out.println("Hasil A - B : "+kurang.getC());
        System.out.println("----------------------------------");
        kurang.tampil();

        perkalian kali = new perkalian ();
        kali.setA(10.5);
        kali.setB(0.5);
        kali.setC();
        System.out.println("----------------------------------");
        System.out.println("perkalian");
        System.out.println("Bilangan A  :"+kali.getA());
        System.out.println("Bilangan B  :"+kali.getB());
        System.out.println("Hasil A * B : "+kali.getC());
        System.out.println("----------------------------------");
        kali.tampil();

        pembagian bagi = new pembagian ();
        bagi.setA(10.5);
        bagi.setB(0.5);
        bagi.setC();
        System.out.println("‎‎")
        System.out.println("----------------------------------");
        System.out.println("pembagian");
        System.out.println("Bilangan A  :"+bagi.getA());
        System.out.println("Bilangan B  :"+bagi.getB());
        System.out.println("Hasil A / B : "+bagi.getC());
        System.out.println("----------------------------------");
        System.out.println("==================================");
        bagi.tampil();
    }

}