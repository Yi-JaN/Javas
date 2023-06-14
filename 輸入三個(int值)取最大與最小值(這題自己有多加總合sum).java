import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b;
        int c;
        int maxVal=a;
        int minVal=a;
        int sum=a;
        for(int i=0;i<1;i++){
            b=scn.nextInt();
            if(b>maxVal){
                maxVal=b;
            }else if(b<minVal){
                minVal=b;
            }
            sum+=b;
        }
        for(int j=0;j<1;j++){
            c=scn.nextInt();
            if(c>maxVal){
                maxVal=c;
            }else if(c<minVal){
                minVal=c;
            }
            sum+=c;
        }
        System.out.println("max= "+maxVal);
        System.out.println("min= "+minVal);
        System.out.println("sum= "+sum);
    }
}
/*
題目:輸入三個int值並找出他們的最大與最小值(自己這題有多加一個sum)
問題描述: 寫一個程式讓使用者輸入三個整數,程式輸出最大與最小值
輸入描述: 輸入三個整數值(int)
輸出說明: 輸出最大值(int)及最小值(int),最後必須有換行字元。
A:
 8 9 2         183 44 490
 max= 9        max= 490
 min= 2        min= 44
 sum= 19       sum= 717

題目說輸入三個整數值,我分別三個值為a,b,c,首先我先把a拉到外面獨立取一個值,那a是第一個開頭值,所以獨立取一個值自然只有第一個正整數,之
後取完往下丟給maxVal,minVal,讓他們最大最小都先是第一個值("這麼做是怕假設我第一個值如果是最小,那我一開始循環遇到最大值,假設最大值空的,那他就
會把最小放到最大!"),之後下面遇到第一個for迴圈,這裡的for取一個值也就是第2個值,裡面改放b=scn.nextInt();這樣你輸入三個值,剛剛取了第一個值
"自然系統就會自動往下往你所輸入得第2個值去取",取了你所輸入的第2個值就往下if判斷,if裡面的maxVal,minVal都先為第一個值,之後第2個值做if判斷看是
在哪一邊,假設兩邊都不是就跳過往下,下面的第2個for迴圈也以此類推!(程式由上往下看)
 */
