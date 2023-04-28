import java.util.Scanner;

public class A1101255_0421_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入日期 (YYYY/MM/DD 或 MM/DD/YYYY): ");
        String input = scanner.nextLine();

        int year, month, day;
        if (input.matches("\\d{4}/\\d{1,2}/\\d{1,2}")) {
            String[] parts = input.split("/");
            year = Integer.parseInt(parts[0]);
            month = Integer.parseInt(parts[1]);
            day = Integer.parseInt(parts[2]);
        } else if (input.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
            String[] parts = input.split("/");
            year = Integer.parseInt(parts[2]);
            month = Integer.parseInt(parts[0]);
            day = Integer.parseInt(parts[1]);
        } else {
            System.out.println("輸入的日期格式有誤。");
            return;
        }

        if (!isValidDate(year, month, day)) {
            System.out.println("輸入的日期不符合常理。");
            return;
        }

        System.out.println("輸入的日期為 " + year + " 年 " + month + " 月 " + day + " 日。");
    }

    private static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        switch (month) {
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    return day <= 29;
                } else {
                    return day <= 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return day <= 30;
            default:
                return day <= 31;
        }
    }
}
