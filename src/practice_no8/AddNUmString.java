package practice_no8;

public class AddNUmString {
    public static void main(String [] args){
        String s ="tec3h 8high 53eng";
        int num=0,sum=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0' >=0) && (s.charAt(i)-'0' <10 )) {
                num = ((num)+ (s.charAt(i)-'0'));
            }
        }
        System.out.println(num);
        System.out.println('6'-'0');

    }
}
