import java.util.*;
public class UnitDigit {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number  :  ");
        int n= sc.nextInt();
        System.out.print("The unit Digit is  : "+ n%10);
    }
}
