import java.util.Scanner;

public class JavaScanner_Que_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2 ;
        int sub = num1 - num2 ;
        int multy = num1 * num2 ;
        int div = num1 / num2 ;

        System.out.println("Sum : "+sum);
        System.out.println("Substraction : "+sub);
        System.out.println("Multiplication : "+multy);
        System.out.println("Division : "+div);

        sc.close();
    }
}
