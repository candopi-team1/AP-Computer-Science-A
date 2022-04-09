class TwoDArrayConnectFour
{
  public static int checkForWinner(int[][] board)
  {
      // Check for Vertical Win
      for(int r=0; r <= board.length - 4; r ++) 
      {
          for(int c=0; c < board[0].length; c ++) 
          {
               if  ( board[r][c] !=0 &&
                   board[r][c] == board[r+1][c] &&
                   board[r+1][c] == board[r+2][c] &&
                   board[r+2][c] == board[r+3][c] ) 
               return board[r][c]; 
          }
       
     } // vertical, for each row
   

      // Check for Horizontal Win
      for(int r=0; r < board.length; r ++) 
      {
          for(int c=0; c <= board[0].length - 4; c ++) 
          {
               if  ( board[r][c] != 0 &&
                   board[r][c] == board[r][c+1] &&
                   board[r][c+1] == board[r][c+2] &&
                   board[r][c+2] == board[r][c+3] ) 
               return board[r][c]; 
          }
       
     } // horizontal, for each column



      // Check for Diagonal Downward Win
      for(int r = 0; r <= board.length - 4; r ++) 
      {
          for(int c = 0; c <= board[0].length - 4; c ++) 
          {
               if  ( board[r][c] != 0 &&
                   board[r][c]     == board[r+1][c+1] &&
                   board[r+1][c+1] == board[r+2][c+2] &&
                   board[r+2][c+2] == board[r+3][c+3] ) 
               return board[r][c]; 
          }
       
     } // Diagonal Downward Win


      // Check for Diagonal Upward Win
      for(int r = 3; r < board.length; r ++) 
      {
          for(int c = 0; c <= board[0].length - 4; c ++) 
          {
               if  ( board[r][c] != 0 &&
                   board[r][c]     == board[r-1][c+1] &&
                   board[r-1][c+1] == board[r-2][c+2] &&
                   board[r-2][c+2] == board[r-3][c+3] ) 
               return board[r][c]; 
          }
       
     } // Diagonal Upward Win

     // ////////////// /////////////// /////////////
     return 0;      
   } // checkForWinner ends


  public static void main(String args[]) 
  {      
      int[][] table1 ={
      {0,0,0, 0,0,0, 1},
      {0,3,0, 0,0,0, 1},
      {0,3,0, 0,0,0, 1},

      {0,3,0, 0,0,0, 0},
      {0,3,0, 0,0,0, 0},
      {0,0,0, 0,0,0, 0},

     };
   System.out.println("Winner !" + checkForWinner(table1) ); // 3 Vertical
  

      int[][] table2 ={
      {0,0,0, 0,0,0, 3},
      {0,3,0, 1,1,1, 1},
      {0,1,0, 0,0,0, 1},

      {0,3,0, 0,0,0, 0},
      {0,3,0, 0,0,0, 0},
      {0,0,0, 0,0,0, 0},

      };   
   System.out.println("Winner !" + checkForWinner(table2) ); // 1 Horiz
  
      
 
      int[][] table3 ={
      {0,4,0,0,0,0, 0},
      {0,0,4,0,0,0, 0},
      {0,0,0,4,0,0, 0},
      {0,0,0,0,4,0, 0},
      {1,1,2, 2,0,0, 0},
      {0,0,0, 2,0,0, 0},

      }; 
   System.out.println("Winner !" + checkForWinner(table3) ); // 4 DiagDown
  

      int[][] table4 ={
      {0,0,0, 0,8,0, 0},
      {1,0,0, 8,0,0, 0},
      {2,0,8, 0,1,0, 0},
      {3,8,0, 0,5,0, 0},
      {0,0,0, 5,0,0, 0},
      {0,0,0, 5,0,0, 0},

      };
   System.out.println("Winner !" + checkForWinner(table4) ); // 8 DiagUp 

  }// main()

}
/*
      int[][] table0 ={
      {0,0,0, 0,0,0, 0},
      {0,0,0, 0,0,0, 0},
      {0,0,0, 0,0,0, 0},

      {0,0,0, 0,0,0, 0},
      {0,0,0, 0,0,0, 0},
      {0,0,0, 0,0,0, 0},

      };
 
*/