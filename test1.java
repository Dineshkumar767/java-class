
interface intone

{

	int add(int a, int b);

}

interface inttwo

{

	int sub(int a, int b);

}

interface intthree extends intone, inttwo

{

	int mul(int a, int b);

}

class test1 implements intthree

{

	public int add(int a, int b)

	{

		return (a + b);

	}

	public int sub(int a, int b)

	{

		return (a - b);

	}

	public int mul(int a, int b)

	{

		return (a * b);

	}

	public static void main(String args[])

	{

		test1 t = new test1();

		System.out.println("Sum = " + t.add(2, 5));

		System.out.println("Difference = " + t.sub(2, 5));

		System.out.println("Product = " + t.mul(2, 5));

	}

}
