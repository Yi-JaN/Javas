import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        sum(n,count);
        System.out.println("水仙花數有: "+sum(n,count)+" 個");
    }
    public static int sum(int x,int counts){
        if(x>=100){
            int v1=x/100;
            int v2=x/10%10;
            int v3=x%10;
            if(x==((v1*v1*v1)+(v2*v2*v2)+(v3*v3*v3))){
                counts++;
                x=x-1;
                return sum(x,counts);   //return->意思是返回
            }else {
                x=x-1;
                return sum(x,counts);  //return ->意思是返回
            }
        }else {
          return counts;          //return ->意思是返回
        }
    }
}
/*
題目: 找三位數水仙花數(用遞迴函數版本)
假設我return完要再丟到下方int函數裡做遞迴函數,那麼我必須當初return時所有值都要返回去,缺一不可,只要缺一就不能在往下丟
當不能在往下丟就代表不能再算下面的int函數裡的東西,這樣的話只能列印你返回的值!
這題就只是稍微改變 變成遞迴函數去做而已,主要就是運用遞迴函數的理念去搞這題
補充:還有你丟進else裡的"return counts",返回count之後因為當初return沒有下"sum"這個函數名稱,所以返回到count,這值也沒辦法在丟下去做遞迴
主要說明可以參考 娛樂題目裡的 找水仙花數看有幾個是然後再列印出來(這題我用三位數).java檔

A:
  373                    999                    370                 200
  A:水仙花數有: 3個        A:水仙花數有: 4個         A:水仙花數有: 2個     A:水仙花數有: 1個
 */
