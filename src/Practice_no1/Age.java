import java.util.*;
class Age{
    public static void main(String []args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter  the Date :");
            int date= 27-sc.nextInt();
            
            System.out.println("Enter  the Month :");
            int month= 12-sc.nextInt();
            
            System.out.println("Enter  the Year :");
            int year= 2025-sc.nextInt();


            int d = date+ (month*30)+(year*365);
            int y = d/365;
            d=d%365;
            int m= d/30;
            d=d%30;
            System.out.println("You are "+ y+" Years "+m+" Months "+d+" days old");
    }
}