import java.util.Scanner;

public class A1101255_0224_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入攝氏溫度：");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println(celsius + "攝氏溫度等於" + fahrenheit + "華氏溫度。");
    }
}
