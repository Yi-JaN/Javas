import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int w=scn.nextInt();
        int h=scn.nextInt();
        f(w,h);
    }
    public static void f(int w,int h){
        for(int i=1;i<=h;i++){
            for(int j=w;j>=1;j--){
                System.out.printf("%d\t",(j*i)); //針對我現在的i做j值相乘動作,每循還到1個新的j值就乘現在的i
            }
            System.out.println();
        }
    }
}
/*
題目:數字矩陣正方形 每一行開頭由大至小(方法2)
補充:假設 w為5 h為3 然後第一行列印就i=1 j=w從5開始for j循環遞減 第一行 j=5 ->5*1,j=4 ->4*1,j=3 ->3*1,j=2 ->2*1,j=1 ->1*1
                 然後第二行列印就i=2 j=w從5開始for j循環遞減 第二行 j=5 ->5*2,j=4 ->4*2,j=3 ->3*2,j=2 ->2*2,j=1 ->1*2
                 然後第三行列印就i=3 j=w從5開始for j循環遞減 第三行 j=5 ->5*3,j=4 ->4*3,j=3 ->3*3,j=2 ->2*3,j=1 ->1*3

                                               圖示如下:
輸入:5 3                                 目前的行數   目前的起始值然後依序遞減  i值為     答案列印
  A:5   4   3   2   1                    第一行列印     j=w 而w==5          1      5(5*1) 4(4*1) 3(3*1) 2(2*1) 1(1*1)
    10  8   6   4   2                    第二行列印     j=w 而w==5          2      10(5*2) 8(4*2) 6(3*2) 4(2*2) 2(1*2)
    15  12  9   6   3                    第三行列印     j=w 而w==5          3      15(5*3) 12(4*3) 9(3*3) 6(2*3) 3(1*3)

 */
