package practice_no8;
public class AddNumString1 {
    public static void main(String[] args){
        String s ="tec3h 8high 54eng100";
        String s1="";
        int sum=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0' >=0) && (s.charAt(i)-'0' <10 )){
                s1=s1+s.charAt(i);
            }
            else{
                if(s1.length()>0){
                    sum=sum+ Integer.parseInt(s1);
                    s1="";
                }
            }
        }
        if(s1.length()>0) {
            sum = sum + Integer.parseInt(s1);
        }
        System.out.println(sum);
    }
}
