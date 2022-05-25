package javaweek3;

public class application1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
   int [] numbers = new int [10];
   //numbers[0] = 100;
   //numbers[1] = 200;
   //numbers[2] = 300;
   
   
   //System.out.println("1st Position = " + numbers[0]);
   //System.out.println("1st Position = " + numbers[1]);
   //System.out.println("1st Position = " + numbers[2]);
   
   for(int index = 0; index < numbers.length; index++) {
     numbers[index] = (index + 1) * 100;
     
   } 
  //System.out.println("1st Position = " + numbers[0]);
  //System.out.println("1st Position = " + numbers[1]);
  //System.out.println("1st Position = " + numbers[2]);
   
   int index = 0;
   while (index < numbers.length) {
     System.out.println("[" + index + "] = " + numbers[index]);
     index++;
   }
}
}