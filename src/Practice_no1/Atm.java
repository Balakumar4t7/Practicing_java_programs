import java.util.*;
class Atm{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Number of Notes you wan to withdraw ! ");

         System.out.print("Enter number of 100's : ");
         int n1=sc.nextInt();
         System.out.print("Enter number of 500's : ");
         int n2=sc.nextInt();
         System.out.print("Enter number of 1000's : ");
         int n3=sc.nextInt();
         
         System.out.print("Total Amount you have taken  : "+(n1*100 + n2*500 + n3*1000));
         
    }
}