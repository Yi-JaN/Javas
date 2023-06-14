import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //題目: 函式 最小公倍數(三個值的)(其中1個方法)
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int z=scn.nextInt();
        f(n,m,z); //把n m z丟到函數名稱為f之中
    }
    public static void f(int n,int m,int z){
        System.out.println(f(f(n,m),z)); //函數名稱f帶著三個值丟在void裡,之後println括號裡,最終列印跟回傳值都在那邊進行
    }
    public static int f(int n,int m){ //這邊一開始的n跟m是取來自上方的println(f(f(n,m),z);先取內括號的n跟m下來,算出來的回傳值,回傳,再繼續取
        int xxx=(n*m); //兩個值先相乘,待會算最小公倍數用              //外括號的z下來遞迴,所以int n就是算出來的回傳值 int m就是那個上方的z,
        while (m>=1) {  //這邊while就用輾轉相除法                  //最後第2次算的回傳值回傳到上方println裡的n,然後就可以不用在丟下來
            int xx=n%m;                                        //這邊做遞迴,就直接在上方void f裡面的println列印值出來
            n=m;
            m=xx;
        }
        int yyy=(xxx)/n; //把相乘後的xxx再除以n(也就是兩個值之間的最大公因數),除完後就是兩個值之間的最小公倍數,所以yyy的身份是最小公倍數
        n=yyy; //最小公倍數這邊復刻一份值出來給n,n就取yyy(最小公倍數的值),取完後n就變成最小公倍數
        return n; //這時候n已經是最小公倍數,用return回傳到上方的void裡的println括號裡的n
    }
}
/*
步驟如下
假設 n=12 m=8 z=16
第1步:那第1次算回傳值依照上面的void f裡的println(f(f(n,m),z)); 先取內括號的值來算,也就是n=12跟m=8來算
第2步:之後12跟8來到void f的下方做遞迴函數,裡面用輾轉相除法算出兩數之間的最大公因數,之後依照int f遞迴函數裡面的循環,最終n return回去,原本以為
     return回去沒下函數名稱這個值(n)就可以不用在丟下來了,沒想到還有f(f(n,m),z);也就是外括號的z
第3步:之後就把原本內括號裡的回傳值(n)跟外括號的z在丟下來做遞迴函數,而回傳值n在int f括號裡是int n,而z這邊是int f括號裡的int m,然後就可以開始算
     之後在裡面用輾轉相除法算出兩數之間的最大公因數,依照int f遞迴函數裡面的循環,最終n return回去,而最終n就是真正的最小公倍數,然後這次return
     沒下函數名稱,就可以真的不用在丟下來了,之後再void f的println裡列印

輸入 12 8 16    輸入 7 5 6   輸入16 12 8
答案 48         答案 210     答案 48

 */
