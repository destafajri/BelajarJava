import java.util.Scanner;

public class KalkulatorLuasBangunDatar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	menghitungLuas();
	
	}
	
	
	
	
	
	
/*
 * Metode saya dibawah sini
 */
	
	//TAMPILAN MAIN
	private static void menghitungLuas() {
		Scanner input = new Scanner(System.in);
		System.out.println("=====Kalkulator Luas Bangun Datar====");
		System.out.println("Mau menghitung luas apa? ");
		System.out.println("");
		
		System.out.print("Ketik bangun datar yang diinginkan : ");
		String masukanUser=input.next();
		
		switch(masukanUser){
		case "Persegi":
		case "persegi":
		case "PERSEGI":	
			inputNilaiPersegi();
			break;
		case "Segitiga":
		case "segitiga":
		case "SEGITIGA":
			inputNilaiSegitiga();
			break;
		case "Trapesium":
		case "trapesium":
		case "TRAPESIUM":
			inputNilaiTrapesium();
			break;
			default :
				System.out.println("belum dibuat cuy....");
				break;
			}
	}
	
	
	
	// INPUTAN NILAI DARI USER
	
	private static void inputNilaiPersegi() {
		Scanner input = new Scanner(System.in);
		
		double a,b;
		System.out.print("Masukan Nilai Panjang :");
		a=input.nextDouble();
		System.out.print("Masukan Nilai Lebar :");
		b=input.nextDouble();
		
		System.out.println("Luas Persegi adalah "+ luasPersegi(a,b));
		
	}
	
	private static void inputNilaiSegitiga() {
		Scanner input = new Scanner(System.in);
		
		double a,b;
		System.out.print("Masukan Nilai Alas :");
		a=input.nextDouble();
		System.out.print("Masukan Nilai Tinggi :");
		b=input.nextDouble();
		
		System.out.println("Luas Segitiga adalah "+ luasSegitiga(a,b));
		
	}
	
	private static void inputNilaiTrapesium() {
		Scanner input = new Scanner(System.in);
		
		double a,b,t;
		System.out.print("Masukan Nilai Alas 1 :");
		a=input.nextDouble();
		System.out.print("Masukan Nilai Alas 2 :");
		b=input.nextDouble();
		System.out.print("Masukan Nilai Tinggi :");
		t=input.nextDouble();
		
		System.out.println("Luas Trapesium adalah "+ luasTrapesium(a,b,t));
		
	}
	
	
	//RUMUS LUAS BANGUN DATAR
	
	private static Double luasPersegi(double a, double b) {
		double Luas = a*b;
		return Luas;
	}
	
	private static Double luasSegitiga(double a, double t) {
		double Luas = (a*t)/2;
		return Luas;
	}
	
	private static Double luasTrapesium(double a, double b, double t) {
		double Luas = ((a+b)*t)/2;
		return Luas;
	}
	
}
