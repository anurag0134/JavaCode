public class ConvertDoubleToString
{
    public static void main(String[] args) {

        // create double variable
        double num1 = 36.33;
        double num2 = 99.99;

        // convert double to string
        // using valueOf()
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        // print string variables
        System.out.println(str1);    // 36.33
        System.out.println(str2);    // 99.99
    }
}
