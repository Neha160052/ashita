//  Q1 Write the following a functional interface and implement it using lambda:
//
//        First number is greater than second number or not Parameter (int ,int ) Return boolean
//        Increment the number by 1 and return incremented value Parameter (int) Return int
//        Concatenation of 2 string Parameter (String , String ) Return (String)
//        Convert a string to uppercase and return . Parameter (String) Return (String)

import java.util.Locale;

interface MyInterface1{
    public boolean operation1(int a, int b);
}

interface MyInterface2{
    public int operation2(int a);
}

interface MyInterface3{
    public String operation3(String a, String b);
}

interface MyInterface4{
    public String operation4(String a);
}

public class Question1 {
    public static void main(String[] args) {
            MyInterface1 m = (a,b) -> a > b ;
            System.out.println(m.operation1(3,1));

            MyInterface2 m2 = a -> a+=1;
            System.out.println(m2.operation2(2));

            MyInterface3 m3 = (a,b) -> a+" "+b;
            System.out.println(m3.operation3("Ashita", "Gupta"));

            MyInterface4 m4 = a -> a.toUpperCase();
            System.out.println(m4.operation4("abc"));
    }
}
