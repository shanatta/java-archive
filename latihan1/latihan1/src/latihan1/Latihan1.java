/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import java.util.Scanner;


/**
 *
 * @author PC-02
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p, l, t;
        
        Scanner input = new Scanner (System.in);
        System.out.println("------------------------------------ Program Menghitung Prisma Segi Empat -----------------------------------------------");
        System.out.print("Masukan Panjang Alas : ");
        p= input.nextInt();
        System.out.print("Masukan Lebar Alas : ");
        l= input.nextInt();
        System.out.print("Masukan tingi prisma : ");
        t= input.nextInt();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        double hasil = p*l*t;
        System.out.print("Hasil Perhitungan Volume Prisma adalah "+ hasil);
    }
    
}
