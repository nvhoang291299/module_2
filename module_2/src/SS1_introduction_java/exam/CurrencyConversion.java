package SS1_introduction_java.exam;

import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        System.out.println("Số tiền mà bạn muốn chuyển: ");
        double usd = new Scanner(System.in).nextDouble();
        while (usd > 0 || usd <= 0) {
            if (usd <= 0){
                System.out.println("giá trị bạn vừa nhập chưa khả dụng");
                System.out.println("bạn hãy nhập lại giá trị");
                usd = new Scanner(System.in).nextDouble();
            }
            else if (usd > 0) {
                double convers = usd * 23000;
                System.out.println("Giá trị VND: " + convers + " đồng");
                break;
            }
        }
        // while(temp > 100) {
        // alert("yêu cầu gaimr nhiệt độ!")
        // temp = +prompt("nhập nhiệt độ:");
        // }
        // while(temp < 20) {
        // alert("yêu cầu tăng nhiệt độ!")
        // temp = +prompt("nhập nhiệt độ:");
        // }
    }
}
