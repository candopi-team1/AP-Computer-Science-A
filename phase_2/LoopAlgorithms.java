import static  java.lang.Math.*;
class LoopAlgorithms
{

  public static void main(String args[]) 
  {        
        
   // Mc Graw Hill 2002, page 139
   // Find all the factors of an integer.
    int n = 100;
    n = Math.abs (n);
    for (int i = 1; i <= n; i++)
    { 
       if (n % i == 0)
       {
         System.out.println( i + " is a factor");
       }
    }
    System.out.println("----------------------------------------------------- ");  



   // Mc Graw Hill 2002, page 140
   // Find sum of all digits in an integer.
    int n2 = 109;
    int n22 = Math.abs (n2);
    int digit, sum =0;
    while(n22 > 0 )
    {
      digit = n22 %10;
      sum += digit;
      n22 = n22/10;
    }
    System.out.println("The number =" + n2 + ", the sum =" + sum);
    System.out.println("----------------------------------------------------- ");  



   // smallest in a list of numbers
   int[] arr1={34,4,5,6,77,-1,-9,190};
   int smallest=0;
   for(int j=0; j < arr1.length; j++)
   {
     if ( arr1[j] < smallest) smallest =arr1[j];
   }
   System.out.println("Smallest = " + smallest);
   System.out.println("----------------------------------------------------- ");  


   // Mc Graw Hill 2002, page 141
   // Count the number of words in a string.
   String phrase = "AP Computer Science A Rocks!";
   int numWords = 1; // initialize the count to 1
   int posSpace = phrase.indexOf(" "); // find the first space

    while (posSpace != -1) // as long as there is a space in the phrase
    {
         numWords++; // increment the word count
         phrase = phrase. substring (posSpace+1) ; // the new phrase will be everything after the space
         posSpace = phrase.indexOf(" "); // find the next space
    }     

    System.out.println("The number of words is " + numWords) ;
    System.out.println("----------------------------------------------------- ");  


   // Mc Graw Hill 2002, page 141
   // Count the number of punctuation marks in a sentence.
   String sentence = "A. P B. Computer Science, Rocks !";
   String punctuation = ".,:;2?1"; // or whatever punctuation marks you want to search for
   int count = 0;
   String letter; 

   for (int i = 0; i < sentence.length(); i++) // look through each letter
   {
     letter= sentence.substring(i, i+1);
     if(punctuation.indexOf(letter) >= 0 ) count++;

   }
    System.out.println("The number of punctuation marks is " + count) ;
    System.out.println("----------------------------------------------------- ");  



   // Mc Graw Hill 2002, page 141
   // Reverse order of characters in a string
   String sentence2 = "How are you? All be peace on this world! Computer Science, Cool!";
   String reverse="", letter2;
   for (int i = sentence2.length() -1;  i >= 0; i--) // look through each letter backwards
   {
     letter2= sentence2.substring(i, i+1);
     reverse +=letter2;

   }
    System.out.println("The sentence2 =" + sentence2 + ", the reverse =" + reverse);

  }// main()

}