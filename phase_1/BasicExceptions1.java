import java.util.ArrayList;

class BasicExceptions1
{
   //// 1
   public static void getArithmeticException() throws Exception {      
       double d= 12/0;
   }

   ///// 2
   public static void getNullPointerException() throws Exception {
      Person person1= new Person("Jack");
      Person person2=null;
      person2.getName();
   }

   ///// 3
   public static void getArrayIndexOutOfBoundsException() throws Exception {
      int[] arr= {0,1,2,3};
      int k= arr[5];
   }

   //4
   public static void getIndexOutOfBoundsException() throws Exception {
      ArrayList<Integer> myFavoriteIntegers = new ArrayList<Integer>();
      int num = 45;
      myFavoriteIntegers.add(num); // The 45 is converted to an Integer
      
      myFavoriteIntegers.remove(12);
  }


   ///// 5
   public static void getIllegalArgumentException(int a) throws Exception {
       if( a<=0)
       {
          throw new IllegalArgumentException("Zerrooo");
       }
      int c= a+100;

  }

   ///// 6
   public static void getCMException() throws Exception {
     ArrayList<Integer> integers = new ArrayList<Integer>();
     integers.add(1);
     integers.add(2);
     integers.add(3);

     for (Integer integer : integers) {
         integers.remove(1);
     }
   }

   //// 7
   public static void getClassCastException(Person person) throws Exception {
      if ( !(person instanceof Person) )
      {
         throw new ClassCastException("Some nasty ClassCastException thrown here!!");
      }
      // ArrayList al=(ArrayList)person; // error: incompatible types: Person cannot be converted to ArrayList
      
     if ( person.name != "KKN" )
      {
         throw new ClassCastException("Some nasty ClassCastException thrown here!!");
      }

  }



////

   public static void getException() throws Exception {
      

  }


  /////////////////////////////// 
  public static void main(String args[]) 
  {      
        // 1
        try
         {
           System.out.print(1+" "); getArithmeticException() ;
         }
         catch(Exception ex)
         {
            ex.printStackTrace();
         }  
         System.out.println("***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***   \n");
  
         // 2
         try
         {
          System.out.print(2+" "); getNullPointerException();
         }
         catch(Exception ex)
         {
            ex.printStackTrace();
         }  
         System.out.println("***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***   \n");


        //3 getArrayIndexOutOfBoundsException()         
         try
         {
           System.out.print(3 +" "); getArrayIndexOutOfBoundsException();
         }
         catch(Exception ex)
         {
            ex.printStackTrace();
         }  
         System.out.println("***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***   \n");

        // 4
         try
         {
           System.out.print(4 +" "); getIndexOutOfBoundsException();
         }
         catch(Exception ex)
         {
            ex.printStackTrace();
         }  
         System.out.println("***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***   \n");
  

        // 5         
         try
         {
           System.out.print(5 +" "); getIllegalArgumentException(0);
          
         }
         catch(Exception ex)
         {
            ex.printStackTrace();
         }  
         System.out.println("***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***   \n");

         // 6
         try
         {
           System.out.print(6 +" "); getCMException();
         }
         catch(Exception ex)
         {
            ex.printStackTrace();
         }  
         System.out.println("***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***   \n");
         
        //7
         try
         {
           Person person1= new Person("Jack");  
           System.out.print( 7+" "); getClassCastException(person1);
         }
         catch(Exception ex)
         {
            ex.printStackTrace();
         }  
         System.out.println("***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***  ***   \n");


  }// main method

}

//
class Person
{
 public String name;

 public Person()
 {
 }

 public Person(String name)
 {
    this.name = name;
 }

 public String getName()
 {
    return name;
 }

} // Person class