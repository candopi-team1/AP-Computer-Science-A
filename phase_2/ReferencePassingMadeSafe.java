public class ReferencePassingMadeSafe
{

   public static void destructive(String[] arr)
   {
    for (int i = 0; i < arr.length; i++){
          if(i % 3 == 0)  
             arr[i] = "Tom Cruise"; // changes the array values

          if(i == 0)  
             arr[i] = "James Dean"; // changes the array values
     }
   }


   public static String[] safeMethod(String[] arr)
   {
      String[] temp = new String[arr.length]; // create a temporary array

      for (int i = 0; i < arr.length; i++)
          temp[i] = arr[i]; // make a copy of the original 

      for (int i = 0; i < temp.length; i++)
          temp[i] = "Myanmar"; // modify the temporary array

      return temp; // return the temporary array
    }


    public static BankAccount chooseBestAccountSafely(BankAccount b1, BankAccount b2)
    {
        BankAccount better;
        if (b1.getBalance() > b2.getBalance())
               better = b1;
            else
               better = b2;

           return better;
    }

    public static void chooseBestAccountDangerous(BankAccount better, BankAccount b1, BankAccount b2)
    {
           if (b1.getBalance() > b2.getBalance())
               better = b1;
            else
               better = b2;
     }

     public static BankAccount returnMadeSafe(BankAccount better, BankAccount b1, BankAccount b2){
           if (b1.getBalance() > b2.getBalance())
               better = b1;
            else
               better = b2;

           return better;
     }

     public static BankAccount returnMadeSafe2(BankAccount b1, BankAccount b2)
    {
        BankAccount better;
        if (b1.getBalance() > b2.getBalance())
            better = new BankAccount(b1.getPassword(), b1.getBalance());
       else
            better = new BankAccount(b2.getPassword(), b2.getBalance());
      return better;
    }


  public static void main(String[] args)
  {
      String[] russianFamily = {"Lenin", "Stalin", "Sharapovar", "Putin"};

      destructive(russianFamily); // the array is the argument

      for (String s : russianFamily)
            System.out.print(s + ",  "); // the array has been changed
      System.out.println(""); System.out.println("Russian family has been changed.");
      System.out.println("-----------------------------------------------------");


       String[] japaneseFamily = {"Kimura", "Toyoda", "Osaka", "Kawasaki", "Honda"};
       String[] watchThis = safeMethod(japaneseFamily );
            for (String s : watchThis ) // the array is modified
                System.out.print(s+ ", ");
      System.out.println(""); System.out.println("---------------------------------------------------------");

      for (String s : japaneseFamily )
              System.out.print(s + ", "); 
      System.out.println(""); System.out.println("Japanese family has NOT been changed.");
      System.out.println("---------------------------------------------------------");

       BankAccount briansFund = new BankAccount("BrianL", 111);
       BankAccount paulsFund = new BankAccount("PaulM", 90000);
       BankAccount betterFund = null;

       BankAccount betterFund2 = chooseBestAccountSafely(briansFund, paulsFund);
       System.out.print("betterFund2 = ");System.out.println(betterFund2); 
       System.out.println(briansFund); System.out.println(paulsFund);
       System.out.println("---------------------------------------------------------");

       chooseBestAccountDangerous(betterFund, briansFund, paulsFund);
       System.out.print("betterFund = ");System.out.println(betterFund); // still null
       System.out.println(briansFund); System.out.println(paulsFund);
       System.out.println("---------------------------------------------------------");

       betterFund =  returnMadeSafe(betterFund, briansFund, paulsFund);
       System.out.print("betterFund = ");System.out.println(betterFund); // still null
       System.out.println(briansFund); System.out.println(paulsFund);
   
  }// main()

} // ReferencePassingMadeSafe class


class BankAccount   // Barron 2015, p 123-125, Example 2
{
private String password;
private double balance;

public BankAccount() {}


public BankAccount(String acctPassword, double acctBalance)
{ 
    password = acctPassword;
    balance = acctBalance;
}

public double getBalance(){ 
  return balance;
}
public String getPassword(){ 
  return password;
}

public String toString(){ 
  return password +" "+ balance;
}

} // BankAccount class
