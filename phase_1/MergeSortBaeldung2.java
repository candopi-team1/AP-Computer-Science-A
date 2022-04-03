/* Refactored version of https://www.baeldung.com/java-merge-sort */
class MergeSortBaeldung2
{

   public static void printArr(int[] arr) 
   {
       for(int i=0; i < arr.length; i++)
       {
                System.out.print(arr[i]+ " ");
       }
       System.out.println();
   }


   public static void merge(int[] arr, int[] leftHalf, int[] rightHalf ) 
   {
          int leftIndex=0; int rightIndex=0; 
          int newIndex=0;

          while (leftIndex < leftHalf.length && rightIndex < rightHalf.length)
          {

                if (leftHalf[leftIndex] <= rightHalf[rightIndex])
                {
                    arr[newIndex] = leftHalf[leftIndex];
                    newIndex+=1; leftIndex+=1;
                }
                else
                {
                    arr[newIndex] = rightHalf[rightIndex];
                    newIndex+=1; rightIndex+=1;
                }            

          } // 1st while ends

          while (leftIndex < leftHalf.length) // if things still remain in leftHalf
          {
                arr[newIndex] = leftHalf[leftIndex];
                newIndex+=1; leftIndex+=1;
          } 

          while (rightIndex < rightHalf.length) // if things still remain in rightHalf
          {
                arr[newIndex] = rightHalf[rightIndex];
                newIndex+=1; rightIndex+=1;
          } 

    }


    public static void mergeHelper(int[] arr)
    {   
           System.out.print("Helper starts --> "); printArr(arr);
           int len = arr.length;

           if(len < 2){ return;  } 

           int mid = len/2;

           //// Build left half 
           int leftHalf[] = new int [mid];
           int i =0;
           for (i = 0; i < mid; i++)
           {
               leftHalf[i] = arr[i];
           }

            //// Build right half 
           int rightHalf[] = new int [len - mid];      
           for ( i = 0; i < len-mid; i++)
           {
               rightHalf[i] = arr[mid+i];
           }

           mergeHelper(leftHalf); 
           mergeHelper(rightHalf);
           merge(arr, leftHalf ,rightHalf); 
           System.out.print("Helper ends --> "); printArr(arr);
                 
   }



  
  public static void main(String args[]) 
  {
         int[] arr1 = {6,1,2,5,4,3,0,7}; // OK
         int[] arr2 =  { 6,1,2,5,4,0,0, 3,0,1,-777}; // with duplicates //OK

         int[] arr3 = { 1,3,4,5,66,78,99,123}; // Sorted OK

         int[] arr4 = { 123,66,34,23,12,11,10,9,8,1}; // largest to smallest sorted // OK

         int[] arr5 = { 56, -2, -1, 1, 1, 1, 8, 9, 10, 11, 12, 23, 34, 66, 123, 666}; // OK
         int[]  arr6 = {666, 123, 66, 56, 34, 23, 12, 11, 10, 9, 8, 1, 1, 1, -1, -2}; // largest to smallest sorted // OK

         int[] arr = {12, 9,3,7,   14,11, 6,  2,10,5}; // "Algorithms Unlocked", Thormas H Cormen, 2013, page 43.


          mergeHelper(arr);  
          printArr(arr);
          
  }

}

