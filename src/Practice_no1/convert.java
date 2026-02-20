import java.util.Scanner;

class convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Decimal : " + n);
        System.out.println("Octal : " + Integer.toOctalString(n));
        System.out.println("Hexadecimal : " + Integer.toHexString(n));
    }
}
