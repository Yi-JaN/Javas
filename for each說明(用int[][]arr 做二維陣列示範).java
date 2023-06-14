import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[][]arr={{9,4,5,7,1},      //先列一個二維陣列int[][]arr,因為{}裡有2個{},所以又是二維陣列,所以說int [][]arr這邊要
                    {5,7,4,2,},};    //設兩個[][]才行! 第一個陣列是{9,4,5,7,1} 第二個陣列是{5,7,4,2}
        for(int v1[]:arr){             //這邊用for each 來算 因為arr是二維陣列,所以for each這邊設一個int v1[],int是因為arr是int
           for(int v2:v1){             //所以v1也要設int 然後v1[]意思是取arr裡的陣列 從第一個陣列開始),第一個陣列丟給v1之後接下來
               System.out.print(v2+" ");   //丟給int v2 v2=v1的陣列,所以第一個陣列都給v2,讓v2也有第一個陣列,之後列印v2裡的第一個陣列
           }                               //然後往下底標返回再往下來(然後剛剛放第一個陣列完然後換行字元完)到外圈的for each
                                           // (int v1[]:arr){,接著arr還有第二個陣列,所以一樣
            System.out.println();          //的道理v1[]意思就是在繼續取arr的陣列,所以v1就有第二個陣列,接下來往下丟給v2:v1 v2=v1,接下
        }                                  //來再把剛剛v1[]裡的第二個陣列丟給v2所以v2"繼剛剛有第一個陣列之後,現在也有第二個陣列",之後
    }                                      //列印第二個陣列裡的值,之後底標返回再往下(然後換行字元完)底標返回外圈for each 這時候外圈已
                                          // 經把所有arr裡的值都丟過去了,所以v1[]這邊就不用再取了,所以這for each就ok了
}
/*

補充:因為v1給v2第二個陣列時,那給的時候本身v2的第1個陣列就會被汰舊換新,變成第2個陣列,進而v2再列印第2個陣列從頭到尾的值
題目:for each (用簡易的二維陣列做說明)
A:
  9 4 5 7 1 <-第一維陣列
  5 7 4 2   <-第二維陣列
 */
