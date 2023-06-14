import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        boolean z=true; //先輸入一個布林數 z先設為true(是)
        int n; //先設第一個正整數(先不給值)
        int m; //先設第二個正整數(先不給值)
        while (z) { //用while把z丟進條件式,當z還是true(是)就會一直循環,當z是false(否)就會停止循環
            System.out.print("請輸入要(+or-or*or/)(由左至右為1 2 3 4): "); //第一步看你是要+-*/看是要哪個由左至右編號為1 2 3 4
            int number=scn.nextInt(); //number就是你+-*/的編號輸入
            if (number==1 || number==2 || number==3 ||number==4){ //如果number是1 2 3 4 就進去
                if (number==1){ //取最外圈if條件式的number,如果是1就為+
                    n=scn.nextInt(); //這時候進去給第一個正整數值
                    m=scn.nextInt(); //第一個正整數值給完後就換給第二個正整數值
                    System.out.println(answer1(n,m)); //這時候把2個正整數值丟過去函數名稱answer1裡,等下做遞迴,由上至下尋找相同的函數名稱
                }else if (number==2){ //取最外圈if條件式的number,如果是2就為-
                    n=scn.nextInt(); //這時候進去給第一個正整數值
                    m=scn.nextInt(); //第一個正整數值給完後就換給第二個正整數值
                    System.out.println(answer2(n,m)); //這時候把2個正整數值丟過去函數名稱answer2裡,等下做遞迴,由上至下尋找相同的函數名稱
                }else if (number==3){ //取最外圈if條件式的number,如果是3就為*
                    n=scn.nextInt(); //這時候進去給第一個正整數值
                    m=scn.nextInt(); //第一個正整數值給完後就換給第二個正整數值
                    System.out.println(answer3(n,m)); //這時候把2個正整數值丟過去函數名稱answer3裡,等下做遞迴,由上至下尋找相同的函數名稱
                }else if (number==4){ //取最外圈if條件式的number,如果是4就為/
                    n=scn.nextInt(); //這時候進去給第一個正整數值
                    m=scn.nextInt(); //第一個正整數值給完後就換給第二個正整數值
                    System.out.println(answer4(n,m)+"..."+(n%m)); //這時候把2個正整數值丟過去函數名稱answer4裡,等下做遞迴,由上至下尋找相同的函數名稱
                }                                                 //然後後面有(n%m),算出餘數後,待會return回傳的值在一起列印出來
                z=false; //之後z變false(否),讓他等下while迴圈不用再循環
            }else { //如果number不是1或2或3或4那就是來到else裡
                z=true; //z汰舊換新true,一樣繼續循環while到你number是1或2或3或4
            }
        }
    }
    public static int answer1(int x,int y){ //如果函數名稱由上至下下來,如果函數名稱是answer1就進去 int x代表為n int y代表為m
        return x+y; //x+y加起來的值return回去,而return回去哪?就是return回去當初由上至下函數名稱對函數名稱進來這邊的那個println括號裡
    }               //而他return沒下函數名稱,沒下的話丟回去的值就不能再丟進來做遞迴!所以直接在該println括號裡列印
    public static int answer2(int x,int y){ //如果函數名稱由上至下下來,如果函數名稱是answer2就進去 int x代表為n int y代表為m
        return x-y; //x-y減起來的值return回去,而return回去哪?就是return回去當初由上至下函數名稱對函數名稱進來這邊的那個println括號裡
    }               //而他return沒下函數名稱,沒下的話丟回去的值就不能再丟進來做遞迴!所以直接在該println括號裡列印
    public static int answer3(int x,int y){ //如果函數名稱由上至下下來,如果函數名稱是answer3就進去 int x代表為n int y代表為m
        return x*y; //x*y乘起來的值return回去,而return回去哪?就是return回去當初由上至下函數名稱對函數名稱進來這邊的那個println括號裡
    }               //而他return沒下函數名稱,沒下的話丟回去的值就不能再丟進來做遞迴!所以直接在該println括號裡列印
    public static int answer4(int x,int y){ //如果函數名稱由上至下下來,如果函數名稱是answer4就進去 int x代表為n int y代表為m
        return x/y; //x/y除起來的商數值return回去,而return回去哪?就是return回去當初由上至下函數名稱對函數名稱進來這邊的那個println括號裡
    }               //而他return沒下函數名稱,沒下的話丟回去的值就不能再丟進來做遞迴!所以直接在該println括號裡列印
}
/*
請輸入要(+or-or*or/)(由左至右為1 2 3 4): 1    請輸入要(+or-or*or/)(由左至右為1 2 3 4): 2   請輸入要(+or-or*or/)(由左至右為1 2 3 4): 3
7 8                                        7 8                                      7 8
A->15                                      A->-1                                    A->56
請輸入要(+or-or*or/)(由左至右為1 2 3 4): 4
7 8
A->0...7
注意:JAVA看遞迴是由上至下循環這樣看 Python則是由下至上循環這樣看

 */
