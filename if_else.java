import java.util.Scanner;
public class if_else {
    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = scan.nextLine();
//        System.out.println(name);
        // The if and Else Statement
        /* Counts the even and odd numbers in a list of numbers using the if...else statement. number[] is an array variable containing all the numbers and
        number.length gives the number of elements in the array. */
        int number[] = { 50, 65, 56, 71, 81};
        int even = 0 , odd = 0;
        for(int i = 0; i < number.length; i++){
            if((number[i] % 2 ) == 0){
                even += 1;
            }
            else{
                odd += 1;
            }
        }
        System.out.println("Even Numbers : " + even + " \nOdd Numbers : " + odd);

    }
}
