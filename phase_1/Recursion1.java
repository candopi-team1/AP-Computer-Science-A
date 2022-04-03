class Recursion1
{

  public static int factorial(int n)
  {
     if (n == 1) // base case comparison // ok, too// if (n == 0) 
       return 1;
     else
       return n * factorial(n - 1); // move closer to base case
  }

  public static int fibonacci(int n)
  {
     if (n == 1 || n == 2)
       return 1;
     else
       return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void reverseDigits(int n)
  {
    System.out.print(n % 10); //rightmost digit
    if (n / 10 != 0) //base case
      reverseDigits(n / 10);
  }


  public static void printLine(int n)
  {
    if (n == 0)
     System.out.println("That's all, folks!");
    else
    {
      for (int i = 1; i <= n; i++)
      {
            System.out.print("*");
      }
      System.out.println();
      printLine(n - 1);
    }
  }




  public static void main(String args[]) 
  {   
      System.out.println(factorial(5)); // find factorial(5)
      System.out.println("");
 
      System.out.println(fibonacci(6)); // find fibonacci(6)    
      System.out.println("");

      reverseDigits(123050);
      System.out.println("\n");

      printLine(6);

         
  }

}