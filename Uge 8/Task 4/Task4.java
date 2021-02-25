/*For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size. But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work, if the array received as a parameter would not have a fixed length. 
4.a create arrays of the following type and assign it at least 3 different values: 
    - Integer array
    - String array
    - boolean array
4.b Write a function that takes in an array of strings as parameter and prints each string.
4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
4.d Write a function that receives an integer array as a parameter and returns the average value.	
4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.*/


class Main{
	

	public static void main(String[] args) {
		
	
	int[] rnumbers = {7, 14, 21, 28};
	String [] rwords = {"Skod",  "Klasse",  "Stærkt"};
	boolean[] rquestions = {true, false, false};

	arrWords(rwords);
	arrNumbs(rnumbers);
	int sum = arrNumbs(rnumbers);
	System.out.println(sum);
	System.out.println(calculateAverageOfIntArr(rnumbers));

}
//4.b
public static void arrWords(String[] rwords) {
  for (int i = 0; i<rwords.length; i++)
   {
   System.out.println(rwords[i]);
  }
}
//4.c
public static int arrNumbs(int[] rnumbers){
	int sum= 0;
	 for (int i = 0; i<rnumbers.length; i++)
   {
   	sum+=rnumbers[i];
}
return sum;
}

//4.d

public static float calculateAverageOfIntArr(int[] rnumbers){
    int sum = 0;

    for(int i = 0; i < rnumbers.length; i++){
      sum += rnumbers[i];
    }

    float average = sum/rnumbers.length;

    return average;

  }

//4.e

  
}