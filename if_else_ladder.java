import java.util.Scanner;
public class if_else_ladder {
    public static void main(String[] args){
        //if..else ladder analysing a mark list.
        int rollNumber[] = { 111, 222, 333, 444 };
        int marks[] = { 81, 74, 43, 58 };
        for(int i = 0 ; i< rollNumber.length; i++){
            if(marks[i] > 79){
                System.out.println(rollNumber[i] + " Honours");
            }
            else if(marks[i] > 59){
                System.out.println(rollNumber[i] + " I Division");
            }
            else if(marks[i] > 49){
                System.out.println(rollNumber[i] + " II Division");
            }
            else{
                System.out.println(rollNumber[i] + " Fail");
            }
        }
    }
}
