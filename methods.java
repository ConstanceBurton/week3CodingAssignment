package javaweek3;

public class methods {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] myArray = new int[3];
    myArray[0] = 7;
    myArray[1] = 10;
    myArray[2] = 8;
    
    //int sum = sumArray(myArray);
    
   //System.out.println(sum); or:
    System.out.println(sumArray(myArray));
    
  }
  
  /*
   * Takes an array of ints and returns the sum of all the ints
   */
  public static int sumArray(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
 
 
  }
  

