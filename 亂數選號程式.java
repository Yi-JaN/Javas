import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //題目敘述: 1到42選出6個亂數產生不重覆的數字組合   然後要設一個名稱為seed的變數名稱
        Scanner scn=new Scanner(System.in); //這邊是先設一個Scanner 要設一個seed的變數名稱用
        Random random=new Random();  // 這邊要亂數產生,設Random 變數名稱random
        long seed=scn.nextLong();    //設一個seed變數名稱
        random.setSeed(seed);       //把seed丟入setseed()括號裡,因為seed的6個值要用亂數產生(random)出來! setseed詳請,在下方有講解
        int []data=new int[6];     //然後說要設1到42的6個亂數產生值,所以就用一維陣列取6個亂數產生值
        for(int i=0;i<6;i++){     //這邊我是用for迴圈取,然後data是一維陣列,陣列開頭第1值必為0
            data[i]=random.nextInt(42)+1;  //每循環1次,data[i]<-(目前位於的i值)就取一個亂數1到42號碼給他
            for(int j=0;j<i;j++){       //然後這邊是把目前位於的data[i]亂數值去比較她這i值前面的亂數值找有沒有重覆
                if (data[i]==data[j]){  //目前data[i]<-(目前位於的i值)亂數值,去比較這亂數值有沒有跟前面的i值亂數值有沒有重覆
                    data[i]=random.nextInt(42)+1;  //如果有,那就在把目前位於的data[i]值再換一個1到42的亂數號碼
                    }
                }
            }                                          //所以這內圈for j做法就以此類推到結束!
        
        for(int k=0;k<data.length;k++){    //來到這邊代表我long seed透過setSeed的方式,保持了我原來利用data[]產出6個的亂數值(不重覆)
            System.out.print(data[k]+"\t");   //之後這for k就取我這data一維陣列裡的值,1個1個值取出來列印
        }
        System.out.println();
    }
}
/*
題目: 亂數選號程式
題目問題描述請去->模三參考題目裡的亂數選號程式去看
補充(setSeed()的意思)-> setSeed()用於設定隨機數種子，一個特定的種子可以產生一個特定的偽隨機序列，這個函數的主要目的，
                      是讓你的模擬能夠可"重複出現"，因為很多時候我們需要取隨機數，但這段代碼(我的seed)再跑一次的時候，
                      結果就"不一樣"了，"如果需要重複出現同樣的模擬結果的話"，"就可以用setSeed()"

補充-> for j 這邊假設我現在i是3 那就是第4個值,這樣for j就先找前3個值,if(data[i]<-(目前第4個值)==data[j]<-(目前前第1再來2再來3))
      一個一個對我現在第4個值看有沒有重複,假設有就進去if裡面,然後把目前的i值<-(第4個)值,再換一個亂數產生值,之後底標返回,返回到for j再繼續
      比較,比較到內圈for j ok為止      

補充2-> data[]這邊要用"random"取6個隨機亂數給seed,因為當初seed丟到random裡的setSeed,所以設一個data[],利用他用"random"去取6個隨機亂數
       值,並且用setSeed保持這6個隨機亂數值!之後每一個隨機亂數值就會保存起來丟給setSeed()裡的seed

A:(1.)23323456                      (2.)1723
    A:34  40  41  18  24  33           A:40  28  15  19  11  37

 */
