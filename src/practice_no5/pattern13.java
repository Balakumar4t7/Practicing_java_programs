public class pattern13 {
    public static void main(String [] args){
        int n=4,n1=0;
        for(int i=1;i<=n;i++){
            n1++;
            for(int j=1;j<=i;j++){
                System.out.print(n1+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            n1--;
            for(int j=0;j<n-i-1;j++){
                System.out.print(n1+" ");
            }
            System.out.println();
        }
    }
}
