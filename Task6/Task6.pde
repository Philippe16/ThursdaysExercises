void setup() {
//6.a
// Making 'a' & 'b' a random variable between 0-10.
  int a = (int) random(0, 11);
  int b = (int) random(0, 11);
  if (a==10||b==10||a+b==10) {
    println("Succes");
  } else {
    println("failure");
  }
}
//6.b
//I'm making 'x''y' and 'z' random numbers between 0-30.
int x = (int) random(0, 31);
;
int y = (int) random(0, 31);
int z = (int) random(0, 31);

int sum=x+y+z;

// Making so that if 'x','y' and'z' can't be 10, 20 or 30. 
boolean containsBannedNumber = true;{
if(x == 10 || y == 10 || z == 10){
  containsBannedNumber = true;
}else if(x == 20 || y == 20 || z == 20){
  containsBannedNumber = true;
}else if(x == 30 || y == 30 || z == 30){
  containsBannedNumber = true;
}else{
  containsBannedNumber = false;
}

if (containsBannedNumber == false) {
  if (sum == 30) {
    println("Success!");
  }
} else {
  println("Failure!");
}
}
