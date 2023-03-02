import java.util.Scanner;

public class A1101255_0224_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個整數：");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " 您輸入的數值是偶數。");
        } else {
            System.out.println(num + " 您輸入的數值是奇數。");
        }
    }
}
