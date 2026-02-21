import java.util.*;
public class OddFollowedEven {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number here :  ");
        String s = sc.nextLine();
        String odds="",eves="";
        for(int i=0;i<s.length();i++){
            int d= s.charAt(i)-'0';
            if(d%2 !=0) odds=odds+s.charAt(i);
            else eves=eves+s.charAt(i);
        }
        System.out.println(odds+eves);
    }

}
