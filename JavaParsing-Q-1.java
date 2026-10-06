import java.util.Scanner;

public class JavaParsing_Que_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = "500";
        int num = Integer.parseInt(st) + 100 ;

        System.out.println("Integer number is "+num);
        sc.close();
    }
}
