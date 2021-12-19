public class Ex6 {
    public static void main(String[] args) {

    }

    public static boolean mathExpression(String mathExp) {
        boolean flag=true;
        int[] num={0,1,2,3,4,5,6,7,8,9};
        char[] sign={'+','-','*','/','^','(',')'};
        for (int i=0; i<mathExp.length(); i++){
            if (mathExp.charAt(0)==sign[2] || mathExp.charAt(0)==sign[3] || mathExp.charAt(0)==sign[4]){
                flag=false;
                break;
            }
            if (mathExp.charAt(i)=='2' && mathExp.charAt(i+1)==sign[i]){
                flag=false;
                break;
            }
            for (int k=0; k<mathExp.length(); k++){
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
}
