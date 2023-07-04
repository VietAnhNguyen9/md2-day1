package day1;
import java.util.Scanner;
public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập só tiền đô: ");
        int USD = scanner.nextInt();
        int VND = USD * 23000;
        System.out.println("Số tiền tương ứng là: "+ VND);
    }
}
