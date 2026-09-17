 public class Main{
     public static void main(String[] args) {
         System.out.println("Hello World");
         byte a = 45;
         int d = a; //Implicit Type Casting
         long b = 454545612;
         int c = (int)b; //Explicit Type Casting
         float f = 45.56f;
         double m = 745.5656565656;
         System.out.println(a);
         System.out.println(b);
         System.out.println(d);
         System.out.println(c);
         System.out.println(f);
         System.out.println(m);

        int e = ++a;
         System.out.println(e);
     }
 }