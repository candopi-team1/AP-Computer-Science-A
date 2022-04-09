class BinarySearchRecursive
{

  public static int search(int[] arr, int target, int start, int end) 
  {        
        int mid=(start + end) / 2;
 
        if (arr[mid] == target) 
            return mid;   

        else if (start > end)
            return -1;

        else if ( target < arr[mid])
            return search(arr,  target, start, mid-1);


        else if ( target > arr[mid])
            return search(arr,  target, mid + 1,  end);

         return -1;

  }


  public static void main(String args[]) 
  {                
         int[] arr1={-66, -55, -40, -7, -1, 0, 0, 1,2,3, 4,5,6, 111,123,145, 2022};

         int targ=5;
         int foundIndex;

         foundIndex = search(arr1, targ, 0, arr1.length -1);
         if (foundIndex != -1)
             System.out.println(targ + " found at " +   foundIndex);
         else  
             System.out.println(targ + " not found");


         int t2=1919;
         foundIndex = search(arr1, t2, 0, arr1.length -1);
         if (foundIndex != -1)       System.out.println(t2 + " found at " +   foundIndex);
         else                        System.out.println(t2 + " not found");

   } // main()   

}