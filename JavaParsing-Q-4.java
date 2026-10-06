public class JavaParsing_Que_4 {
    public static void main(String[] args) {
        String int_num = "100";
        String double_num = "10.5";
        String float_num = "20.5";
        String long_num = "50000";

        int num1 = Integer.parseInt(int_num);
        double num2 = Double.parseDouble(double_num);
        float num3 = Float.parseFloat(float_num);
        long num4 = Long.parseLong(long_num);

        System.out.println("Number 1 = "+num1);
        System.out.println("Number 2 = "+num2);
        System.out.println("Number 3 = "+num3);
        System.out.println("Number 4 = "+num4);
    }
}
