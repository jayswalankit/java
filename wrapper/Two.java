import javax.print.DocFlavor.STRING;

public class Two {
    public static void main(String[] args) {
    //  1 way....
    //     Integer a=Integer.valueOf(100); // object ban rha hai ...
    //     int  b=a.intValue(); // primitive datatype me convert ho rha hai...
    //     System.out.println(b);

//   2nd way....
//      Integer a=100;  // autoboxing wala way means direct assign karna without use of valueof()...
//      int b=a;   // unboxing wala way means direct assign karna without use of intvalue()...
//      System.out.println(b);


// Float a=Float.valueOf(200.2f);
// float b=a.floatValue();
// System.out.println(b);

// Double a=100.24;
// double b=a;
// System.out.println(b);

// String a=("123");
// int b=Integer.parseInt(a);
// System.out.println(b);

// String a="123";
// Integer b=Integer.valueOf(a);
// int c=b.intValue();
// System.out.println(c);
        

// Float a=Float.valueOf(1001.23f);
// int c=a.intValue();
// System.out.println(c);

// String a="1001.23";
// Float b=Float.valueOf(a);
// float c=b.floatValue();
// System.out.println(b);


// Double a=10002.23;
// Integer b=Double.valueOf(a).intValue();
// System.out.println(b);
    
// Boolean a=Boolean.valueOf(true);
// int b= a?1:0;
// System.out.println(b);

// int a=100;
// Integer b=Integer.valueOf(a);
// String c=b.toString();
// System.out.println(b); 
 
Boolean a=Boolean.valueOf(false);
String b= a.toString();
System.out.println(b);

    }
  
}
