import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random scn1=new Random();
        double v1=Math.random()*100+1;
        double maxVal=v1;
        double minVal=v1;
        System.out.print(Math.floor(v1*100)/100+" ");
        for(int i=0;i<8;i++){
            v1=Math.random()*100+1;
            System.out.print(Math.floor(v1*100)/100+" ");
            if(v1>maxVal){
                maxVal=v1;
            }else if(v1<minVal){
                minVal=v1;
            }
        }
        System.out.println();
        System.out.println("max= "+Math.floor(maxVal*100)/100);
        System.out.println("min= "+Math.floor(minVal*100)/100);
    }
}
/*
題目:用Random隨機亂數產生九個1-100的double值然後取最大與最小值(第2個方法,先把一個亂數值丟給maxVal與minVal法)
A:(這裡我取2種組合)
1. 89.99 43.4 60.53 42.07 30.01 13.78 43.65 63.15 45.66  2. 7.01 94.46 15.03 90.4 38.61 79.87 7.83 98.3 85.3
 max= 89.99                                                max= 98.3
 min= 13.78                                                min= 7.01
 這題我以上面範例組合第2個組合來說明!
 第一行的v1=Math.random()*100+1;先隨機產生一個亂數值給他自己,之後OK了往下分別丟給double maxVal=v1;跟double minVal=v1;那這樣已經
 先列出一個值了("這樣子做是因為怕第一個亂數值就是最大或最小值如果都丟給for迴圈做的話怕第一個值會出錯可能明明最小被放到最大值!"),之後
 題目說要亂數產生九個值,所以9-1=8,還剩8個亂數產生,言歸正傳這時候先把我第1個亂數v1值列在print()裡顯示出來,然後再用Math.floor到小數點第2位不四
 捨五入這樣列出來比較方便看(這樣在print裡列本身不影響v1本值!)之後再for迴圈裡列(int i=0;i<8;i++){ 因為還剩8個值,所以說v1=Math.random()*
 100+1;放迴圈裡面讓他循環8次這樣,之後他就慢慢產生8個隨機亂數v1值再丟進print跟if判斷(剛開始if裡的maxVal跟minVal都是第一個v1亂數值),然後這8次
 循環產生的亂數值符合就丟不符合就往下判斷循環,以此類推!
 */