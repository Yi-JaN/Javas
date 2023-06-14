import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);  //此Scanner 是用於取字串型態的輸入值
        Scanner scn1=new Scanner(System.in);  //此Scanner 是用於取正整數數字型態的輸入值
        int n=scn1.nextInt();
        int countYES=0 ,countNO=0;
        for(int i=0;i<n;i++){
            String str=scn.nextLine();
            char[]ch={'A','B','C','D','E','F','G','H','J','K','L'
            ,'M','N','P','Q','R','S','T','U','V','X','Y','W','Z','I','O'};
            byte[]number={10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27
            ,28,29,30,31,32,33,34,35};
            int chstr=new String(ch).indexOf(str.substring(0,1));
            int x0=number[chstr];
            int x1=x0/10;
            int x2=x0%10;
            int sum=x1+(9*x2);
            int k=8;
            for(int j=1 ;j<str.length();j++){
                sum=sum+(k*(str.charAt(j)-'0'));
                if(k>1){
                    k--;
                }
            }
            if(sum%10==0){
                countYES++;
            }else if(sum%10!=0){
                countNO++;
            }
        }
        System.out.println("YES= "+countYES);
        System.out.println("NO= "+countNO);
    }
}
/*
補充:每找好一個字串的身分證是否為countYES還是countNO時,找好後丟入完成後他都會底標返回外圈for迴圈繼續往下取你所打的str字串,並且方法都是一樣
循環!(找的時候會刷新你前一個字串所留下來的東西,因為現在在算下一個str,所以前一個字串的東西會由上至下慢慢被汰舊換新刷掉,變新字串的東西,畢竟是要找
新字串是否驗證YES還是NO)
題目: 身分證驗證器(用n取值並且找n有幾個是正確的幾個是失敗的)
A: 4
A123456789
C220159987
A220169709
L165372132
A: YES= 2
   NO= 2
 */