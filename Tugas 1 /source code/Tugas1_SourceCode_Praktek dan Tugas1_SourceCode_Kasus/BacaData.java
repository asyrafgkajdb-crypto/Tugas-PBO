// NIM: 13020240043
// Nama: Muhammad Asyraf Aufa Asaf
// Hari/Tanggal: 4/2/2026
// Waktu: 9.19 pm

import java.util.Scanner; 

/* contoh membaca integer menggunakan Class Scanner*/ 
public class BacaData { 
    public static void main(String[] args) { 
        // TODO Auto-generated method stub 
        /* Kamus */ 
        int a; 
        Scanner masukan; 
        
        /* Program */ 
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n"); 
        
        masukan = new Scanner(System.in); 
        a = masukan.nextInt(); /* coba ketik : 
        masukan.nextInt();  
        Apa akibatnya ?*/ 
        System.out.print ("Nilai yang dibaca : "+ a); 
	
    } 
}