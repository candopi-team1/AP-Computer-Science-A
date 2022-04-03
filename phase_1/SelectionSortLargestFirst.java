class SelectionSortLargestFirst
{
   public static void printArr(int[] arr) 
   {
       for(int i=0; i < arr.length; i++)
       {
                System.out.print(arr[i]+ " ");
       }
       System.out.println();
   }

    public static void sort1(int[] arr)
    {
         int bigstIndex; 
         int i; int j; 
         int temp;

         for ( i=0; i< arr.length -1; i++ ) 
         {
             bigstIndex = i;

             for (j= i+1; j <arr.length; j++ )
             {
                 if (arr[j] > arr[bigstIndex]){
                    bigstIndex = j ;  
                 }          
             }

             temp            =  arr[i] ;
             arr[i]          = arr[bigstIndex] ;
             arr[bigstIndex] = temp;              
              
        }  // for outer
   }

  
  public static void main(String args[]) 
  {

         int[] arr1 = { 7,7, 6,1,2,5,4,0,0, 3,0,1,-777,7,7}; // with duplicates // OK
         int[] arr2 = {-777, 0, 0, 0, 1, 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 8,9, 100}; // Already sorted // OK 
         int[] arr = { 88, 34, 24, 11, 10, 7, 7, 7, 7, 6, 5, 4, 3, 2, 1, 1, 0, 0, 0, -777, -999};  // Already sorted //OK 

          printArr(arr); 
          sort1(arr);
          printArr(arr); 
  
  }// main method



}


