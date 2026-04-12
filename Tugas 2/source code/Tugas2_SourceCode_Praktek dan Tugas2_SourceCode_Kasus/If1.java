// NIM: 13020240043
// Nama: Muhammad Asyraf Aufa Asaf
// Hari/Tanggal: 4/10/2026
// Waktu: 11.25 pm

/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */
import java.util.Scanner;
public class If1 {
	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		Scanner masukan=new Scanner(System.in);
		int a;
		/* Program */
		System.out.print ("Contoh IF satu kasus \n");
		System.out.print ("Ketikkan suatu nilai integer : ");
		a = masukan.nextInt();
		if (a >= 0)
		System.out.print ("\nNilai a positif "+ a);
	}
}