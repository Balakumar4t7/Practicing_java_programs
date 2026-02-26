package practice_no9;

public class WordReverse {
    public static void main(String [] args){

        String s = "indian institute of technology";
        String rev ="";
        String arr[] =s.split(" ");

        for(int i=0;i<arr.length;i++){
            String ch=arr[i],rev1="";
            for(int j=ch.length()-1;j>=0;j--){
                rev1=rev1+ch.charAt(j);
            }
            rev=rev+" "+rev1;
            rev1="";
        }
        System.out.println(rev);

    }
}
