import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("What time is it? ");
    int time = scanner.nextInt();

    switch (time) {
      case 10:
        System.out.println("The time is " + time + "\nTime for a coffee.");
        break;
      case 12:
        System.out.println("The time is " + time + "\nTime for a run!");
        break;
      case 7:
        System.out.println("The time is " + time + "\nTime to wake up.");
        break;
      default:
        System.out.println("Time to relax.");
        break;
    }
  }
}