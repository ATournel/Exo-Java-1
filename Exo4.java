
public class Exo4 {
	public static void op1 (int a, int b, int c) {
		int res=- a + b * c;
		System.out.println(res);
	}
	public static void op2 (int a, int b) {
		int res=(a + b) % b;
		System.out.println(res);
	}
	public static void op3 (int a, int b, int c, int d) {
		int res=a + -b * c / d;
		System.out.println(res);
	}
	public static void op4 (int a, int b, int c, int d, int e) {
		int res=a + b / c * d - e % c;
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		op1(5, 8, 6);
		op2(55, 9);
		op3(20, 3, 5, 8);
		op4(5, 15, 3, 2, 8);
	}

}
