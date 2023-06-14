import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int z=(n*m);
        gcd(n,m);
        System.out.println("最大公因數: "+gcd(n,m));
        System.out.println("最小公倍數: "+z/gcd(n,m));
    }
    public static long gcd(int nn,int mm){
        int maxx=Math.max(nn,mm);
        int minn=Math.min(nn,mm);
        if(maxx%minn!=0){
            return gcd(minn,maxx%minn); // <-丟到這回傳時,裡面的值是給他們 -> gcd(nn,mm); 然後做回傳!
        }else {
            return minn;   //這行意思是遞迴函數比到最後,最後的maxx跟minn%是0,就往下來到else裡,代表已經不在需要丟回去然後再由上至下傳下來做遞迴
                           //,並且也找到他們這兩個值彼此之間的"最大公因數",之後return minn,也就是回傳我目前的minn值回去上方的println括號裡,
                          //其他的值都沒傳回去,然後minn值傳回去之後也沒下gcd函數名稱,所以不能名稱對名稱再丟下來做遞迴,所以丟回去的minn值直接在
                          //println()裡列印就是答案!
        }
    }
}
/*
題目:
A:(1.) 10 20         (2.) 12 8
   最大公因數: 10           最大公因數: 4
   最小公倍數: 20           最小公倍數: 24

 */
