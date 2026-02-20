import java.util.*;
public class stepping_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=""+n;
        boolean f= false;
        for(int i=0;i<s.length()-1;i++){

            if(((s.charAt(i)-s.charAt(i+1)) == 1 )||((s.charAt(i)-s.charAt(i+1)) == -1 )){
                f=true;
            }
        }
        if(f) System.out.println("The Number is a Stepping Number !");
        else System.out.println("The Number is Not a Stepping Number !");
    }
}
