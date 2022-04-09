
class TruthTable1
{

  public static void main(String args[]) 
  {        

        boolean true1 = true;
        boolean true2 = true;

        boolean false1 = false;       
        boolean false2 = false;

        // True True 
        System.out.print("true1 && true2 = ");         System.out.println(true1 && true2);        
        System.out.print("true1 || true2 = ");         System.out.println(true1 || true2);System.out.println();



        // True False
        System.out.print("true1 && false1 = ");         System.out.println(true1 && false1);
        System.out.print("true1 || false1 = ");         System.out.println(true1 || false1);System.out.println();



        // False True
        System.out.print("false2 && true2 = ");         System.out.println(false2 && true2);
        System.out.print("false2 || true2 = ");         System.out.println(false2 || true2);System.out.println();




        // False False
        System.out.print("false1 && false2 = ");         System.out.println(false1 && false2);
        System.out.print("false1 || false2 = ");         System.out.println(false1 || false2);System.out.println();

         
  }

}