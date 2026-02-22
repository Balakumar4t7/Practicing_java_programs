package practice_no7;
import java.util.*;
public class find_key1 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int n2= sc.nextInt();
        int n3 = sc.nextInt();
      int d11=n1/1000,d21=n2/1000,d31=n3/1000;
      int d12=(n1/100)%10,d22=(n2/100)%10,d32=(n3/100)%10;
      int d13=(n1/10)%10,d23=(n2/10)%10,d33=(n3/10)%10;
      int d14=n1%10,d24=n2%10,d34=n3%10;
        System.out.println ( "" + (max(d11,d21,d31)-min(d11,d21,d31))
                +(max(d12,d22,d32)-min(d12,d22,d32))
                +(max(d13,d23,d33)-min(d13,d23,d33))
                +(max(d14,d24,d34)-min(d14,d24,d34)) );
    }
    public static int max(int num1 ,int num2 ,int num3){
        int l=0;
        if(num1> num2 && num1> num3 ) l=num1;
        else if(num2 > num3) l=num2;
        else l=num3;
        return l;
    }
    public static int min(int num1 ,int num2 ,int num3){
        int l=0;
        if(num1< num2 && num1< num3 ) l=num1;
        else if(num2 <num3) l=num2;
        else l=num3;
        return l;
    }
}
