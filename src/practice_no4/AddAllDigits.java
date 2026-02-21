package practice_no4;

import java.util.*;
public class AddAllDigits {
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int sum=0;
        System.out.println("Enter the Number : ");
        int n= sc.nextInt();
        while(n>0){
            int d= n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println("The  Sum of the Digits is : "+ sum);
    }
}
