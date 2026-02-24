package practice_no9;

//program to print the String without an palindrom in it

public class RemovePlanidrome {
    public static void main(String[] args) {

        String s = "In India malayalam is best in dad and mom";
        s = s.toLowerCase();
        String arr[] = s.split(" ");
        String rev = "";
        String s5 = "";
        for (int i = 0; i < arr.length; i++) {
            String val = arr[i];
            if(pal(val)) s5=s5 +" "+val;
            rev = "";
        }

        System.out.println(s5);
    }

    public static boolean pal(String val) {
        String rev = "";
        for (int j = val.length() - 1; j >= 0; j--) {
            rev = rev + val.charAt(j);
            }
             if (val.equals(rev))  return false;
            else
            return true;
        }

}
