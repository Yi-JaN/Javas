import java.util.Scanner;

public class Main {

    public static void main(String[] args) {  //注意:此題目只會用到0 跟 1 因為真值表只有0 跟 1
        Scanner scn=new Scanner(System.in);
        int[]arr=new int[4]; //先輸入一個1維陣列 此1維陣列拿來取下方真值表裡的Y進而去找出哪種邏輯符號的真值表
        int[][]data=new int[4][3]; //輸入2維陣列,用來輸入真值表,而每個數位邏輯符號的真值表用二維陣列去看都是高4值3
        for(int i1=0;i1<4;i1++){ //for i1為高  這裡開始先取data二維陣列的值,根據下方的真值表輸入正整數值給他
            for(int i2=0;i2<3;i2++){ //for i2為值
                data[i1][i2]=scn.nextInt(); //每循還1次就取data目前位於的[i1][i2]取1個我自己輸入的正整數給他
            }                                                   //    高   值
        }
        System.out.println("   A   B   Y"); //這邊開始把我取到的data二維陣列的值(真值表)全部取出來列印
        for (int i=0;i<4;i++){ //for i為高
            for(int j=0;j<3;j++){ //for j為值                          高 值                                           高 值
                System.out.printf("%4d",data[i][j]);//把我目前位於的data[i][j]值取出來,這裡一開始列印時會先%4d,之後再把目前data[i][j]
            }                                       //取出來列印
            System.out.println();
        }
        for(int a=0;a<4;a++){  //for a為高   這邊開始取arr一維陣列的值,也就是拿下方真值表裡的Y值進去
            for(int b=0;b<3;b++){ //for b為值 而Y值是每個高裡面的值2,所以針對值2去給arr一維陣列
                if(a==0&&b==2||a==1&&b==2||a==2&&b==2||a==3&&b==2){ //如果是高0裡的值2,高1裡的值2,高2裡的值2,高3裡的值2,4選1,中1,就可進去
                   arr[a]=data[a][b]; //一維陣列放符合外圈if的規定a,然後data目前的[a][b]的值就丟給arr位於的[a](arr[a])
                }                                                      //   高  值
            }
        }                                //這樣循環結束後我arr一維陣列裡就有真值表的Y值
        System.out.println(); //這邊開始就是利用arr一維陣列取到data二維陣列裡的真值表Y值去了解說這data二維陣列裡的真值表是誰的邏輯符號
        if(arr[0]==0 && arr[1]==1 && arr[2]==1 && arr[3]==1){ //如果arr一維陣列裡的值如左方一樣就進去
            System.out.println("此真值表是 或閘(OR)"); //之後列印
        }else if(arr[0]==0 && arr[1]==0 && arr[2]==0 && arr[3]==1){ //如果arr一維陣列裡的值如左方一樣就進去
            System.out.println("此真值表是 及閘(AND)"); //之後列印
        }else if(arr[0]==1 && arr[1]==0 && arr[2]==0 && arr[3]==0){ //如果arr一維陣列裡的值如左方一樣就進去
            System.out.println("此真值表是 反或閘(NOR)"); //之後列印
        }else if(arr[0]==1 && arr[1]==1 && arr[2]==1 && arr[3]==0){ //如果arr一維陣列裡的值如左方一樣就進去
            System.out.println("此真值表是 反及閘(NAND)"); //之後列印
        }else if(arr[0]==0 && arr[1]==1 && arr[2]==1 && arr[3]==0){ //如果arr一維陣列裡的值如左方一樣就進去
            System.out.println("此真值表是 互斥或閘(exclusive OR)"); //之後列印
        }else if(arr[0]==1 && arr[1]==0 && arr[2]==0 && arr[3]==1){ //如果arr一維陣列裡的值如左方一樣就進去
            System.out.println("此真值表是 互斥反或閘(exclusive NOR)"); //之後列印
        }else { //如果上述6個循環下來都沒有的話,來到這邊else進入
            System.out.println("查無此真值表的數位邏輯符號!"); //進入之後,並列印這一行!
        }               //上面if開始就是找這真值表是位於這6個符號中的哪一個,如果if由上至下循環都沒有而跑來else裡,就代表此真值表6個符號都不是
    }
}
/*
題目:輸入真值表之後判斷此真值表是哪一個數位邏輯符號的
6種邏輯符號的真值表如下:
  或閘(OR)    及閘(AND)  反或閘(NOR)   反及閘(NAND)   互斥或閘(exclusive OR)    互斥反或閘(exclusive NOR)
  A B Y       A B Y     A B Y        A B Y         A B Y                    A B Y
  0 0 0       0 0 0     0 0 1        0 0 1         0 0 0                    0 0 1
  1 0 1       1 0 0     1 0 0        1 0 1         1 0 1                    1 0 0
  0 1 1       0 1 0     0 1 0        0 1 1         0 1 1                    0 1 0
  1 1 1       1 1 1     1 1 0        1 1 0         1 1 0                    1 1 1
補充:真值表裡的A B 是拿來判斷得出 Y 例如或閘的A(0)B(0) 0 0得出 0 <-Y

補充1-1:%4d意思->是用於int值去先取空格,之後把該int值列印於空格後方(先空後印)  %4d是用於int %4f是用於float(浮點數) %4s是用於String(字串)
補充2-1:arr[a]=data[a][b]->這邊不管是arr一維陣列還是data二維陣列,這裡的a跟b都是取來自符合外圈if的a跟b去給arr一維陣列值
輸入如下:
0 0 1                   0 0 0                     0 0 1
1 0 0                   1 0 1                     1 0 1
0 1 0                   0 1 1                     0 1 0
1 1 0                   1 1 0                     1 1 0

答案列印如下:            答案列印如下:              答案列印如下:
   A   B   Y             A   B   Y                A   B   Y
   0   0   1             0   0   0                0   0   1
   1   0   0             1   0   1                1   0   1
   0   1   0             0   1   1                0   1   0
   1   1   0             1   1   0                1   1   0

此真值表是 反或閘(NOR)   此真值表是 互斥或閘(exclusive OR)   查無此真值表的數位邏輯符號!
 */
