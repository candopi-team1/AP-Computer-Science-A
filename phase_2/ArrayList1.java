import java.util.List;
import java.util.ArrayList;

class ArrayList1
{
  public static void getCMException() throws Exception 
  {
     // ArrayList integers = new ArrayList(); // BAD
     ArrayList<Integer> integers = new ArrayList<Integer>();

     integers.add(1);
     integers.add(2);
     integers.add(3);

     for (Integer integer : integers)
     // for (int integer : integers)  // OK, too
     {
         integers.remove(1);
     }
   }


  public static void main(String args[]) 
  {        
        
      Professor  head  = new  Professor("John", 99900.00);      
      Professor  prof1 = new  Professor("Jack", 7000.00);
      Professor  prof2 = new  Professor("Jane", 9030.00);

      ArrayList<Professor> profs = new ArrayList<Professor>();
      List<Professor>     profs2 = new ArrayList<Professor>();

      ArrayList lunchBag = new ArrayList(); // multiple data types? BAD
      // lunchBag.add(1); lunchBag.add(2.00);lunchBag.add("Okay");
      // Note: ArrayList1.java uses unchecked or unsafe operations. // Note: Recompile with -Xlint:unchecked for details.

      profs.add(head); profs.add(prof1);profs.add(prof2); // Add to the end of list
      profs2.add(head); profs2.add(prof1);profs2.add(prof2); profs2.add(new  Professor("Dr. Last Prof", 33030.00));
      System.out.println(profs2.get(profs2.size() -1   )); // Dr. Last Prof 33030.0

      System.out.println(profs.get(0));   System.out.println(profs2.get(0)); // John 99900.0 + John 99900.0

      Professor  prof3 = new  Professor("Dr. Third Rates", 9030.00);
      profs2.add(0, prof3);              // Add element at that index
      System.out.println(profs2.get(0)); // Dr. Third Rates 9030.0
      
      System.out.println("---------------------------------------------------- ");   
      System.out.println(profs);
      System.out.println(profs2);

      Professor  prof4 = new  Professor("Dr. Four Leaves", 9030.00);
      System.out.println(profs2.set(0, prof4) );   // Add element at that index, removes old element, and returns that old element
      System.out.println(profs2);

        
      profs2.remove(0);  profs2.remove(profs2.size() -1 ); 
      System.out.println(profs2);

      System.out.println("---------------------------------------------------- ");   


     /////// Auto-Boxing and -Unboxing

     ArrayList<Integer> favoriteIntegers = new ArrayList<Integer>();
    int num = 45, num2=64;
    favoriteIntegers.add(num); // The 45 is converted to an Integer
    favoriteIntegers.add(num2);


    for(Integer ku: favoriteIntegers){
       System.out.print(ku+ " ");
    }
    System.out.println("\n---------------------------------------------------- ");   

    for(Professor pf: profs){
       System.out.println( pf);
    }
    System.out.println("\n---------------------------------------------------- ");   
    

    // ConcurrentModificationException. because of using remove() in the enhanced for loop
         try
         {
           System.out.print(6 +" "); getCMException();
         }
         catch(Exception ex)
         {
            ex.printStackTrace();
         }  
         

       
  }// main ()

}

class Professor
{
 private String name;
 private double salary;

 public Professor(String newName, double newSalary)
 {
   name = newName;
   salary = newSalary;
 }

 public String getName()
 {
    return name;
 }

 public double getSalary()
 {
    return salary;
 }

 public String toString()
 {
    return name + " "+ salary;
 }

}

