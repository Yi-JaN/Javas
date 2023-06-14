import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String str="";
        if(n==0){                       //如果一開始ｎ為0就丟到if然後把0 int轉字串丟給str,之
            str=Integer.toString(n)+str; //後下面while迴圈就不用放了,直接把丟到str的值丟給[]ch去做!讓他單分解字串列出來!
        }
        while (n>=1){                  //如果一開始n不為0就略過if直接來到while迴圈做正整數轉給str,之後轉完往下丟丟給下面[]ch
            str=Integer.toString(n%10)+str;   //讓他單分解字串一個一個值列出來
            n/=10;
        }
        char []ch=str.toCharArray();      //[]ch拿str的字串做for迴圈,一個一個值print列出來
        for(int i=0;i<ch.length;i++){     //ch[i]意思是把目前該i值丟過來,ch就是目前該i值位於的字串!
            System.out.print(ch[i]+" ");
        }
        System.out.println();
    }
}
/*
題目:數字拆解(主要方法之一!)
A:
(1.) 060        (2.) 1395         (3.)128917178           (4.)866      (5.)02201      (6.)88710
   A:6 0          A:1 3 9 5         A:1 2 8 9 1 7 1 7 8     A:8 6 6      A:2 2 0 1      A:8 8 7 1 0
 */
