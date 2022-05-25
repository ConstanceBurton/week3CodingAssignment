package javaweek3;

import java.util.Scanner;

public class Objects {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    
    String name = "Sally Mae";
    System.out.println(name.length());
    System.out.println(name.charAt(5));
    
    Scanner s = new Scanner(System.in);
    
    int[] numbers = new int[3];
    System.out.println(numbers.length);
    
    String a = new String("Hello");
    String b = new String("Hello");
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(a == b);
    System.out.println("equals() method: " + a.equals(b));
    
    int x = 5;
    int y = 5;
    System.out.println(x);
    System.out.println(y);
    System.out.println(x == 5);
    
    String c = new String("Hello");
    String d = c;
    System.out.println(c);
    System.out.println(d);
    System.out.println(c == d);
    
    
  }

}
