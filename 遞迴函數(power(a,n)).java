import java.util.Scanner;

public class Main {                             //此題有方法一及方法二  這題用方法一來寫
                                                //方法一:power(a,n)=a*power(a,n-1)
    public static void main(String[] args) {    //方法二:power(a,n)=a*power(a,n/2)*power(a,n/2) 當n為偶數
        Scanner scn=new Scanner(System.in);     //      power(a,n)=a*power(a,n-1)              當n為奇數
        int a=scn.nextInt();                   //以輸入3 5來說! a輸入3
        int n=scn.nextInt();                   //n=輸入5  n做為平方
        power(a,n);                            //分別把a,n的值丟給函數名稱"power"
        System.out.println(power(a,n));    //待會要列印用的
    }
    public static long power(int x,int y){ //把"power"設置遞迴函數,並且int x就是a的值,int y就是n的值
        if(y==1){     //如果我的平方y是==1的話就直接丟這,並且直接return x; ,因為x的1平方還是一樣的值,所以return後又沒下"power"函數名稱
            return x;    //所以丟回去就不用再丟進來了
        }else {           //其他只要平方y大於1就往下丟進else裡,並且return x*power(x,y-1); 做遞迴函數
            return x*power(x,y-1);  //以3 5來說,x(3)*power(x(3),y(5)-1);->丟回去的值變成x(3)*power(x(9),y(4));
        }                             //然後再丟x(3)*power(x(9),y(4)-1),以此類推,算到不能再算為止
    }
}
/*
題目:遞迴方法 power(a,n)
題目詳請請去看模三題庫!
           丟進來的值                丟回去的值
3 5=x(3)*power(x(3),y(5)-1) ->power(x(9),y(4))
   =x(3)*power(x(9),y(4)-1) ->power(x(27),y(3))
   =x(3)*power(x(27),y(3)-1) ->power(x(81),y(2))
   =x(3)*power(x(81),y(2)-1) ->power(x(243),y(1))
  之後丟入if(y==1) return x; 所以回去就只有x值,也就是243 之後就列印"243"這個值!
  那為什麼前方的x(3)一直是x(3)呢? 因為x*x是乘給power,讓power裡的值做遞迴,所以你的x就只取第一次丟進來遞迴的那個x值
A:(1.)2 3     A:(2.)3 5    A:(3.)2 10
    A:8           A:243        A:1024
 */
