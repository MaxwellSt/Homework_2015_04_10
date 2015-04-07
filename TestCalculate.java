package package_01;

public class TestCalculate {

	public static void main(String[] args) {

		Calculate calculate = new Calculate();

		int a = 6;
		int b = 0;

		calculate.division(a, b);
		calculate.minus(a, b);
		calculate.multiply(a, b);
		calculate.sum(a, b);
		calculate.print(a, b);

		System.out.println("float:");

		float c = 3;
		float d = 0;

		calculate.division(c, d);
		calculate.minus(c, d);
		calculate.multiply(c, d);
		calculate.sum(c, d);
		calculate.print(c, d);

		System.out.println("min element is: " + calculate.min(1, 3, 5, -6, 0));

		// for interface

		CalculateImp calculateImp = new CalculateImp();

		calculateImp.division(a, b);
		calculateImp.minus(a, b);
		calculateImp.multiply(a, b);
		calculateImp.sum(a, b);

		System.out.println("float:");

		calculateImp.division(c, d);
		calculateImp.minus(c, d);
		calculateImp.multiply(c, d);
		calculateImp.sum(c, d);

		System.out.println("min element is: "
				+ calculateImp.min(1, -2, 5, -3, 0));
	}

}
