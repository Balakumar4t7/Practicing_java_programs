package practice_no9;

public class Anagram {
    public static void main(String[] args){
        String s="solent";
        String s1="listen";
        int [] arr = new int[26];
        s=s.toLowerCase();
        s1=s1.toLowerCase();
        boolean res =true;
        if(s.length()!=s1.length()){
            res =false;
        }
        else{
          for(int i=0;i<s.length();i++){
              arr[s.charAt(i)-'a']+=1;
              arr[s1.charAt(i)-'a']-=1;
          }
        }
       for(int c : arr){
           if(c!=0) res= false;
       }
       if(res) System.out.println("True");
       else System.out.println("False");
    }
}
