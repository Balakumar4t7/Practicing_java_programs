import java.util.*;
public class odd_and_even {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int even=0,odd=0;
        while(n>0){
            if(n%2==0) even++;
            else odd++;
            n/=10;
        }
        String s=""+n;
        System.out.println("NUmber of even Digits in the given number is : "+even);
        System.out.println("Number of Odd Digits in the given Number is : "+odd);

    }
}
