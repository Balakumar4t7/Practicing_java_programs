public class sam {
    public static void main(String[] args) {

        int n = 5,n1=0;
        for (int i = 0; i < n; i++) {
            n1=1+i;
            for (int j = 0; j<n; j++) {
                if(j<i){
                    System.out.print("  ");
                }
                else{
                    System.out.print(n1+" ");
                    n1++;
                }
            }


            System.out.println();
        }
    }
}
