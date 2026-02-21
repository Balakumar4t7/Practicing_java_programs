import java.util.*;
public class OddSeqCountNEven {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number here :  ");
        String s = sc.nextLine();
        String odds="",eves="";
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++){
            int d= s.charAt(i)-'0';
            if(d%2 !=0) {
                odds=odds+s.charAt(i);
                c1++;
            }
            else {
                eves=eves+s.charAt(i);
                c2++;
            }
        }
        System.out.println(odds+c1+eves+c2);
    }
}
