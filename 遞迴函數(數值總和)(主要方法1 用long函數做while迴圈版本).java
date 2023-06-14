import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int sum=0;
        ofdigits(x,sum);
        System.out.println("總和: "+ofdigits(x,sum));
    }
    public static long ofdigits(int xx,int summ){
       while (xx>=1){
           summ=summ+xx%10;
           return ofdigits(xx/10,summ);
       }
       return summ;
    }
}
/*
題目:遞迴函數:數值總和(主要方法1(用long迴圈做while迴圈循環))
A:  (1.) 023         (2.) 220      (3.) 10070      (4.) 4395           (5.)087010
        總和: 5          總和: 4         總和: 8          總和: 21           總和: 16

說明詳請至模三資料夾裡的 遞迴函數 數值位數(用str字串轉換成int n找計數).java檔 參考!
 */
