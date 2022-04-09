class OperatorPrecedence1
{
  public static void main(String args[]) 
  {        
      int result = 0;
      result = 5 + 2 * 3 - 1;
      System.out.println("5 + 2 * 3 - 1 = " +result);
					
      result = 5 + 4 / 2 + 6;
      System.out.println("5 + 4 / 2 + 6 = " +result);
					
      result = 3 + 6 / 2 * 3 - 1 + 2;
      System.out.println("3 + 6 / 2 * 3 - 1 + 2 = " +result);
					
      result = 6 / 2 * 3 * 2 / 3;
      System.out.println("6 / 2 * 3 * 2 / 3 = " +result);
					 
      int x = 2;
      result = x++ + x++ * --x / x++ - --x + 3 >> 1 | 2;
      System.out.println("result = " +result);				 
      System.out.println("----------------------------------------------");

          
        //initialize variables with default values  
        int x2 = 2;  
        int y = 5;  
        int z =  12;  
          
        //calculating exp1, exp2, and exp3   
        int exp1 = x2   + (z/x2 + (z%y)*(z-x2) );  
        int exp2 = z/x2 + y*x2 - (y+x2)%z;  
        int exp3 = 4/2  + 8*4 - (5+2)%3;  
          
        //printing the result  
        System.out.println(exp1);  
        System.out.println(exp2);  
        System.out.println(exp3);  
      System.out.println("----------------------------------------------");
 
      int year = 2000;
      boolean b1= year % 4 == 0 && year % 100 != 0 || year % 400 == 0; // true
      boolean b2=      ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0); // true
      
      System.out.println(b1); System.out.println(b2);


      // BAD boolean b3= 1 <= 2 <= 3;
      boolean b3= 1 <= 2 && 0 <= 3; // true
      System.out.println(b3);



      boolean a = false;
      boolean b = false;
      boolean c = true;
      System.out.println(a == b == c);

      // --17 // BAD


      int u= -100, q=90;
      int v= -u, qq= -q;
      System.out.println(v +",  "+ qq);


  }// main



}
  



