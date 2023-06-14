import java.util.Scanner;

public class Main {

    public static void main(String[] args) {   //本題是矩陣的乘法改編 A的高3直2與B高3直2 A直行乘B直行給C
        Scanner scn=new Scanner(System.in);   //敘述: A=n1*m1  B=n2*m2   C=AB  C=m1*m2
        int n1=scn.nextInt();
        int m1=scn.nextInt();
        int n2=scn.nextInt();
        int m2=scn.nextInt();
        int[][]arr=new int[n1][m1]; //<-A為高3值2
        int[][]data=new int[n2][m2]; //<-B為高3值2
        int[][]cc=new int[m1][m2];   //C=AB m1*m2
        for(int i=0;i<n1;i++){  //A的高3值2先取值給arr二維陣列
            for(int i1=0;i1<m1;i1++){
                arr[i][i1]=scn.nextInt();
            }
        }
        for(int j=0;j<n2;j++){  //B的高3值2先取值給data二維陣列
            for(int j1=0;j1<m2;j1++){
                data[j][j1]=scn.nextInt();
            }
        }
        for(int k=0;k<m1;k++){  //這為C的m1 為C的高
            for(int k1=0;k1<n1;k1++){ //這行是要給A的高3值2取"高"值循環 以及B的高3值2取"高"值循環
                for(int k2=0;k2<m2;k2++){ //這為C的m2 為C的值
                    cc[k][k2]+=arr[k1][k]*data[k1][k2];  //依照此迴圈循環慢慢給值給cc[k][k2]"+"起來
                }                                        //依照arr目前的[k1][k]以及data目前的[k1][k2]
            }                                           //相乘得出的值在+給cc目前的[k][k2],一直依照到這大for迴圈跑完就完事!
        }
        for(int a=0;a<m1;a++){     //<-把C的規格高2值2依照這for迴圈循環1個1個列印出來
            for(int b=0;b<m2;b++){   //從C的高0值0到高0值1 以及高1值0以及高1值1 把C的高2值2通通列印出來
                System.out.print(cc[a][b]+" ");
            }
            System.out.println();
        }
    }
}
/*
3 2 3 2 <-n1 m1 n2 m2     A:高3值2       B:高3值2   公式:A直行*B直行->     C答案
1 4                        1 4            1 2                      0         1
2 3 <-A的高3值2             2 3            3 2               0  1*1+2*3+3*0  1*2+2*2+3*-1
3 2                        3 2            0 -1              1  4*1+3*3+2*0  4*2+3*2+2*-1
                                                                     | |
1 2                                                                0         1
3 2 <-B的高3值2                                               0    7         3
0 -1                                                         1    13        12

7 3   <-C=AB m1*m2的值
13 12
 */
