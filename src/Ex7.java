import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        quadraticEquation();
    }

    public static void quadraticEquation() {
        Scanner scanner = new Scanner(System.in);
        int[] a1 = new int[2];
        int[] b1 = new int[2];
        int[] c1 = new int[2];
        double a = 1;
        double b = 0;
        double c = 0;
        double x1 = 0;
        double x2 = 0;
        int num1=0;
        int sum1=0;
        int sum3=0;
        int sum2=0;
        int num2;
        int num3;
        int[] digit = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String quadEq = scanner.nextLine();
        quadEq = quadEq.toLowerCase(Locale.ROOT);
        if (quadEq.length() > 8) {
            int i = 0;
            int j = 0;
            int k = 0;
            a1 = new int[a1.length + i];
            b1 = new int[b1.length + j];
            c1 = new int[c1.length + k];
            if (quadEq.charAt(0) == 'x') {
                a1[0] = 1;

            } else {
                while (quadEq.charAt(i) != 'x' && quadEq.charAt(1 + i) != '^' && quadEq.charAt(2) != '2') {
                    a1[0] =(int) quadEq.charAt(0);
                    for (int n = 1; n < a1.length; n++) {
                        a1[n] = quadEq.charAt(6 + i);
                        i++;
                    }
                }
                if (quadEq.charAt(5 + i) == '+' && quadEq.charAt(6 + i) == 'x') {
                    b1[0] = 1;
                    k = k - 1;
                } else if (quadEq.charAt(5 + i) == '-' && quadEq.charAt(6 + i) == 'x') {
                    b1[0] = -1;
                }
                else if (quadEq.charAt(i + 6) == '=') {
                    b1[0]=0;
                    k=k-2;
                }
                else {
                    while (quadEq.charAt(6 + i + k) != 'x') {
                        b1[0] = quadEq.charAt(5 + i);
                        for (int l = 1; l < b1.length; l++) {
                            b1[l] = (int) quadEq.charAt(6 + i + k);
                            k++;
                        }
                    }
                }
                if (quadEq.charAt(i + k + 8) == '=') {
                    c1[0]=0;
                }
                else
                    while (quadEq.charAt(i + j + k + 9) != '=' && quadEq.charAt(i + j + k + 10) != '0') {
                    c1[0] = (int) quadEq.charAt(8 + i + j);
                    for (int m = 1; m < b1.length; m++) {
                        c1[m] = quadEq.charAt(6 + i + k + j);
                        j++;
                    }
                    for (int value : digit) {
                        if (a1[0] == value) {
                            a = a1[0];
                        } else if (a1[0] == '-') {
                            a = -1;
                            if (a1[1] == value) {
                                for (int d=1; d< a1.length; d++){
                                    num1= (int) (a1[d-1]*Math.pow(10, a1.length-d-1));
                                    sum1=sum1+num1;
                                }
                                a = -1*num1;
                            }
                        }
                        if (b1[0] == '+') {
                            b = 1;
                            if (b1[1] == value) {
                                b = b1[1];
                            }
                        } else if (b1[0] == '-') {
                            b = -1;
                            if (b1[1] == value) {
                                for (int e=1; e< b1.length; e++){
                                    num2= (int) (a1[e-1]*Math.pow(10, b1.length-e-1));
                                    sum2=sum2+num2;
                                }
                                b = -1 * sum2;
                            }
                        }
                        if (c1[0] == '+' && c1[1] == value) {
                            c = c1[1];
                        } else if (a1[0] == -1 && a1[1] == value) {
                            for (int f=1; f< a1.length; f++){
                                num3= (int) (a1[f-1]*Math.pow(10, c1.length-f-1));
                                sum3=sum3+num3;
                            }
                            c = -1 * sum3;

                        }
                    }
                    double a2 = Math.pow(b, 2) - 4 * a * c;
                    x1 = (-1 * b + Math.sqrt(a2)) / (2 * a);
                    x2 = (-1 * b - Math.sqrt(a2)) / (2 * a);
                }
                System.out.println(x1 + "," + x2);
            }
        }
    }
}
