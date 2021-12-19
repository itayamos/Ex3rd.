//import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        //Scanner scanner= new Scanner(System.in);
        //int[] a= new int[scanner.nextInt()];
        int[] a1= {4,3,2,1,0};
        System.out.println(isFullArray(a1));
    }

    public static boolean fullArray(int[] a) {
        boolean checker = false;
        for (int i = 1; i < a.length; i++) {
            for (int k=0; k< a.length; k++) {
                if (a[i] != a[k]) {
                    checker = true;
                }
                else
                    break;
            }
            if (a[i] < a[i+1] && i< a.length-1) {
                checker = true;
            }
            else
                break;
        }
        return checker;
    }
    public static  boolean isFullArray(int[] a1){
        boolean flag=false;
        int[] a2= new int[a1.length];
        for (int p=0; p< a1.length; p++){
            a2= new int[a1.length];
            a2[p]=a1[a1.length-1-p];
        }
        if (fullArray(a2)){
            flag=true;
        }
        return flag;
    }
}
