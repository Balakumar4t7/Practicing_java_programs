package practice_no9;

public class CountLowerFolByHIgher {
    public static void main(String[] args){
        String s= "Hello Gopal";
        int c =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A'&& s.charAt(i)<='Z'){
                for(int j=i+1;j<s.length();j++){
                    if((s.charAt(j)>='a' && s.charAt(j)<='z')){
                        c=c+1;

                    }
                    else i=j;
                }
            }
        }
        System.out.println(c);
    }
}
