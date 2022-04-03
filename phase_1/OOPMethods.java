public class OOPMethods
{

  public String methodTester(Person person)
  {

     // ATTENTION 3 : Error 
     // String message1= person.getSecretMessage(); //error: getSecretMessage() has private access in Person
     String message1= person.getSecretMessageForPublic();

     String message2     = person.getMessage();
     String messageStatic= person.getStaticMessage();

    return message1+ "\n"+ message2+  "\n"+ messageStatic;
  }


  public static void methodTester2()
  {
     Person  alex = new  Person("Alex", 21, 6000.0);
     System.out.println(Person.getStaticMessage()  );
     System.out.println(alex.getSecretMessageForPublic() + "<--- Here, we use a public method.");

  }


  public  static void main(String args[]) {
  
       Person  alan = new  Person("Alan", 21, 6000.0);
     

       System.out.println("*************** ACCESSING PRIVATE METHODS  *************** ");
       // ATTENTION 1 : Error 

       // System.out.println(alan.getSecretMessage()); //error: getSecretMessage() has private access in Person
       System.out.println("You cannot call method with private access in Person object");
       System.out.println(alan.getSecretMessageForPublic() + "<--- Here, we use a public method.");

       System.out.println();




       System.out.println("\n\n*************** ACCESSING PUBLIC METHODS ");
       System.out.println(alan.getMessage());





       System.out.println("\n\n*************** ACCESSING PUBLIC STATIC METHODS ");
       // ATTENTION 2 : Both ways work. But only the second way makes sense. 

       System.out.println(alan.getStaticMessage());
       System.out.println(Person.getStaticMessage());


 


       System.out.println("\n\n*************** ACCESSING METHODS FROM INSIDE A METHOD"); 
       OOPMethods oopm= new OOPMethods(); 
       System.out.println(oopm.methodTester(alan) );

       System.out.println("\n\n*************** ACCESSING METHODS FROM INSIDE A METHOD 2"); 
       methodTester2();



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



}
