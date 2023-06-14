import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();         //取n組數值
        int []arr=new int[n];        //arr可以取n組數字
        int sum=0;
        for(int i=0;i<n;i++){          //用for迴圈取n組數字
            arr[i]=scn.nextInt();     //跟著for迴圈循環1個1個取你所輸入數字,取n組為止
        }
        for(int j=0;j<arr.length;j++){  //把取到的n組數字做arr.length,每一個數值1個1個分開
            for(int k=2;k<=2;k++){           //小迴圈是做平方用的
                sum=(int)Math.pow(arr[j],k);   //用sum去取你目前位於得j的arr單數字值的平方
                System.out.printf("%d\t",sum);  //取完往下丟列印出來,(之後j再取下一個單數字時做
            }                                  //以此類推上述動作!)
        }
        System.out.println();
    }
}
/*
題目:陣列平方 (主要方法之二(此題沒用函數版本))
A:(1.)                   (2.)
    4                        6
    2 4 5 3                  7 4 11 5 9 13
  A:4   16  25  9         A:49  16  121 25  81  169
 */
