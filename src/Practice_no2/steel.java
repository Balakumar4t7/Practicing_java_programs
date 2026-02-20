import java.util.*;
public class steel {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Hardness : ");
        int h= sc.nextInt();
        System.out.print("Enter the Carbon Content : ");
        float c = sc.nextFloat();
        System.out.print("Enter the Tensile Strength : ");
        int t= sc.nextInt();
        System.out.println("Class : " + classifySteel(h,c,t));
    }
    public static  char classifySteel(int h, float c,int t){
        if(h>60 && c>0.8 && t>5700) return 'A';
        if(h>60 && c>0.8 ) return 'B';
        if(h>60 && t>5700) return 'C';
        if(c>0.8 && t>5700) return 'D';
        if(h>60 || c>0.8 || t>5700) return 'E';
        else return 'F';
    }
}
