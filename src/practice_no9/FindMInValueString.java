package practice_no9;

//program to return the string which hase the smalles value

public class FindMInValueString {
    public static void main(String [] args){
        String s ="laptop 100;mobile 21;tv 123";

        String arr[] =new String[s.length()];
        arr=s.split(";");
        String arr1[] =new String[arr.length*2];
        int min = Integer.MAX_VALUE;
        String minstring="";
        for(int i=0;i<arr.length;i++) {
            String str = arr[i];
            arr1 = str.split(" ");
            int value = Integer.parseInt(arr1[1]);
            if (min > value) {
                min = value;
                minstring = arr1[0];
            }

        }
        System.out.println(minstring);
    }
}
