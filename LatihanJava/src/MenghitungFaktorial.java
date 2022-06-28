import java.util.Scanner;

public class MenghitungFaktorial {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
            int number, fact,i;
            number = scanner.nextInt();
            fact = 1;
            //Loop faktorial
            i=1;
            while(i<=number){
                fact=fact*i;
                i++;
            }
            
            System.out.println(fact);
    }
}