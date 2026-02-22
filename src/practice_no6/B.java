public class B {
    public static void main(String [] args){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if((i==0 || i==9 ||i==5) &&(j==9 )){
                        System.out.print("   ");
                }
                else if(((i>=2 && i<=3 )&&(j>=3 && j<=6))||((i>=6 && i<=7)&&(j>=3 && j<=6))){
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
