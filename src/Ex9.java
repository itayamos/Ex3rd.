import java.util.Random;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        code(num);
    }

    public static void code(int num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose diff level from 0 to 3");
        int diff = scanner.nextInt();
        System.out.println("choose code");
        int userCode;
        int i = 0;
        int a = 20;
        int b = 15;
        int c = 10;
        Random random = new Random();
        int d = random.nextInt(100);
        int count = 0;
        int[] diffLvl = {a, b, c, d};
        int[] uCode;
        int[] myCode = {num % 10, (num / 100) % 10, (num / 10) % 10, num / 1000};
        while (i != diffLvl[diff]) {
            userCode = scanner.nextInt();
            uCode = new int[]{userCode % 10, (userCode / 100) % 10, (userCode / 10) % 10, userCode / 1000};
            for (int k = 0; k < uCode.length; k++) {
                for (int j = 0; j < myCode.length; j++) {
                    if (myCode[j] == myCode[k] && j!=k) {
                        System.out.println("my code is invalid sorry");
                        break;
                    } else if (uCode[j] == uCode[k] && j!=k) {
                        i = i + 2;
                    }
                    if (uCode[k] == myCode[j] && k != j) {
                        System.out.println("partly guessed");
                    }
                }
                if (uCode[k] > 6 || myCode[k] > 6) {
                    System.out.println("invalid code");
                    break;
                }
                if (uCode[k] == myCode[k]) {
                    count++;
                    if (count == 4) {
                        System.out.println(diffLvl[diff] - i + "guesses left, good job");
                        break;
                    } else if (count < 4) {
                        System.out.println("partly guessed");
                    }
                }
            }
            count = 0;
            i++;
        }
        System.out.println(num);
        //a= num * code(num - 1);

    }
}