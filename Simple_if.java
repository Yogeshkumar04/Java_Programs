import java.sql.SQLOutput;
import java.util.Scanner;

public class Simple_if {
    public static void main(String[] args){
        //Decision Making and Branching
        //Simple if

        /* Question 1. If the value of weight is less than 50, then the following statement in executed, which another if statement. This if statement tests
        height and if the height is greater than 170, then the count is incremented by 1.*/

        int i, count, count1, count2;
        float[] weight = { 45.0f, 55.0f, 47.0f, 51.0f, 54.0f};
        float[] height = { 176.5f, 174.2f, 168.0f, 170.7f, 169.0f};
        count = 0;
        count1 = 0;
        count2 = 0;
        for(i=0;i<=4;i++){
            if(weight[i] < 50.0f && height[i] > 170.0){
                count1 += 1;
            }
            count += 1; //Total Person
        }
        count2 = count - count1;
        System.out.println("Number of persons with ....");
        System.out.println("Weight < 50 and height > 170 = " + count1);
        System.out.println("Others = " + count2);
    }
}
