class VariableOperatorComment
{

  public static void main(String args[]) 
 {
         int  i=3;
         int  j=2;
         System.out.println("i/j =" + i/j);

         double  dj=2.0;
         System.out.println("i/dj =" + i/dj);


// This is how you leave notes to yourself or other programmers.
// Java doesn't care much about white paces. In a language like Python, the following line will cause some problem.
 double  di=3.0;  
         System.out.println("di/j =" + di/j);
         System.out.println("di/dj =" + di/dj);

/*
If  you want to comment
for mutiple lines,
use this format.

*/

        int total=200, n=3;
        double average;

        average = (double) total/n;
        int average2 =  total/n;
        System.out.println("average2 WRONG  = " + average2);
        System.out.println("average CORRECT = " + average);


         int age=2;
         double age2= (double) age;
         System.out.println("age  = "+ age); System.out.println("age2 = "+ age2);
         System.out.println("\n");



         boolean isLincolnAmerican=true;
         boolean isLincolnChinese=false;


         System.out.println("isLincolnAmerican =" + isLincolnAmerican);
         System.out.println("isLincolnChinese =" + isLincolnChinese);

        // parentheses () are needed, to tell the computer what to do first! 
         System.out.println("66 > 34 = " + (66 > 34 ) );
         System.out.println("3 > 34 = " +  ( 3 > 34)  );
         System.out.println("\n");



         String myName="Tom Cruise";
         String hisName= new String("Tommy Cruise");


         System.out.println(myName + " Mr.");
         System.out.println("hisName =" +  hisName);


         System.out.println("");
         
  }

}