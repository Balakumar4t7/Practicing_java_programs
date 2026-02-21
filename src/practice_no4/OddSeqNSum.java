import java.util.*;
public class OddSeqNSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number here ! ");
        int n=sc.nextInt();
        int sum=0,seq=0;
       String s =""+n;
       for(int i=0;i<s.length();i++){
           int d=s.charAt(i)-'0';
           if((d %2) !=0){
               seq=seq*10+d;
               sum=sum+d;
           }
       }
        System.out.println("The Sum of the Odd number digits is : "+sum );
        System.out.println( " The seq of odd numbers is :"+ seq);
    }
}
