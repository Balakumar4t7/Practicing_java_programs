package Practice_no2;
import java.util.*;
public class find_pin5 {
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println((n1/1000)*((n2/100)%10) +(min(n3/1000,(n3/100)%10,(n3/10)%10,(n3%10))));
    }
    public static int min(int num1 ,int num2 ,int num3,int num4){
        int min= num1;
        if(num2 < min) min = num2;
        if(num3 < min) min = num3;
        if(num4 < min) min = num4;
        return min;
    }
}
