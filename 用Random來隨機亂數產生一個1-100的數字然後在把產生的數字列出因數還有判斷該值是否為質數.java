import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random=new Random();
       int n=random.nextInt(100)+1;
        System.out.println("隨機數為: "+n);
        isPrime(n);
    }
    public static void isPrime(int n){
        int p=1;
        int count=0;
       while (p<=n){
           if(n%p==0){
               count++;
               System.out.println(p);
           }
           p++;
       }
       if(count==2){
           System.out.println("是否為質數="+" YES");
       }else {
           System.out.println("是否為質數="+" NO");
       }
    }
}
/*
題目:隨機亂數產生1~100一個數字然後再判斷該數是否為質數(也要列出因數)
上面的int n=random.nextInt(100)+1;->是由原本的int n=random.nextInt(100)去改變的, 而int n=random.nextInt(100)意思是
0~99(不包括100)產生一個亂數,所以也包刮0 ,所以說如果我在她(100)旁下+1變成-> int n=random.nextInt(100)+1就變成1~100中產生一個亂數,所以就從
1開始到100就不包刮0了,所以這就是為甚麼我在(100)旁下+1的意思(int n=random.nextInt(100)+1)

然後把我亂數出來的int n值先丟進ln("隨機數為: "+n),然後再丟到我所設立的isPrime(n);
之後再列函數出來把isPrime(n);列出來變public static void isPrime(int n),之後下面就是算出該值的質數判斷循環,判斷出是否為質數,然後
順便在列印出該亂數的因數值!
A:(我隨機測試6組)
 1.隨機數為: 76        2.隨機數為: 37     3.隨機數為: 57     4.隨機數為: 77      5.隨機數為: 78        6.隨機數為: 41
 1                    1                1                1                  1                   1
 2                    37               3                7                  2                   41
 4                    是否為質數= YES    19               11                 3                   是否為質數= YES
 19                                    57               77                 6
 38                                    是否為質數= NO     是否為質數= NO       13
 76                                                                        26
 是否為質數= NO                                                              39
                                                                           78
                                                                           是否為質數= NO
 */
