import java.util.*;
//public class solution {
//    public static void main(String [] args){
//        int [] arr ={3521,2452,1352};
//        int max=0,min=9,sum1=0,sum2=0;
//        for(int i=0;i<arr.length;i++){
//            int n=arr[i];
//            while(n>0){
//                int d=n%10;
//                if(d>max) max=d;
//                if(d<min) min=d;
//
//                n=n/10;
//            }
//            sum1=sum1+max;
//            sum2=sum2+min;
//        }
//        System.out.println(sum1-sum2);
//
//    }
//}
public class solution {
    public static void main(String[] args) {

        int[] arr = {3521, 2452, 1352};
        int sum1 = 0, sum2 = 0;

        for(int i = 0; i < arr.length; i++) {

            int n = arr[i];
            int max = 0;
            int min = 9;

            while(n > 0) {
                int d = n % 10;

                if(d > max) max = d;
                if(d < min) min = d;

                n = n / 10;
            }

            sum1 += max;
            sum2 += min;
        }

        System.out.println(sum1 - sum2);
    }
}

