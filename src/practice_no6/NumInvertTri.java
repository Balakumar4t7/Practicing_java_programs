public class NumInvertTri {

        public static void main(String[] args) {
            int n = 5,n1=1;
            for(int i=1;i<=n;i++){
                for(int j=n ; j>=i;j--){
                    System.out.print(n1);
                    n1=n1+1;
                }
                n1=1;
                System.out.println();
            }
        }
}
