import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       int[][]arr=new int[3][3];
       int sum=0;
       for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             arr[i][j]=scn.nextInt();
         }
       }
       for(int i=0;i<3;i++){  //for i 當二維陣列的高
           for (int j=0;j<arr[i].length;j++){ //for j工作是看此高的值有幾個,進而當做for j循環次數,每次for j循環就會帶動for k排出氣泡排序(盡可能)
               for(int k=0;k<arr[i].length-1;k++){ //這邊是for k,他的工作是依目前此高裡的位置值從頭到尾做氣泡排序
                   if (arr[i][k]<arr[i][k+1]){
                       int x=arr[i][k];
                       arr[i][k]=arr[i][k+1];
                       arr[i][k+1]=x;
                   }
               }
           }
       }                        //來到此底標代表目前此二維陣列的高裡面的值做好循環,排出最完美狀態的氣泡排序,之後這個底標返回,換下一個高
       for(int a=0;a<3;a++){
           for(int b=0;b<3;b++){
               System.out.print(arr[a][b]+" ");
           }
           System.out.println();
       }
    }
}
/*
補充: 那為什麼要加內圈for j的原因是因為如果不加,那他最內圈k排出來不管是由小至大還由大至小
 都只有循環排1次,而且還是排出半成品出來,所以如果要每個高裡面的值各自1個1個由小至大或由大至小,
那一定要放內圈for j看我arr[i].length目前i高裡有幾個值,內圈j就跟著循環幾次,之後內圈j帶動
最內圈k排出最完美的由小到大或由大至小,這樣一個2維陣列裡的高裡面的值就變成氣泡排序了,所以在繼續做
2維陣列下一個高裡面的值

10 5 15
2 6 8
11 10 21

A:
15 10 5
8 6 2
21 11 10

 */
