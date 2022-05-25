package javaweek3;

import java.util.Arrays;

public class week3codingassignment {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    //Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    
    int[] ages = new int[9];
    
    ages[0] = 3;
    ages[1] = 9;
    ages[2] = 23;
    ages[3] = 64;
    ages[4] = 2;
    ages[5] = 8;
    ages[6] = 28;
    ages[7] = 93;
    ages[8] = 39;
    
    //Programmatically subtract the value of the first element in the array from the value in the last element of the array 
   // Add a new age to your array and repeat the step above to ensure it is dynamic 
    
    System.out.println((ages[ages.length - 1] - ages[0]));
    
    double sum = 0;
    for (int number : ages) {
      sum += number;
     System.out.println(sum);
      
  //Use a loop to iterate through the array and calculate the average age. 
     
      double average = sum / ages.length;
      System.out.println(average);
      
      }
    
    //Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    
    String[] names = {"Sally", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    
    double sumOfLetters = 0;
    
    for (String name : names) {
      sumOfLetters += name.length();
      System.out.println(sumOfLetters);
      
      //Use a loop to iterate through the array and calculate the average number of letters per name.
      
      double average = sumOfLetters / names.length;
      
       System.out.println(average);
       
    //Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
       
       int a = 0;
       for (a =0; a < names.length; a++) {
         System.out.println(names[a]);
       }   
       
   //Create a new array of int called nameLengths
   //Write a loop to iterate over the previously created names array 
   //and add the length of each name to the nameLengths array 
       
       int[] nameLengths = new int[names.length];
       int b = 0;
       for (b = 0; b < names.length; b++) {
         nameLengths[b] = names[b].length();
         System.out.println(nameLengths[b]);

       }
   //6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array
       
       int sumOfNameLengths = 0;
       
       for(int nameLength : nameLengths) {
         sumOfNameLengths += nameLength;
         System.out.println(sumOfNameLengths);
         
         
       }
    }
  //Write a method that takes a String, word, and an int, n, 
  //as arguments and returns the word concatenated to itself n number of times
    
    System.out.println(multiplyString("Congratulations", 5));
    
  //Write a method that takes two Strings, firstName and lastName, and returns a full name 
    
    String firstName = "Constance";
    String lastName = "Burton";
    String fullName = createFullName(firstName, lastName);
    
    System.out.println(fullName);
    
  //Write a method that takes an array of int and returns true if the sum of all the ints 
  //in the array is greater than 100.
    
    isSumGreaterThanOneHundred(ages.length, 100);
    
  //Write a method that takes an array of double and returns the average of all the elements in the array.
    
    double[] temperature = {99.8, 100.0, 88.2};
    System.out.println(calculateAverageTemp(temperature));
  
 //Create a method of your own that solves a problem. 
 //In comments, write what the method does and why you created it.
 //I made this method to calculate the average time that my daughter spends reading in a week.
 //It allows for us to put her daily minutes read in for each day of the week and calculates the average 
 //time spent reading for the week.
    
    int[] readingTime = {100, 53, 10, 200, 5, 10, 68};
    
    System.out.println(averageMinutesRead(readingTime));
    
    boolean isHotOutside = true;
    double moneyInPocket = 20.50;
    System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
    
  }
  
    public static String multiplyString(String str, int num) {
      String result = "";
      for (int i = 0; i < num; i++) {
        result += str;
        
    }
      
      return result;
    }       
    public static String createFullName(String firstName, String lastName) {
      return firstName + " " + lastName;
    }
    public static boolean isSumGreaterThanOneHundred(int ages, int number) {
      if(ages > number) {
        return true;
      } else {
        return false;
      }
    }
    public static double calculateAverageTemp(double[] temperature) {
      double sumTemperature = 0;
      for(double temp : temperature) {
        sumTemperature += temp;
      }
      return sumTemperature / temperature.length;
      
    }
  public static int averageMinutesRead(int[] readingTime) {
    int sumMinutes = 0;
    for(int minutes : readingTime) {
      sumMinutes += minutes;
    }
    return sumMinutes / readingTime.length;
  }
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
      if(isHotOutside == true && moneyInPocket > 10.50) {
        return true;
      } else {
        return false;
      }
    }
   }
    
    
  
   
  