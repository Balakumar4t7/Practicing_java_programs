import java.util.*;
public class AddedFraction {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the first number : ");
        float f1= sc.nextFloat();
        System.out.print("Enter the Second  number : ");
        float f2= sc.nextFloat();
        float sum = f1+f2 ;
        int sum1=(int)sum;
        System.out.println(sum-sum1);

    }
}
