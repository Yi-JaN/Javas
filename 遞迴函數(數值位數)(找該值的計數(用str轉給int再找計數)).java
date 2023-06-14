//import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str;
        str=scn.next();
        int n=Integer.parseInt(str);
        int count=0;
        ofdigits(n,count);
        System.out.print("位數: "+ofdigits(n,count));
        System.out.println();
    }
    public static long ofdigits(int x,int counts) {
        if(x>0){ //x值不等於0的話
            counts++;   //先count+1 再往下  之後->//返回ofdigits(先除10,counts(+1))完之後變(除完的值,counts+1的值)
            return ofdigits(x/10,counts);   //返回到上面的ofdigits(n,count)在往下丟print裡的ofdigits(n,count);
        }else {
            return counts;
        }
    }
}
/*
題目:遞廻函數:數值位數 (用long函數+(return))
A:
(1.) 220             (2.)4395         (3.)012
     位數: 3             位數: 4           位數: 2

說明:以A:(1.)去做說明
先設一個str=scn.next();之後往下丟給int n,做Integer.parseInt(str),意思是str做字串轉int值給int n的意思,之後再設一個count=0(要算該值的
計數位數)!所以我一開始str設220丟給n做字串轉int值,轉完後220變int n給他!
再來就是設一個名稱叫"ofdigits"然後把n跟count丟給她變成ofdigits(n,count); 然後丟到print("位數: "+ofdigits(n,count));"之後下方有println
先不要println()換行字元!"
然後設一個long函數像上方的 "public static long ofdigits(int x,int counts){"(這邊int x就是n,int counts就是count在函數這邊我只是換
名稱而已,本質並沒有變!),然後一開始先把我int x(n);丟到if(x>0)->if我的x(n=220)大於0的話丟進去,進去之後counts(count)原本是0,然後counts++,
變counts(count)=1,在return(返回)到ofdigits裡,這時候我的ofdigits裡的x值要先/10(/10是因為10個值就進位),除完之後變ofdigits(x(=22)
,counts(=1)),返回到上方的ofdigits(n,count)之後在把他往下丟到print("位數: "+ofdigits(n,count));
這時候n=22,count=1帶下去long做""上方敘述!""以此類推做到你的x已經不在是大於0了,這時候x不在大於0的值是x(n)=0,counts(count)=3!
然後帶下去if迴圈這時候來到else,丟進else之後return(返回)counts; 之後返回counts也就是上方的count,這時候count是=3,往下丟到ofdigits(n,coun
t);,丟count就好n不用,之後print列印count就好,因為當初最後他是""return counts(也就是count)!""所以說只提到count所以就列印count就好,
然後再列印println();就已經完成了!(""因為下面的long函數要有x(n),counts(count),你當初return只有counts(count)所以不能再丟下去long函數"")

題外話:""所謂的return是返回到你所輸入的地方""像if迴圈裡就是return ofdigits(x/10,counts);,所以說先把值除以10再放值進去,再返回long函數上方的
""ofdigits(n,count);"",然後->ofdigits(目前的n(x),目前的count(counts));丟給print("位數: "ofdigits(n,count)); 以此類推!

然後再來就是if迴圈裡的else-> return counts;,他就是丟進去else然後返回counts(count),所以就返回long函數上方的int count=0這行,在把你目前
的count值+到多少放給int count=0變成->int count=(目前加好的值);,所以說放好再丟入ofdigits(n,count);<-這邊就取count就好,因為他只return
count 變成->ofdigits(count)丟下去print("位數: "+ofdigits(count))<-這邊也一樣丟count就好,然後往下因為沒有所謂的int x(n),所以無法在
丟入long函數裡面執行,所以就往下列印println();直接列印答案出來!

(所以說這就是所謂的遞迴函數!)
 */

