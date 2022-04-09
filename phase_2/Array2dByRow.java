public class Array2dByRow
{

   public static void a(int num, int index, int[][] table) 
   {
       int nOfRows=table.length,  nOfCols= table[0].length;
   }
 
   public static void printTable(int[][] table)
   {
  
      for (int k = 0; k <= table[0].length; k++)
      {   
           for(int i: table[k])
           {
             System.out.print(i+ ", ");
            }  
             System.out.println("");
      }


   }


    public static void byRowStartTL(int[][] table) 
    {
       int nOfRows=table.length,  nOfCols= table[0].length;

       for(int r =0; r < nOfRows; r++)
       {
          System.out.print("Row" + r +" : ");
          for(int c =0; c < nOfCols; c++)
          {
            System.out.print(table[r][c]+ ", ");
          }
          System.out.println("");
       }

   }

    public static void byRowStartTR(int[][] table) 
    {
       int nOfRows=table.length,  nOfCols= table[0].length;

         for(int r =0; r < nOfRows; r++)
         {
          System.out.print("Row" + r +" : ");
          for(int c =nOfCols-1; c >= 0; c--)
          {
              System.out.print(table[r][c]+ ", ");
          }
          System.out.println("");
       }

   }


    public static void byRowStartBL(int[][] table) 
   {
       int nOfRows=table.length,  nOfCols= table[0].length;

       for(int r = nOfRows-1; r >= 0; r--)
       {
          System.out.print("Row" + r +" : ");
          for(int c =0; c < nOfCols; c++)
          {
                System.out.print(table[r][c]+ ", ");
          }
          System.out.println("");
       }
    }


    public static void byRowStartBR(int[][] table) 
    {
       int nOfRows=table.length,  nOfCols= table[0].length;

       for(int r = nOfRows-1; r >= 0; r--)
       {
          System.out.print("Row" + r +" : ");
          for(int c =nOfCols-1; c >= 0; c--)
          {
                System.out.print(table[r][c]+ ", ");
          }
          System.out.println("");
       }
    }


 

  public  static void main(String args[])
  {
     // int[][] table = new int[5][5];
     int[][] table ={
       {11,12,13,14,15},
       {21,22,23,24,25},
       {31,32,33,34,35},
       {41,42,43,44,45},
       {51,52,53,54,55},
       {61,62,63,64,65},

       };

       int nOfRows=table.length,  nOfCols= table[0].length;
       System.out.println("nOfRows = " + nOfRows);
       System.out.println("nOfCols = " + nOfCols);

    
     System.out.println("\nAfter Initialization:");
     printTable(table); System.out.println("");
      
     System.out.println("byRow StartTL"); byRowStartTL(table); System.out.println("");
     System.out.println("byRow StartTR"); byRowStartTR(table); System.out.println("");

     System.out.println("byRow StartBL"); byRowStartBL(table); System.out.println("");
     System.out.println("byRow StartBR"); byRowStartBR(table); System.out.println("");
}

}
