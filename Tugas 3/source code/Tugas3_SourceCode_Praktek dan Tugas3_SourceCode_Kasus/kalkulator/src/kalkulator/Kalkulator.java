/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;
// NIM: 13020240043
// Nama: Muhammad Asyraf Aufa Asaf
// Hari/Tanggal: 4/18/2026
// Waktu: 02.20 pm
import java.util.Scanner;
public class Kalkulator {
    public static class calculator{
    double angka1, angka2;
    char operator;
    
    calculator (double a1, double a2, char o){
    this.angka1 = a1;
    this.angka2 = a2;
    this.operator = o;
    }
    double tambah(){return angka1 + angka2;}
    double kurang(){return angka1 - angka2;}
    double kali(){return angka1 * angka2;}
    double bagi(){return angka1 / angka2;}
    }
    
    
    
    public static void main(String[] args) {
       double hasil = 0;
       char lagi;
       Scanner masukan = new Scanner(System.in);
       do{
           System.out.print("\nmasukkan angka1 :");
           double a1 = masukan.nextDouble();
           System.out.print("masukkan angka2 :");
           double a2 = masukan.nextDouble();
           System.out.print("masukkan operator :");
           char o = masukan.next().charAt(0);
           
           calculator k = new calculator(a1, a2, o);
           switch(o){
               case '+':
                   hasil = k.tambah();
                    System.out.print("hasil: "+ a1+" + "+a2+ " ="+ hasil);
                   break;
                case '-':
                   hasil = k.kurang();
                   System.out.print("hasil: "+ a1+" - "+a2+ " ="+ hasil);
                   break;
                case '*':
                   hasil = k.kali();
                   System.out.print("hasil: "+ a1+" * "+a2+ " ="+ hasil);
                   break;
                case '/':
                   hasil = k.bagi();
                   if(a2 == 0){
                       System.out.println("Error: Pembagian dengan nol!");
                   }
                   System.out.print("hasil: "+ a1+" / "+a2+ " ="+ hasil);
                   break;
                default:
                    System.out.println("operator tidak ");
           }
           
           System.out.print("\nHitung lagi? (y/n): ");
           lagi = masukan.next().charAt(0);
       }while (lagi == 'y');
        System.out.println("program selesai.");
    }
    
}
