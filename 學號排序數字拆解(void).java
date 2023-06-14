import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();           //先輸入一個n
        long []arr=new long[n];        //丟到arr取new long[n]值 讓arr能夠取n值
        for(int i=0;i<n;i++){          //先在這邊設for取arr正整數,for跑幾次,裡頭的arr就跟著跑幾次循環
            arr[i]=scn.nextLong();
        }
        answer(arr);  //把取好的arr的long值丟到名為answer(arr);
    }
    public static void answer(long[]arrs){  //把answer設void函數 並把arr變成->(long[]arrs) <-裡頭已經有我取的正整數值
       for(int j=0;j<arrs.length;j++){       //把有正整數值的arrs用for迴圈把它變arrs.length
           if (arrs[j]>=0){                        //一次丟一個arrs[j]值丟到if迴圈,讓他把arrs[j]正整數轉string給str
               String str=Long.toString(arrs[j]);
               char []ch=str.toCharArray();        //把str拿到一模一樣的值丟給[]ch,讓他拿跟str一模一樣的值
               for(int k=0;k<ch.length;k++){       //之後就變成ch.length把他一個一個值拆開
                   System.out.print(ch[k]+" ");    //然後一樣一個一個取ch[k]值慢慢數字拆開列印
               }
           }
           System.out.println();  //完成一個之後,由上往下來到這邊換行字元,再接著底標返回外圈for再繼續取下一個arrs[j]值
       }                          //取到外圈的for迴圈不能再進為止 以此類推的上述動作!
    }
}
/*
題目:學號排序的數字拆解(void)
3
105031261
102889177
107126338
A:1 0 5 0 3 1 2 6 1
  1 0 2 8 8 9 1 7 7
  1 0 7 1 2 6 3 3 8

 */
