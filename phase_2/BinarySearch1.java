class BinarySearch1
{

   public static void printArr(int[] arr)
   {
       for(int i=0; i< arr.length; i++)
      {
                System.out.print(arr[i]+ " ");
       }
       System.out.println();
   }



    public static void searchFor(int arr[], int target)
    {         
          int start = 0, endd = arr.length -1,  mid = 0; 

          for ( start=0 ; start <= endd ;  ) 
          {
             mid = (start +endd )/2; 

             if (arr[mid] == target) break;

             if (arr[mid] < target)
             {
                 start = mid +1;  
             }          
             else if (arr[mid] > target)
             {
                 endd = mid -1;                   
             }   
             
             System.out.println(start + " " + endd + " " +  mid + "<-------");
     
             if (start == endd)
             {
                mid= start;
                break;
             } 
  
         }  // for

         if (arr[mid] == target)
         {
                System.out.println(target + " Found at index " + mid + " <--- by FOR ");
         } 
         else
         {
             System.out.println(target + " NOT FOUND");
         }
    
        
 
    }
  

    public static void searchWhile(int arr[], int target){   
         int mid = 0, start = 0, endd = arr.length -1; 
  
         while ( start <= endd ) // not exhuasted && not found
         {
             mid = (start+ endd)/2; 

              //ok System.out.print( start + " " + endd + " ");
              //ok System.out.println(mid+ " ==> " + arr[mid]);
              if (arr[mid] == target) break;        
            
             if (arr[mid] < target)
             {
                 start = mid +1;  
             }          
             else if (arr[mid] > target)
             {
                 endd = mid -1;  
             }                     
    
         }  // while 

         if (arr[mid] == target)
         {
                 System.out.println(target + " Found at index " + mid + " <--- by WHILE ");
         } 
         else
         {
             System.out.println(target + " NOT FOUND");
         }
        
 
    }

  
  public static void main(String args[]) 
  {
          int target= Integer.valueOf(args[0]);

         // int arrOK[] = {-123, -12, -3,  0, 1,3,4,5,66,78,99,123, 444}; //ok
         // int arrO[] = {1,3,4,5,66,78,99,123, 140};         // ok 
         int arr[] = {0,1,2,3,  4,      5,6,7, 8, 9, 10, 11,12,13,14,15,  16,17,18,19, 20, 21}; 
        
          printArr(arr);                     System.out.println();
         
          searchFor(arr, target) ;           System.out.println("");                  
          searchWhile(arr, target) ;
   }// main()

}

