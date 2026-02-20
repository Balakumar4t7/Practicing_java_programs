import java.util.*;

class gst{
    public static void main(String [] args){
            Scanner sc =new Scanner(System.in);
            double num = sc.nextDouble();

            double CGST= num*(9.0/100.0);

            System.out.println("CGST : "+CGST);

            System.out.println("SGST : "+CGST);
            
            System.out.println("Total price to be Paid : "+(CGST+num+CGST));


    }
}