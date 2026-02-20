import java.util.*;
public class charges {
    public static void main(String [] args){
        int amt=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Taxi Number : ");
        String number= sc.nextLine();
        System.out.print("Enter the Distance Travelled : ");
        int dist=sc.nextInt();
        if(dist>=5) amt=100;
        else if(dist<=15 ) amt= (( dist-5)*10)+100;
        else if(dist<=25 ) amt= (10*10+(dist-15)*8)+100;
        if(dist>25) amt= (10*10+ (10*8)+( dist -25 )*5)+100;
        System.out.println(amt);
    }
}
