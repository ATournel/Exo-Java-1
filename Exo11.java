
public class Exo11 {
	public static void calc(double a, double b, double c, double d, double e, double f, double g) {
		double res= a * (b - (b/c) + (b/d) - (b/e) + (b/f) - (b/g));
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc(4.0, 1.0, 3, 5, 7, 9, 11);
	}

}
