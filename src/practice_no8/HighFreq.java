package practice_no8;
//highest frq char and how many times the char is apperead
public class HighFreq {
    public static void main(String[] args){
        String s ="Engineering";
        s=s.toLowerCase();
        int arr[] = new int[26];
        int max=0;
        for(int i=0 ; i<s.length();i++){
            arr[s.charAt(i)-'a']=arr[s.charAt(i)-'a']+1;
            if(max<arr[s.charAt(i)-'a']) max=arr[s.charAt(i)-'a'];
        }
        System.out.println("maximum number of occurence "+ max);
        for(int i=0;i<arr.length;i++) {
            char ch= (char)(i+'a');
            if(arr[i]==max) System.out.println(ch + " " +arr[i] );
        }
    }
}
