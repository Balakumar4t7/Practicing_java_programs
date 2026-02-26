package practice_no9;
//program to remove the comman elements btween tow strings here the output needs to be bbbb
public class DelCommanElements {
    public static void main(String[] args){
        String a="aaaabbbcccddd";
        String b="aabbbbd";
        String f="";
        if(a.length()<b.length()) {
            for (int i = 0; i < b.length(); i++) {
                if (!a.contains(b.charAt(i) + ""))
                    f = f + b.charAt(i);
            }
        }
        else{
            for (int i = 0; i < a.length(); i++) {
                if (!b.contains(a.charAt(i) + ""))
                    f = f + a.charAt(i);
            }
        }
        System.out.println(f);

    }
}
