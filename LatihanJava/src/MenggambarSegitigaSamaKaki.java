import java.util.Scanner;

public class MenggambarSegitigaSamaKaki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("masukan batas");
		
		int batas =input.nextInt();
		
		int s = batas+4-1;
		
		for(int x=1;x<=batas;x++) {
			
			for(int y=s ; y !=0 ; y--) {
				System.out.print(" ");
			}
			
			
			for(int z=1;z<=x;z++) {
				System.out.print(x+" ");
			}
			
			System.out.println();
			s--;
			
			
		}
		
	}

}
