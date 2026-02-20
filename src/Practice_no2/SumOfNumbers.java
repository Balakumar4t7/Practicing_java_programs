import java.util.*;
public class SumOfNumbers {
    public static void main(String [] arga){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number  M-");
        int m = sc.nextInt();
        System.out.print("Enter the Number  N-");
        int n = sc.nextInt();
        int sum= 0;
        int i=m;
        while (i<=n){
            sum= sum+i;
            i++;
        }
        System.out.print("Output : "+ sum);
    }
}
