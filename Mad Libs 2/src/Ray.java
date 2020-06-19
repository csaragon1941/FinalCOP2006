/*
 * This class was to determine how to use an array. Sources: Udemy.com TheNewBoston (Bucky's Videos)
 * YouTube Jeff the TA
 */

public class Ray {
  public void array() {


    System.out.print("Here are some Array's to brighten your day. ");

    System.out.println();

    System.out.println("1D Array"); // The Smallest value in this array would be [2]
    int numArray[];
    numArray = new int[5];
    numArray[0] = 67;
    numArray[1] = 1398;
    numArray[2] = 5;
    numArray[3] = 33;
    numArray[4] = 731;
// The code above is setting the variabes for the array's. 
    int sum = numArray[0] + numArray[1] + numArray[2] + numArray[3] + numArray[4];
    // The Array values were found in the index of the array, and in each index "[]" is an element
    System.out.println("Sum of the 1D Array is: " + sum);
    System.out.println();
// Calculating the sume of the array
    System.out.println("2D Array");
    // 2D Arrays are Multi Dimensional
    int[][] arr = new int[5][3];
    arr[0][0] = 21;
// A 2D array is when there is two values that need to be defined.

    System.out.println("arr[0][0] = " + arr[0][0]);
    System.out.println();

    System.out.println("Advanced For Loop \n");
    int arr1[] = {8, 9, 3, 7, 2};

    for (int x = 0; x < arr1.length; x++) {
      System.out.println(arr1[x]);

    }

    for (Integer x : arr1) {
      System.out.println(x);

    }


  }



}


// Sprint 3 - June 13
// What is inheritance and its benefits?
// Inheritance is important in OOP and is used in java in which one class can inherit another
// classes features.
// It allows us to reuse code and improves its reusability because we don't have to rewrite much
// Describe polymorphism.
// Polymorphism in Java means the progress ability to process objects of various types and classes
// through one interface
