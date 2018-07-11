
public class Exo13 {
	public static void swap(int a, int b) {
		int c;
		System.out.println("Before:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(10, 8);
	}

}
