import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nummber to Check :  ");
        int n1= sc.nextInt();
        if(n1%9==1) System.out.println("The Number is a magic number !");
        else System.out.println(" The Nummmber is Not a Magic number !");
    }
}