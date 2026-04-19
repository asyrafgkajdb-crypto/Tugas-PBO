/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainkonversi;
// NIM: 13020240043
// Nama: Muhammad Asyraf Aufa Asaf
// Hari/Tanggal: 4/18/2026
// Waktu: 04.15 pm
import java.util.Scanner;

class KonversiWaktu {
    private long totalDetik;
    private long detikSekarang;
    private long totalMenit;
    private long menitSekarang;
    private long totalJam;
    private long jamSekarang;

    public KonversiWaktu(long td) {
        this.totalDetik = td;
    }

    public void konversi() {
        detikSekarang = totalDetik % 60;
        totalMenit = totalDetik / 60;
        menitSekarang = totalMenit % 60;
        totalJam = totalMenit / 60;
        jamSekarang = totalJam % 24;
    }

    public void tampilkanWaktu() {
        System.out.println("Total detik: " + totalDetik);
        System.out.println("====================");
        // Format %02d artinya angka minimal 2 digit, jika 1 digit ditambah angka 0 di depan
        System.out.printf("Waktu: %02d:%02d:%02d%n", jamSekarang, menitSekarang, detikSekarang);
        System.out.println("====================");
        System.out.println("\nTotal Detik    : " + totalDetik);
        System.out.println("detikSaat ini  : " + detikSekarang);
        System.out.println("menitSaat ini  : " + menitSekarang);
        System.out.println("jamSaat ini    : " + jamSekarang);
    }
}

public class MainKonversi {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        long inputDetik = masukan.nextLong();

        KonversiWaktu kw = new KonversiWaktu(inputDetik);
        kw.konversi();
        kw.tampilkanWaktu();
    }
}
