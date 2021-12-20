import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String mathExp=scanner.nextLine();
        System.out.println(mathExpression(mathExp));
        System.out.println(Equation(mathExp));
    }

    public static boolean mathExpression(String mathExp) {
        boolean flag=true;
        int[] num={0,1,2,3,4,5,6,7,8,9};
        char[] sign={'+','-','*','/','^','(',')'};
        for (int i=0; i<mathExp.length() && mathExp.length()>2 ; i++){
            if (mathExp.charAt(0)==sign[2] || mathExp.charAt(0)==sign[3] || mathExp.charAt(0)==sign[4]){
                flag=false;
                break;
            }
            if (mathExp.charAt(i)=='2' && mathExp.charAt(i+1)==sign[i]){
                flag=false;
                break;
            }
            for (int k=0; k<mathExp.length() && mathExp.length()>3; k++){
                if (mathExp.charAt(i)==sign[5]){
                    if (mathExp.charAt(k)==sign[6]){
                        if (i<k){
                            flag=true;
                        }
                        else{
                            flag=false;
                            break;
                        }
                    }
                    else {
                        flag = false;
                        break;
                    }
                }
                else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;

    }
    public static double Equation(String mathExp){
        double outcome = 0;
        int[] num={0,1,2,3,4,5,6,7,8,9};
        char[] sign={'+','-','*','/','^','(',')'};
        for (int i=0; i<mathExp.length(); i++){
            for (int j=0; j<num.length; j++){
                for (int k=0; k< sign.length; k++){
                    for (int p=0; p< num.length; p++)
                    if (mathExp.charAt(i)==num[j] && mathExp.charAt(i+1)==sign[k] && mathExp.charAt(i+2)==num[p]){
                        if (mathExp.charAt(i+1)==sign[0]){
                            outcome=num[j]+ num[p];
                        }
                        else if (mathExp.charAt(i+1)==sign[1]){
                            outcome=num[j]-num[p];
                        }
                        else if (mathExp.charAt(i+1)==sign[2]){
                            outcome=num[j]*num[p];
                        }
                        else if (mathExp.charAt(i+1)==sign[3]){
                            outcome=(double) num[j]/num[p];
                        }
                        else if (mathExp.charAt(i+1)==sign[4]){
                            outcome=Math.pow(num[j],num[p]);
                        }

                    }
                }
            }
        }
        return outcome;
    }
}
