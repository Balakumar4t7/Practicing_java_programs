package practice_no8;
//program to count the number of vowels and consonents numbers and special symbol
public class CountVowelsConsonents {
    public static void main(String [] args){
        String s = "Aeibcd@#$12&*(3";
        String vow="aeiou",num="0123456789",cons="bcdfghjklmnpqrstvwxyz";
        int v=0,c=0,d=0,sy=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(vow.contains(s.charAt(i)+"")) v++;
            else if(num.contains(s.charAt(i)+"")) d++;
            else if(cons.contains(s.charAt(i)+"")) c++;
            else {
                if(!(cons.contains(s.charAt(i)+"") && (vow.contains(s.charAt(i)+"")) && (num.contains(s.charAt(i)+"")))){
                    sy++;
                }
            }
        }

        System.out.println("vowels " + v);
        System.out.println("Digits " + d);
        System.out.println("Symbols " + sy);
        System.out.println("Consonents " + c);
    }

}
