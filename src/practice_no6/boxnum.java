public class boxnum {
    public static void main(String [] args){
        int n=5,n1=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 ){
                    System.out.print(" "+1);
                }
                else if(i==n-1){
                    System.out.print(" "+n);
                }
                else if((i>0 && i<n-1)&& (j==0 || j==n-1)){
                    System.out.print(" "+n1);
                }
                else{
                    System.out.print("  ");
                }
            }
            n1++;
            System.out.println();
        }
    }
}
