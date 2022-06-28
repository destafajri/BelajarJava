import java.util.Scanner;

public class ReverseStringArray{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		int n = str.length();

		char[] array = new char[n];

		//my code goes here
		
		for (int i = 0; i < n; i++) {
				array[n - i - 1] = str.charAt(i);
			}

			System.out.println(array);

		}
}