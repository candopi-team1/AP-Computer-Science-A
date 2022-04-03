public class Polymorphism1
{
  public  static void main(String args[]) {
  
       Person  alan = new  Student("Alan", 21, 6000.0, "Harvard");
       Person  htet = new  Student("Htet", 21, 6000.0, "Striking Range College");


       Person  ken    = new  GradStudent("Ken", 25, 9000.0,    "Stanford", "New CRISPR");
       Person  nomura = new  GradStudent("Nomura", 25, 9000.0, "Cornell", "Quantum Crypto");

       Person  bob  = new  Worker("Bob", 21, 6000.0, "FAANG");
       Person  jane = new  Worker("Jane", 21, 6000.0, "BAT");

       Person[]  persons= {alan, htet, ken, nomura, bob, jane};     


       System.out.println("*************** Polymorphically, run overloaded methods. *************** ");

       for(Person psn: persons)
       { 
           System.out.print(psn.name+ " ");
           psn.doPolyWork(100); System.out.println(); 

       } // for

       
       System.out.println("*************** Polymorphically. Also Checking their types *************** ");

       for(Person psn: persons)
       { 
         if (psn instanceof Student)
         {
          System.out.println(psn.name + " is a Student at " + ((Student)psn).getSchool());
         } 

         if (psn instanceof GradStudent)
         {
          System.out.println(psn.name + " is a GradStudent at " + ((GradStudent)psn).getSchool() + " researching on "+   ((GradStudent)psn).getThesis() );
         } 

         if (psn instanceof Worker)
         {
          System.out.println(psn.name + " is working  at"+  ((Worker)psn).getWorkplace() );
         } 
         
         System.out.println();
   
       } // for

     

  }// main () 

}


/////////////////////////////////////////////////////////////////////////////
class Person
{

 public String name;
 private int age;
 private double income;

 public final static int LIFE_EXPECTANCY = 75;
 public static int NATIONAL_ID_NUMBER;

 public static double BASE_RATE=100;


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

// other methods
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


 public void doPolyWork (double income)
 {
    this.income = income;
    System.out.println("Your fees is : " + (income * 1.0) );
 }



}



/////////////////////////////////////////////////////////////////////////////
class Student extends Person
{

 private String school;


 public Student()
 {
 }

 public Student(String name, int age, double income, String school)
 {  
    super(name, age, income);
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


 public void doPolyWork (double income)
 {
    this.setIncome(income);
    System.out.println("Student doesn't earn much");
    System.out.println("Your fees is : " + (income * 0.5) );
 }


}

/////////////////////////////////////////////////////////////////////////////
class GradStudent extends Student
{

 private String thesis;


 public GradStudent()
 {
 }

 public GradStudent(String name, int age, double income, String school, String thesis)
 {  
    super(name, age, income, school);
    this.thesis = thesis;
    
 }


 public String getThesis()
 {
    return thesis;
 }

 public void setThesis (String thesis)
 {
    this.thesis = thesis;
 }


 public void doPolyWork (double income)
 {
    this.setIncome(income);
    System.out.println("GradStudent doesn't earn much, but more than mere Student");
    System.out.println("Your fees is : " +  (income * 0.9) );
 }


}




//////////////////////////////////////////////////////////////////////////////////

class Worker extends Person
{

 private String workplace;


 public Worker()
 {
 }

 public Worker(String name, int age, double income, String workplace)
 {  super(name, age, income);

    this.workplace = workplace;
    
 }


 public String getWorkplace()
 {
    return workplace;
 }

 public void setWorkplace (String workplace)
 {
    this.workplace = workplace;
 }


 public void doPolyWork (double income)
 {
    this.setIncome(income);
    System.out.println("Worker can earn much more");
    System.out.println("Your fees is : " +  (income * 2.0));
 }


} // Worker

