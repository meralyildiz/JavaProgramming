package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {
    public static void main(String[] args) {
       //implicit casting shorter primitive assigned to larger primitive number
        byte a = 100;
        short b = a;
        // short b = (short)a;

       //       (short)a

        int c = b;

        // int c = (int)b

        long d = c ;

        //explicit casting larger primitive can not be assigned directly to shorter primitives

       int e = 100;
      byte f =(byte) e;

      int x = 55;
      short y = (short)x; //short y = (short)x;  this is the way of casting manually

        System.out.println( "x " + x + " : " + "y " + y);

        long j = 1000000;
        short k = (short)j;
        System.out.println(j + " : " + k); // 1000000 is out of short' range so the result will be cast in byte number

        double l = 2.5;
        float m = (float) l;

        System.out.println( l + " : " + m );

        double n = 10.8;
        int s = (int) n;
        System.out.println( n + " : " + s);

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println( d1 + " : " +  s1);

        float f1 = 30.5F;
        long l2 = (long) f1;
        System.out.println( f1 + " : "+ l2);
    }

}
