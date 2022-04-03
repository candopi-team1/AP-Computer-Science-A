class ForLoop1
{ 
 
  public static void main(String args[])
  {
      for (int i = 0; i < 3; i++)
     {
           System.out.println("hello");
      }
     System.out.println("********* ********* ");



          for(int j=0; j < 6; j++)
         {
            System.out.print(j + " ");
          }
          System.out.println("\n");

          for(int j=0; j < 6; j=j+2)
          {
            System.out.print(j + " ");
          }
         System.out.println("\n");System.out.println("********* ********* ");
 

         int k;
         for (k = 20; k >= 15; k--)
         {
           System.out.print(k + " ");
         }
         System.out.println("\n");

         for (k = 20; k >= 15; k=k-5)
         {
           System.out.print(k + " ");
         }

         System.out.println("\n");System.out.println("********* ********* ");
 


          
        System.out.println("Nothing will be printed below."); 
          for(int j=1; j < 1; j++){
            System.out.print(j+ " ");
          }        

        System.out.println("Nothing will be printed below."); 
          for(int j=9; j > 91; j--){
            System.out.print(j+ " ");
          }
          System.out.println("********* ********* ");
    

  }



}
