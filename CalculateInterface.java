package package_01;

public interface CalculateInterface {

	public void sum(int a, int b);

	public void sum(float a, float b);

	public void minus(int a, int b);

	public void minus(float a, float b);

	public void multiply(int a, int b);

	public void multiply(float a, float b);

	public void division(int a, int b);

	public void division(float a, float b);

	public void print(float a, float b);

	public void print(int a, int b);

	public int min(int... param);
}
