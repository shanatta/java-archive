package luas_segitiga;

import java.util.Scanner;
public class Luas_Segitiga { 
    public static void main(String[] args) {
        double alas, tinggi;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Alas: ");
        alas = keyboard.nextDouble();
        
        System.out.println("Tinggi: ");
        tinggi = keyboard.nextDouble();
        
        //Menampilkan apa yang sudah disimpan di variabel
        System.out.println("Luas segitiga adalah " + ((alas * tinggi) /2) + " cm");
       
    }
} 
