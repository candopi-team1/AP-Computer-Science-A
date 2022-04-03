class Array1
{

  public static void main(String args[]) 
  {        
         double[] data1 = new double[25];
         double data2[] = new double[25];

         double[] data3;
         data3 = new double[25];
         //Reassign
         data3 = new double[40];
         System.out.println("So far, so good. No error.\n");


         // count the number of even integers in array arr of integers 
         int[] arr={1, 2, 39, 4, 5, 6, 79, 88, 9, 10};

         int count = 0;
         for (int num : arr) // Note: enhanced loop
          if ( num % 2 == 0) //num is even
              count++;
         System.out.println("count =" + count +  "\n");



         // Change each even-indexed element in array arr2 to 0.
         int[] arr2= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         for (int i = 0; i < arr2.length; i += 2)
           arr2[i] = 0;

         for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i]+ " ");
         System.out.println("\n");


        String[] names = new String[5];
        String[] names2 = {"Bill Clinton", "Ronald Reagan", "Gerald Ford", };

        // loop to process all names in array
        for (int i = 0; i < names2.length; i++)
           names2[i] = "President "+names2[i];
      
        for (int i = 0; i < names2.length; i++)
            System.out.println(names2[i]);
         
  }

}