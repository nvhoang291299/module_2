package SS1_introduction_java.exam;

import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        System.out.println("Số tiền mà bạn muốn chuyển: ");
        double usd = new Scanner(System.in).nextDouble();
        double convers = usd*23000;
        System.out.println("Giá trị VND: " + convers + " đồng");
    }
}
