String x="Philippe";
String y="25";
boolean Happy = true;

void setup() {
  //2.a
  String x=("Philippe");
  println(x);

  //2.b
  String y=("25");
  println(y);
  
  //2.c
      //Happy is static, therefore it will always be true unless changed manuale.
  boolean Happy = true; 
  if (Happy==true) { 
    println("I do clap my hands");
  }else{
    println("I don't clap my hands");
  }
  
  //2.d
  {
    x=("Hi, my name is Philippe");
    y=("I am 25 years old");
    println(x,y);
}
}
