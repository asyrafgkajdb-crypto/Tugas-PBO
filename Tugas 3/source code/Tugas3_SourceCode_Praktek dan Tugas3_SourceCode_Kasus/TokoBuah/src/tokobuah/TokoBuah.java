/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokobuah;
// NIM: 13020240043
// Nama: Muhammad Asyraf Aufa Asaf
// Hari/Tanggal: 4/18/2026
// Waktu: 04.12 pm
import java.util.Scanner;

class Buah {
    private String nama;
    private double harga;
    private int stok;

    public Buah(String n, double h, int s) {
        this.nama = n;
        this.harga = h;
        this.stok = s;
    }

    public String getInfo() {
        return nama + "  Rp " + (int)harga + " (stok:" + stok + " kg)";
    }

    public double hitungTotal(int qty) {
        return harga * qty;
    }

    public boolean tersedia(int qty) {
        if (stok >= qty) {
            stok -= qty;
            return true;
        }
        return false;
    }
}

public class TokoBuah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Buah[] katalog = new Buah[3];
        katalog[0] = new Buah("Apel", 15000, 10);
        katalog[1] = new Buah("Jeruk", 12000, 8);
        katalog[2] = new Buah("Mangga", 20000, 5);

        int pilih, qty;
        double totalBelanja = 0;

        for (int i = 0; i < katalog.length; i++) {
            System.out.println((i + 1) + ". " + katalog[i].getInfo());
        }

        do {
            System.out.print("\nPilih (0=stop): ");
            pilih = sc.nextInt();

            if (pilih == 0) break;

            if (pilih > 0 && pilih <= katalog.length) {
                System.out.print("Jumlah(kg): ");
                qty = sc.nextInt();

                if (katalog[pilih - 1].tersedia(qty)) {
                    double subTotal = katalog[pilih - 1].hitungTotal(qty);
                    totalBelanja += subTotal;
                    System.out.println("OK +Rp" + (int)subTotal);
                } else {
                    System.out.println("Stok tidak cukup!");
                }
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);

        System.out.println("Total: Rp" + (int)totalBelanja);
    }
}
