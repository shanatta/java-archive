package input_data_scanner;

import java.util.Scanner;
public class Input_Data_Scanner { 
    public static void main(String[] args) {
        String nama, alamat;
        int usia, NIS;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("### Data Siswa ###");
        System.out.println("Nama Siswa: ");
        nama = keyboard.next();
        
        System.out.println("Alamat: ");
        alamat = keyboard.next();
        
        System.out.println("Usia: ");
        usia = keyboard.nextInt();
        
        System.out.println("NIS: ");
        NIS = keyboard.nextInt();
        
        //Menampilkan apa yang sudah disimpan di variabel
        System.out.println("------------------------");
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Alamat Siswa: " + alamat);
        System.out.println("Usia: " + usia);
        System.out.println("NIS: " + NIS);
        
    }
} 
