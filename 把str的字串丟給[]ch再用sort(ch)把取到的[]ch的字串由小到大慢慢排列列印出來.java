import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();        //輸入一個字串
       char []ch=str.toCharArray();       //把我輸入的字串丟給[]ch,[]ch拿到str一模一樣的字串值
       Arrays.sort(ch);                   //把拿到的ch丟遞增排序
       for(int i=0;i<ch.length;i++){      //丟完往下用正向排序的for迴圈一個一個取值,並且過程中,每取一個值就由小到大排列,列印好
           System.out.print(ch[i]+" ");   //排列也好,就底標返回for迴圈取下一個值,以此類推
       }
       System.out.println();
    }                                   //補充:他由小到大排列是利用ASCII碼判斷排列!
}
/*
題目: 用str的字串丟給[]ch然後sort(ch)並且把ch拿到的字串由小到大排列出來
A:
(1.) AbCCbA             (2.) PC!a*        (3.)dbca
   A:A A C C b b           A:! * C P a      A:a b c d
 */
