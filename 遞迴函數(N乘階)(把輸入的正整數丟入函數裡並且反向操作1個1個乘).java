import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int sum=1;
       ofdigits(n,sum);
       System.out.println("該數乘階總和為: "+ofdigits(n,sum));
    }
    public static long ofdigits(int nn,int summ){
        if(nn>=1){
            summ=summ*nn;
            nn=nn-1;
            return ofdigits(nn,summ);
        }else {
            return summ;
        }
    }
}
/*
題目:遞迴函數(N乘階)(主要方法1 把正整數反向開始1個1個乘)
A:
1.  1    2.  2    3.  3   4.  4     5.   5   6.   6    7.   7     8.   8      9.   9
  A: 1    A: 2      A:6     A:24      A:120    A:720     A:5040     A:40320     A:362880

說明詳請 模三資料夾裡的  遞迴函數(數值位數)(用str字串轉成int n找計數).java檔 參考看說明!
 */
