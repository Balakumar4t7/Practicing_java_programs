import java.util.Scanner;

public class Asscending_or_Decending {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String n= sc.nextLine();
        boolean f1=true,f2=true;
        for(int i=0;i<n.length()-1;i++){
            if(n.charAt(i)>n.charAt(i+1)) f1=false;
        }
        for(int j=0;j<n.length()-1;j++){
            if(n.charAt(j)<n.charAt(j+1)) f2=false;
        }
        if(f1) System.out.println("In Assecending !");
        else if (f2) System.out.println("In Descending !");
        else System.out.println("not in order !");
    }
}
