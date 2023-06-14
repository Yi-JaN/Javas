import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        lcm(n,m);
    }
    public  static void lcm(int w,int h){
        int x=0,y=1;
        for(int i=0;i<h;i++){
            for(int k=0;k<w;k++){
                y=y+x;
                System.out.print(y+"\t");
                y++;
            }
            System.out.println();
            x++;
            y=1;
        }
    }
}
/*
此為題目 函數:數字矩陣
假設我設 5 3
從第一個函數main先建立2個需要的正整數之後建立一個叫做lcm名稱的函數然後把2個正整數丟入lcm -> lcm(n,m) 之後往下建立lcm函數 並且
在void lcm 依照題目要求建立w(int)h(int)，所以就把public static void lcm()括號裡用w代替n,h代替m，所以()變成lcm(int w,int h){
之後可以再lcm函數值做數字矩陣的要求
之後先建立int x=0 ,y=1 ,然後把h設大for迴圈做高度 w設大迴圈裡的小for迴圈做寬度，從h開始i為1 往下w部分k為1 從第1行開始做 往下y=y+x 就把上面x=0,
y=1 拉下來相加得到1之後print(y+"\t")列印出來,再往下把加完的y值(1)做y++，再循環回去小for迴圈做第2次 ，在丟下去y=y+x -> 2=2+0 ->2 把2print
列印出來在往下y++ 變 3 在循環小迴圈，循環到你所輸入的w值，之後小迴圈完畢後，往下大迴圈裡有println()意思換行，再來把原本x是0 利用x++，變為x=1
做待回第2行 然後這裡很重要y要=1，不然你設w=5 ，在小迴圈做完5次之後你會把他y++的值停留在小迴圈裡，你設5總不可能w再跑1次變第6次吧? 所以他會留在
小迴圈裡，所以在大迴圈底標y要重設為1 讓他跑，接著回到大for迴圈跑第2行 小迴圈從第1次開始跑到第5次，之後5次跑完跳出來往下println()再把第2行換行
之後x++ 變x=2 y重設為=1 然後回大for迴圈跑第3行 ，然後往下小for迴圈從第1次橫的開始跑5次 以此類推!
最後跑到大for迴圈 也就是h跑完3之後完成3就可以跳出這個迴圈的部分 往下做，那下面的部分也沒有了 所以這題就是這樣完成!
 */
