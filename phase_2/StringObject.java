class StringObject
{

  public static void main(String args[]) 
  {        
    String s1= new String ("Constructs a new String object that represents the same sequence of characters as str");
    System.out.println(s1);


    // String Concatenation
    String sta= new String ("Constructs a new String");
    String stam= new String ("Hopefully Good.");

    System.out.println(sta + " Hello ");
    System.out.println(sta + " Hello " + stam);


    System.out.println(s1.length());
    System.out.println(s1.substring(0,1)   );
    System.out.println(s1.substring(1, 10)   );
    System.out.println(s1.substring(11)   );

    System.out.println(s1.indexOf("C"));
    System.out.println(s1.indexOf("on"));
    System.out.println(s1.indexOf("structs a new String"));

    System.out.println(s1.indexOf("K"));
    System.out.println(s1.indexOf("X"));

    // String comparisions
    String s2= new String ("Constructs a new String object that represents the same sequence of characters as str");
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals("Lucky goes happy!"));

/* Returns a value <0 if this is less than other; returns zero if this is
equal to other; returns a value >0 if this is greater than other */
String s3="Happy";
String s4="Happy";
String s5="Happier";
System.out.println(s3.compareTo(s4) );
System.out.println(s3.compareTo(s5) ); 
System.out.println();


System.out.println("".compareTo("") ); 
System.out.println("A".compareTo("a") ); 

System.out.println("A".compareTo("B") );
System.out.println("B".compareTo("A") );

    System.out.println("**********************************************************");

   //  \n newline
   String result = "a\nb\nc";
   System.out.println(result);

   // \" double quote
   String result2 = "Jane said,\"I love you a lot!\"";
   System.out.println(result2);


   // \\ backslash
   String result3 = "C:\\Users\\donald500\\ap_dev\\y2022_03\\lesson26";
   System.out.println(result3);

   //  tab \t 
   String result4 = "a\tb\tc"; 
   System.out.println(result4);






  } // main()


}

