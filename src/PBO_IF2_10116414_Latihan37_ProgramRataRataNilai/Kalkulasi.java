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
 */
public class Kalkulasi {
    public int banyakMahasiswa;
    public double nilai;
    public double jumlah = 0;
    public double hasilRatarata;

    Scanner masuk = new Scanner(System.in);
    
    public void tampil(){
    
    for (int i = 1; i <= banyakMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = masuk.nextDouble();
            jumlah = jumlah + nilai;
        }
    
    }
    
    double jumlah() {

        hasilRatarata = jumlah / banyakMahasiswa;

        return hasilRatarata;
    }
}
