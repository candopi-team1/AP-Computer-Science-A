public class Inherit1
{

  public  static void main(String args[]) {
  
       Person  alan = new  Student("Alan", 21, 6000.0, "Harvard");
       Person  htet = new  Student("Htet", 21, 6000.0, "Striking Range College");

       System.out.println("*************** ACCESSING PARENT'S DATA  *************** ");
  
       System.out.println("public               " + alan.name);
       // System.out.println(alan.age); // error: age has private access in Person

       System.out.println("public final static  " + alan.LIFE_EXPECTANCY); // It is ok. But it doesn't makes sense.
       System.out.println("public final static  " + Person.LIFE_EXPECTANCY); // Better: Use class to access class-wide's data.

       System.out.println("public  static       " + alan.NATIONAL_ID_NUMBER);  // It is ok. But it doesn't makes sense.
       System.out.println("public  static       " + Person.NATIONAL_ID_NUMBER); // Better: Use class to access class-wide's data.


       System.out.println("alan.age ==> error: age has private access in Person");
       System.out.println();



       System.out.println("*************** MODIFYING PARENT'S DATA  *************** ");

       alan.name = "Smth Strange";
       System.out.println("public               " + alan.name);

       // alan.age = 2345; //error: age has private access in Person
       alan.setAge(2345);
       System.out.println("Access age with a public getter : "+alan.getAge()); 

       // alan.LIFE_EXPECTANCY  = 250; // error: cannot assign a value to final variable LIFE_EXPECTANCY
       System.out.println("public final static  " + alan.LIFE_EXPECTANCY);

       alan.NATIONAL_ID_NUMBER = 117;
       System.out.println("public  static       " +alan.NATIONAL_ID_NUMBER);
       System.out.println("alan.age = 2345; ===>  error: age has private access in Person");
       System.out.println("\n\n");
 


 

       System.out.println("*************** ACCESSING PARENT'S PRIVATE METHODS  *************** ");
       // ATTENTION 1 : Error 

       // System.out.println(alan.getSecretMessage()); //error: getSecretMessage() has private access in Person
       System.out.println("You cannot call method with private access in Person object");
       System.out.println(alan.getSecretMessageForPublic() + "<--- Here, we use a public method.");

       System.out.println();




       System.out.println("\n\n*************** ACCESSING PARENT'S PUBLIC METHODS ");
       System.out.println(alan.getMessage());





       System.out.println("\n\n*************** ACCESSING PARENT'S PUBLIC STATIC METHODS ");
       // ATTENTION 2 : Both ways work. But only the second way makes sense. 
       System.out.println(alan.getStaticMessage());
       System.out.println(Person.getStaticMessage());
  }

} // main class


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

///////////////////////////////////////////////////////////////

 private String getSecretMessage()
 {
    return "private String getSecretMessage()";
 }

 public String getSecretMessageForPublic()
 {
    return getSecretMessage()+ " We work only inside class definition itself.";
 }


 public String getMessage()
 {
    return "public String getMessage()";
 }


 public static String getStaticMessage()
 {
    return "public static String getStaticMessage()";
 }



}// Person

/////////////

class Student extends Person
{

 private String school;


 public Student()
 {
 }

 public Student(String name, int age, double income, String school)
 {  super(name, age, income);

    this.school = school;
    
 }


 public String getSchool()
 {
    return school;
 }

 public void setSchool (String school)
 {
    this.school = school;
 }

} // Student