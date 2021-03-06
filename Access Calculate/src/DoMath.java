//This class is client code that uses the calculate library to perform various mathematical tasks. 
//@Carolyn Yee
//@version 1, 9/06/18
public class DoMath {

	public static void main(String[] args) {
		Calculate.square(5);
			System.out.println(Calculate.square(5));
			System.out.println(Calculate.cube(5));
			System.out.println(Calculate.average(1.2, 5.6));
			System.out.println(Calculate.average(4.2, 6.7, 7.7));
			System.out.println(Calculate.toDegrees(3.14159));
			System.out.println(Calculate.toRadians(180));
			System.out.println(Calculate.discriminant(2,3,4));
			System.out.println(Calculate.toImproperFrac(3, 1, 2));
			System.out.println(Calculate.toMixedNum(7, 3));
			System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
			System.out.println(Calculate.isDivisibleBy(5, 6));
			System.out.println(Calculate.absValue(-3));
			System.out.println(Calculate.max(8,6));
			System.out.println(Calculate.max(5.0, 6.0, 7.0));
			System.out.println(Calculate.min(5, 6));
			System.out.println(Calculate.round2(5.4567));
			System.out.println(Calculate.exponent(5, 2));
			System.out.println(Calculate.factorial(5));
			System.out.println(Calculate.isPrime(2));
			System.out.println(Calculate.gcf(72, 81));
			System.out.println(Calculate.sqrt(25));
			System.out.println(Calculate.quadform(1, 6, 2));
			System.out.println(Calculate.quadform(2, -10, 8));
		// TODO Auto-generated method stub

	}

}


	
	