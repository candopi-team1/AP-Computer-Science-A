class StarPyramids{
  
  public static void main(String args[]) {
         int noOfRows= Integer.valueOf(args[0]);


         String star = "*";    
         String gap = " ";   
         System.out.println("star repeats 3 times = "+star.repeat(3));
          
         System.out.println("/////////////// 1 bottomLeft"); 
         for(int j=0; j <= noOfRows; j++){
            if(j!=0) 
              System.out.println(star.repeat(j));        
         }     
         
         int noOfGaps = noOfRows;
          
          System.out.println("/////////////// 2 bottomRight");          
          for(int j=0; j <= noOfRows; j++){
              if(j!=0)
                System.out.println( gap.repeat(noOfGaps) + star.repeat(j) );
            noOfGaps -=1;        
          }


         noOfGaps = 0;
         
          System.out.println("/////////////// 3 topRight");          
          for(int j = noOfRows; j > 0; j--){
            System.out.println( gap.repeat(noOfGaps) + star.repeat(j) );
            noOfGaps +=1;        
          }


          System.out.println("/////////////// 4 topLeft");          
          for(int j = noOfRows; j > 0; j--){
            System.out.println(star.repeat(j) );
                  
          }




  }



}


