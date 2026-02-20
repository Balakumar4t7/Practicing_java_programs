import java.util.*;
public class Check_Asscending {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        boolean flag=true;
        int n= sc.nextInt();
        int l= n%10;

        n/=10;
        while(n>0){
            int d= n%10;
            if(d>l){
                flag=false;
            }
            n/=10;
        }
        if(flag) System.out.println("it is in asscending ");
        else System.out.println("not in Asscending");
    }
}
