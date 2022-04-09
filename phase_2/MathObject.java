import static  java.lang.Math.*;

class StringMathObject
{

  public static void main(String args[]) 
  {        


      Professor  head  = new  Professor("John", 99900.00);
      Professor  prof1 = new  Professor("Jack", 7000.00);
      Professor  prof2 = new  Professor("Jane", 9030.00);

      Professor  chief;
      chief = head;
      System.out.println(chief.equals(head));
      System.out.println(head.equals(chief));

      System.out.println(head.equals(prof1));
      System.out.println(head.equals(prof2));
 

       System.out.print("chief == head ?  "); System.out.println(chief == head);
       Professor  profA = new  Professor("Jane", 9030.00);
       Professor  profB = new  Professor("Jane", 9030.00);
       System.out.print("profA == profB ?  "); System.out.println(profA == profB);           // false
       System.out.print("profA.equals(profB) ?  "); System.out.println(profA.equals(profB)); //flase

    System.out.println(head); // without toString() --->  Professor@7692d9cc
    System.out.println("**********************************************************");



    System.out.println(Math.abs(100));
    System.out.println(Math.abs(-100));

    System.out.println(Math.abs(110.00));
    System.out.println(Math.abs(-190.01));


    System.out.println(Math.pow(3,3));
    System.out.println(Math.pow(-3,3));
   System.out.println(Math.pow(12.3,2));// 151.29000000000002
 
 
    System.out.println(Math.sqrt(100.00));
    System.out.println(Math.sqrt(144.00));
    System.out.println(Math.sqrt(151.29000000000002));

    // Random number generation
    double r1 = Math.random();
    System.out.println(r1);   
    System.out.println(r1 + 2);   

   System.out.print("Between 0 and 9  ---> ");
   int x= 9 -1; 
   for (int k=0; k < 6; k++){
     int r2= (int) (Math.random() * x ) ;

     System.out.print(r2 + "  ");
   }
   System.out.println();

   System.out.print("Between 12 and 20  ---> ");
   int y= (20 -12) + 1;
   for (int k=0; k < 6; k++){
       int r3= (int) (Math.random() * y )  + 12; 
       System.out.print(r3 + "  " );
   }
    System.out.println("\n**********************************************************");

    // Rounding double numbers
    double positiveD = 12.98;   // 12.34;
    double negativeD = -12.98; // -12.34;
    System.out.print( (int)(positiveD + 0.5) + "  " );
    System.out.print( (int)(negativeD - 0.5) + "  " );
    System.out.println();


    // Comparing double numbers
    double diga = 1234566666.9811;   
    double digu = 1234566666.98108;   
    double digy = 1234566666.9810999999998;   

    final double LIMIT= 0.00001;
    if (Math.abs(diga - digu) <=  LIMIT)
        System.out.println(diga +" and "+ digu +" are same") ;
    else
        System.out.println(diga +" and "+ digu +" are NOT same") ;

    if (Math.abs(diga - digy) <=  LIMIT)
        System.out.println(diga +" and "+ digy +" are same") ;






  } // main()


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