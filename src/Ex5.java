import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str1=scanner.nextLine();
        mostCommon(str1);
    }
    public static void mostCommon(String str1){
        char[] newStr=new char[str1.length()];
        int count=0;
        int max=0;
        char maxCh = 0;
        int min=str1.length();
        char minCh = 0;
       for (int i=0; i<str1.length(); i++){
           for (int j=0; j<str1.length(); j++){
               if(str1.charAt(i)==str1.charAt(j)){
                   count++;
               }
               if (max<count){
                   max=count;
                   maxCh=str1.charAt(i);
               }
               if (count<min){
                   min=count;
                   minCh=str1.charAt(i);
               }
               count=0;
           }
       }
       for (int k=0; k<str1.length(); k++){
           newStr[k]=str1.charAt(k);
           if (str1.charAt(k)==minCh){
               newStr[k]=maxCh;
           }
           else if (str1.charAt(k)==maxCh){
               newStr[k]=minCh;
           }
       }
        for (int m=0; m<newStr.length; m++){
            System.out.println(newStr[m]);
        }
    }
}