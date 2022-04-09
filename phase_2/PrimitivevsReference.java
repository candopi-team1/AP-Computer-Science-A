public class PrimitivevsReference
{
   public static int tripleIt(int copyVal) 
   {
       return (copyVal * 3);
   }

   public static void changePerson(Person refPerson) 
   {
       refPerson.setReligion("Flat Earth Theory");
   }
 
    public static void passArrayByRef(int num, int index, int[] nums) 
    {
        int temp = num;
        num = nums[index];
        nums[index] = temp;
        index++;
    }
 


  public  static void main(String args[]) 
  {
        Person  person1 = new  Person("Tom Cruise", "Buddhist");
        Person  person2 = new  Person("Steve Jobs", "Buddhist");
        Person  person3 = new  Person("Putin", "Buddhist");
        /* -------------------------------------------------------------- */



        int a=10;
        int resultTriple= tripleIt(a);

        System.out.println("resultTriple = " +resultTriple );
        System.out.println("Did a change?");
        System.out.println("a = "+ a);
        System.out.println("No, a didn't change outside the method.");
        System.out.println("----------------------------------------------------------");

        System.out.println(person1);
        changePerson(person1);
        System.out.println("Did that person change?");
        System.out.println(person1);
        System.out.println("----------------------------------------------------------");

        Person  personNull;
        /*
        if( personNull == null)
        {
          System.out.println("personNull is null");
         }
        */

        person1=null; 
        if( person1 == null)
        {
          System.out.println("person1 is null");
         }
        System.out.println("----------------------------------------------------------");




        int[] val = {1, 22, 333, 4444, 55555};
        int num = -6;
        int index = 3;
        for(int i : val)           System.out.print(i+ ", ");

        System.out.println("\nAfter our op: the array DID change outside the method:");
        passArrayByRef(num, index, val);         
        for(int i : val)           System.out.print(i+ ", ");


  }// main()



}
class Person
{

 private String name;
 private String religion;
  

 public Person(String newName, String newReligion)
 {
    name = newName;
    religion = newReligion;
 }

 public void setReligion(String newReligion)
 {
    religion = newReligion;
 }

 public String toString()
 {
    return name + " --- " + religion;
 }

}//  Person


