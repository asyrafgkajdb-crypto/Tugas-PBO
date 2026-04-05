// NIM: 13020240043
// Nama: Muhammad Asyraf Aufa Asaf
// Hari/Tanggal: 4/4/2026
// Waktu: 10.40 am

 class Oprator{
	public static void main(String [] args){
	// TODO Auto-generated method stub
	/*kamus*/
	Boolean Booll, Bool2, TF;
	int i, j, hsl;
	float x, y, res;
	/*algoritma*/
	 System.out.println ("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
	Booll = true; Bool2 = false;
	TF = Booll && Bool2;
	if (TF) {System.out.println("Hasil Booll = "+ TF);}	/* Boolean AND*/
	else {System.out.println("Hasil Bool2 ="+ TF);}
	TF = Booll || Bool2;
	if (TF) {System.out.println("Hasil Booll || Bool2 = "+ TF);} 	/*Boolean OR */
	TF =! Booll;	/* NOT */
	System.out.println("Hasil Booll =! = "+ TF);
	TF = Booll ^Bool2;	 /*XOR*/
	if (TF) {System.out.println("Hasil Booll ^ Bool2 = "+ TF);}
	/* operasi numerik */
	i = 5; j = 2;
	hsl = i+j;
	System.out.println("Hasil i + j = "+ hsl);
	hsl = i - j;
	System.out.println("Hasil i - j = "+ hsl);
	hsl = i / j;
	System.out.println("Hasil i/j = "+ hsl);
	hsl = i * j;
	System.out.println("Hasil i * J = "+ hsl);
	hsl = i /j;	/*pembagian bulat */
	System.out.println("Hasil i /j = "+ hsl);
	hsl = i % j;	/*sisa modulo*/
	System.out.println("Hasil i%j = "+hsl);

	/* Operasi numerik */
	x = 5; y = 5;
	res = x + y;
	System.out.println("Hasil x + y ="+ res);
	res = x - y;
	System.out.println("Hasil x - y ="+ res);
	res = x / y;
	System.out.println("Hasil x / y ="+ res);
	res = x * y;
	System.out.println("Hasil x * y ="+ res);

	/* operasi relasional numerik */
	TF = (i==j);
	System.out.println("Hasil i==j = "+ TF);
	TF = (i!=j);
	System.out.println("Hasil i!=j = "+TF);
	TF = (i<j);
	System.out.println("Hasil i < j = "+ TF);
	TF = (i>j);
	System.out.println("Hasil i > j = "+ TF);
	TF = (i<=j);
	System.out.println("Hasil i <= j = "+TF);
	TF = (i>=j);
	System.out.println("Hasil i >= j = "+TF);
	
	/*Operasi relasional numerik*/
	TF = (x != y);
	System.out.println("Hasil x != y = "+ TF);
	TF = (x < y);
	System.out.println("Hasil x < y = " +TF);
	TF = (x > y);
	System.out.println("Hasil x > y = "+ TF);
	TF = (x <= y);
	System.out.println("Hasil x =< y = " +TF);
	TF = (x >= y);
	System.out.println("Hasil x => y = "+ TF);
	
}

}