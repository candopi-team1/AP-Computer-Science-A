class  ShortCircuitEvaluations

{

  public static void main(String args[]) 
  {    
    
       if (false && true && true) {
            System.out.println("Un-see-able");
        }

        if (0 == 1 && 2 + 2 == 4) {
                 System.out.println("This line won't be printed either.");
        }


        if (true || false || false) {
            System.out.println("This output is always printed");
        }
        



         if (2 + 2 == 4 || 0 == 1) {
            System.out.println("One True makes the whole True.");
         } 
         System.out.println();

         System.out.println( 1 < 3 ||  5 * 7 % 3 >= 9 / 4 * 7 + 3 );

           
  }

}