import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][]A=new int[n][n]; //設一個題目講解的A,此A做待會取值動作
        int[][]B=new int[n][n]; //設一個題目講解的B,此B做取A的側翼取值
        int summ=0; //設一個summ,此summ待會給A做取值動作時,會給A在目前位置值上給值
        for (int i=0;i<n;i++){ //先給A取值, 陣列開頭必為0,不管是高還是值第1個都為0 for i為高
            for(int j=0;j<n;j++){ //for j為值
                if(i==0){ //一開始高是0就進去
                    summ+=1; //先在高0部份每循環1個j值就+1,然後放值給A目前的高i值j位置上
                    A[i][j]=summ;
                }else if(i%2!=0){ //如果高是奇數高就進去
                    if(j==0){ //奇數高裡的第1個值必為0,第一個值都先+我所輸入的n,然後再給值到A目前高i值j位置上
                        summ+=n;
                        A[i][j]=summ;
                    }else { //其他奇數高只要值的部份不是第1個值,都進來這邊
                        summ-=1; //然後每循環1個j值就-1,然後再放值給A目前的高i值j位置上
                        A[i][j]=summ;
                    }
                }else if(i%2==0){ //如果高是偶數高就進去
                    if(j==0){ //偶數高裡的第1個值必為0,第一個值都先+我所輸入的n,然後再給值到A目前高i值j位置上
                        summ+=n;
                        A[i][j]=summ;
                    }else { //其他偶數高只要值的部份不是第1個值,都進來這邊
                        summ+=1; //然後每循環1個j值就+1,然後再放值給A目前的高i值j位置上
                        A[i][j]=summ;
                    }
                }
            }
        }
        for(int i1=0;i1<n;i1++){ //來到for i1這邊代表取完A的值,所以就把取完的A給他列印出來
            for(int j1=0;j1<n;j1++){
                System.out.printf("%d\t",A[i1][j1]); //每循環1次就取A目前的高i1值j1的位置值出來列印,列印完再"\t"
            }
            System.out.println(); //每列完1行OK之後就換行,換取下一行列印
        }
        System.out.println(); //這個System.out.println()意思是列印完A的值之後,先空格一行,做為A跟B列印區別
        for(int x=0;x<n;x++){ //for x這邊開始取A的側翼取值到B身上
            for(int y=0;y<n;y++){
                B[x][y]=A[y][x];
            }
        }
        for(int x1=0;x1<n;x1++){ //來到for x1這邊代表B取完A的側翼取值,所以就把完成的B給他列印出來
            for(int y1=0;y1<n;y1++){
                System.out.printf("%d\t",B[x1][y1]); //每循環1次就取B目前的高x1值y1的位置值出來列印,列印完再"\t"
            }
            System.out.println(); //每列印完B的1行OK之後就換行,換取下一行列印
        }
    }
}
/*
題目:陣列A[n][n] B[n][n]

題目講解 例如n=5 就是要取5*5矩陣如下:
A=  1    2    3    4    5        B=    1   10   11   20   21
    10   9    8    7    6              2    9   12   19   22
    11  12   13   14   15              3    8   13   18   23
    20  19   18   17   16              4    7   14   17   24
    21  22   23   24   25              5    6   15   16   25

#輸出說明:
#輸出兩個二維陣列A[n][n] B[n][n],每個數字間請以tab(\t)間格,最後必須換行字元

輸入n->5                    輸入n->4
1   2   3   4   5          1   2   3   4
10  9   8   7   6          8   7   6   5
11  12  13  14  15         9   10  11  12
20  19  18  17  16         16  15  14  13
21  22  23  24  25
                           1   8   9   16
1   10  11  20  21         2   7   10  15
2   9   12  19  22         3   6   11  14
3   8   13  18  23         4   5   12  13
4   7   14  17  24
5   6   15  16  25

 */
