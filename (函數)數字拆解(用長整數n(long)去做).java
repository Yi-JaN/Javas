import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       long n=scn.nextLong();
       docamp(n);
    }
    public static void docamp(long nn){
        String str="";
        if(nn==0){
            str=Long.toString(nn)+str;
        }
        while (nn>=1){
            str=Long.toString(nn%10)+str;
            nn/=10;
        }
        char[]ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
        System.out.println();
    }
}
/*
題目:含數:數字拆解
說明:取一個叫docamp的函數,然後輸入長整數 n(long)
輸出:在docamp(n)函數裡進行數字拆解,並最後換行字元

我是用n設長整數,再把他丟到函數裡用str(然後用%10)拿取我每個位數的值借值轉成字串,拿完之後再用char[]ch=str(拿好的值).toCharArray;
之後再用for迴圈把我拿到的值做ch.length,在做"單字串分解拿取每個位置的字串列印",之後再最後換行字元!
如果我的長整數n是0,那麼就設一個if(n==0)丟進去直接把n值用Long.toString(n)+str;直接丟進轉str,然後給str,之後再丟到char[]ch=str(拿好的值).
toCharArray;以此類推的動作!
A:
  (1.)4395             (2.)0     (3.)010       (4.)128917178          (5.)10       (6.)00    (7.)139
    A:4 3 9 5            A:0       A:1 0         A:1 2 8 9 1 7 1 7 8     A:1 0       A:0       A:1 3 9
 */
