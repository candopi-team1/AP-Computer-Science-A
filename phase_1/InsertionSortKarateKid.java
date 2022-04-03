class InsertionSortKarateKid
{
   public  static void printArr(int[] arr) 
   {
       for(int i=0; i < arr.length; i++)
       {
                System.out.print(arr[i]+ " ");
       }
       System.out.println();
   }

  public static void main(String args[]) 
  {         
        int[] arr1 = {2,4, 3,1, 0}; 
        int[] arr12 = {6,4,1, 7,8};  // OK. Test this too.
        int[] arr13 = {1,2,9, 8,3,2}; // with duplicates.  OK. Test this too.


        System.out.print("START "); printArr(arr1);System.out.println();
           
        int i,j, temp;
        for(i=1; i < arr1.length; i++)
        {
          j    = i-1;        // see left
          temp = arr1[i]; // save current value

          while(j >= 0  && arr1[j] > temp) // till left exists and left is bigger
          {
              arr1[j+1] = arr1[j]; // In right, place that biggie
              j --;                // move to left
              System.out.print("  "); printArr(arr1);
 
          }// while

          // Have found something samller than or equal to current value
          arr1[j+1] = temp; 
          System.out.print("i= " + i +": "); printArr(arr1);  System.out.println();
        }

           System.out.print("END  "); printArr(arr1);
           System.out.println();System.out.println();
         
  }//main



}