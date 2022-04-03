/*

*/

public class Conditionals
{ 
 
  public  static void main(String args[]) 
  {
        int x = 10;
        if (x%2 ==0) 
           System.out.println(x + " is even.");
        else
           System.out.println(x + " is not even.");
        System.out.println("\n");


        if (x%2 ==0)
        { 
           System.out.println(x + " is even.");
                   if (x > 5){ 
                           System.out.println(x + " is larger than 5.");
                   }

        }
        System.out.println("\n");
    
       if (x > 5)
       { 
           System.out.println(x + " is larger than 5.");
          if (x%2 ==0){ 
              System.out.println(x + " is even.");         
          }

       }
       System.out.println("\n");

     if (x > 5 &&  x%2 ==0) 
     { 
           System.out.println(x + " is larger than 5. "+  x + " is even.");         
          
       }
       System.out.println("\n");



      if (x <5 &&  x < 100) // condition2 is true.
     {
          System.out.println("Both condition1 and condition2 are not true");
     }
     else 
     {
          System.out.println("Either condition1 or condition2 is false (or both are false)");

     }




  }



}
