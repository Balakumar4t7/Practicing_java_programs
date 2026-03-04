package practice_no10;
import java.util.*;

public class countAlphaValue {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s =sc.nextLine();
        int sum=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            sum=sum+(ch-'a' +1);
        }
        System.out.println(sum);
    }
}
