import java. util.Scanner;
 class percent{

    public static void main(String []args){
            Scanner s=new Scanner(System. in);

            System.out.print("Enter Marks in Each subject 1:");
            int s1=s.nextInt();
             System.out.print("Enter Marks in Each subject 2 :");
            int s2=s.nextInt();
             System.out.print("Enter Marks in Each subject 3 :");
            int  s3=s.nextInt();
             System.out.print("Enter Marks in Each subject 4 :");
            int s4=s.nextInt();
             System.out.print("Enter Marks in Each subject  5 :");
            int s5=s.nextInt();


System.out.println("Percentage of marks Scored :"+(( s1+s2+s3+s4+s5)/5) );

    
    }
    
}