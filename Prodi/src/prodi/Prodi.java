/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodi;

import java.util.Scanner;

/**
 *
 * @author PC-02
 */
public class Prodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat array program Studi
        String[] Prodi = new String[5];
        
        //membuat scanner
        Scanner scan = new Scanner (System.in);
        
        //mengisi data ke array
        for (int i = 0; i < Prodi.length; i++) {
            System.out.print("Prodi ke - " + i +": ");
            Prodi [i]=scan.nextLine();
        }
        System.out.println("Menampilkan array program study");
        System.out.println("-------------------------------");
        
        //menampilkan semua isi array
        for (String b : Prodi){
            System.out.println(b);
        }
    }
    
}
