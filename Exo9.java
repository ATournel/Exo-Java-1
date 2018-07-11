import java.util.Scanner;

public class Exo9 {
	private static int a;
	public static int b;
	public static void exo9 (int a) {
		
		System.out.println("We will print your input's multiplication table!!");
		System.out.print("Input your number: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		for (b=1; b < 11; b++) {
		System.out.println(a + " " + "*" + " " + b + " " + "=" + " " + a * b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exo9(a);
	}

}