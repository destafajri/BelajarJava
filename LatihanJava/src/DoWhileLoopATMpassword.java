
import java.util.Scanner;
public class DoWhileLoopATMpassword{
	
    public static void main(String[] args) {
	   Scanner read = new Scanner(System.in);
           //database
           int yourPass=8819;

           int password;
           
          
        do {
            System.out.println("Write password");
             password=read.nextInt();
         } while(password!=yourPass);
	}
}