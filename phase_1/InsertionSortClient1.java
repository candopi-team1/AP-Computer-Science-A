class InsertionSortClient1
{

  public static void main(String args[]) 
  {        
      InsertionSort1 sorter=new InsertionSort1();
        
         int[] arr1 = {6,1,2,5,4,0, 3}; // no duplicates             
         int[] arr2 = {6,1,2,5,4,0,0, 3,0,1,-777}; // with duplicates

         int[] arr3 = {1,3,4,5,66,78,99,123}; // Already sorted OK
         int[] arr4 = {1,3,4,5,66,78,99,123,    -123,-12, -3,     0,0, 0,1,1,2,2,3}; // Already partially-sorted OK

         // ALL OK
 
        int[][] myList={arr1, arr2, arr3, arr4 };
 
       for (int[] arr : myList)
       {
         // ATTENTION : uncomment each and try each. Every method works! 
         // sorter.sort1ForWhile(arr);           sorter.printArr(arr); 
         // sorter.sort1ForFor(arr);          sorter.printArr(arr); 

         sorter.bigToSmallForWhile(arr);          sorter.printArr(arr); 

         // sorter.sortMcGrawHill(arr);  sorter.printArr(arr); 

        // sorter.sortPrinceton(arr);  sorter.printArr(arr);  // IDENTICAL TO Barron
        sorter.sortBarron(arr);  sorter.printArr(arr);        // IDENTICAL TO Princeton

         System.out.println("");

       }

      System.out.println("... ... ...  It's getting easier.");
         
  }

}

class InsertionSort1
{

  public InsertionSort1()
  {        
  }
  
   public  void printArr(int[] arr) 
   {
       for(int i=0; i < arr.length; i++)
       {
                System.out.print(arr[i]+ " ");
       }
       System.out.println();
   }


    public  void sort1ForWhile(int arr[])
    {       
         int i; int j; 
         int temp; 

         for ( i=0; i< arr.length ; i++ )
         {             
              temp = arr[i];
              j = i-1;

             while (j >=0  &&  temp < arr[j]  )
             {
                 arr[j+1] = arr[j];   
                 j -=1; 
             } // while ends

             arr[j+1] = temp;            
              
        }  // for ends
 
   }


    public  void sort1ForFor(int arr[])
    {       
         int i; int j; 
         int temp; 

         for ( i=0; i < arr.length ; i++ )
         {             
              temp = arr[i];

             for(j= i-1;  j>=0; j-- ) // ORIG while (j >=0  &&  temp < arr[j]  )
             {
                 if(temp >= arr[j]  ){ break; }

                 arr[j+1] = arr[j];   
               
             } // for ends

             arr[j+1] = temp;            
              
        }  // for ends
 
   }




    public  void bigToSmallForWhile(int[] arr)
    {     
         int i; int j; 
         int temp; 

         for ( i=0; i < arr.length ; i++ )
         {             
              temp = arr[i];
              j = i-1;

             while (j >=0  &&  temp > arr[j]  ) // FROM temp < arr[j] TO temp > arr[j]
             { 
                 arr[j+1] = arr[j];   
                 j -=1; 
                          
             } // while ends

             arr[j+1] = temp;            
              
        }  // for ends
 
       
 
   }
////////////////
public void sortMcGrawHill (int[] arr)
{

  for (int j=1 ; j < arr.length; j++)
  {
   int temp  = arr[j]; // Keep current value outside
   int index = j; 

     while (index > 0 && temp < arr[index - 1])
     {
       arr[index] = arr[index - 1]; // Move big to right
       index--;
      }

     arr[index] = temp;
  } //for

}

///
  public void sortPrinceton(int[] arr) // IDENTICAL TO Barron
  {
     for (int i = 1; i < arr.length; i++)
     {
       int temp = arr[i];  // Keep current value outside
       int j = i-1;

       while (j >= 0 && arr[j] > temp)
       {
         arr[j+1]= arr[j];
         j--;
       }

       arr[j+1]= temp;

     } // for
   }


///
  public void sortBarron(int[] arr) // IDENTICAL TO Princeton
  {
     for (int i = 1; i < arr.length; i++)
     {
       int temp = arr[i];  // Keep current value outside
       int j = i-1;

       while (j >= 0 && arr[j] > temp)
       {
         arr[j+1]= arr[j];
         j--;
       }

       arr[j+1]= temp;

     } // for
   }




}