package practice_no7;
import java.util.*;
public class find_pin4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4= sc.nextInt();
        int d11 = n1 / 1000, d21 = n2 / 1000, d31 = n3 / 1000;
        int d12 = (n1 / 100) % 10, d22 = (n2 / 100) % 10, d32 = (n3 / 100) % 10;
        int d13 = (n1 / 10) % 10, d23 = (n2 / 10) % 10, d33 = (n3 / 10) % 10;
        int d14 = n1 % 10, d24 = n2 % 10, d34 = n3 % 10;
        System.out.println((((max(d11,d12,d13,d14)) * min(d11,d12,d13,d14))
                + (max(d21,d22,d23,d24) * min(d21,d22,d23,d24))
                + (max(d31,d32,d33,d34) * min(d31,d32,d33,d34)))-n4);
    }
    public static int max(int num1 ,int num2 ,int num3,int num4){
        int max = num1;
        if(num2 > max) max = num2;
        if(num3 > max) max = num3;
        if(num4 > max) max = num4;
        return max;
    }
    public static int min(int num1 ,int num2 ,int num3,int num4){
        int min= num1;
        if(num2 < min) min = num2;
        if(num3 < min) min = num3;
        if(num4 < min) min = num4;
        return min;
    }
}

