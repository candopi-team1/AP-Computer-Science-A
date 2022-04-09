
class TwoDArraySumAndLargest
{

  public static void main(String args[]) 
  {      

      int[][] table ={
       {11,12,13,14,15},
       {21,22,23,24,25},
       {31,32,33,34,35},
       {41,42,43,44,45},
       {51,52,53,54,55},
       {61,62,63,64,65},
       };
 


      // Sum by row
      System.out.println("Sum, row by row");
      int sum1=0;
      for(int row=0; row < table.length; row ++) // every row
      {
          for(int column=0; column < table[0].length; column ++) // every column
          {
              sum1 += table[row][column]; // every cell
          }
      }
      System.out.println("Sum1 = " + sum1 );
      System.out.println("---------------------------------------------------- ");   

      // Sum by column
      System.out.println("Sum, column by column");
      int[][] myGrid = table;
      int sum2=0;
      for (int column = 0; column < myGrid[0].length; column++) // every column
      {
          for (int row = 0; row < myGrid.length; row++) // every row
          {
            sum2 += myGrid[row][column]; // every cell
          }
      }

      System.out.println("Sum2 = " + sum2 );
      System.out.println("---------------------------------------------------- ");   


      // Largest cell value
      int[][] myGrid3 ={
       {11,12,13,14,15},
       {21,2022,23,24,25},
       {31,32,33,34,35},
       {41,42,43,44,45},
       {51,52,53,54,55},
       {61,62,63,64,65},
       };
 
      System.out.println("Sum, column by column");
      int largest=0;
      for (int column = 0; column < myGrid3[0].length; column++) // every column
      {
          for (int row = 0; row < myGrid3.length; row++) // every row
          {
            if( myGrid3[row][column]  > largest) 
                  largest=  myGrid3[row][column]   ; // every cell
          }
      }

      System.out.println("Largest cell value =" + largest );
    
      


  }

}