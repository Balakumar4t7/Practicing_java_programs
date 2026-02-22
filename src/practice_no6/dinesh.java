public class dinesh {
    public static void main(String []args) {
        int n=20,n1=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n*2;j++){
                if(j>=i) {
                    System.out.print("   ");
                }
                else if(j<=n-i){

                    System.out.print("     ");
                }
                else {

                    System.out.print(" "+n1+"   ");
                    n1++;
                }

            }

            System.out.println();
        }
    }
}
