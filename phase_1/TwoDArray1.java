
class TwoDArray1
{

  public static void main(String args[]) 
  {      
     
       for(int i=0; i<3; i++)
       {
          for(int i2=1; i2<6; i2++) // control variable i2 can be anything such u,v,x,y etc.
          {
                System.out.print(i2+ " ");
          }
           System.out.println("");
       }


       for(int outer = 0; outer < 3; outer++){
           System.out.println("The outer index is: " + outer);
           for(int inner = 0; inner < 4; inner++){
               System.out.println("	The inner index is: " + inner);
           }
       }



      int[][] twoDIntArray;
      String[][] twoDStringArray;
      double[][] twoDDoubleArray;
      System.out.println("Correct! So far, no error.\n");



      int[][] threeFour=new int[3][4] ;
      System.out.println("No of rows    = "+ threeFour.length);
      System.out.println("No of columns = "+ threeFour[0].length);

      int[][] table ={
       {11,12,13,14,15},
       {21,22,23,24,25},
       {31,32,33,34,35},
       {41,42,43,44,45},
       {51,52,53,54,55},
       {61,62,63,64,65},
       };
 
      // print first row
      for(int j=0; j< table[0].length; j ++)
      {
         System.out.print(table[0][j]+ " ");
      }
     System.out.println("\n");



      for(int i=0; i< table.length; i ++) // every row
      {
          for(int j=0; j< table[0].length; j ++)
          {
              System.out.print(table[i][j]+ " ");
          }
           System.out.println("");
      }
         
  }

}