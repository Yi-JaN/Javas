import java.util.Scanner;


public class Main {

    public static void main(String[] args)  {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine(); //輸入一個字串
        String str2=""; //輸入一個str2當空白字串
        for(int i=str.length();i>0;i--){ //把妳的str變str.length(),之後這for i要取此str做反向字串
            char ch =str.charAt(i-1); //這行意思就是取妳i值位置位於的str單字串,而這行的str.charAt括號裡面是0的話就是固定取str第1個單字串
            str2=str2+ch; //把我取到的汰舊換新的ch值丟給str2 1個1個取到的單字串慢慢加起來      //所以i=1 ->(1i-1)->=0,取0位於的str單字串
        }
        if(str.equals(str2)){ //來到這邊我的str2已經加起來了,接下來equals就是字串對比意思,而外圈if表示,如果str做字串對比跟測試方str2是一
            System.out.println("YES"); //樣的,那就為True,測試不一樣,就不用丟這行,也就是為false,True的話就進去顯示"YES"列印
        }else {     //如果上方if進不了,就會自動往下來到else
            System.out.println("NO"); //進入後顯示"NO"
        }
    }
}
/*
題目: 迴文(用String版)(Scanner scn版)
答案: 23NBaabN32 -> NO
     23NBaaBN32 -> YES
 */
