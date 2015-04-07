package package_01;

public class CalculateImp implements CalculateInterface {

	public void sum(int a, int b) {

		int c = a + b;

		System.out.println("" + a + "+" + b + "=" + c);
	}

	public void sum(float a, float b) {

		float c = a + b;

		System.out.println("" + a + "+" + b + "=" + c);
	}

	public void minus(int a, int b) {

		int c = a - b;

		System.out.println("" + a + "-" + b + "=" + c);
	}

	public void minus(float a, float b) {

		float c = a - b;

		System.out.println("" + a + "-" + b + "=" + c);
	}

	public void multiply(int a, int b) {

		int c = a * b;

		System.out.println("" + a + "*" + b + "=" + c);
	}

	public void multiply(float a, float b) {

		float c = a * b;

		System.out.println("" + a + "*" + b + "=" + c);
	}

	public void division(int a, int b) {

		int c;

		if (b == 0) {
			System.out.println("Error. Divide by zero");
			return;
		}

		c = a / b;

		System.out.println("" + a + "/" + b + "=" + c);
	}

	public void division(float a, float b) {

		float c;

		if (Float.isNaN(a / b)) {
			System.out.println("Error. NaN");
			return;
		} else {
			if (b == 0.0f) {
				System.out.println("Error. Divide by zero");
				return;
			}
		}

		c = a / b;

		System.out.println("" + a + "/" + b + "=" + c);
	}

	public void print(float a, float b) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

	public void print(int a, int b) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

	public int min(int... param) {

		int m = 0;

		if (param.length > 0)
			m = param[0];

		for (int i : param) {
			if (i < m)
				m = i;
		}

		return m;
	}

}
