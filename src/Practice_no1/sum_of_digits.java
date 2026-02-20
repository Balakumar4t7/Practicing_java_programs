import java.util.*;

public class sum_of_digits {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num=sc.nextInt();

    
    if(num>999 && num< 9999){
        int sum=0;
        while(num!=0){
           int digits=num%10;
           sum=sum+digits;
           num=num/10;
        }
        System.out.println("Sum of the digits is : "+sum);

    }
    else{
        System.out.println("NUmber should be in 4 Digit !");
    }
    }
}
