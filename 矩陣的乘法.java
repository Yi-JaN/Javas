import java.util.Scanner;

public class Main {

    public static void main(String[] args) {  //以下方題目範例做說明,題目詳請請去模三題目"矩陣的乘法"去了解
        Scanner scn=new Scanner(System.in);  //問題描述是要 A=n1*m1的矩陣 B=n2*m2的矩陣 C=AB為n1*m2的矩陣
        int n1=scn.nextInt();
        int m1=scn.nextInt();
        int n2=scn.nextInt();
        int m2=scn.nextInt();
        int [][]arr=new int[n1][m1]; //<-這arr[][]取高3值2  也就是 A=n1*m1
        int [][]data=new int[n2][m2]; //<-這data[][]取高2值3 也就是 B=n2*m2
        int [][]cc=new int[n1][m2];  // <-這cc[][]就是為 C=AB n1*m2的矩陣
        for(int i=0;i<n1;i++){    //先把arr[][]取高3值2的值 <-A=n1*m1
            for(int j=0;j<m1;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int k=0;k<n2;k++){   //先把data[][]取高2值3的值 <-A=n1*m1
            for(int k1=0;k1<m2;k1++){
                data[k][k1]=scn.nextInt();
            }
        }
        for(int i1=0;i1<n1;i1++){   //讓cc[][]控制n1*m2的n1 ->也就是高
            for(int i2=0;i2<m1;i2++){  //for i2這邊是控制arr高3值2的"值" ,以及控制data高2值3的"高"
                for(int j1=0;j1<m2;j1++){//讓cc[][]控制n1*m2的m2 ->也就是值
                    cc[i1][j1]+=arr[i1][i2]*data[i2][j1]; //我的cc[i1][j1]的值要依照for迴圈循環判斷用"+"的,然後依照for迴圈的
                }                                         //循環判段去+我目前的arr[i1][i2]*data[i2][j1],各自對位出來的相乘值
            }                                             //並且利用for循環累"+"值到我目前的cc[i1][j1]身上,持續到我外圈for i1
        }                                                 //跑完為止
        for(int a=0;a<n1;a++){   //把cc拿到的高3值3,經過外圈的高for a 以及
            for(int b=0;b<m2;b++){  //內圈的值for b,慢慢把cc二維陣列裡的值列印出來
                System.out.print(cc[a][b]+" ");
            }
            System.out.println();  //每列印一行出來就換行字元換到下一行
        }
    }
}
/*
題目範例如下:
3 2 2 3                                      cc[][]的計算循環:
1 4                                           arr的高3值2   data的高2值3           出來的值 C=AB n1*m2 高3值3
2 3  <-這邊是高3值2                              1  4          1  2  3               0       1         2
3 2                                            2  3          2  0  -1       0   1*1+4*2  1*2+4*0   1*3+4*-1
1 2 3   <-這邊開始是高2值3                        3  2                         1  2*1+3*2  2*2+3*0   2*3+3*-1
2 0 -1                                                                      2  3*1+2*2  3*2+2*0   3*3+2*-1
                                                                                答案等於如下:
A:9 2 -1                                                                          0       1        2
  8 4 3   <-這就是C=AB n1*m2的矩陣答案                                         0    9        2        -1
  7 6 7     成果                                                             1    8        4        3
                                                                            2    7        6        7
 */

