import java.util.Scanner;
public class Questions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Q. Write a program to find the number of and sum of all integer greater than 100 and less than 200 that are divisible by 7.
//
//        int n1 = 100;
//        int n2 = 200;
//        float sum = 0.0f;
//
//        for(n1 = 100; n1 < n2; n1++){
//            if(n1 % 7 == 0){
//                sum += n1;
//                System.out.println("The integers between 100 and 200 which is divisible by 7 is : "+n1);
//            }
//        }
//        System.out.println("The Sum of all integers between 100 and 200 which is divisible by 7 is: " +sum);


        /*Q. W set of two linear equations with two unknowns x1 and x2 is given below:
            ax1 + bx2 = m
            cx1 + bx2 = n
           The set has a unique solution
            x1 = (md - bn) / (ad - cb)
            x2 = (na - mc) / (ad - cb)
            provided the denominator ad - cd is not equal to zero.
           Write a program that will read the values of constants a, b, c, d, m and n and compute the values of x1 and x2.
           An appropriate message should be printed if ad -cb = 0 */


//        System.out.println("Enter the values of the following constants : ");
//        System.out.println("Enter the value of a : ");
//        int a = scan.nextInt();
//        System.out.println("Enter the value of b : ");
//        int b = scan.nextInt();
//        System.out.println("Enter the value of c : ");
//        int c = scan.nextInt();
//        System.out.println("Enter the value of d : ");
//        int d = scan.nextInt();
//        System.out.println("Enter the value of m : ");
//        int m = scan.nextInt();
//        System.out.println("Enter the vlaue of n : ");
//        int n = scan.nextInt();
//
//        int x1 = 0;
//        int x2 = 0;
//
//        if((a*d - c*d)==0){
//            System.out.println(" since, ad - cb = 0 \n Invalid ");
//        }
//        else{
//            x1 = (m*d - b*n)/(a*d - c*b);
//            x2 = (n*a - m*c)/(a*d - c*b);
//
//            System.out.println("The value of x1 : " + x1);
//            System.out.println("The value of x2 : " + x2);
//        }


        /*Q. Given a list of marks ranging form 0 to 100, write a program to compute and print the number of students who have obtained marks
        (a). in the range 81 to 100,
        (b). in the range 61 to 80,
        (c). in the range 41 to 60 and
        (d). in the range 00 to 40.
            The program should use a minimum number of if statements.
          */
        //Source Code
//        int student_Score[] = {93,24,56,66,77,43,34};
//        int i = 0;
//        for(i = 0 ; i < student_Score.length; i++){
//            if(student_Score[i]>81 && student_Score[i] < 100){
//                System.out.println("Student Score is " + student_Score[i] + " and its Grade is 'A'.");
//            }
//            else if(student_Score[i] > 61 && student_Score[i] < 80){
//                System.out.println("Student Score is " + student_Score[i] + " and its Grade is 'B'.");
//            }
//            else if(student_Score[i] > 41 && student_Score[i] < 60){
//                System.out.println("Student Score is " + student_Score[i] + " and its Grade is 'C'.");
//            }
//            else if(student_Score[i] > 00 && student_Score[i] < 40){
//                System.out.println("Student Score is " + student_Score[i] + " and its Grade is 'D'.");
//            }
//            else{
//                System.out.println("FAIL");
//            }
//        }

        /*Q. Admission to a professional course is subject to the following conditions:
         (a). Marks in Mathematics          >= 60
         (b). Marks in Physics              >= 50
         (c). Marks in Chemistry            >= 40
         (d). Total in all three subjects   >=200
                            (or)
              Total in mathematics and physics >= 150
         Given the marks in the three subjects, write a program to process the applications to list the eligible candidates.
         */
        //Source Code
//        System.out.println("Enter Your Following Details For Admission to a professional courses : ");
//        System.out.println("Enter Your Name : ");
//        String name = scan.nextLine();
//        System.out.println("Enter Your MATHEMATICS marks : ");
//        int maths_marks = scan.nextInt();
//        System.out.println("Enter Your PHYSICS marks     : ");
//        int phy_marks = scan.nextInt();
//        System.out.println("Enter Your CHEMISTRY marks   : ");
//        int che_marks = scan.nextInt();
//
//        if(maths_marks>=60 && phy_marks>=50 && che_marks>=40 && maths_marks+phy_marks+che_marks >= 200){
//            System.out.println("Your are eligible candidate : " + name);
//        }
//        else if(maths_marks+phy_marks >= 150){
//            System.out.println("Your are eligible candidate : " + name);
//        }
//        else {
//            System.out.println("Your are not eligible candidate : " + name + " for admission to a professional courses.");
//        }


        /*Q. Show below is a Floyd's triangle.
            1
            2 3
            4 5 6
            7 8 9 10
            11 .. .. .. 15
            .
            .
            79 .. .. .. .. .. .. 91

          (a). Write a program to print this triangle.
          (b). Modify the program to produce the following form of Floyd's traingle.

                1
                0 1
                1 0 1
                0 1 0 1
                1 0 1 0 1

        */
        // Source Code










    }
}
