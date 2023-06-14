import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[4];    //範例要我輸入4個值,所以我int[]arr這邊new 4個int值
        square(arr);        //丟到名為square(arr)的函數名稱
    }
    public static void square(int []arr){   //之後用一般函數void把square(arr)放進去,arr是一維陣列要加"[]"
        Scanner scn1=new Scanner(System.in);   //我在這函數裡加一個Scanner 做待會arr要取4個int值的動作,沒Scanner arr[]會無法取數!
        int sum;               //輸入一個sum,待會每列一個值我要做此arr數字的平方!,然後也可以取完列完再繼續使用!
        for(int i=0;i<4;i++){     //for迴圈讓他跑4次,因為範例要取4個值!
            arr[i]=scn1.nextInt();      //每循環一次for arr[i]=scn1.nextInt();就取一個你輸入正整數,以此類推!
            for(int j=2;j<=2;j++){         //取完的arr[i],跑到下面的小迴圈,讓他用此數字的平方,那平方也就是2次方,所以這邊我固定設2!
                sum=(int)Math.pow(arr[i],j);  //之後把sum丟進去這邊讓他做目前的arr[i]的j平方,那j只有2,所以就跑該arr[i]的2次方!
                System.out.printf("%d\t",sum); //跑完的值丟到這邊列印出來,之後往下跳出這小迴圈,在底標返回大for迴圈,之後再往下做一樣
            }                                  //的上述動作,大FOR迴圈循環完畢之後,往下println做換行字元!
        }
        System.out.println();
    }
}
/*
補充:我也可以先在void main 這邊下for迴圈讓他取new int[4]個正整數 ->for迴圈裡放arr[]=scn.nextInt();讓他循環4次取4個正整數 ,之後把取
//到的arr裡4個正整數拖到下方的void函數裡直接做!
題目: 陣列平方 (取4個int[]arr值並且主要方法之一)
問題描述:
 撰寫一方法 square(arr)，在呼叫 square(arr)方法後，一維陣列 arr 裡的每一個元素皆會
被平方。
輸入說明:
  連續輸入多個正整數，並存至陣列 arr。
 輸出說明:
  呼叫 square(arr) 函數後，一維陣列 arr 裡的每一個元素皆會被平方，並輸出結果，數
字以 tab 間格，最後必須有換行字元。
A:
(1.)1 3 5 7        (2.)2 7 9 13
 A:1  9  25  49        A:4  49  81  169
 */
