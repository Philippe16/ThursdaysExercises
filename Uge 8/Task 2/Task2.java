class Main{
  public static boolean happy = true;

public static void main(String [] args) {

  sum(5,10);
  returnUpper("Hello");
  checkFirstLetter("letter");

   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }

   System.out.println("The sum of a and b is = " +sum(5, 10));

  

}

//2.a
public static boolean iAmHappy()
{ 
    if(happy == true){
      return true;
    }
    return false;  
  }
//2.b
public static int sum(int a, int b){
 int sum = 0;
  sum = a + b;

  return sum;

}
//2.c
public static String returnUpper(String input1){
System.out.println(input1.toUpperCase());
  return input1.toUpperCase();
}
//2.d
public static boolean checkFirstLetter(String input2){
    String input = input2;
    char checker = input.charAt(0);
    if (Character.isUpperCase(checker)){

    System.out.println("First letter is uppercase"); 
    return true;
    }

    System.out.println("First letter is NOT uppercase"); 
    return false;
  }


}