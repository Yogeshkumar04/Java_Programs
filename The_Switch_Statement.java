import java.util.Scanner;
public class The_Switch_Statement {
    public static void main(String[] args){

        //The Switch Statement
 //Question : Grading of Student
 Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your RollNumber From 1 to 10");
 int rollNumber = scan.nextInt();

 switch (rollNumber){
     case 1:
         System.out.println("Honours");
         break;
     case 2:
         System.out.println("I Division");
         break;
     case 3:
         System.out.println("II Division");
         break;
     case 4:
         System.out.println("III Division");
         break;
     case 5:
         System.out.println("IV Division");
         break;
     case 6:
         System.out.println("V Division");
         break;
     case 7:
         System.out.println("VI Division");
         break;
     case 8:
         System.out.println("VII Division");
         break;
     case 9:
         System.out.println("VIII Divison");
         break;
     case 10:
         System.out.println(" XI Division");
         break;
     default:
         System.out.println("FAIL");
         break;
 }



    }
}
