class MergeSortPrinceton
{

   public static void printArr(int[] arr) 
   {
       for(int i=0; i < arr.length; i++)
       {
                System.out.print(arr[i]+ " ");
       }
       System.out.println();
   }

   public static void printArr2(int[] arr, int start, int endd) 
   { 
        System.out.print( start + " " + endd +" --> ");
       for(int i=start; i <= endd; i++)
       {
                System.out.print(arr[i]+ " ");
       }
       System.out.println();
   }


   public static void merge(int[] arr, int lowIndex, int mid, int highIndex, int[] tempArr ) 
   {
          int l= lowIndex; 
          int m= mid +1; 
          int n= lowIndex;

          while ( l <= mid && m <= highIndex)
          {
                if (arr[l] <= arr[m])
                {
                   tempArr[n]=  arr[l];
                   l++;
                }
                else
                {
                   tempArr[n]=  arr[m];
                   m++;
                }            
                n++;

          } // 1st while ends

          while ( l <= mid)  // if things still remain in left side
          { 
              tempArr[n]=  arr[l];
              l++;  n++;  
          } 

          while ( m <= highIndex)   // if things still remain in right side
          {
             tempArr[n]=  arr[m];
             m++; n++;
          } 

          for(n = lowIndex; n <= highIndex; n++)
          {
               arr[n] = tempArr[n];  
          }

    }


    public static void mergeSortHelper(int[] arr, int lowIndex, int highIndex, int[] tempArr)
    {            
           printArr2(arr, lowIndex, highIndex);
 
           if (lowIndex < highIndex )
           { 

           // OK int mid = ( lowIndex + highIndex) / 2;
           int mid = lowIndex + ( highIndex - lowIndex) / 2; // McGraw Hill trick //OK too


           
           mergeSortHelper(arr,  lowIndex,  mid,       tempArr);
           mergeSortHelper(arr,  mid+1,     highIndex, tempArr);

           merge(arr, lowIndex, mid, highIndex, tempArr); 
         }// if

           System.out.println("End of mSortHelper-->"); printArr2(arr, lowIndex, highIndex);
                 
   }

  
  public static void main(String args[]) {
          //OK int arr1[] = {6,1,2,5,4,3,0,7};
         // int arr[] = {6,1,2,5,4,3,0,7};

         int[] arr2 = {6,1,2,5,4,0,0, 3,0,1,-777}; // with duplicates

         int[] arr3 = {1,3,4,5,66,78,99,123}; //Sorted OK
         int[] arr4 = {123,-1, 66,34,23,12,11,1,1, -2, -56, 666, 10,9,8,1}; // ALL 4 are OK
         int[] arr6= { 56, -2, -1, 1, 1, 1, 8, 9, 10, 11, 12, 23, 34, 66, 123, 666};
         int[]  arr12= {666, 123, 66, 56, 34, 23, 12, 11, 10, 9, 8, 1, 1, 1, -1, -2};

          int arr[] = {12, 9,3,7,   14,11, 6,  2,10,5}; // "Algorithms Unlocked", Thormas H Cormen, 2013, page 43.

          int low=0; int high= arr.length - 1;
          int[] tempArr= new int[arr.length];

          mergeSortHelper(arr, low, high, tempArr);  
          printArr(arr);          
  }

}
