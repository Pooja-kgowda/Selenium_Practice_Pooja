package oct152024;

public class Variable {
    public static void main(String[] args) {
      int a1;
      char b2;//Accepts a single value like 'a','A'->occupies 1 byte of memory in the stack
      boolean c3;//true or false
      long d4;//range of values from -2^64 to -2^63(8 byte of memeory in stack)
      short e5;//range of values from -32768 to 32767(2 byte of memeory in stack)
      byte f6;//accepts range of values from -128 to 127 (1 byte of memory)
      float g7;//5decimal points
      double h8; //16decimal point

      a1=-324;
      b2='A';
      c3=true;
      d4=1234567899L;
      e5=12345;
      f6=123;
      g7= 123.44545F;
      h8=12.3353254543;
      System.out.println(a1);
      System.out.println(b2);
      System.out.println(c3);
      System.out.println(d4);
      System.out.println(e5);
      System.out.println(f6);
      System.out.println(g7);
      System.out.println(h8);
      var a11=121;
      System.out.println(a11);

      var a2="abc";
      System.out.println(a2);

        System.out.println( -324+123.456f -1234/'A');
        System.out.println( -324+123.456f);
        System.out.println( 1234/'A');
        String s5="Hello World";
        String s6= """
                Hello world
                Today is 15th October 2024
                """;
      System.out.println(s5+s6);
 int a=10;
 int b=5;
      System.out.println(a+b*2);

      int x=8;
      int y=3;
      System.out.println((x+y)*3);

      double a8=5.0;
      double b8=2.0;
      System.out.println(a8*b8+(a8-b8)/b8);

    }

}
