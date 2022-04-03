public class OOPData
{
  public  static void main(String args[]) {
  
       Person  alan = new  Person("Alan", 21, 6000.0);
     

       System.out.println("*************** ACCESSING PRIVATE DATA  *************** ");
       // ATTENTION 1  : Error
      // System.out.println(  alan.age ); //  error: age has private access in Person
                                         //  alan.age fails because it's a private data.

      System.out.println(  alan.getAge()  + " <--  alan.getAge() works because we use a getter/accessor method." );
      System.out.println();



       System.out.println("\n\n*************** ACCESSING PUBLIC DATA  *************** ");
       System.out.println(  alan.getName()    );
       System.out.println(  alan.name  + " <--  alan.name works because it's a public data." );
       System.out.println();



       System.out.println("\n\n*************** ACCESSING  PUBLIC STATIC DATA *************** ");
       System.out.println(  Person.NATIONAL_ID_NUMBER + " <-- Person.NATIONAL_ID_NUMBER works because it's a public static data." );
       System.out.println(  Person.LIFE_EXPECTANCY    + " <-- Person.LIFE_EXPECTANCY works because it's a public static data." );
       System.out.println();



       System.out.println("\n\n\n*************** MODIFYING PRIVATE DATA  ");
       alan.setAge(202200);
       System.out.println(  alan.getAge()  + " <--  Alan's age can be changed, with a setter/mutator method." );


       System.out.println("\n\n*************** MODIFYING PUBLIC DATA  ");
       alan.setName("New ALAN");
       System.out.println(  alan.name  + " <--  Alan's name can be changed, with a setter/mutator method." );

       alan.name = "Even Newer ALAN";
       System.out.println(  alan.name  + " <--  Alan's name can be changed, just with a dot operator." );




       System.out.println("\n\n*************** MODIFYING PUBLIC STATIC DATA  ");
       Person  david = new  Person("David", 41, 36000.0);
       System.out.println(  Person.NATIONAL_ID_NUMBER + " <-- Person.NATIONAL_ID_NUMBER increases because it's a static data." );


       Person  nancy = new  Person("Nancy", 36, 16000.0);
       System.out.println(  Person.NATIONAL_ID_NUMBER + " <-- Person.NATIONAL_ID_NUMBER increases because it's a static data." );
       System.out.println();



       Person.NATIONAL_ID_NUMBER = 1234567890;
       System.out.println(  Person.NATIONAL_ID_NUMBER + " <-- Person.NATIONAL_ID_NUMBER can be changed, it's NOT a final data." );

      // ATTENTION 2  : Not an error. BUT avoid such usage.
       alan.NATIONAL_ID_NUMBER = 90;      
       System.out.println(  Person.NATIONAL_ID_NUMBER + " <-- Person.NATIONAL_ID_NUMBER changes to 90 because it's a static data." );
       System.out.println();



       

       System.out.println("\n\n*************** MODIFYING PUBLIC STATIC FINAL DATA  ");
       // ATTENTION 3 : Error 
       
        // alan.LIFE_EXPECTANCY = 120;    //  error: cannot assign a value to final variable LIFE_EXPECTANCY
       // Person.LIFE_EXPECTANCY = 120;  //  error: cannot assign a value to final variable LIFE_EXPECTANCY

        System.out.println("You cannot modify PUBLIC STATIC FINAL DATA, because it is FINAL.");




  }

}


////////////////////
class Person
{

 public String name;
 private int age;
 private double income;

 public final static int LIFE_EXPECTANCY = 75;
 public static int NATIONAL_ID_NUMBER;


 public Person()
 {
 }

 public Person(String name, int age, double income)
 {
    this.name = name;
    this.age = age;
    this.income = income;

    NATIONAL_ID_NUMBER++;


 }

 public String getName()
 {
    return name;
 }

 public int getAge()
 {
    return age;
 }



 public double getIncome()
 {
    return income;
 }

 public void setName (String name)
 {
    this.name = name;
 }

 public void setAge (int age)
 {
    this.age = age;
 }
 
 public void setIncome (double income)
 {
    this.income = income;
 }




}
