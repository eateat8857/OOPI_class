import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A1101255_0505_1 {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 49;
    private static final int NUM_NUMBERS = 6;

    public static void main(String[] args) {
        int[] winningNumbers = { 5, 10, 15, 20, 25, 30 }; 

        int[] userNumbers = getUserNumbers();

        System.out.println("您選擇的號碼: " + Arrays.toString(userNumbers));
        System.out.println("中獎號碼: " + Arrays.toString(winningNumbers));

        int matchedNumbers = countMatchingNumbers(userNumbers, winningNumbers);
        System.out.println("中獎號碼數量: " + matchedNumbers);

        if (matchedNumbers == NUM_NUMBERS) {
            System.out.println("恭喜您中獎了！");
        } else {
            System.out.println("很遺憾，您沒有中獎。");
        }
    }

    private static int[] getUserNumbers() {
        int[] numbers = new int[NUM_NUMBERS];
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入六個號碼 (1~49):");

        for (int i = 0; i < NUM_NUMBERS; i++) {
            try {
                int number = scanner.nextInt();
                validateNumber(number);
                numbers[i] = number;
            } catch (InputMismatchException e) {
                System.out.println("輸入的不是整數，程式即將結束。");
                System.exit(0);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }

        return numbers;
    }

    private static void validateNumber(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException("號碼必須介於 " + MIN_NUMBER + " 和 " + MAX_NUMBER + " 之間。");
        }
    }

    private static int countMatchingNumbers(int[] userNumbers, int[] winningNumbers) {
        int count = 0;

        for (int userNumber : userNumbers) {
            for (int winningNumber : winningNumbers) {
                if (userNumber == winningNumber) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
