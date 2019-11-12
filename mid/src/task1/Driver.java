package task1;

public class Driver {

	public static void main(String[] args) {
		double a[] = {5,2,7};
		double b[] = {2,1,3,4};
		
		Polynomial p = new Polynomial(a);
		Polynomial p2 = new Polynomial(b);
		
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		System.out.println(p2.degree());
		System.out.println(Polynomial.printSum(p,p2));

	}

}
