import java.util.Scanner;

public class Main {

    public static void main(String[] args) {     //我先設2個正整數叫8 6
        Scanner scn=new Scanner(System.in);
       int m=scn.nextInt();   //m就設8
       int n=scn.nextInt();   //n就設6
       System.out.println(f(m)/(f(n)*f(m-n)));  //先帶進這行公式來看:f(m)/(f(n)*f(m-n))把數字帶下去如下
    }                                                             //"f(8)/(f(6)*f(8-6))"
    public static int f(int x){           //把"f(8)/(f(6)*f(8-6))"帶給 int f(int x)
        int sum=1;                       //之後要算乘階所以先設sum
        for(int i=1;i<=x;i++){ //一個一個把int x裡的->f(8)/(f(6)*f(8-6))由內到外丟進for,先從8開始,8算完乘階在往下丟return sum返回,那因為
            sum=sum*i;             //return時沒加"f"函數名稱,所以8的sum值返回去之後就不能再丟下來遞迴,以此類推! 接著就是丟f(6),f(6)
        }                         //一樣算法一樣往下return沒加"f"函數名稱不能再返回下方的遞迴函數,接著就是f(8-6),之後一樣跟(8),(6)一樣算法
        return sum;        //這個return就是把一個一個算完乘階值丟回上方,那沒下"函數名稱",所以不能丟回去又丟下來!
    }                      //所以一個一個丟回去值是這樣->f(40320)/(f(720)*f(2)) ->f(40320)/f(1440) ->"28"
}
/*
題目:用遞迴函數:C(m,n) 算乘階的
A:(1.)8 6        A:(2.)7 5       A:(3.)12 8
    A:28             A:21            A:495
 */
