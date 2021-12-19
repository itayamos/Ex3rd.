import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] a = new int[scanner.nextInt()];
        System.out.println(ChangeNum(num));
        System.out.println(arrayCheckChangeNum(a));
    }

    public static boolean ChangeNum(int num) {
        boolean checker = false;
        while (num != 0) {
            checker = false;
            if (num % 2 == 0 && (num / 10) % 2 != 0) {
                checker = true;
            } else if (num % 2 != 0 && (num / 10) % 2 == 0) {
                checker = true;
            }
            num = num / 100;
        }
        return checker;
    }

    public static int arrayCheckChangeNum(int[] a) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int sum2 = 0;
        int min;
        int sum = 0;
        int index1 = -1;
        int count = 1;
        int[] b = new int[count];
        for (int i = 0; i < a.length; i++) {
            a[i]=scanner.nextInt();
            if (ChangeNum(a[i])) {
                b[count - 1] = a[i];
                count++;
            }
            for (int k=1; k<count; k++) {
                num1 = b[k-1];
                num2 = b[0];
                while (num2 != 0) {
                    sum2 = num2 % 10 + sum2;
                    num2 = num2 / 10;
                }
                min=sum2;
                while (num1 != 0) {
                    sum = num1 % 10 + sum;
                    num1 = num1 / 10;
                }
                if (sum < min) {
                    index1 = i;
                }
            }
        }
        return index1;
    }
}