
class TwoDArray2
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
 


      // Print every row
      System.out.println("Every Row, row by row");
      for(int row=0; row < table.length; row ++) // every row
      {
          for(int column=0; column < table[0].length; column ++) // every column
          {
              System.out.print(table[row][column]+ " "); // every cell
          }
           System.out.println("");
      }
      System.out.println("---------------------------------------------------- ");   

      // Print every column
      System.out.println("Every Column, column by column");


      int[][] myGrid = table;
 
      for (int column = 0; column < myGrid[0].length; column++) // every column
      {
          for (int row = 0; row < myGrid.length; row++) // every row
          {
            System.out.print(myGrid[row][column] + " "); // every cell
          }
      System.out.println("");

      }

      


  }

}