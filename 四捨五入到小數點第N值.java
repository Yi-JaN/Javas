import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double m=scn.nextDouble();
       int n=scn.nextInt();
        BigDecimal sb=new BigDecimal(m);
        sb=sb.setScale(n, BigDecimal.ROUND_HALF_UP); //如果要小數點第n位後面的值去掉並且不進位 可用(n,BigDecimal.ROUND_DOWN);
        if(n>=1){ //如果是小數點第1位以上丟來這邊
            System.out.println(sb.doubleValue());
        }else {  //如果是小數點第0位丟來else這邊
            System.out.println(Math.round(sb.doubleValue()*10)/10); //意思是如果假設n是第0位的話,不管有沒有四捨五入進位,那到第0
        }                                                           //位的時候小數點第1位都會.0,假設如果是用BigDecimal.ROUND
    }                                      //_DOWN,然後輸入2.657跟0,那他會第0位後面的值去掉,這時候用round就不會有2.0而是2這樣才對
}                                          //那為什麼會有2.0是因為"doubleValue的原因,因為double型態是浮點數,所以會有.0現象"
/*
這是四捨五入取得小數點第n位的題目
輸入為 一個double值 ， n值
之後用 BigDecimal sb=new BigDecimal(m) <- 意思是把你的 double m丟進去給BigDecimal sb進而產生新的BigDecimal sb的值類似於 sb=m意思
把值丟進去後sb=sb.setScale(n,BigDecimal.ROUND_HALF_UP); n=你的進位值 BigDecimal.ROUND_HALF_UP就是把你的值四捨五入到你所輸入的
n值最後再把用好的值往下丟 然後println()列印，println(sb.doubleValue()) <-意思是新的sb值用doubleValue()型態列印出來
註:doubleValue 你的double 值(Value)
 */
