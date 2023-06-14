import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine(); //輸入一個二進制的字串
        int k=0; //k為次方數
        int sum=0; //<-計算總合,拿來結合答案->十進制
        for(int i=str.length()-1;i>=0;i--){ //把字串變成字串長度-1是因為我要用str.substring取單字串,之後再轉int值,然後反向取值,(0,1)固定為substring第一個單字串值
              if(i==(str.length()-1)){  //這if是str取單字串中從最後一個開始往前取,這是最後一個值再放的地方,然後我反向取值,所以第一個取的單字串會丟來這邊,也就是最後一個值
                  String str2=str.substring(i,i+1); //取str中的字串參數,也就是單字串,取到丟給String str2
                  int mm=Integer.parseInt(str2); //然後String str2取到後再轉int值給mm
                  sum+=mm; //那因為第一個取的值(也就是字串中的最後一個值)是0次方,所以不用乘,直接+我的最後一個值的數值
                  k++; //加完後k+=1
              }else { //這else是str取單字串中從最後一個開始往前取,然後除了最後一個值之外,其他值由後往前取的值都丟來這邊
                  String str3=str.substring(i,i+1); //取str中的字串參數,也就是單字串,取到丟給String str3
                  int xx=Integer.parseInt(str3); //然後String str3取到後再轉int值給xx
                  sum+=((int)Math.pow(2,k))*xx; //之後除了第一個取的值(也就是字串中的最後一個值)是0次方,其他由後往前的值,依照由後往前順序去乘於2的k次方,之後再*轉給xx的值
                  k++; //加完後k+=1
              }
        }
        System.out.println(sum); //最後for ok之後加起來的值就是此數的二進制轉十進制的值
    }
}
/*
題目:二進制轉十進制

補充 sum+=((int)Math.pow(2,k))*xx ->為什麼是2的k次方呢? 因為此輸入的值是二進制,然後題目說二進制轉十進制,所以輸入的值是二進制,那自然二進制就
                                   用2去乘次方數,如果今天是六進制轉十進制,就是六進制用6去乘次方數慢慢轉成十進制
說明圖如下:
     1    0    0    0    1 <-2進制
     |    |    |    |    |
     2的  2的   2的   2的  2的              1              0              0            0         1
     4次方 3次方 2次方 1次方 0次方   -> (2*2*2*2)*1=16 +  (2*2*2)*0=0  +  (2*2)*0=0  + (2)*0=0  +  1 =17
 A:->17 <-上面2轉10答案

輸入->00001111         101100      10001     1111
輸出->15               44          17        15

 */
