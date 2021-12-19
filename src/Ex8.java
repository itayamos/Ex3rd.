import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        wordSpeller();
        partPrinter();
    }
    public static void wordSpeller(){
        Scanner scanner= new Scanner(System.in);
        String str1 = scanner.nextLine();
        char[] speller= new char[str1.length()];
        if(str1.length()>0 && str1.length()<4){
            for (int j = 0; j< str1.length(); j++){
                speller[j]= str1.charAt(j);
            }
        }
        System.out.println(Arrays.toString(speller));
    }
    public static void partPrinter(){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int n= word.length();
        int Sn=n*(n+1)/2;
        int count=0;
        String[] substring1=new String[Sn];
        for (int i = 1; i< word.length(); i++){
            for (int k = 0; k< word.length(); k++){
                if (count*n+i+k+1< substring1.length){
                    break;
                }
                else if (i+k> word.length()){
                    break;
                }
                else
                    substring1[i+k-1]= word.substring(k,k+i);

            }
            count++;

        }
        System.out.println(Arrays.toString(substring1));
    }

}
