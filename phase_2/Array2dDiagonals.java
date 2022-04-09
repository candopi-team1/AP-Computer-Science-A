class Array2dDiagonals
{
   public static void printMatrix(int[][] table)
   {
  
      for (int k = 0; k < table[0].length; k++)
      {   
           for(int i: table[k])
           {
             System.out.print(i+ " ");
            }  
             System.out.println("");
      }
  }


  public static void main(String args[]) 
  {        
      // The major and minor diagonals of a square matrix :
      final int SIZE= 6;

      int[][] mat= { 
            {1,0,0, 0,0,9},    
            {0,2,0, 0,8,0},    
            {0,0,3, 7,0,0},   
            {0,0,6, 4,0,0},
            {0,5,0, 0,5,0},
            {4,0,0, 0,0,6}     };
   
      printMatrix(mat);       System.out.println();

      System.out.print("Major diagonal ---> ");
      for (int i = 0; i < SIZE; i++)
      {
            System.out.print(mat[i][i]+ " "); // major diagonal
      }
      System.out.println();


      System.out.print("Minor diagonal ---> ");

      for (int i = 0; i < SIZE; i++)
      {
           System.out.print(mat[i][SIZE - i - 1] + " ") ; //minor diagonal
      }

         
  }// main()

}