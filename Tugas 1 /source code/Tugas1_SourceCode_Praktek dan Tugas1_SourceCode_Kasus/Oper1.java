// NIM: 13020240043
// Nama: Muhammad Asyraf Aufa Asaf
// Hari/Tanggal: 4/3/2026
// Waktu: 10.53 pm

/* pemakaian beberapa operator terhadap bit */

public class Oper1{
	public static void main(String [] args){
	// TODO Auto-generated method stub
	/*kamus*/
	int n = 10; /*1001*/
	int x = 1; /*1*/
	int y = 2; /*10*/

	/*ALGORITMA*/
	System.out.println ("n = "+ n);
	System.out.println ("x = "+ x);
	System.out.println ("y = "+ y);	
	System.out.println ("n & 8 = " + (n & 8)); /*1010 and 1000*/
	System.out.println ("x & ~ 8 = "+ (x & ~8)); /* 1 and 0111*/
	System.out.println ("y << 2= "+ (y << 2)); /*10==> 1000 = 8 */
	System.out.println ("y >> 3= "+ (y >> 3)); /*10 ==0000 = 0 */
	}

}