import java.util.Scanner;

public class Exo14 {
	private static String a;
	public static void exo14 (String a) {
		
		System.out.println("Input your Password.");
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		System.out.print("Your password is: " + a + ".");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exo14(a);
	}

}