import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Random randnum=new Random();
        long seed=scn.nextLong(); //輸入一個long代碼值,而這用途是待回輸入此代碼值,然後放在setSeed裡面
        randnum.setSeed(seed); //而亂數這邊的randnum用setSeed,並且括號裡面待會用剛剛所輸入的long代碼值 而setSeed詳請下方有補充
        int[]data=new int[4]; //用一維陣列取4個值,然後待會用他用randnum去取4個亂數產生的值,列印時結合起來變成4位數的值
        for(int i=0;i<4;i++){
            data[i]=randnum.nextInt(10); //for i每循環1次就取1個亂數0到9 共10個值之間隨機取1個值到現在的data目前位於的[i]位置上
        }
        for(int i1=0;i1<data.length;i1++){ //這邊是把我亂數產生的4個值用一個for i1 1個1個列印出來
            if (i1==data.length-1){  //最後一個值列印時不空格
                System.out.print(data[i1]);
            }else {     //其他只要不是最後一個值就進去,並且列印目前data位於的[i1]位置值,然後要空格
                System.out.print(data[i1]+" ");
            }
        }
        System.out.println(); //列印完換行到下一行,然後做下一個步驟
        String[][]data2={{"*****",  //這邊的String二維陣列詳請請去模三資料夾裡的矩陣數字顯示 去看詳細介紹,這個String二維陣列意思跟
                          "*   *",  //他的一樣
                          "*   *",
                          "*   *",
                          "*****"},
                         {"    *",
                          "    *",
                          "    *",
                          "    *",
                          "    *"},
                         {"*****",
                          "    *",
                          "*****",
                          "*    ",
                          "*****"},
                         {"*****",
                          "    *",
                          "*****",
                          "    *",
                          "*****"},
                         {"*   *",
                          "*   *",
                          "*****",
                          "    *",
                          "    *"},
                         {"*****",
                          "*    ",
                          "*****",
                          "    *",
                          "*****"},
                         {"*****",
                          "*    ",
                          "*****",
                          "*   *",
                          "*****"},
                         {"*****",
                          "    *",
                          "    *",
                          "    *",
                          "    *"},
                         {"*****",
                          "*   *",
                          "*****",
                          "*   *",
                          "*****"},
                         {"*****",
                          "*   *",
                          "*****",
                          "    *",
                          "*****"}};
        for(int a=0;a<5;a++){  //這個for a先假設為高
            for(int b=0;b<data.length;b++){ //這個for b假設為值,然後放data的值有幾個,當 b=0 0<data長度值(data有幾個值),然後循環
                if (b==(data.length-1)){  //假設我的for b的值跟我data.length-1一樣,那就進去,進去後代表取最後一個高位於的值列印
                    System.out.print(data2[data[b]][a]); //然後data2這邊a就變成當值,b變當高,所以data2二維陣列的高是取我data[b]目前位於的b
                }else {  //其他只要b不是跟data.length-1一樣的值就進去                      //位置值當高,而a就是取這位於的高裡面的值
                    System.out.print(data2[data[b]][a]+" "); //進去後代表不是取最後一個高位於的值列印,所以就要列印完空格
                }                                     //而這邊data2一樣a就變成當值,b變當高,所以data2二維陣列的高是取我data[b]目前位於的b
            }                                        //位置值當高,而a就是取這位於的高裡面的值
            System.out.println(); //列印完一行就換行取下一行
        }
    }
}
/*
題目:矩陣數字顯示(用隨機亂數產生setSeed做法)
補充:setSeed()->用於設定隨機數種子，一個特定的種子可以產生一個特定的偽隨機序列，這個函数的主要目的，是讓你的模擬能夠可重覆出現
               ，因為很多時候我們需要取随機數，但這段代碼(我所設的long seed)再跑一次的時候，结果就不一样了，如果需要重覆出現同
               樣的模擬结果的话，就可以用setSeed()。
補充:data一維陣列跟long seed的關係->因為我long seed是丟到randnum裡的setSeed括號裡面,而這邊產生一個一維陣列(data)讓他利用randnum產生
                                4個值,而進而randnum有用到setSeed所以我long seed放setSeed括號裡面,所以利用data產生的4個值,之後丟
                                到setSeed讓他保存起來這4個值,保存起來再轉給括號裡的long seed,之後輸入相同long seed就會跳出一模一樣
                                的4個保存起來的亂數產生值
補充1:用data一維陣列產生出來的4個亂數值,最終列印出來的矩陣數字顯示,合起來就會變4位數的值,而我當初取值方式是1個1個取,所以我取完列印出來,就會合
     起來變成4位數的矩陣數字顯示
補充2:System.out.print(data2[data[b]][a]+" ");意思->意思是假設我如上方程式碼一樣進去到else裡遇到這行,然後假設data[b]b目前是1 a是3
                                                  假設我題目輸入如下方是23323456,然後取23323456這代碼值的4個亂數值,而b是1那就是
                                                  data2[data[b]][a]->data2[7][a], 而a是3那就是 data2[7][3],就是取data2位
                                                  於的高7值3的值,所以就去data2把這行取下來列印->"    *"然後之後在空格
題目輸入->23323456
      A:1 7 6 3
            * ***** ***** ***** <-a=0的值,也就是data2目前位於的高裡面的值0,列印出來就是第一行高
            *     * *         * <-a=1的值,也就是data2目前位於的高裡面的值1,列印出來就是第二行高
            *     * ***** ***** <-a=2的值,也就是data2目前位於的高裡面的值2,列印出來就是第三行高
            *     * *   *     * <-a=3的值,也就是data2目前位於的高裡面的值3,列印出來就是第四行高
            *     * ***** ***** <-a=4的值,也就是data2目前位於的高裡面的值4,列印出來就是第五行高

 */
