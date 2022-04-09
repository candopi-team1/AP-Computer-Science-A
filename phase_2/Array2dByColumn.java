public class Array2dByColumn
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


    public static void byColumnStartTL(int[][] table) 
    {
       int nOfRows=table.length,  nOfCols= table[0].length;

       for(int c =0; c < nOfCols; c++)
       {
           System.out.print("Column "+ c +" : "); 
          for(int r =0; r < nOfRows;  r++)
          {                         
                System.out.print(table[r][c]+ ", ");
          }
          System.out.println("");
       }

   }

    public static void byColumnStartTR(int[][] table) 
    {
       int nOfRows=table.length,  nOfCols= table[0].length;

       for(int c =nOfCols-1; c >= 0;  c--)
       {
           System.out.print("Column "+ c +" : "); 

          for(int r =0; r < nOfRows;  r++)
          {                         
             System.out.print(table[r][c]+ ", ");
          }
          System.out.println("");
       }

   }


    public static void byColumnStartBL(int[][] table) 
    {
       int nOfRows=table.length,  nOfCols= table[0].length;

       for(int c =0; c < nOfCols; c++)
       {
           System.out.print("Column "+ c +" : "); 
          for(int r = nOfRows-1;  r >= 0; r--)
          {                         
                System.out.print(table[r][c]+ ", ");
          }
          System.out.println("");
       }

   }



    public static void byColumnStartBR(int[][] table)
    {
       int nOfRows=table.length,  nOfCols= table[0].length; 

       for(int c =nOfCols-1; c >= 0;  c--)
       {
           System.out.print("Column "+ c +" : "); 
          for(int r = nOfRows-1;  r >= 0; r--)
          {                         
                   System.out.print(table[r][c]+ ", ");
          }
          System.out.println("");
       }

   }

 

  public  static void main(String args[]) 
  {

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
     

     System.out.println("byColumn StartTL"); byColumnStartTL(table); System.out.println("");
     System.out.println("byColumn StartTR"); byColumnStartTR(table); System.out.println("");
  

  
     System.out.println("byColumn StartBL"); byColumnStartBL(table); System.out.println("");
     System.out.println("byColumn StartBR"); byColumnStartBR(table); System.out.println("");
 

}

}
