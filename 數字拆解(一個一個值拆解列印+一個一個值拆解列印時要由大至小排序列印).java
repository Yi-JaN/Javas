import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       String str="";
       if(n==0){
           str=Integer.toString(n);
       }
       while (n>=1){
           str=Integer.toString(n%10)+str;
           n/=10;
       }
        char []ch=str.toCharArray();
       for(int i=0;i<ch.length;i++){
           System.out.print(ch[i]+" ");
       }                                  //把取到的值一個一個從第一個值排到最後一個值
       System.out.println();
       Arrays.sort(ch);                  //之後換行字元ln完再把原本str丟給[]ch的值丟進去sort做遞增排序
       System.out.print("由大至小: ");
       for(int j=ch.length-1;j>=0;j--){        //然後要把一個一個值從反向開始丟下來列印,丟下來列印的同時要列印完再由大至小排列,因為
           System.out.print(ch[j]+" ");       //sort完,此for迴圈是用反向取值,一個一個值取,所以才要每丟一個列印,一邊列印完,一邊由大至小
       }                                     //排列!,以此類推!
       System.out.println();              //ok完再換行字元
    }
}
/*
題目: 數字拆解(另外再加猜解完的值由大至小另外排列)
A:
(1.) 057           (2.) 0            (3.) 12            (4.) 850             (5.) 1062
  A: 5 7                0                 1 2                8 5 0                1 0 6 2
  A:由大至小: 7 5      由大至小: 0      由大至小: 2 1          由大至小: 8 5 0     由大至小: 6 2 1 0
 */
