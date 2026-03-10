package practice_no11;

public class ArraySumAndAvg {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        float avg=0f;
        for(int x : arr){
            sum+=x;
        }
        avg=sum/(arr.length);
        System.out.println("Sum of the Elements is : "+ sum );
        System.out.println("Average is : "+ avg);

    }
}
