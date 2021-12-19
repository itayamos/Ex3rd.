//import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        //Scanner scanner= new Scanner(System.in);
        int[] arr1= {1,2,6};
        int[] arr2= {24,42,5};
        System.out.println(sumDigits(arr1,arr2));
    }
    public static int sumDigits(int[] arr1, int[] arr2){
        int num1;
        int num2;
        int sum1=0;
        int sum2=0;
        int max=0;
        int index1=0;
        int[] counter= new int[arr1.length];
        for (int i=0; i<arr1.length; i++){
            num1=arr1[i];
            while (num1 != 0) {
                sum1 = num1 % 10 + sum1;
                num1 = num1 / 10;
            }
            for (int j : arr2) {
                num2 = j;
                while (num2 != 0) {
                    sum2 = num2 % 10 + sum2;
                    num2 = num2 / 10;
                }
                if (sum1==sum2) {
                    counter[i]++;
                }
            }
        }
        for (int p=0; p< arr1.length; p++){
            if (max<counter[p]){
                max=counter[p];
                index1=p;
            }
        }
        return index1;
    }
}
