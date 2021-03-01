import java.util.Scanner;

public class Program01 {
    public static void main(String[] args){

        System.out.println("Hello World");

        String name = "Yogesh";
        System.out.println(name);

        int a = 45;
        float b = 45.33f;
        boolean isAdult = false;

        System.out.println(a);
        System.out.println(b);
        System.out.println(isAdult);


        //Taking user input in Java
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name ?");

        String input = scan.nextLine();
        System.out.println(input);

        // Here scan is a object and input is a variable

        // for taking integer input
        System.out.println("Enter Your age : ");
        int number = scan.nextInt();
        System.out.println("Your age is " + number);

        //continue form 1:14:54;







    }
}
