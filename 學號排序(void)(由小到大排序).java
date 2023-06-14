import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();         //輸入我要丟的n個值
        int []arr=new int[n];       //讓arr取n個值 ->new int[n]
        for(int i=0;i<n;i++){       //接下來這邊我是在這邊先用for迴圈取n個正整數,for迴圈循環幾次arr[i]=scn.nextInt();就跟著取幾個值
            arr[i]=scn.nextInt();
        }
        number(arr);             //這時候把我取的arr值丟到 名為number名稱裡
    }
    public static void number(int []arrs){   //之後再把number丟到這邊下void函數,這時候這邊的arrs 有n個正整數的值在這邊
        Arrays.sort(arrs);                     //把arrs丟sort遞增排序
        for(int j=0;j<arrs.length;j++){          //這時候做到這邊我的arrs已經被遞增排序,所以這時候這邊下for迴圈正向排序,那正向排序
            System.out.println(arrs[j]);        //是"由小到大"排序,所以我每取一個arrs[j]值列印時,列印完成順便做由小到大排序,做到for
        }                                       //跑完!
    }
}
/*
題目: 學號排序(void)(由小到大排序)
3
103021020
105074011
102033058

A: 102033058
   103021020
   105074011
 */
