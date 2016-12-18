class ArraySumDemo
{
	public static void main(String[] args)
	{
		int[] myArrayOfIntegers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		for(int x : myArrayOfIntegers)
		{
		  System.out.println("Value of x is: " + x + " and value of sum is " + sum);
		  sum += x;
		}
		System.out.println("Outside the for loop. Sum is: " + sum);
	}
}