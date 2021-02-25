public class debugging{

  public static void main(String[] args) {
    int a = 7, b = 42;

    char smaller = minimum(a, b);

    if(smaller == 'a'){
      System.out.println(a + " is the smallest!");
    }
  }

  public static char minimum(int a, int b) {
    char numbA = 'a';
    char numbB = 'b';

    char smaller = 'x';

    if(a < b) {
      smaller = numbA;
    }else{
      smaller = numbB;
    }

    if(smaller == 'a'){
      return numbB ;
    }

    return numbB ;
  }

}
