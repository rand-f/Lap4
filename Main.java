import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int choice;
        System.out.println("Welcome to shapes by Rand");
        do {
            System.out.println("please choose the shape you want test: " +
                    "\n 1. Circle" +
                    "\n 2. Rectangle" +
                    "\n 3. Triangle" +
                    "\n 4. Exit");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    circle();
                    break;
                case 2:
                    rectangle();
                    break;
                case 3:
                    triangle();
                    break;
                case 4:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Wrong Entry");
            }
        }while (choice != 4);
    }
    public static void circle(){
        Circle c = new Circle();
        System.out.println("Please enter the circle's radius");
        c.setRadius(input.nextDouble());
        int choice;
        do {
            System.out.println("What would you lik to do?" +
                    "\n 1. get circle info" +
                    "\n 2. change circle info" +
                    "\n 3. calculate circle circumference" +
                    "\n 4. calculate circle area" +
                    "\n 5. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(c.toString());
                    break;
                case 2:
                    System.out.println("Please enter the circle's new radius");
                    c.setRadius(input.nextDouble());
                    System.out.println(c.toString());
                    break;
                case 3:
                    System.out.println("the circles circumference is "+c.calculateCircumference());
                    break;
                case 4:
                    System.out.println("the circles area is "+c.calculateArea());
                    break;
                case 5:
                    System.out.println("thank you for visiting circles world");
                    System.out.println("========================================================");
                    break;
                default:
                    System.out.println("Wrong Entry");
            }
        }while (choice != 5);
    }
    public static void rectangle(){
        Rectangle r = new Rectangle();
        System.out.println("Please enter the rectangle's height");
        r.setHeight(input.nextDouble());
        System.out.println("Please enter the rectangle's width");
        r.setWidth(input.nextDouble());

        int choice;
        do {
            System.out.println("What would you lik to do?" +
                    "\n 1. get rectangle info" +
                    "\n 2. change rectangle info" +
                    "\n 3. calculate rectangle perimeter" +
                    "\n 4. calculate rectangle area" +
                    "\n 5. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(r.toString());
                    break;
                case 2:
                    System.out.println("Please enter the rectangle's new height");
                    r.setHeight(input.nextDouble());
                    System.out.println("Please enter the rectangle's new width");
                    r.setWidth(input.nextDouble());
                    System.out.println(r.toString());
                    break;
                case 3:
                    System.out.println("the rectangle perimeter is "+r.calculateCircumference());
                    break;
                case 4:
                    System.out.println("the rectangle area is "+r.calculateArea());
                    break;
                case 5:
                    System.out.println("thank you for visiting rectangle world");
                    System.out.println("========================================================");
                    break;
                default:
                    System.out.println("Wrong Entry");
            }
        }while (choice != 5);
    }
    public static void triangle(){
        Triangle t = new Triangle();
        System.out.println("Please remember this is an equilateral triangle");
        System.out.println("Please enter the triangle's height");
        t.setHeight(input.nextDouble());
        System.out.println("Please enter the triangle's base");
        t.setBase(input.nextDouble());

        int choice;
        do {
            System.out.println("What would you lik to do?" +
                    "\n 1. get triangle info" +
                    "\n 2. change triangle info" +
                    "\n 3. calculate triangle perimeter" +
                    "\n 4. calculate triangle area" +
                    "\n 5. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(t.toString());
                    break;
                case 2:
                    System.out.println("Please enter the triangle's new height");
                    t.setHeight(input.nextDouble());
                    System.out.println("Please enter the triangle's new base");
                    t.setBase(input.nextDouble());
                    System.out.println(t.toString());
                    break;
                case 3:
                    System.out.println("the triangle perimeter is "+ t.calculateCircumference());
                    break;
                case 4:
                    System.out.println("the triangle area is "+ t.calculateArea());
                    break;
                case 5:
                    System.out.println("thank you for visiting triangle world");
                    System.out.println("========================================================");
                    break;
                default:
                    System.out.println("Wrong Entry");
            }
        }while (choice != 5);
    }

}