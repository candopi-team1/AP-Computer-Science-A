
class ErrorCompileOrRuntime
{
   public static void doIt1(int a) 
   {
      // return 1; //MUST NOT RETURN
   }

   public static int doIt2(int a) 
   {
      return 1;//1.23; // //MUST RETURN int
   }


   public static int doIt3(double n) 
   {
       /*
       ErrorCompileOrRuntime.java:17: error: incompatible types: possible lossy conversion from double to int
             return  Math.sqrt(n)/2;
                          ^
       1 error
       error: compilation failed
       */

      // return  Math.sqrt(n)/2;
      return 1;
   }



   public static void getIllegalArgumentException(String country, double taxRate) throws Exception {
      
       if( country =="India" && taxRate <=55)
       {
          throw new IllegalArgumentException(country + " taxes way more than " + taxRate+" %");
       }

       if( country =="Italy" && taxRate <=30)
       {
          throw new IllegalArgumentException(country + " taxes way more than " + taxRate+" %");
       }
      
       if( country =="Ireland" && taxRate <=25)
       {
          throw new IllegalArgumentException(country + " taxes way more than " + taxRate+" %");
       }
      
       if( country =="Iceland" && taxRate <=20)
       {
          throw new IllegalArgumentException(country + " taxes way more than " + taxRate+" %");
       }
      
      
       if( country =="Indonesia" && taxRate <=10)
       {
          throw new IllegalArgumentException(country + " taxes way more than " + taxRate+" %");
       }

  }





  public static void main(String args[]) 
  {        
         // System.out.println(doIt1(3));
         /*
          ErrorCompileOrRuntime.java:6: error: incompatible types: unexpected return value
          ...      
          error: compilation failed
         */
         

         //System.out.println(doIt2(3.0));
         /*
         ErrorCompileOrRuntime.java:11: error: incompatible types: possible lossy conversion from double to int
           ... 
         error: compilation failed
         
         */         


         // System.out.println(doIt2(3.0)); // MUST CALL WITH int ONLY
         /*
         ErrorCompileOrRuntime.java:54: error: method doIt2 in class ErrorCompileOrRuntime cannot be applied to given types;
                  System.out.println(doIt2(3.0));
                            ^
           required: int
           found:    double
           reason: argument mismatch; possible lossy conversion from double to int
         1 error
         error: compilation failed
         */

         /*
         */

         // System.out.println(doIt3(3.0)); // CORRECT, CALL WITH double ONLY
         // STILL CAUSE exception inside that method !!


        try
         {
           System.out.print(1 +" "); getIllegalArgumentException("India", 32);          
         }
         catch(Exception ex)
         {
            ex.printStackTrace();
         }  
         System.out.println("***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***   \n");


        try
         {
           System.out.print(2 +" "); getIllegalArgumentException("Italy", 22);          
         }
         catch(Exception ex)
         {
            ex.printStackTrace();
         }  
         System.out.println("***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***   \n");


        try
         {
            System.out.print(3 +" "); getIllegalArgumentException("Ireland", 20);          
         }
         catch(Exception ex)
         {
            ex.printStackTrace();
         }  
         System.out.println("***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***   \n");


         System.out.println("MORAL OF THE STORY: See, the Compiler has no interest in such outside-world affairs.");
         System.out.println("It doesn't check such errors. So this type of errors is called 'unchecked,' or 'runtime' error!!");
         System.out.println("Programmers must learn to throw/raise and catch/handle such errors by themselves.");
  }// main

}