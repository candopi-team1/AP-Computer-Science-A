class SequentialSearch1
{
   public static void printArr(int[] arr) 
   {
       for(int i=0; i< arr.length; i++)
       {
                System.out.print(arr[i]+ " ");
       }
       System.out.println();
   }



    public static int searchFor(int arr[], int target)
    {         
          for ( int i=0 ; i < arr.length ; i++  ) 
          {
             if (arr[i] == target)
             {
                return i;
             }         
  
         }  // for
         return -1111;

    }
  
    public static int searchFor2(int[] arr, int target)
    {      
          int loc =0;   
          for ( int i : arr  ) 
          {
             if (i == target)
             {
                return loc;
             }         
             loc++;

         }  // for

         return -1111;
    }
  

    
  public static void main(String args[]) 
  {
          int target= Integer.valueOf(args[0]);

         // int arrOK[] = {-123, -12, -3,  0, 1,3,4,5,66,78,99,123, 444}; //ok
         // int arrO[] = {1,3,4,5,66,78,99,123, 140};         // ok 
         int arr1[] = {0, -1, -2,-3,  -4,      -5,-6,-7, -8}; 

         int arr[] = {123, 87, 58, 43, 39, 24, 11, 3, 0 ,-1 , -6, -45, -99 };
         

          printArr(arr);                      
          System.out.println("Found "+ target  +" at " + searchFor(arr, target) ); 
          System.out.println("Found "+ target  +" at " +  searchFor2(arr, target) ); 

          System.out.println("");                  
         
        }

}
