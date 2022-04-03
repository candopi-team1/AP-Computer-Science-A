class SelectionSort1
{
   public static void printArr(int[] arr) 
   {
       for(int i=0; i< arr.length; i++)
       {
                System.out.print(arr[i]+ " ");
       }
       System.out.println();
   }

    public static void sort1(int[] arr)
    {
         int smlstIndex; 
         int i; int j; 
         int temp;

         for ( i=0; i < arr.length -1; i++ ) {
             smlstIndex = i; //  1. save the index as "assumed smallest";  
             // 2. Make a new index, to check right members. 

             for (j= i+1; j < arr.length; j++ )  // for(FROM j TO end )
             {
                 if (arr[j] < arr[smlstIndex]) // 3. If smomething on right is smaller,
                 {
                    smlstIndex = j ;   // 3. Take it as smallest.  
                 }          
             }

             // 4. Have found smallest. Swap it with the "assumed smallest";
             temp            =  arr[i] ;
             arr[i]          = arr[smlstIndex] ;
             arr[smlstIndex] = temp;    
        }  // for outer 

   }
  
  
  public static void main(String args[]) 
  {

         // int arr[] = {6,1,2,5,4,3,0,7}; // OK
         int[] arr = { 7,7, 6,1,2,5,4,0,0, 3,0,1,-777,7,7}; // with duplicates // OK
         int[] arr2 = {-777, 0, 0, 0, 1, 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 8,9, 100}; // Already sorted //OK 

         printArr(arr); 
         sort1(arr);  
         printArr(arr); 
  
  }// main method

}

