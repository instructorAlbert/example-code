class ArraySumDemo0
{
  public static void main(String[] args)
  {
    int[] myArrayOfIntegers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int sum = 0;

    for(int i = 0; i < myArrayOfIntegers.length; i++)
    {
      System.out.println("Value of this element in the arry is: " + myArrayOfIntegers[i] + " and value of sum is " + sum);
      sum += myArrayOfIntegers[i];
    }
    System.out.println("Outside the for loop. Sum is: " + sum);
  }
}