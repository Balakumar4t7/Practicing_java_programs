package practice_no7; import java.util.*;
public class find_pin2 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int n2= sc.nextInt();
        int n3 = sc.nextInt();
        int n4= sc.nextInt();
        int d11=n1/1000,d21=n2/1000,d31=n3/1000;
        int d12=(n1/100)%10,d22=(n2/100)%10,d32=(n3/100)%10;
        int d13=(n1/10)%10,d23=(n2/10)%10,d33=(n3/10)%10;
        int d14=n1%10,d24=n2%10,d34=n3%10;
        if(n4%2==0){
            System.out.println(even(d11,d12,d13,d14)+
                            even(d21,d22,d23,d24)+
                            even(d31,d32,d33,d34));
        }
        else{   System.out.println(odd(d11,d12,d13,d14)+
                odd(d21,d22,d23,d24)+
                odd(d31,d32,d33,d34));
        }
    }
    public static int even(int num1,int num2,int num3,int num4){
        int sum=0;
        if(num1%2==0) sum+=num1; if(num2%2==0) sum+= num2;
        if(num3%2==0) sum+= num3; if(num4%2==0) sum+= num4;
        return sum;
    }
    public static int odd(int num1,int num2,int num3,int num4){
        int sum=0;
        if(num1%2!=0) sum+=num1;
        if(num2%2!=0) sum+= num2;
        if(num3%2!=0) sum+= num3;
        if(num4%2!=0) sum+= num4;
        return sum;
    }
}
