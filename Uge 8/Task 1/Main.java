/*1.a Create a file and name it Main.java, include a main method.
1.b Write a function that prints an empty line and call it from main();
1.c Write a function that receives a string as a parameter and prints it. call this function from main()
1.d Write a function that receives a string called "name" and an integer called "age" and call it from main with your own name and age. Have the function print the text "My name is \<name\>, I am <age> years old".*/

//1.a
public class Main{

public static void main(String[] args) {

newLine();
newMessage("Hillo");
me("Philippe", 25);


}
//1.b
public static String newLine(){
	String noString = "";
	System.out.println(noString);
	return noString;


}
//1.c
public static String newMessage(String text1){

String text = text1;
System.out.println(text);
return text;


}
//1.d
public static String me(String namep, Integer agep){

String name = namep;
Integer age = agep;
System.out.println("my name is " + name +" I am " + age + "years old");
return name;
}


}