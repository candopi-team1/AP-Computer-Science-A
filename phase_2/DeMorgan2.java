
class DeMorgan2
{

  public static void main(String args[]) 
  {        

        boolean true1 = true;
        boolean false1 = false;       


       //////////////////////  NO insideAND       ==>  NOeach  OR
        System.out.println( (  !(true1  && true1 ) == ( !true1   ||  !true1))       );      
        System.out.println( (  !(true1  && false1 ) == ( !true1  ||  !false1))       );      
   
        System.out.println( (  !(false1  && true1 ) == ( !false1   ||  !true1))       );    
        System.out.println( (  !(false1  && false1 ) == ( !false1  ||  !false1))       );    
        System.out.println("--------------------------------------------------------------------------");


       //////////////////////  NO insideOR       ==>  NOeach  AND
        System.out.println( (  !(true1  || true1 ) == ( !true1   &&  !true1))       );      
        System.out.println( (  !(true1  || false1 ) == ( !true1  &&  !false1))       );      
   
        System.out.println( (  !(false1  || true1 ) == ( !false1   &&  !true1))       );    
        System.out.println( (  !(false1  || false1 ) == ( !false1  &&  !false1))       );    


         
  }

}