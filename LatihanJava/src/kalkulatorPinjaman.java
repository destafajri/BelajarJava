import java.util.Scanner;

public class kalkulatorPinjaman {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Banyak Pinjaman ");
		int pinjaman = input.nextInt();
		
		System.out.print("Cicilan 10% pada bulan ke-");
        int cicilanKe= input.nextInt();

		for(int i=1;i<=cicilanKe;i++){
			pinjaman = (pinjaman-(10*pinjaman)/100);
			//setiap bulan membayar 10% dari total pinjaman
		}
		
		System.out.println("Sisa pinjaman adalah " + pinjaman);	


	}
}
