class WhileLoop1
{ 
 
  public static void main(String args[])
  {
     int count = 0;
     while (count < 5)
     {
        System.out.print(count + " ");
        count++;
     }
     System.out.print("count =" + count+ "\n");

    int kount = 0;
    for (kount = 0; kount < 5; kount++ )
     {
        System.out.print(kount + " ");
        
     }
     System.out.print("kount =" + kount+ "\n\n");
   


     int i = 1, mult4 = 4;
     while (mult4 < 64)
     {
       System.out.print("mult4 = " + mult4 + " i = " + i +"  \n");
        i++;
        mult4 *= i;
      } 
   

  }



}


