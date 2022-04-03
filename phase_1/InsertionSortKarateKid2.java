class InsertionSortKarateKid2
{
   public  static void printArr(int[] arr) 
   {
       for(int i=0; i< arr.length; i++)
       {
                System.out.print(arr[i]+ " ");
       }
       System.out.println();
   }

  public static void main(String args[]) 
  {   
      
        System.out.println("// GOAL = In an array, compare each element to its neighbor on the right");
        int[] arr = {6,1,2,5,4,0, 3}; // no duplicates        
        printArr(arr); 

        for (int i=0; i< arr.length -1; i++ )
        {
          if(arr[i] > arr[i+1]){
             System.out.println(arr[i] + " is larger than its neighbor on the right");      
          }             
                            
        }  // for ends
        System.out.println();System.out.println();


        System.out.println("// GOAL = In an array, move first element to end of the array");
        printArr(arr);
        int first=  arr[0];
        for (int i=0; i< arr.length-1; i++ )
        {
          int temp= arr[i];
           arr[i] =  arr[i+1];    
           arr[i+1]= temp;     
        }  // for ends

        arr[arr.length-1]= first;

        printArr(arr);
        System.out.println();System.out.println();



        ////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("// GOAL = In an array, move chosen element to where it belongs in the Left");
        System.out.println("// e.g. In 9 2 3   1   4 5, move 1 to Left wherever it belongs.");
        int[] arr4={9, 2, 3,  1, 4, 5};
     
        printArr(arr4);
       
       int k = 2;
       int temp2 = 1;
       while(k >=0 && temp2< arr4[k] )
       {
          arr4[k+1] = arr4[k];
          k--; 
       } 

       arr4[k+1] = temp2;
       printArr(arr4);

         
  }//main



}