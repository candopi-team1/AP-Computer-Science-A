import java.util.ArrayList; 
class WrapperClasses
{
  public static void boxy(Double d)
  {
    if(d instanceof Double){     
      System.out.println("Param is a Double type.");
    }

  } 

  public static void unBoxer(int i)
  {
      System.out.println("Param is an int type." + i);
  } 

  public static void main(String args[]) 
  {        
     // The Integer (int value) constructor      // OLD style, gets warning!
     // The Integer (String string) constructor // OLD style, gets warning!

     Integer i = new Integer(22);   // create an object with 22 in it. // OLD style, gets warning!
     Integer j = new Integer("22"); // create an object with 22 in it // OLD style, gets warning!
     Integer k = 22; // in newer versions of Java (9+)   

     System.out.print(i + " ");  System.out.print(j + " ");      System.out.println(k);
     System.out.println(k.intValue());

     // Special data members
     System.out.println(Integer.MIN_VALUE);  //-2147483648
     System.out.println(Integer.MIN_VALUE - 1);// 2147483647  !!!!

     System.out.println(Integer.MAX_VALUE); // 2147483648
     System.out.println(Integer.MAX_VALUE + 1); // -2147483648  !!!
     System.out.println();


     // SAME for Double
     Double d1 = new Double(3.15);   // create an object with 3.15 in it // OLD style, gets warning!
     Double d2 = new Double("3.15"); // create an object with 3.15 in it // OLD style, gets warning!
     Double d3 = 3.15; // in newer versions of Java (9+)  

     System.out.print(d1 + "  "); System.out.print(d2 + "  "); System.out.println(d3 + "  ");
     System.out.println(d3.doubleValue() + "  ");
     System.out.println("-------------------------------------------------------------------------");


     // Not on the AP exam. Methods to convert an input string to a number so you can do math on it.
     String ageStr = "16";
     System.out.println("In 10 years age is " + (Integer.parseInt(ageStr) + 10) );
     System.out.println("Concatenation, not addition: " + (ageStr + 10));
     System.out.println("-------------------------------------------------------------------------");


    // autobox
     Integer i1 = 2; // in newer versions of Java (9+)   
     System.out.print(i1 + "  " ); System.out.println(i1 instanceof Integer);    
     Integer i2 = new Integer(2);

     System.out.println(i1 == i2); // false
     System.out.println(i1 == 2); // true


     Double da = 2022.34; // in newer versions of Java (9+)   
     System.out.print(da+ "  ");    System.out.println(da instanceof Double);    


     //unbox
     int int1      = i1;     // unboxing the object automatically - back to primitive type
     double double1= 2 * da; // unboxing the object automatically - back to primitive type

     System.out.print(int1 +" ");      System.out.println(double1);
     System.out.println("-------------------------------------------------------------------------");

     ArrayList<Integer> alInteger = new ArrayList<Integer>();
     ArrayList<Double> alDouble = new ArrayList<Double>();
     alInteger.add(4);    // autobox
     alDouble.add(4.78); // autobox

     for(Integer kuu: alInteger){ 
        System.out.print(kuu + " "); 
     }
     System.out.println();

     for(Double kyy: alDouble){ 
        System.out.print(kyy + " "); 
     }
     System.out.println();
     System.out.println("-------------------------------------------------------------------------");


     double dagger= 2022.11;
     boxy(dagger); // autobox // Method expects a Double

     Integer ice= 1980;
     unBoxer(ice); // unboxed //  // Method expects an int

     System.out.println("Integer, Double are immutable. They have no mutators.");
         
  }

}

