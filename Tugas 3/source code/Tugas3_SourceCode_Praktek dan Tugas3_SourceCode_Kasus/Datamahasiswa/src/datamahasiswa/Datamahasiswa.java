/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamahasiswa;
// NIM: 13020240043
// Nama: Muhammad Asyraf Aufa Asaf
// Hari/Tanggal: 4/18/2026
// Waktu: 03.30 pm

import java.util.Scanner;
class Mahasiswa {
    private String nama;
    private String nim;
    private int jumlahMK;
    private int[] nilai;

    public Mahasiswa(String nm, String ni, int jmk) {
        this.nama = nm;
        this.nim = ni;
        this.jumlahMK = jmk;
        this.nilai = new int[jmk];
    }

    public void inputNilai(Scanner sc) {
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nilai MK-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    public double hitungRataRata() {
        double total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / jumlahMK;
    }

    public char tentukanGrade() {
        double avg = hitungRataRata();
        if (avg >= 85) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else return 'D';
    }

    public boolean lulus() {
        return hitungRataRata() >= 60.0;
    }

    public void tampilRapor() {
        System.out.println("\n=== RAPOR ===");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai :");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("  MK-" + (i + 1) + " : " + nilai[i]);
        }
        System.out.printf("Rata  : %.2f%n", hitungRataRata());
        System.out.println("Grade : " + tentukanGrade());
        System.out.println("Lulus : " + lulus());
    }
}

public class Datamahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama   : ");
        String nama = sc.nextLine();
        System.out.print("NIM    : ");
        String nim = sc.nextLine();
        System.out.print("Jml MK : ");
        int jml = sc.nextInt();

        Mahasiswa mhs = new Mahasiswa(nama, nim, jml);
        mhs.inputNilai(sc);
        mhs.tampilRapor();
    }
}