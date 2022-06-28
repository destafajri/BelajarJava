import java.util.Scanner;

public class loginUser {

	public static void main(String[] args) {
		//DataBase
		String userName, password;
		userName = "otongsurotong";
		password = "bukan";
		
		//input user
		Scanner input= new Scanner(System.in);  
		
		System.out.print("masukan username anda :");
		String idUser = input.nextLine();
		System.out.print("masukan password anda :");
		String passwordUser= input.nextLine();
		
		if (idUser.equals(userName)) {
			if(passwordUser.equals(password)) {
				System.out.println("Selamat Datang kamu memang pemilik akun");}
				else {
					System.out.println("password salah kamu bukan pemilik akun");
				}
			}
			else {
				System.out.println("KAMU ORANG LAIN, bukan klan kami");
				}
		
		}
	}
