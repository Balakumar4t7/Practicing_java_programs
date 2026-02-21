public class pattern10 {
    public static void main(String[] args) {
        int n=5,n1=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n*2;j++) {
                if (i > j || j > n * 2 - i - 2) {
                    System.out.print(" ");
                } else System.out.print(n1);
            }
            System.out.println();
            n1++;
        }

    }
}