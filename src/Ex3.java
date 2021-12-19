import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num= scanner.nextInt();
        System.out.println(Arrays.toString(fact(num)));
    }
    public static int[] fact(int num){
        int count1=0;
        int count2=0;
        int[] factor;
        int[] prime = new int[0];
        for (int i=2; i<num; i++){
            factor = new int[count1+1];
            if (num%i == 0) {
                count1++;

                factor[count1-1]=i;

            }
            for (int k=0; k< factor.length; k++)
                for (int j = 2; j < factor[k]; j++) {
                    prime = new int[count2+1];
                    if (factor[k] % j == 0) {

                        count2++;
                        prime[count2-1] =j;
                    }
                }
        }
        return prime;
    }
}
