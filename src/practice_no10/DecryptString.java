package practice_no10;

public class DecryptString {
    public static void main(String[] args){
        String s ="a9b1c5d4";
        String ds="";
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch-'0'>=0 && ch-'0'<=9){
                int val= ch-'0';
                for(int j=0;j<val;j++){
                    ds=ds+s.charAt(i-1);
                }

            }
        }
        System.out.println(ds);


    }
}
