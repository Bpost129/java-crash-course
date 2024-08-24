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

    // String[] friends = {"Maria", "Alex", "Bita", "Ana", "John", "Steve"};
    // for (String friend : friends) {
    //   // System.out.println(friend);
    // }


    // int[] numbers = {2, 19, 20, 33, 15, 17, 5};
    // // getMaxFromArr(numbers);
    
    // Car mazda = new Car("Mazda", "RX-7", "Red", 2);
    // Car subi = new Car("Subaru", "WRX", "Blue", 4);


  
    // System.out.println(subi.getName());
    // System.out.println(subi.getModel());
    // System.out.println(subi.getColor());
    // System.out.println(subi.getDoors());
    // System.out.println("\n");
    
    // System.out.println(mazda.getName());
    // System.out.println("\n");

    // subi.setModel("Crosstrek");
    // subi.setColor("Silver");

    // System.out.println(subi.getName());
    // System.out.println(subi.getModel());
    // System.out.println(subi.getColor());
    // System.out.println(subi.getDoors());

    Car car = new Car("Kia", "Forte", "Black", 4);
    Plane plane = new Plane("Boeing", "767", "White", 4);

    plane.move();
    plane.stop();
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

  // public static int getMaxFromArr(int[] numbers){
  //   int max = numbers[0];
  //   for (int number : numbers) {
  //     if (number > max) {
  //       max = number;
  //     }
  //   }

  //   System.out.println(max);
  //   return max;
  // }

  
  }


class Vehicle {
  private String name;
  private String color;

  public Vehicle(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public void move() {
    System.out.println("The vehicle " + this.name + " is moving.");
  }

  public void stop() {
    System.out.println("The vehicle " + this.name + " has stopped.");
  }

}

class Car extends Vehicle {
  private String model;
  private int doors;

  public Car(String name, String model, String color, int doors) {
    super(name, color);
    this.model = model;
    this.doors = doors;
  }

}

class Plane extends Vehicle {
  private String model;
  private int engines;

  public Plane(String name, String model, String color, int engines) {
    super(name, color);
    this.model = model;
    this.engines = engines;
  }

  @Override
  public void move() {
    System.out.println("The plane is flying");
    // super.move();
  }

}