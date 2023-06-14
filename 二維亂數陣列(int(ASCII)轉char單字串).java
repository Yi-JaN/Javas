import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in); //輸入一個Scanner,要下long seed
        Random randrand=new Random(); //用亂數產生
        long seed=scn.nextLong(); //設long seed
        randrand.setSeed(seed); //把long seed丟入亂數的.setseed裡面
        char [][]ch=new char[10][10]; //設一個10*10矩陣,高10值10
        for(int i=0;i<10;i++){ //for i當高
            for(int j=0;j<10;j++){ //for j當值
                int n=randrand.nextInt(26)+97; //每循環1次取97~122的正整數,然後再給int n汰舊換新
                ch[i][j]=((char)(n)); //汰舊換新的n丟到這裡int(ASCII)碼轉成char單字串,給目前ch的(i)高(j)值上
            }                         //這邊可以參考筆記的ASCII碼轉char單字串!
        }
        for(int a=0;a<10;a++){ //來到這邊代表ch二維陣列已取值完畢,接下來這裡開始一個一個列印,for a當高
            for(int b=0;b<10;b++){ //for b當值
                System.out.print(ch[a][b]+"\t"); //每循環1次取ch二維陣列目前的(a)高(b)值,然後再"\t"(tab)
            }
            System.out.println(); //每列印完一個高裡的值就換行,繼續下一行的動作
        }
    }
}
/*
題目:二維陣列亂數行列互換seed(ASCII轉char單字串)

問題描述:
設計一個程式97~122的亂數產生一 10*10的二維陣列,將ASCII馬轉換成單字串字元輸出

#一些詳請補充可以看 JAVA資料夾裡的模三資料夾裡的 二維陣列亂數行列互換

1723
x	l	u	f	a	i	m	x	p	v
j	n	v	k	y	g	l	p	i	w
t	w	w	x	b	u	t	y	c	v
n	a	y	n	e	i	e	p	z	g
y	t	e	x	h	k	u	y	i	i
d	l	p	b	t	z	t	a	k	u
p	z	u	c	v	i	g	m	s	q
x	u	m	m	b	t	h	s	h	m
p	v	t	f	l	j	z	k	t	k
g	o	s	j	h	i	f	s	m	f

 */
