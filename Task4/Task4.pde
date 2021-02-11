// 4.a
//As long as i is/or is between 0 and 20, it will print out the number.

for (int i=0; i<=20; i++){
  println(i);
  
}
//4.b
//Using %2, you will find out even and odd numbers. 0 for even and 1 for odd.
for (int i=0; i<=20; i++){
  println(i%2);
  
}

//4.c
//Here you do the same as in 4.b but with a while loop. Set x to 0 and then add 1 each loop.
int x=0;
while (x<=20){
 println(x%2);
 x=x+1;
}
