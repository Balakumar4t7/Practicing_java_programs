package Practice_no3;

import java.util.*;
public class sum_of_digits1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        System.out.println("The sum of the Number until unit Digits : " + n%9);

    }
}
