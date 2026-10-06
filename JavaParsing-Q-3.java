import java.util.Scanner;

public class JavaParsing_Que_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        String st = sc.nextLine();
        int num = Integer.parseInt(st);
        System.out.println("Integer Number : "+num);

        sc.close();
    }
}
