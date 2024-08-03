import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    // System.out.println("What time is it? ");
    // int time = scanner.nextInt();

    // switch (time) {
    //   case 10:
    //     System.out.println("The time is " + time + "\nTime for a coffee.");
    //     break;
    //   case 12:
    //     System.out.println("The time is " + time + "\nTime for a run!");
    //     break;
    //   case 7:
    //     System.out.println("The time is " + time + "\nTime to wake up.");
    //     break;
    //   default:
    //     System.out.println("Time to relax.");
    //     break;
    // }

    // for (int i = 0; i <= 10; i++) {
    //   System.out.println("i = " + i);
    // }

    // getMax(99, 99);

    String[] friends = {"Maria", "Alex", "Bita", "Ana", "John", "Steve"};
    for (String friend : friends) {
      System.out.println(friend);
    }


    int[] numbers = {2, 19, 20, 33, 15, 17, 5};
    getMaxFromArr(numbers);

  }


  // public static int getMax(int num1, int num2) {
  //   if (num1 > num2) {
  //     System.out.println("Max is " + num1);
  //     return num1;
  //   } else if (num2 > num1) {
  //     System.out.println("Max is " + num2);
  //     return num2;
  //   } else {
  //     System.out.println("Even numbers!!");
  //     return 0;
  //   }
  // }

  public static int getMaxFromArr(int[] numbers){
    int max = numbers[0];
    for (int number : numbers) {
      if (number > max) {
        max = number;
      }
    }

    System.out.println(max);
    return max;
  }
}