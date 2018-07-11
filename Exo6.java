import java.util.Scanner;

public class Exo6 {
	private static int a;
	private static int b;
	public static void exo6 (int a, int b) {
		
		System.out.println("We will add your input together!!");
		System.out.print("Input first number: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.print("Input second number: ");
		Scanner sc2 = new Scanner(System.in);
		b = sc.nextInt();
		
		int res=a + b;
		System.out.println(a + " + " + b + " = " + res + ".");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exo6(a, b);
	}

}