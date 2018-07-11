import java.util.Scanner;

public class Exo7 {
	private static int a;
	private static int b;
	public static void exo7 (int a, int b) {
		
		System.out.println("We will divide your first input by the second!!");
		System.out.print("Input first number: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.print("Input second number: ");
		Scanner sc2 = new Scanner(System.in);
		b = sc.nextInt();
		
		int res=a / b;
		System.out.println(a + " / " + b + " = " + res + ".");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exo7(a, b);
	}

}