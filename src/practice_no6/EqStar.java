public class EqStar {
    public static void main(String[] args) {
        char c = 'A';
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n; j++) {
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(c);
                    c++;
                }            }
            c = (char) ('B' + i);
            System.out.println();
        }
    }
}





















