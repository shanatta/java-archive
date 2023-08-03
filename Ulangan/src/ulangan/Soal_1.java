package ulangan;

import java.util.Scanner;
public class Soal_1 { 
    public static void main(String[] args) {
        double harga_awal, diskon;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Harga awal: ");
        harga_awal = keyboard.nextDouble();
        System.out.println("Berapa persen diskon: ");
        diskon = keyboard.nextDouble();
        
        //Menampilkan apa yang sudah disimpan di variabel
        System.out.println("Total diskon= Rp." + ((harga_awal * diskon/100) + " rupiah"));
        System.out.println("Jumlah yang harus dibayar= Rp." + ((harga_awal) - (harga_awal * diskon/100)) + " rupiah");
       
    }
} 
