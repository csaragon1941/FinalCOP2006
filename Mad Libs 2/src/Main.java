/*
 * Christina Aragon Title: Mad Libs: Carona Edition Part of this project is a Mad Libs game based on
 * the Carona Virus Outbreak. Also in this project there is also code I wrote to understand the
 * cencept of it. I soon to integrate it into my project in a unique way.
 * 
 * Sources: w3schools.com, beginnersbook.com, Udemy.com, TheNewBoston (Bucky's Videos) YouTube, Jeff the
 * TA
 * 
 */


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // This is a method and there is a header to the method

    Scanner keyboardInput = new Scanner(System.in);
    System.out.print("I HOPE U AREE YOUUU READYYY TO RUMBLEEEE! I HOPE SO" + " ");
    String intro = keyboardInput.nextLine();

    boolean readyPlay = true;

    do {
      MadQuiz1 MadObject = new MadQuiz1(); // Imports the Mad Lib Quiz
      MadObject.lib1();


      System.out.println();
      plant plant1 = new plant();
      plant plant2 = new plant();

      System.out.println(plant1.getTypePlant());
      plant1.setTypePlant("Sunflower");
      System.out.println(plant1.getTypePlant());
      System.out.println(plant2.getTypePlant());
      System.out.println();

      System.out.println();
      // PRESS ANY KEY TO CONINTUE SECTION
      System.out.println("Comparing two strings together");
      System.out.println();

      Scanner keyboardInput1 = new Scanner(System.in);
      System.out.print("Press Anykey to continue");
      System.out.println();
      // Comparing two string together
      String spongebob = "yellow and square";
      String gary = "snail";
      System.out.println();


      int var1 = spongebob.compareTo(gary);
      System.out.println("Spongebob & Gary comparison: " + var1);
      // == compares two object references and not what is in the string



      // For loops and other methods that I did not know how to integrate in my Mad Libs Yet
      for (int y = 1; y < 10; y++) {
        // These are parameters up above ^^
        System.out.println("value of y: " + y + "\n");
        continue; // The continue loop skips to the next part of the loop
      }
      for (int i = 3; i < 5;) {
        System.out.println("value of i: " + i + "\n");
        break;

      }

      int x = 0;
      int opp = (x += 53.6);
      // This is an Argument ^^
      System.out.println("The answer to += is: " + opp);
      System.out.println("");
      System.out.println();



      double first_num, second_num, answer;
      // beginnersbook.com
      first_num = 10;
      second_num = 20;
      answer = first_num + second_num;
      System.out.println("Double Variable Exmaple Output: " + "Sum of Num = " + answer + "\n"
          + "                   ");
      System.out.println();

      final int digit;
      digit = 10;
      // The variable final means that the value stored inside a variable cannot be changed later
      System.out.println("Int. Exmaple Output: " + " = " + digit + "\n" + "                   ");

      System.out.println();
      Ray rayObject = new Ray();
      rayObject.array();
      System.out.println();

      System.out.println("Come Back Again");

    } while (!readyPlay);

  }

}



// Operator precedence is the order that the operator goes first in the expression

// Sprint 1
// What is Variable?
// In programing a value is a part of the program that can change depending on
// its condition or on info passed to the program
// What is the term Scope?
// A scope refers to the visibility of variables
