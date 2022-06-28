import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AplikasiPencarianNama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sekolah[] = new String[] {
				"Ronaldowati", "OtongSurotong",
				"Tahu", "Michael",
				"Oncom", "Santiwati"
				};
		Scanner input= new Scanner(System.in);
		
		
		String query = input.next();
		String hasil = "";
		
		for (String name: sekolah) {
			if (name.toLowerCase().equals(query.toLowerCase())) {
				hasil = name;
				break;
			} 	
		}
		
		if (hasil.length()==0) {
			System.out.println("tidak ada");
		} else {
			System.out.println("ada "+ hasil);
		}
		
		System.out.println(sekolah.length);
		
	}
}