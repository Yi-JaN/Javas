import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(); //輸入1個n,看要取幾個正整數做比較
        int[]arr=new int[n]; //此arr一維陣列拿來取n個正整數值
        int[]arrsum=new int[n]; //此arrsum一維陣列作用是取arr陣列裡的總和值 ,哪個arr的值就對她的arrsum位於的位置值
        int sum=0;  //此做為目前arr一維陣列裡的值丟給sum做取值動作給arrsum
        for(int i1=0;i1<n;i1++){  //用for 先取arr一維陣列裡的n值,陣列開頭必為"0"
            arr[i1]=scn.nextInt(); //每位於的arr[i]的位置就取1個正整數給目前的arr[i]位置
        }
        for(int i2=0;i2<arr.length;i2++){ //把我取好的arr值變arr.length,看有幾個arr值,當作此for迴圈循環
            sum=arr[i2];  //目前位於的arr[i2]位置正整數值,就丟給sum汰舊換新給他
            while (sum>=1){ //把我汰舊換新的sum值丟到while取此arr[i2]位置值的總和值
                arrsum[i2]+=sum%10;  //arrsum的[i2],i2這邊就對arr的[i2],i2對i2,然後就把我的此總和值總合起來給arrsum
                sum=sum/10;       //假設arrsum[i2],i2是0,就把他最終總和丟給arrsum[0]的位置,然後arr[i2(0)]總和值就是arrsum[i2(0)]
            }
        }
        for(int i=0;i<arr.length;i++){  //這行開始做泡沫排序(氣泡排序),每一次外圈盡量帶動內圈排出最完美狀態的排序
            for(int j=0;j<arr.length-1;j++){
                if(arrsum[j]==arrsum[j+1] && arr[j]>arr[j+1]){ //這邊假設我的arrsum目前的j位置總和跟下一個arrsum j+1一樣 以及
                    int v=arrsum[j];  //進入後先把arrsum[j]丟給int v               //arr目前j位置值大於下一個arr j位置值,那就進入
                    arrsum[j]=arrsum[j+1]; //然後arrsum[j]就被arrsum[j+1]取代(下一個總和值取代"前面"的總和值)
                    arrsum[j+1]=v;    //之後原本arrsum[j]丟給v的值丟到後方arrsum[j+1]
                    int v1=arr[j];  //然後arr目前的[j]正整數值先丟給int v1
                    arr[j]=arr[j+1]; //然後arr[j]就被arr[j+1]取代(下一個正整數值取代"前面"的正整數值)
                    arr[j+1]=v1;   //之後取代完成就把原本arr[j]丟給v1的正整數值丟到後方arr[j+1]   //這個if迴圈詳請可看下方補充1-1 1-2
                }else if(arrsum[j]>arrsum[j+1]){ //上面if迴圈不成立的話來到這else if,如果目前arrsum[j]總和值大於下一個arrsum j+1
                    int v2=arrsum[j];  //進入之後先把arrsum[j]丟給int v2                                 //那就進入else if
                    arrsum[j]=arrsum[j+1]; //然後arrsum[j]就被arrsum[j+1]取代(下一個總和值取代"前面"的總和值)
                    arrsum[j+1]=v2;   //之後原本arrsum[j]丟給v2的總和值丟到後方arrsum[j+1]
                    int v3=arr[j];   //然後arr目前[j]正整數值丟給v3
                    arr[j]=arr[j+1]; //然後arr[j]就被arr[j+1]取代(下一個正整數值取代"前面"的正整數值)
                    arr[j+1]=v3;    //之後取代完成後把原本arr[j]丟給v3的正整數值丟到後方arr[j+1]  //此else if詳請可看下方補充2-1 2-2
                }
            }
        }
        System.out.println("正整數值位置排序: ");
        for(int k=0;k<arr.length;k++){   //來到這邊代表正整數值排序完成,1個1個依照for k 列印出來
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("正整數位於的總和值排序: ");
        for(int k1=0;k1<arrsum.length;k1++){ //來到這邊代表總和值跟正整數值也一樣排序完成,然後正整數一個一個列印完成OK之後來到這邊
            System.out.print(arrsum[k1]+" ");  //1個1個依照for k1 列印出我的總和值,也就是跟正整數位於一樣的位置排序的總和值!
        }
        System.out.println();
    }
}
/*
題目:各位數和排序
 3                    4                          4
 9122 3128 5122       1725 3821 2011 1428        6531 7113 1096 2185
A:正整數值位置排序:       正整數值位置排序:             正整數值位置排序:
  5122 3128 9122       2011 3821 1428 1725        7113 6531 1096 2185
  正整數位於的總和值排序:  正整數位於的總和值排序:         正整數位於的總和值排序:
  10 14 14             4 14 15 15                 12 15 16 16

補充1-1:if(arrsum[j]==arrsum[j+1] && arr[j]>arr[j+1]意思-> 因為假設arr"他們"自己得出來的總和值假設一樣,然後如果正整數他比下一個
       正整數值還要大那就丟進來
補充1-2:進來之後,雖然雙方的總和值都一樣可以不用改,但是我改的原因是因為,既然他自己生出來的總和值,如果假設自己位置被對調,那麼這總和值也要跟著這正整數
       值對調到一樣的位置,所以才會符合進入之後,總和跟正整數一起對調!
補充2-1:else if(arrsum[j]>arrsum[j+1])意思-> 如果我面前arrsum[j]位置總和值大於下一個arrsum j+1的位置總和值,那就丟進去
補充2-2:丟進去之後一樣泡沫排序(氣泡排序) arrsum目前[j]的總和值先丟給v2,然後arrsum j+1的總和值丟到arrsum[j]取代上去,之後arrsum j+1就把原本
       arrsum[j]總和值丟給v2的值丟給他,所以arrsum j+1=v2,這樣慢慢就形成一種泡沫排序(氣泡排序)的道理,之後arr正整數值也是一樣的道理,因為假設
       arr[j]的正整數值的總和值大於下一個arr j+1正整數值的總和值,所以既然他自己生出來的總和值,假設自己正整數值位置做對調,那麼這總和值也要跟著
       這正整數值對調到一樣的位置! 所以arr[j]也一樣做泡沫排序(氣泡排序) ,一開始總和先對調,之後正整數值也要跟著總和值做對調
 */
