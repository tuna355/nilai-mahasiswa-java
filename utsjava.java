/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irvan Achya Arrosyid
 */
import java.util.Scanner;
public class utsjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nilai Akhir Mahasiswa Stekom Kendal");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Nama Mahasiswa = ");
        String mahasiswa = userInput.nextLine();
        System.out.print("Pilih jurusan anda : \n");
        System.out.println("1. Information Technolgy");
        System.out.println("2. management Information");
        System.out.print("Masukkan : ");
        String jurusan = userInput.nextLine();
        System.out.print("Nilai Bahasa inggris : ");
        int bing = userInput.nextInt();
        System.out.print("Nilai Visual Basic : ");
        int vb = userInput.nextInt();
        System.out.print("NIlai Sisco : ");
        int sisco = userInput.nextInt();
        System.out.print("\n");
        System.out.println("hitung nilai");
        int tn = bing+vb+sisco;
        System.out.println("total nilai : " + tn );
        int rat = tn/3;
        System.out.print("rata rata nilai : " + rat);
        System.out.print("\n");
        String keterangan;
        keterangan = rat > 70 ? "Keterangan = Selamat anda telah lulus" : "keterangan = anda gagal";
        System.out.println(keterangan);
    }
    
}
