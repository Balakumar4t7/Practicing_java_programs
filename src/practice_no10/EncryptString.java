package practice_no10;

public class EncryptString {
    public static void main(String [] args){
        String s= "aaabbbccdddd";
        int[] arr=new int [26];
        int val=0;
        String es="";
        for(int i=0;i<s.length();i++){
          arr[s.charAt(i)-'a']=arr[s.charAt(i)-'a']+1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                val=arr[i];
                char c1= (char)(i+'a');
                es=es+c1+(val);
            }
        }
        System.out.println(es);
    }
}
