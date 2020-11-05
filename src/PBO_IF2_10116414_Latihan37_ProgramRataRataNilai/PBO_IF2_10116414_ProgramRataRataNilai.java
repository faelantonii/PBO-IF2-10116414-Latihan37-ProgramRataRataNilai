/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan37_ProgramRataRataNilai;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan rata rata nilai
 */
public class PBO_IF2_10116414_ProgramRataRataNilai {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);
        Kalkulasi nilai = new Kalkulasi();

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nilai.banyakMahasiswa = masuk.nextInt();
        nilai.tampil();
        
        System.out.println("\nMaka Rata-rata nya Adalah : " + nilai.jumlah());
        System.out.println("Developed by : Fael Antoni Wijaya");

    }
}
