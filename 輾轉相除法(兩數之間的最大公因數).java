import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        System.out.println(f(a,b));
    }
    public static int f(int x,int y){ //這邊x->a y->b
        while (y!=0){  //如果y不等於0就進去,如果y是0就代表算法結束,while外圈循環停止
            int v=x%y; //<-這裡v是算現在的x跟y的餘數值
            x=y; //<-算出餘數之後,就用推過去的方式,把x變成現在y值
            y=v; //<-算出餘數之後,就用推過去的方式,並且x=y了,所以現在的y就變成餘數,以此類推循環
        }
        return x; //<-來到這,代表while已經結束,而y如果是0也代表算法結束,這時候就把最後推過去的x值拉出來做return
    }             //注意:這裡return沒下函數名稱,所以return x之後就不能再把值丟下來做遞迴函數!
}
/*
題目:輾轉相除法(做兩數的最大公因數)                  程式流程 我以a=49 b=91去說
範例:                                            現在的x跟y   餘數          推過去之後的x跟y
(1.)49 91    (2.)12 8                             x   y                     x    y
   A:7          A:4                               49  91 得% 49  推過去後->  91    49
                                                  91  49 得% 42  推過去後->  49    42
                                                  49  42 得%  7  推過去後->  42     7
                                                  42   7 得%  0  推過去後->   7     0
                                                   7   0  <-之後推過去y如果是0,代表算法已結束,然後目前x==7 y==0,return就取
                                                            x值,所以return返回之後這個值就是兩數(a=49,b=91)之間的"最大公因數"

 */
