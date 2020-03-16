/* 	Nama 	: Athifah arsa khaerawan
	Tanggal : 16 Maret 2020
	Waktu	: 21:39
*/

public class tugas2{
	public static void main(String[] args){
			int s, minute, hour, mod1, mod2;
			s = 5200;

		hour = s/3600;
		mod1 = s%3600;

		minute = (int) mod1/60;
		mod2 = mod1%60;

		System.out.println("Hasil Konversi : " + s + " detik = " + hour + " jam : " + minute + " menit : " + mod2 + " detik");
	}
}
	