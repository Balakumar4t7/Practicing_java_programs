import java.util.*;
public class HoursDaysSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number of days : ");
        int days= sc.nextInt();
        int hours = days * 24;
        int mins= hours *60;
        int secs= mins *60 ;
        System.out.print(days+ " has " +hours+" Hours , "+mins+" Minutes and "+ secs+" Seconds ");
    }
}
